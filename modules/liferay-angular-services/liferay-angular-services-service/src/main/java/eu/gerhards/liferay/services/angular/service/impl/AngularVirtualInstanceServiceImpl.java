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
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;
import com.liferay.portal.kernel.service.permission.PortalPermissionUtil;
import eu.gerhards.liferay.services.angular.service.base.AngularVirtualInstanceServiceBaseImpl;
import eu.gerhards.liferay.services.angular.service.util.AngularActionKeys;

import java.util.List;

/**
 * The implementation of the Virtual instance remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link eu.gerhards.liferay.services.angular.service.AngularVirtualInstanceService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularVirtualInstanceServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.AngularVirtualInstanceServiceUtil
 */
@ProviderType
public class AngularVirtualInstanceServiceImpl
	extends AngularVirtualInstanceServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link eu.gerhards.liferay.services.angular.service.AngularVirtualInstanceServiceUtil} to access the Virtual instance remote service.
	 */

	public static Log _log = LogFactoryUtil.getLog(AngularVirtualInstanceServiceImpl.class);

	@Override
	public List<Company> getAvailableInstances() throws PortalException {

		_log.info("Getting all instances ... ");

		_log.debug("    ... security check ...");

		PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.LIST_VIRTUAL_INSTANCES);

		_log.debug("   ... getting information ...");

		List<Company> companies = CompanyLocalServiceUtil.getCompanies();
		return companies;
	}

	@Override
	public Company createVirtualInstance(String webId, String virtualHostname, String mx, boolean system, int maxUsers, boolean active) throws PortalException {

		_log.info("Creating new instance ...");

		_log.debug("    ... security check ...");

		PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.ADD_VIRTUAL_INSTANCE);

		_log.debug( "... creating company ...");

		return CompanyLocalServiceUtil.addCompany(webId, virtualHostname, mx, system, maxUsers, active);
	}

	@Override
	public Company updateVirtualInstance(long companyId, String virtualHostname, String mx, int maxUsers, boolean active) throws PortalException {

		_log.info("Updating instance ...");

		_log.debug("    ... security check ...");

		PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.UPDATE_VIRTUAL_INSTANCE);

		_log.debug(" .... updating company ...");

		return CompanyLocalServiceUtil.updateCompany(companyId, virtualHostname, mx, maxUsers, active);
	}

	@Override
	public Company updateVirtualInstanceExtended(long companyId, String virtualHostname, String mx, String homeUrl, boolean logo, byte[] logoBytes, String name, String legalName, String legalId, String legalType, String sicCode, String tickerSymbol, String industry, String type, String size) throws PortalException {

		_log.info("Updating instance ...");

		_log.debug("    ... security check ...");

		PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.UPDATE_VIRTUAL_INSTANCE);

		_log.debug(" .... updating company ...");

		return CompanyLocalServiceUtil.updateCompany(companyId, virtualHostname, mx, homeUrl, logo, logoBytes, name, legalName, legalId, legalType, sicCode, tickerSymbol, industry, type, size);
	}

	@Override
	public void deleteVirtualInstance(long companyId) throws PortalException {

		_log.info("Deleting instance ... id: "+companyId);

		_log.debug("    ... security check ...");

		PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.DELETE_VIRTUAL_INSTANCE);

		_log.debug("    .... deleting company ...");

		CompanyLocalServiceUtil.deleteCompany(companyId);

	}

	@Override
	public Company updateLogo(long companyId, byte[] bytes) throws PortalException {

		_log.info("Updating company logo for company with id: "+companyId);

		_log.debug("    ... security check ...");

		PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.UPDATE_VIRTUAL_INSTANCE);

		_log.info("    ... updating logo ...");

		return CompanyLocalServiceUtil.updateLogo(companyId, bytes);

	}

	@Override
	public void deleteCompanyLogo(long companyId) throws PortalException {

		_log.info("Deleting company logog for company with id: "+companyId);

		_log.debug("    ... security check ...");

		PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.DELETE_VIRTUAL_INSTANCE);

		_log.info("    ... deleting company ...");

		CompanyLocalServiceUtil.deleteLogo(companyId);

	}

	@Override
	public Company getVirtualInstance(long companyId) throws PortalException {

		_log.info("Getting company with id: "+companyId);

		_log.debug("    ... security check ...");

		PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.LIST_VIRTUAL_INSTANCES);

		_log.debug("    ... return company parameters ... ");

		return CompanyLocalServiceUtil.getCompany(companyId);

	}

	@Override
	public void updateCompanySecurity(long companyId, String authType, boolean autoLogin, boolean sendPassword, boolean strangers, boolean strangesWithMx, boolean strangersVerify, boolean siteLogo) throws PortalException {

		_log.info("Updating company security for company with id: "+companyId);

		_log.debug("    ... security check ...");

		PortalPermissionUtil.check(getPermissionChecker(), AngularActionKeys.UPDATE_VIRTUAL_INSTANCE);

		_log.debug("    ... updating security ... ");

		CompanyLocalServiceUtil.updateSecurity(companyId, authType, autoLogin, sendPassword, strangers, strangesWithMx, strangersVerify, siteLogo);
	}
}