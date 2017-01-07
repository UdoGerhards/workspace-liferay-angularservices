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

package eu.gerhards.liferay.services.angular.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AngularUserGroupLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AngularUserGroupLocalService
 * @generated
 */
@ProviderType
public class AngularUserGroupLocalServiceWrapper
	implements AngularUserGroupLocalService,
		ServiceWrapper<AngularUserGroupLocalService> {
	public AngularUserGroupLocalServiceWrapper(
		AngularUserGroupLocalService angularUserGroupLocalService) {
		_angularUserGroupLocalService = angularUserGroupLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _angularUserGroupLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _angularUserGroupLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _angularUserGroupLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserGroupLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserGroupLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the User group to the database. Also notifies the appropriate model listeners.
	*
	* @param angularUserGroup the User group
	* @return the User group that was added
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularUserGroup addAngularUserGroup(
		eu.gerhards.liferay.services.angular.model.AngularUserGroup angularUserGroup) {
		return _angularUserGroupLocalService.addAngularUserGroup(angularUserGroup);
	}

	/**
	* Creates a new User group with the primary key. Does not add the User group to the database.
	*
	* @param groupId the primary key for the new User group
	* @return the new User group
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularUserGroup createAngularUserGroup(
		long groupId) {
		return _angularUserGroupLocalService.createAngularUserGroup(groupId);
	}

	/**
	* Deletes the User group from the database. Also notifies the appropriate model listeners.
	*
	* @param angularUserGroup the User group
	* @return the User group that was removed
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularUserGroup deleteAngularUserGroup(
		eu.gerhards.liferay.services.angular.model.AngularUserGroup angularUserGroup) {
		return _angularUserGroupLocalService.deleteAngularUserGroup(angularUserGroup);
	}

	/**
	* Deletes the User group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param groupId the primary key of the User group
	* @return the User group that was removed
	* @throws PortalException if a User group with the primary key could not be found
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularUserGroup deleteAngularUserGroup(
		long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserGroupLocalService.deleteAngularUserGroup(groupId);
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularUserGroup fetchAngularUserGroup(
		long groupId) {
		return _angularUserGroupLocalService.fetchAngularUserGroup(groupId);
	}

	/**
	* Returns the User group with the primary key.
	*
	* @param groupId the primary key of the User group
	* @return the User group
	* @throws PortalException if a User group with the primary key could not be found
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularUserGroup getAngularUserGroup(
		long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserGroupLocalService.getAngularUserGroup(groupId);
	}

	/**
	* Updates the User group in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param angularUserGroup the User group
	* @return the User group that was updated
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularUserGroup updateAngularUserGroup(
		eu.gerhards.liferay.services.angular.model.AngularUserGroup angularUserGroup) {
		return _angularUserGroupLocalService.updateAngularUserGroup(angularUserGroup);
	}

	/**
	* Returns the number of User groups.
	*
	* @return the number of User groups
	*/
	@Override
	public int getAngularUserGroupsCount() {
		return _angularUserGroupLocalService.getAngularUserGroupsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _angularUserGroupLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _angularUserGroupLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _angularUserGroupLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _angularUserGroupLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the User groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of User groups
	* @param end the upper bound of the range of User groups (not inclusive)
	* @return the range of User groups
	*/
	@Override
	public java.util.List<eu.gerhards.liferay.services.angular.model.AngularUserGroup> getAngularUserGroups(
		int start, int end) {
		return _angularUserGroupLocalService.getAngularUserGroups(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _angularUserGroupLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _angularUserGroupLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public AngularUserGroupLocalService getWrappedService() {
		return _angularUserGroupLocalService;
	}

	@Override
	public void setWrappedService(
		AngularUserGroupLocalService angularUserGroupLocalService) {
		_angularUserGroupLocalService = angularUserGroupLocalService;
	}

	private AngularUserGroupLocalService _angularUserGroupLocalService;
}