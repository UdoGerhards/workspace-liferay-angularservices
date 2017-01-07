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
 * Provides a wrapper for {@link AngularOrganizationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AngularOrganizationLocalService
 * @generated
 */
@ProviderType
public class AngularOrganizationLocalServiceWrapper
	implements AngularOrganizationLocalService,
		ServiceWrapper<AngularOrganizationLocalService> {
	public AngularOrganizationLocalServiceWrapper(
		AngularOrganizationLocalService angularOrganizationLocalService) {
		_angularOrganizationLocalService = angularOrganizationLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _angularOrganizationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _angularOrganizationLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _angularOrganizationLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularOrganizationLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularOrganizationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the Organization to the database. Also notifies the appropriate model listeners.
	*
	* @param angularOrganization the Organization
	* @return the Organization that was added
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularOrganization addAngularOrganization(
		eu.gerhards.liferay.services.angular.model.AngularOrganization angularOrganization) {
		return _angularOrganizationLocalService.addAngularOrganization(angularOrganization);
	}

	/**
	* Creates a new Organization with the primary key. Does not add the Organization to the database.
	*
	* @param organizationId the primary key for the new Organization
	* @return the new Organization
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularOrganization createAngularOrganization(
		long organizationId) {
		return _angularOrganizationLocalService.createAngularOrganization(organizationId);
	}

	/**
	* Deletes the Organization from the database. Also notifies the appropriate model listeners.
	*
	* @param angularOrganization the Organization
	* @return the Organization that was removed
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularOrganization deleteAngularOrganization(
		eu.gerhards.liferay.services.angular.model.AngularOrganization angularOrganization) {
		return _angularOrganizationLocalService.deleteAngularOrganization(angularOrganization);
	}

	/**
	* Deletes the Organization with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param organizationId the primary key of the Organization
	* @return the Organization that was removed
	* @throws PortalException if a Organization with the primary key could not be found
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularOrganization deleteAngularOrganization(
		long organizationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularOrganizationLocalService.deleteAngularOrganization(organizationId);
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularOrganization fetchAngularOrganization(
		long organizationId) {
		return _angularOrganizationLocalService.fetchAngularOrganization(organizationId);
	}

	/**
	* Returns the Organization with the primary key.
	*
	* @param organizationId the primary key of the Organization
	* @return the Organization
	* @throws PortalException if a Organization with the primary key could not be found
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularOrganization getAngularOrganization(
		long organizationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularOrganizationLocalService.getAngularOrganization(organizationId);
	}

	/**
	* Updates the Organization in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param angularOrganization the Organization
	* @return the Organization that was updated
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularOrganization updateAngularOrganization(
		eu.gerhards.liferay.services.angular.model.AngularOrganization angularOrganization) {
		return _angularOrganizationLocalService.updateAngularOrganization(angularOrganization);
	}

	/**
	* Returns the number of Organizations.
	*
	* @return the number of Organizations
	*/
	@Override
	public int getAngularOrganizationsCount() {
		return _angularOrganizationLocalService.getAngularOrganizationsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _angularOrganizationLocalService.getOSGiServiceIdentifier();
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
		return _angularOrganizationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _angularOrganizationLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _angularOrganizationLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the Organizations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Organizations
	* @param end the upper bound of the range of Organizations (not inclusive)
	* @return the range of Organizations
	*/
	@Override
	public java.util.List<eu.gerhards.liferay.services.angular.model.AngularOrganization> getAngularOrganizations(
		int start, int end) {
		return _angularOrganizationLocalService.getAngularOrganizations(start,
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
		return _angularOrganizationLocalService.dynamicQueryCount(dynamicQuery);
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
		return _angularOrganizationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public AngularOrganizationLocalService getWrappedService() {
		return _angularOrganizationLocalService;
	}

	@Override
	public void setWrappedService(
		AngularOrganizationLocalService angularOrganizationLocalService) {
		_angularOrganizationLocalService = angularOrganizationLocalService;
	}

	private AngularOrganizationLocalService _angularOrganizationLocalService;
}