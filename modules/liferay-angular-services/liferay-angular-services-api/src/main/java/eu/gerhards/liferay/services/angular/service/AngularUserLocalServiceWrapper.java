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
 * Provides a wrapper for {@link AngularUserLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AngularUserLocalService
 * @generated
 */
@ProviderType
public class AngularUserLocalServiceWrapper implements AngularUserLocalService,
	ServiceWrapper<AngularUserLocalService> {
	public AngularUserLocalServiceWrapper(
		AngularUserLocalService angularUserLocalService) {
		_angularUserLocalService = angularUserLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _angularUserLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _angularUserLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _angularUserLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the User to the database. Also notifies the appropriate model listeners.
	*
	* @param angularUser the User
	* @return the User that was added
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularUser addAngularUser(
		eu.gerhards.liferay.services.angular.model.AngularUser angularUser) {
		return _angularUserLocalService.addAngularUser(angularUser);
	}

	/**
	* Creates a new User with the primary key. Does not add the User to the database.
	*
	* @param userId the primary key for the new User
	* @return the new User
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularUser createAngularUser(
		long userId) {
		return _angularUserLocalService.createAngularUser(userId);
	}

	/**
	* Deletes the User from the database. Also notifies the appropriate model listeners.
	*
	* @param angularUser the User
	* @return the User that was removed
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularUser deleteAngularUser(
		eu.gerhards.liferay.services.angular.model.AngularUser angularUser) {
		return _angularUserLocalService.deleteAngularUser(angularUser);
	}

	/**
	* Deletes the User with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userId the primary key of the User
	* @return the User that was removed
	* @throws PortalException if a User with the primary key could not be found
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularUser deleteAngularUser(
		long userId) throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserLocalService.deleteAngularUser(userId);
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularUser fetchAngularUser(
		long userId) {
		return _angularUserLocalService.fetchAngularUser(userId);
	}

	/**
	* Returns the User with the primary key.
	*
	* @param userId the primary key of the User
	* @return the User
	* @throws PortalException if a User with the primary key could not be found
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularUser getAngularUser(
		long userId) throws com.liferay.portal.kernel.exception.PortalException {
		return _angularUserLocalService.getAngularUser(userId);
	}

	/**
	* Updates the User in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param angularUser the User
	* @return the User that was updated
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularUser updateAngularUser(
		eu.gerhards.liferay.services.angular.model.AngularUser angularUser) {
		return _angularUserLocalService.updateAngularUser(angularUser);
	}

	/**
	* Returns the number of Users.
	*
	* @return the number of Users
	*/
	@Override
	public int getAngularUsersCount() {
		return _angularUserLocalService.getAngularUsersCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _angularUserLocalService.getOSGiServiceIdentifier();
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
		return _angularUserLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _angularUserLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _angularUserLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the Users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Users
	* @param end the upper bound of the range of Users (not inclusive)
	* @return the range of Users
	*/
	@Override
	public java.util.List<eu.gerhards.liferay.services.angular.model.AngularUser> getAngularUsers(
		int start, int end) {
		return _angularUserLocalService.getAngularUsers(start, end);
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
		return _angularUserLocalService.dynamicQueryCount(dynamicQuery);
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
		return _angularUserLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public AngularUserLocalService getWrappedService() {
		return _angularUserLocalService;
	}

	@Override
	public void setWrappedService(
		AngularUserLocalService angularUserLocalService) {
		_angularUserLocalService = angularUserLocalService;
	}

	private AngularUserLocalService _angularUserLocalService;
}