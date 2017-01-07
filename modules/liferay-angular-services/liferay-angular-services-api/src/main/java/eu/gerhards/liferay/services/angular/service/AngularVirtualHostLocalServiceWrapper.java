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
 * Provides a wrapper for {@link AngularVirtualHostLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AngularVirtualHostLocalService
 * @generated
 */
@ProviderType
public class AngularVirtualHostLocalServiceWrapper
	implements AngularVirtualHostLocalService,
		ServiceWrapper<AngularVirtualHostLocalService> {
	public AngularVirtualHostLocalServiceWrapper(
		AngularVirtualHostLocalService angularVirtualHostLocalService) {
		_angularVirtualHostLocalService = angularVirtualHostLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _angularVirtualHostLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _angularVirtualHostLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _angularVirtualHostLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularVirtualHostLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularVirtualHostLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the Virtual host to the database. Also notifies the appropriate model listeners.
	*
	* @param angularVirtualHost the Virtual host
	* @return the Virtual host that was added
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularVirtualHost addAngularVirtualHost(
		eu.gerhards.liferay.services.angular.model.AngularVirtualHost angularVirtualHost) {
		return _angularVirtualHostLocalService.addAngularVirtualHost(angularVirtualHost);
	}

	/**
	* Creates a new Virtual host with the primary key. Does not add the Virtual host to the database.
	*
	* @param virtualHostId the primary key for the new Virtual host
	* @return the new Virtual host
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularVirtualHost createAngularVirtualHost(
		long virtualHostId) {
		return _angularVirtualHostLocalService.createAngularVirtualHost(virtualHostId);
	}

	/**
	* Deletes the Virtual host from the database. Also notifies the appropriate model listeners.
	*
	* @param angularVirtualHost the Virtual host
	* @return the Virtual host that was removed
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularVirtualHost deleteAngularVirtualHost(
		eu.gerhards.liferay.services.angular.model.AngularVirtualHost angularVirtualHost) {
		return _angularVirtualHostLocalService.deleteAngularVirtualHost(angularVirtualHost);
	}

	/**
	* Deletes the Virtual host with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param virtualHostId the primary key of the Virtual host
	* @return the Virtual host that was removed
	* @throws PortalException if a Virtual host with the primary key could not be found
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularVirtualHost deleteAngularVirtualHost(
		long virtualHostId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularVirtualHostLocalService.deleteAngularVirtualHost(virtualHostId);
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularVirtualHost fetchAngularVirtualHost(
		long virtualHostId) {
		return _angularVirtualHostLocalService.fetchAngularVirtualHost(virtualHostId);
	}

	/**
	* Returns the Virtual host with the primary key.
	*
	* @param virtualHostId the primary key of the Virtual host
	* @return the Virtual host
	* @throws PortalException if a Virtual host with the primary key could not be found
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularVirtualHost getAngularVirtualHost(
		long virtualHostId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularVirtualHostLocalService.getAngularVirtualHost(virtualHostId);
	}

	/**
	* Updates the Virtual host in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param angularVirtualHost the Virtual host
	* @return the Virtual host that was updated
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularVirtualHost updateAngularVirtualHost(
		eu.gerhards.liferay.services.angular.model.AngularVirtualHost angularVirtualHost) {
		return _angularVirtualHostLocalService.updateAngularVirtualHost(angularVirtualHost);
	}

	/**
	* Returns the number of Virtual hosts.
	*
	* @return the number of Virtual hosts
	*/
	@Override
	public int getAngularVirtualHostsCount() {
		return _angularVirtualHostLocalService.getAngularVirtualHostsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _angularVirtualHostLocalService.getOSGiServiceIdentifier();
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
		return _angularVirtualHostLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularVirtualHostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _angularVirtualHostLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularVirtualHostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _angularVirtualHostLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the Virtual hosts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularVirtualHostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Virtual hosts
	* @param end the upper bound of the range of Virtual hosts (not inclusive)
	* @return the range of Virtual hosts
	*/
	@Override
	public java.util.List<eu.gerhards.liferay.services.angular.model.AngularVirtualHost> getAngularVirtualHosts(
		int start, int end) {
		return _angularVirtualHostLocalService.getAngularVirtualHosts(start, end);
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
		return _angularVirtualHostLocalService.dynamicQueryCount(dynamicQuery);
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
		return _angularVirtualHostLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public AngularVirtualHostLocalService getWrappedService() {
		return _angularVirtualHostLocalService;
	}

	@Override
	public void setWrappedService(
		AngularVirtualHostLocalService angularVirtualHostLocalService) {
		_angularVirtualHostLocalService = angularVirtualHostLocalService;
	}

	private AngularVirtualHostLocalService _angularVirtualHostLocalService;
}