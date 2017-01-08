/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package eu.gerhards.liferay.services.angular.service.impl;

import aQute.bnd.annotation.ProviderType;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.permission.PortalPermissionUtil;
import eu.gerhards.liferay.services.angular.exception.NoSuchAngularSiteException;
import eu.gerhards.liferay.services.angular.service.base.AngularSiteServiceBaseImpl;
import eu.gerhards.liferay.services.angular.service.util.AngularActionKeys;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * The implementation of the Site remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link eu.gerhards.liferay.services.angular.service.AngularSiteService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularSiteServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.AngularSiteServiceUtil
 */
@ProviderType
public class AngularSiteServiceImpl extends AngularSiteServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link eu.gerhards.liferay.services.angular.service.AngularSiteServiceUtil} to access the Site remote service.
	 */


    public static final Log _log = LogFactoryUtil.getLog(AngularSiteServiceImpl.class.getName());

    @Override
    public List<Group> getInstanceSites(long companyId) throws PortalException {

        _log.info("Getting all groups for company id: "+String.valueOf(companyId));

        _log.debug("    ... security check ...");

        PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.LIST_PAGES);

        _log.debug("   ... getting information ...");

        int groupCount = GroupLocalServiceUtil.getCompanyGroupsCount(companyId);
        List<Group> instanceGroups = null;
        List<Group> sites = null;

        if (groupCount > 0) {
            instanceGroups = GroupLocalServiceUtil.getCompanyGroups(companyId, 0, groupCount - 1);
            sites = this.filterSites(instanceGroups);
        }

        return sites;
    }

    @Override
    public List<Group> getActiveSites(long companyId) throws PortalException {

        _log.info("Getting all sites for company id: "+String.valueOf(companyId));

        _log.debug("    ... security check ...");

        PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.LIST_PAGES);

        _log.debug("   ... getting information ...");

        List<Group> activeGroups = GroupLocalServiceUtil.getActiveGroups(companyId, true);
        List<Group> sites = null;

        if (activeGroups!=null && activeGroups.size() > 0) {
            sites = this.filterSites(activeGroups);
        }
        return sites;
    }

    @Override
    public List<Group> getInactiveSites(long companyId) throws PortalException {

        _log.info("Getting all sites for company id: "+String.valueOf(companyId));

        _log.debug("    ... security check ...");

        PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.LIST_PAGES);

        _log.debug("   ... getting information ...");

        List<Group> inactiveGroups = GroupLocalServiceUtil.getActiveGroups(companyId, false);
        List<Group> sites = null;

        if (inactiveGroups != null && inactiveGroups.size() > 0) {
            sites = this.filterSites(inactiveGroups);
        }

        return sites;
    }

    @Override
    public Group createSite(long parentSiteId, long liveGroupId, Map<Locale, String> nameMap, Map<Locale, String> descriptionMap, int type, boolean manualMembership, int membershipRestriction, String friendlyURL, boolean site, boolean inheritContent, boolean active) throws PortalException {

        _log.info("Creating new site ...");

        _log.debug("    security check ...");

        PortalPermissionUtil.check(getPermissionChecker(), ActionKeys.ADD_COMMUNITY);

        _log.debug("    ... processing ...");

        return groupService.addGroup(parentSiteId, liveGroupId,nameMap,descriptionMap,type, manualMembership, membershipRestriction,friendlyURL,site, active, null);
    }

    @Override
    public Group updateSite(long siteId, long parentSiteId, long liveGroupId, Map<Locale, String> nameMap, Map<Locale, String> descriptionMap, int type, boolean manualMembership, int membershipRestriction, String friendlyURL, boolean site, boolean inheritContent, boolean active) throws PortalException {

        _log.info("Creating new site ...");

        _log.debug("    security check ...");

        PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.UPDATE_COMMUNITY);

        _log.debug("    ... processing ...");

        return groupService.updateGroup(siteId, parentSiteId,nameMap,descriptionMap,type, manualMembership,membershipRestriction,friendlyURL, inheritContent, active, null);
    }

    @Override
    public void deleteSite(long siteId) throws PortalException {

        _log.info("Creating new group ...");

        _log.debug("    security check ...");

        PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.DELETE_COMMUNITY);

        _log.debug("    ... processing ...");

        Group group = GroupLocalServiceUtil.getGroup(siteId);
        if (group != null && group.isSite()) {
            GroupLocalServiceUtil.deleteGroup(siteId);
        } else {
            throw new NoSuchAngularSiteException("No such site");
        }
    }

    protected List<Group> filterSites(List<Group> groups) {

        List<Group> sites = new ArrayList<Group>();
        for(Group group:groups) {
            if (group.isSite()) {
                sites.add(group);
            }
        }

        return sites;
    }
}