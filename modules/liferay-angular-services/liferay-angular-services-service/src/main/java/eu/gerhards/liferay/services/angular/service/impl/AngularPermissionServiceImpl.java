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
import com.liferay.portal.kernel.model.ResourcePermission;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ResourcePermissionLocalServiceUtil;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import eu.gerhards.liferay.services.angular.service.base.AngularPermissionServiceBaseImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * The implementation of the Permission remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link eu.gerhards.liferay.services.angular.service.AngularPermissionService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularPermissionServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.AngularPermissionServiceUtil
 */
@ProviderType
public class AngularPermissionServiceImpl
	extends AngularPermissionServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link eu.gerhards.liferay.services.angular.service.AngularPermissionServiceUtil} to access the Permission remote service.
	 */

	public static Log _log = LogFactoryUtil.getLog(AngularPermissionServiceImpl.class);

	@Override
	public List<ResourcePermission> getPermissions(long roleId) {

		_log.debug("Role id: "+roleId);

		List<ResourcePermission> permissions = ResourcePermissionLocalServiceUtil.getRoleResourcePermissions(roleId);

		_log.debug("Permissions: "+permissions);

		return permissions;
	}

	@Override
	public List<List<ResourcePermission>> getPermissionsForUser(long userId) throws PortalException {

		User user = UserLocalServiceUtil.getUser(userId);
		List<List<ResourcePermission>> permissionsPerRole = null;

		_log.debug("Found user: "+user);

		if (user != null) {

			List<Role> roles = user.getRoles();

			_log.debug("Roles: "+roles);

			if (roles != null && !roles.isEmpty()) {
				permissionsPerRole = new ArrayList<List<ResourcePermission>>();
				for(Role role:roles) {
					List<ResourcePermission> permissions = this.getPermissions(role.getRoleId());
					if (permissions != null) {
						permissionsPerRole.add(permissions);
					}
				}
			}
		}

		_log.debug("All permissions: "+permissionsPerRole);

		return permissionsPerRole;
	}

	@Override
	public List<List<ResourcePermission>> getPermissionsForUserPerType(long userId, long roleType, long scopeType) throws PortalException {

		User user = UserLocalServiceUtil.getUser(userId);
		List<List<ResourcePermission>> permissionsPerRole = null;

		_log.debug("Found user: "+user);

		if (user != null) {

			List<Role> roles = user.getRoles();

			_log.debug("Roles: "+roles);

			if (roles != null && !roles.isEmpty()) {
				permissionsPerRole = new ArrayList<List<ResourcePermission>>();
				for(Role role:roles) {
					List<ResourcePermission> permissions = this.getPermissions(role.getRoleId());
					if (permissions != null) {
						List<ResourcePermission> filteredRessourcePermission = new ArrayList<ResourcePermission>();
						for (ResourcePermission permission:permissions) {
							if ( roleType == -1 || (roleType != -1 && role.getType() == roleType)) {
								if (scopeType == -1 || (scopeType != -1 && permission.getScope() == scopeType)) {
									filteredRessourcePermission.add(permission);
								}
							}
						}

						permissionsPerRole.add(filteredRessourcePermission);
					}
				}
			}
		}

		_log.debug("All permissions: "+permissionsPerRole);

		return permissionsPerRole;
	}
}