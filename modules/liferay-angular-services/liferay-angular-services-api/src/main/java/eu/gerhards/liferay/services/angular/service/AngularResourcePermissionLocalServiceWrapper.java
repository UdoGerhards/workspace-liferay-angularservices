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
 * Provides a wrapper for {@link AngularResourcePermissionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AngularResourcePermissionLocalService
 * @generated
 */
@ProviderType
public class AngularResourcePermissionLocalServiceWrapper
	implements AngularResourcePermissionLocalService,
		ServiceWrapper<AngularResourcePermissionLocalService> {
	public AngularResourcePermissionLocalServiceWrapper(
		AngularResourcePermissionLocalService angularResourcePermissionLocalService) {
		_angularResourcePermissionLocalService = angularResourcePermissionLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _angularResourcePermissionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _angularResourcePermissionLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _angularResourcePermissionLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularResourcePermissionLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularResourcePermissionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the Resource permission to the database. Also notifies the appropriate model listeners.
	*
	* @param angularResourcePermission the Resource permission
	* @return the Resource permission that was added
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularResourcePermission addAngularResourcePermission(
		eu.gerhards.liferay.services.angular.model.AngularResourcePermission angularResourcePermission) {
		return _angularResourcePermissionLocalService.addAngularResourcePermission(angularResourcePermission);
	}

	/**
	* Creates a new Resource permission with the primary key. Does not add the Resource permission to the database.
	*
	* @param resourcePermissionId the primary key for the new Resource permission
	* @return the new Resource permission
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularResourcePermission createAngularResourcePermission(
		long resourcePermissionId) {
		return _angularResourcePermissionLocalService.createAngularResourcePermission(resourcePermissionId);
	}

	/**
	* Deletes the Resource permission from the database. Also notifies the appropriate model listeners.
	*
	* @param angularResourcePermission the Resource permission
	* @return the Resource permission that was removed
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularResourcePermission deleteAngularResourcePermission(
		eu.gerhards.liferay.services.angular.model.AngularResourcePermission angularResourcePermission) {
		return _angularResourcePermissionLocalService.deleteAngularResourcePermission(angularResourcePermission);
	}

	/**
	* Deletes the Resource permission with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param resourcePermissionId the primary key of the Resource permission
	* @return the Resource permission that was removed
	* @throws PortalException if a Resource permission with the primary key could not be found
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularResourcePermission deleteAngularResourcePermission(
		long resourcePermissionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularResourcePermissionLocalService.deleteAngularResourcePermission(resourcePermissionId);
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularResourcePermission fetchAngularResourcePermission(
		long resourcePermissionId) {
		return _angularResourcePermissionLocalService.fetchAngularResourcePermission(resourcePermissionId);
	}

	/**
	* Returns the Resource permission with the primary key.
	*
	* @param resourcePermissionId the primary key of the Resource permission
	* @return the Resource permission
	* @throws PortalException if a Resource permission with the primary key could not be found
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularResourcePermission getAngularResourcePermission(
		long resourcePermissionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularResourcePermissionLocalService.getAngularResourcePermission(resourcePermissionId);
	}

	/**
	* Updates the Resource permission in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param angularResourcePermission the Resource permission
	* @return the Resource permission that was updated
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularResourcePermission updateAngularResourcePermission(
		eu.gerhards.liferay.services.angular.model.AngularResourcePermission angularResourcePermission) {
		return _angularResourcePermissionLocalService.updateAngularResourcePermission(angularResourcePermission);
	}

	/**
	* Returns the number of Resource permissions.
	*
	* @return the number of Resource permissions
	*/
	@Override
	public int getAngularResourcePermissionsCount() {
		return _angularResourcePermissionLocalService.getAngularResourcePermissionsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _angularResourcePermissionLocalService.getOSGiServiceIdentifier();
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
		return _angularResourcePermissionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularResourcePermissionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _angularResourcePermissionLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularResourcePermissionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _angularResourcePermissionLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the Resource permissions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularResourcePermissionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Resource permissions
	* @param end the upper bound of the range of Resource permissions (not inclusive)
	* @return the range of Resource permissions
	*/
	@Override
	public java.util.List<eu.gerhards.liferay.services.angular.model.AngularResourcePermission> getAngularResourcePermissions(
		int start, int end) {
		return _angularResourcePermissionLocalService.getAngularResourcePermissions(start,
			end);
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
		return _angularResourcePermissionLocalService.dynamicQueryCount(dynamicQuery);
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
		return _angularResourcePermissionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public AngularResourcePermissionLocalService getWrappedService() {
		return _angularResourcePermissionLocalService;
	}

	@Override
	public void setWrappedService(
		AngularResourcePermissionLocalService angularResourcePermissionLocalService) {
		_angularResourcePermissionLocalService = angularResourcePermissionLocalService;
	}

	private AngularResourcePermissionLocalService _angularResourcePermissionLocalService;
}