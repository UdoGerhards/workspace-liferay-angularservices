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
 * Provides a wrapper for {@link AngularGroupLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AngularGroupLocalService
 * @generated
 */
@ProviderType
public class AngularGroupLocalServiceWrapper implements AngularGroupLocalService,
	ServiceWrapper<AngularGroupLocalService> {
	public AngularGroupLocalServiceWrapper(
		AngularGroupLocalService angularGroupLocalService) {
		_angularGroupLocalService = angularGroupLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _angularGroupLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _angularGroupLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _angularGroupLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularGroupLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularGroupLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the Group to the database. Also notifies the appropriate model listeners.
	*
	* @param angularGroup the Group
	* @return the Group that was added
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularGroup addAngularGroup(
		eu.gerhards.liferay.services.angular.model.AngularGroup angularGroup) {
		return _angularGroupLocalService.addAngularGroup(angularGroup);
	}

	/**
	* Creates a new Group with the primary key. Does not add the Group to the database.
	*
	* @param groupId the primary key for the new Group
	* @return the new Group
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularGroup createAngularGroup(
		long groupId) {
		return _angularGroupLocalService.createAngularGroup(groupId);
	}

	/**
	* Deletes the Group from the database. Also notifies the appropriate model listeners.
	*
	* @param angularGroup the Group
	* @return the Group that was removed
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularGroup deleteAngularGroup(
		eu.gerhards.liferay.services.angular.model.AngularGroup angularGroup) {
		return _angularGroupLocalService.deleteAngularGroup(angularGroup);
	}

	/**
	* Deletes the Group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param groupId the primary key of the Group
	* @return the Group that was removed
	* @throws PortalException if a Group with the primary key could not be found
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularGroup deleteAngularGroup(
		long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularGroupLocalService.deleteAngularGroup(groupId);
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularGroup fetchAngularGroup(
		long groupId) {
		return _angularGroupLocalService.fetchAngularGroup(groupId);
	}

	/**
	* Returns the Group with the primary key.
	*
	* @param groupId the primary key of the Group
	* @return the Group
	* @throws PortalException if a Group with the primary key could not be found
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularGroup getAngularGroup(
		long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularGroupLocalService.getAngularGroup(groupId);
	}

	/**
	* Updates the Group in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param angularGroup the Group
	* @return the Group that was updated
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularGroup updateAngularGroup(
		eu.gerhards.liferay.services.angular.model.AngularGroup angularGroup) {
		return _angularGroupLocalService.updateAngularGroup(angularGroup);
	}

	/**
	* Returns the number of Groups.
	*
	* @return the number of Groups
	*/
	@Override
	public int getAngularGroupsCount() {
		return _angularGroupLocalService.getAngularGroupsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _angularGroupLocalService.getOSGiServiceIdentifier();
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
		return _angularGroupLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _angularGroupLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _angularGroupLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the Groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Groups
	* @param end the upper bound of the range of Groups (not inclusive)
	* @return the range of Groups
	*/
	@Override
	public java.util.List<eu.gerhards.liferay.services.angular.model.AngularGroup> getAngularGroups(
		int start, int end) {
		return _angularGroupLocalService.getAngularGroups(start, end);
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
		return _angularGroupLocalService.dynamicQueryCount(dynamicQuery);
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
		return _angularGroupLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public AngularGroupLocalService getWrappedService() {
		return _angularGroupLocalService;
	}

	@Override
	public void setWrappedService(
		AngularGroupLocalService angularGroupLocalService) {
		_angularGroupLocalService = angularGroupLocalService;
	}

	private AngularGroupLocalService _angularGroupLocalService;
}