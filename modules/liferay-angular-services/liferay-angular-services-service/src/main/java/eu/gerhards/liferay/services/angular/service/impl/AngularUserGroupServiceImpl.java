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
import com.liferay.portal.kernel.model.CompanyConstants;
import com.liferay.portal.kernel.model.UserGroup;
import com.liferay.portal.kernel.security.membershippolicy.UserGroupMembershipPolicyUtil;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.service.UserGroupLocalServiceUtil;
import com.liferay.portal.kernel.service.permission.UserGroupPermissionUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import eu.gerhards.liferay.services.angular.service.base.AngularUserGroupServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the User group remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link eu.gerhards.liferay.services.angular.service.AngularUserGroupService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularUserGroupServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.AngularUserGroupServiceUtil
 */
@ProviderType
public class AngularUserGroupServiceImpl extends AngularUserGroupServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link eu.gerhards.liferay.services.angular.service.AngularUserGroupServiceUtil} to access the User group remote service.
	 */

    @Override
    public List<UserGroup> getUserGroupsInCompany(long companyId) {
        List<UserGroup> userGroupsPerCompany = UserGroupLocalServiceUtil.getUserGroups(companyId);
        return userGroupsPerCompany;
    }

    public long[] checkUserGroupIds(long userId, long[] userGroupIds)
            throws PortalException {

        long[] oldUserGroupIds = null;

        PermissionChecker permissionChecker = getPermissionChecker();

        if (userId != CompanyConstants.SYSTEM) {

            // Add back any user groups that the administrator does not have the
            // rights to remove or that have a mandatory membership

            List<UserGroup> oldUserGroups =
                    userGroupLocalService.getUserUserGroups(userId);

            oldUserGroupIds = new long[oldUserGroups.size()];

            for (int i = 0; i < oldUserGroups.size(); i++) {
                UserGroup userGroup = oldUserGroups.get(i);

                if (!ArrayUtil.contains(
                        userGroupIds, userGroup.getUserGroupId()) &&
                        (!UserGroupPermissionUtil.contains(
                                permissionChecker, userGroup.getUserGroupId(),
                                ActionKeys.ASSIGN_MEMBERS) ||
                                UserGroupMembershipPolicyUtil.isMembershipRequired(
                                        userId, userGroup.getUserGroupId()))) {

                    userGroupIds = ArrayUtil.append(
                            userGroupIds, userGroup.getUserGroupId());
                }

                oldUserGroupIds[i] = userGroup.getUserGroupId();
            }
        }

        // Check that the administrator has the permission to add a new user
        // group and that the user group membership is allowed

        for (long userGroupId : userGroupIds) {
            if ((oldUserGroupIds == null) ||
                    !ArrayUtil.contains(oldUserGroupIds, userGroupId)) {

                UserGroupPermissionUtil.check(
                        permissionChecker, userGroupId, ActionKeys.ASSIGN_MEMBERS);
            }
        }

        return userGroupIds;
    }
}