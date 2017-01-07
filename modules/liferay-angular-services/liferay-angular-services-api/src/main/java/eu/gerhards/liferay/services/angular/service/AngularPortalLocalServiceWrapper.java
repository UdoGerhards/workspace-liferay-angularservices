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
 * Provides a wrapper for {@link AngularPortalLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AngularPortalLocalService
 * @generated
 */
@ProviderType
public class AngularPortalLocalServiceWrapper
	implements AngularPortalLocalService,
		ServiceWrapper<AngularPortalLocalService> {
	public AngularPortalLocalServiceWrapper(
		AngularPortalLocalService angularPortalLocalService) {
		_angularPortalLocalService = angularPortalLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _angularPortalLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _angularPortalLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _angularPortalLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularPortalLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularPortalLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the Portal to the database. Also notifies the appropriate model listeners.
	*
	* @param angularPortal the Portal
	* @return the Portal that was added
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularPortal addAngularPortal(
		eu.gerhards.liferay.services.angular.model.AngularPortal angularPortal) {
		return _angularPortalLocalService.addAngularPortal(angularPortal);
	}

	/**
	* Creates a new Portal with the primary key. Does not add the Portal to the database.
	*
	* @param portalId the primary key for the new Portal
	* @return the new Portal
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularPortal createAngularPortal(
		long portalId) {
		return _angularPortalLocalService.createAngularPortal(portalId);
	}

	/**
	* Deletes the Portal from the database. Also notifies the appropriate model listeners.
	*
	* @param angularPortal the Portal
	* @return the Portal that was removed
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularPortal deleteAngularPortal(
		eu.gerhards.liferay.services.angular.model.AngularPortal angularPortal) {
		return _angularPortalLocalService.deleteAngularPortal(angularPortal);
	}

	/**
	* Deletes the Portal with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param portalId the primary key of the Portal
	* @return the Portal that was removed
	* @throws PortalException if a Portal with the primary key could not be found
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularPortal deleteAngularPortal(
		long portalId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularPortalLocalService.deleteAngularPortal(portalId);
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularPortal fetchAngularPortal(
		long portalId) {
		return _angularPortalLocalService.fetchAngularPortal(portalId);
	}

	/**
	* Returns the Portal with the primary key.
	*
	* @param portalId the primary key of the Portal
	* @return the Portal
	* @throws PortalException if a Portal with the primary key could not be found
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularPortal getAngularPortal(
		long portalId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularPortalLocalService.getAngularPortal(portalId);
	}

	/**
	* Updates the Portal in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param angularPortal the Portal
	* @return the Portal that was updated
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularPortal updateAngularPortal(
		eu.gerhards.liferay.services.angular.model.AngularPortal angularPortal) {
		return _angularPortalLocalService.updateAngularPortal(angularPortal);
	}

	/**
	* Returns the number of Portals.
	*
	* @return the number of Portals
	*/
	@Override
	public int getAngularPortalsCount() {
		return _angularPortalLocalService.getAngularPortalsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _angularPortalLocalService.getOSGiServiceIdentifier();
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
		return _angularPortalLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularPortalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _angularPortalLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularPortalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _angularPortalLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the Portals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularPortalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Portals
	* @param end the upper bound of the range of Portals (not inclusive)
	* @return the range of Portals
	*/
	@Override
	public java.util.List<eu.gerhards.liferay.services.angular.model.AngularPortal> getAngularPortals(
		int start, int end) {
		return _angularPortalLocalService.getAngularPortals(start, end);
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
		return _angularPortalLocalService.dynamicQueryCount(dynamicQuery);
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
		return _angularPortalLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public AngularPortalLocalService getWrappedService() {
		return _angularPortalLocalService;
	}

	@Override
	public void setWrappedService(
		AngularPortalLocalService angularPortalLocalService) {
		_angularPortalLocalService = angularPortalLocalService;
	}

	private AngularPortalLocalService _angularPortalLocalService;
}