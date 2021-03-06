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

package eu.gerhards.liferay.services.angular.service.http;

import aQute.bnd.annotation.ProviderType;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.RoleSoap;
import com.liferay.portal.kernel.model.UserGroupRole;
import com.liferay.portal.kernel.model.UserGroupRoleSoap;
import com.liferay.portal.kernel.util.LocalizationUtil;
import eu.gerhards.liferay.services.angular.service.AngularRoleServiceUtil;

import java.rmi.RemoteException;
import java.util.Locale;
import java.util.Map;

/**
 * Provides the SOAP utility for the
 * {@link AngularRoleServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link eu.gerhards.liferay.services.angular.model.AngularRoleSoap}.
 * If the method in the service utility returns a
 * {@link eu.gerhards.liferay.services.angular.model.AngularRole}, that is translated to a
 * {@link eu.gerhards.liferay.services.angular.model.AngularRoleSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularRoleServiceHttp
 * @see eu.gerhards.liferay.services.angular.model.AngularRoleSoap
 * @see AngularRoleServiceUtil
 * @generated
 */
@ProviderType
public class AngularRoleServiceSoap {
	public static RoleSoap[] getRolesInCompany(long companyId)
		throws RemoteException {
		try {
			java.util.List<Role> returnValue = AngularRoleServiceUtil.getRolesInCompany(companyId);

			return RoleSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static RoleSoap[] getRegularRoles(long companyId)
		throws RemoteException {
		try {
			java.util.List<Role> returnValue = AngularRoleServiceUtil.getRegularRoles(companyId);

			return RoleSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static RoleSoap[] getSiteRoles(long companyId)
		throws RemoteException {
		try {
			java.util.List<Role> returnValue = AngularRoleServiceUtil.getSiteRoles(companyId);

			return RoleSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static Role createRole(java.lang.String name, int type,
		java.lang.String className, java.lang.String[] titleMapLanguageIds,
		java.lang.String[] titleMapValues,
		java.lang.String[] descriptionMapLanguageIds,
		java.lang.String[] descriptionMapValues, java.lang.String subType)
		throws RemoteException {
		try {
			Map<Locale, String> titleMap = LocalizationUtil.getLocalizationMap(titleMapLanguageIds,
					titleMapValues);
			Map<Locale, String> descriptionMap = LocalizationUtil.getLocalizationMap(descriptionMapLanguageIds,
					descriptionMapValues);

			Role returnValue = AngularRoleServiceUtil.createRole(name, type,
					className, titleMap, descriptionMap, subType);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static Role updateRole(long roleId, java.lang.String name, int type,
		java.lang.String className, java.lang.String[] titleMapLanguageIds,
		java.lang.String[] titleMapValues,
		java.lang.String[] descriptionMapLanguageIds,
		java.lang.String[] descriptionMapValues, java.lang.String subType)
		throws RemoteException {
		try {
			Map<Locale, String> titleMap = LocalizationUtil.getLocalizationMap(titleMapLanguageIds,
					titleMapValues);
			Map<Locale, String> descriptionMap = LocalizationUtil.getLocalizationMap(descriptionMapLanguageIds,
					descriptionMapValues);

			Role returnValue = AngularRoleServiceUtil.updateRole(roleId, name,
					type, className, titleMap, descriptionMap, subType);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static Role deleteRole(long roleId) throws RemoteException {
		try {
			Role returnValue = AngularRoleServiceUtil.deleteRole(roleId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static RoleSoap[] getOrganizationRoles(long companyId)
		throws RemoteException {
		try {
			java.util.List<Role> returnValue = AngularRoleServiceUtil.getOrganizationRoles(companyId);

			return RoleSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static long[] checkRoles(long userId, long[] roleIds)
		throws RemoteException {
		try {
			long[] returnValue = AngularRoleServiceUtil.checkRoles(userId,
					roleIds);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static UserGroupRoleSoap[] checkUserGroupRoles(long userId,
														  java.util.List<UserGroupRole> userGroupRoles) throws RemoteException {
		try {
			java.util.List<UserGroupRole> returnValue = AngularRoleServiceUtil.checkUserGroupRoles(userId,
					userGroupRoles);

			return UserGroupRoleSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(AngularRoleServiceSoap.class);
}