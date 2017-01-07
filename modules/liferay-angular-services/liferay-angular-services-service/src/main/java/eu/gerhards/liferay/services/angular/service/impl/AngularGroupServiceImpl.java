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
import com.liferay.portal.kernel.model.CompanyConstants;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.security.membershippolicy.SiteMembershipPolicyUtil;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.permission.GroupPermissionUtil;
import com.liferay.portal.kernel.service.permission.PortalPermissionUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import eu.gerhards.liferay.services.angular.service.base.AngularGroupServiceBaseImpl;

import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * The implementation of the Group remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link eu.gerhards.liferay.services.angular.service.AngularGroupService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularGroupServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.AngularGroupServiceUtil
 */
@ProviderType
public class AngularGroupServiceImpl extends AngularGroupServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link eu.gerhards.liferay.services.angular.service.AngularGroupServiceUtil} to access the Group remote service.
	 */

    public static final Log _log = LogFactoryUtil.getLog(AngularGroupServiceImpl.class.getName());

    @Override
    public List<Group> getInstanceGroups(long companyId) {

        int groupCount = GroupLocalServiceUtil.getCompanyGroupsCount(companyId);
        List<Group> instanceGroups = null;

        if (groupCount > 0) {
            instanceGroups = GroupLocalServiceUtil.getCompanyGroups(companyId, 0, groupCount - 1);
        }

        return instanceGroups;
    }

    @Override
    public List<Group> getActiveGroups(long companyId) {
        List<Group> activeGroup = GroupLocalServiceUtil.getActiveGroups(companyId, true);
        return activeGroup;
    }

    @Override
    public List<Group> getInactiveGroups(long companyId) {
        List<Group> inactiveGroups = GroupLocalServiceUtil.getActiveGroups(companyId, false);
        return inactiveGroups;
    }

    @Override
    public Group createGroup(long parentGroupId, long liveGroupId, Map<Locale, String> nameMap, Map<Locale, String> descriptionMap, int type, boolean manualMembership, int membershipRestriction, String friendlyURL, boolean site, boolean inheritContent, boolean active) throws PortalException {
        _log.info("Creating new group ...");

        _log.debug("    security check ...");

        PortalPermissionUtil.check(getPermissionChecker(), ActionKeys.ADD_COMMUNITY);

        return groupService.addGroup(parentGroupId, liveGroupId,nameMap,descriptionMap,type, manualMembership, membershipRestriction,friendlyURL,site, active, null);
    }

    @Override
    public Group updateGroup(long groupId, long parentGroupId, long liveGroupId, Map<Locale, String> nameMap, Map<Locale, String> descriptionMap, int type, boolean manualMembership, int membershipRestriction, String friendlyURL, boolean site, boolean inheritContent, boolean active) throws PortalException {
        _log.info("Updating group ...");

        GroupPermissionUtil.check(getPermissionChecker(), groupId, ActionKeys.UPDATE);

        return groupService.updateGroup(groupId, parentGroupId,nameMap,descriptionMap,type, manualMembership,membershipRestriction,friendlyURL, inheritContent, active, null);
    }

    @Override
    public void deleteGroup(long groupId) throws PortalException {
        groupService.deleteGroup(groupId);
    }

    public long[] checkGroups(long userId, long[] groupIds)
            throws PortalException {

        long[] oldGroupIds = null;

        PermissionChecker permissionChecker = getPermissionChecker();

        User user = null;

        if (userId != CompanyConstants.SYSTEM) {

            // Add back any mandatory groups or groups that the administrator
            // does not have the rights to remove and check that he has the
            // permission to add a new group

            user = userPersistence.findByPrimaryKey(userId);

            List<Group> oldGroups = groupLocalService.getUserGroups(userId);

            oldGroupIds = new long[oldGroups.size()];

            for (int i = 0; i < oldGroups.size(); i++) {
                Group group = oldGroups.get(i);

                if (!ArrayUtil.contains(groupIds, group.getGroupId()) &&
                        (!GroupPermissionUtil.contains(
                                permissionChecker, group, ActionKeys.ASSIGN_MEMBERS) ||
                                SiteMembershipPolicyUtil.isMembershipProtected(
                                        permissionChecker, user.getUserId(),
                                        group.getGroupId()) ||
                                SiteMembershipPolicyUtil.isMembershipRequired(
                                        userId, group.getGroupId()))) {

                    groupIds = ArrayUtil.append(groupIds, group.getGroupId());
                }

                oldGroupIds[i] = group.getGroupId();
            }
        }

        // Check that the administrator has the permission to add a new group
        // and that the group membership is allowed

        for (long groupId : groupIds) {
            if ((oldGroupIds != null) &&
                    ArrayUtil.contains(oldGroupIds, groupId)) {

                continue;
            }

            Group group = groupPersistence.findByPrimaryKey(groupId);

            GroupPermissionUtil.check(
                    permissionChecker, group, ActionKeys.ASSIGN_MEMBERS);
        }

        return groupIds;
    }

}