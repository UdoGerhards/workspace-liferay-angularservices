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
 * Provides a wrapper for {@link AngularRoleLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AngularRoleLocalService
 * @generated
 */
@ProviderType
public class AngularRoleLocalServiceWrapper implements AngularRoleLocalService,
	ServiceWrapper<AngularRoleLocalService> {
	public AngularRoleLocalServiceWrapper(
		AngularRoleLocalService angularRoleLocalService) {
		_angularRoleLocalService = angularRoleLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _angularRoleLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _angularRoleLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _angularRoleLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularRoleLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularRoleLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the Role to the database. Also notifies the appropriate model listeners.
	*
	* @param angularRole the Role
	* @return the Role that was added
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularRole addAngularRole(
		eu.gerhards.liferay.services.angular.model.AngularRole angularRole) {
		return _angularRoleLocalService.addAngularRole(angularRole);
	}

	/**
	* Creates a new Role with the primary key. Does not add the Role to the database.
	*
	* @param roleId the primary key for the new Role
	* @return the new Role
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularRole createAngularRole(
		long roleId) {
		return _angularRoleLocalService.createAngularRole(roleId);
	}

	/**
	* Deletes the Role from the database. Also notifies the appropriate model listeners.
	*
	* @param angularRole the Role
	* @return the Role that was removed
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularRole deleteAngularRole(
		eu.gerhards.liferay.services.angular.model.AngularRole angularRole) {
		return _angularRoleLocalService.deleteAngularRole(angularRole);
	}

	/**
	* Deletes the Role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param roleId the primary key of the Role
	* @return the Role that was removed
	* @throws PortalException if a Role with the primary key could not be found
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularRole deleteAngularRole(
		long roleId) throws com.liferay.portal.kernel.exception.PortalException {
		return _angularRoleLocalService.deleteAngularRole(roleId);
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularRole fetchAngularRole(
		long roleId) {
		return _angularRoleLocalService.fetchAngularRole(roleId);
	}

	/**
	* Returns the Role with the primary key.
	*
	* @param roleId the primary key of the Role
	* @return the Role
	* @throws PortalException if a Role with the primary key could not be found
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularRole getAngularRole(
		long roleId) throws com.liferay.portal.kernel.exception.PortalException {
		return _angularRoleLocalService.getAngularRole(roleId);
	}

	/**
	* Updates the Role in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param angularRole the Role
	* @return the Role that was updated
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularRole updateAngularRole(
		eu.gerhards.liferay.services.angular.model.AngularRole angularRole) {
		return _angularRoleLocalService.updateAngularRole(angularRole);
	}

	/**
	* Returns the number of Roles.
	*
	* @return the number of Roles
	*/
	@Override
	public int getAngularRolesCount() {
		return _angularRoleLocalService.getAngularRolesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _angularRoleLocalService.getOSGiServiceIdentifier();
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
		return _angularRoleLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _angularRoleLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _angularRoleLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the Roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Roles
	* @param end the upper bound of the range of Roles (not inclusive)
	* @return the range of Roles
	*/
	@Override
	public java.util.List<eu.gerhards.liferay.services.angular.model.AngularRole> getAngularRoles(
		int start, int end) {
		return _angularRoleLocalService.getAngularRoles(start, end);
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
		return _angularRoleLocalService.dynamicQueryCount(dynamicQuery);
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
		return _angularRoleLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public AngularRoleLocalService getWrappedService() {
		return _angularRoleLocalService;
	}

	@Override
	public void setWrappedService(
		AngularRoleLocalService angularRoleLocalService) {
		_angularRoleLocalService = angularRoleLocalService;
	}

	private AngularRoleLocalService _angularRoleLocalService;
}