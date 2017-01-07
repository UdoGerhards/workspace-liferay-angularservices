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
 * Provides a wrapper for {@link AngularInstanceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AngularInstanceLocalService
 * @generated
 */
@ProviderType
public class AngularInstanceLocalServiceWrapper
	implements AngularInstanceLocalService,
		ServiceWrapper<AngularInstanceLocalService> {
	public AngularInstanceLocalServiceWrapper(
		AngularInstanceLocalService angularInstanceLocalService) {
		_angularInstanceLocalService = angularInstanceLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _angularInstanceLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _angularInstanceLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _angularInstanceLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularInstanceLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularInstanceLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the Instance to the database. Also notifies the appropriate model listeners.
	*
	* @param angularInstance the Instance
	* @return the Instance that was added
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularInstance addAngularInstance(
		eu.gerhards.liferay.services.angular.model.AngularInstance angularInstance) {
		return _angularInstanceLocalService.addAngularInstance(angularInstance);
	}

	/**
	* Creates a new Instance with the primary key. Does not add the Instance to the database.
	*
	* @param instanceId the primary key for the new Instance
	* @return the new Instance
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularInstance createAngularInstance(
		long instanceId) {
		return _angularInstanceLocalService.createAngularInstance(instanceId);
	}

	/**
	* Deletes the Instance from the database. Also notifies the appropriate model listeners.
	*
	* @param angularInstance the Instance
	* @return the Instance that was removed
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularInstance deleteAngularInstance(
		eu.gerhards.liferay.services.angular.model.AngularInstance angularInstance) {
		return _angularInstanceLocalService.deleteAngularInstance(angularInstance);
	}

	/**
	* Deletes the Instance with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param instanceId the primary key of the Instance
	* @return the Instance that was removed
	* @throws PortalException if a Instance with the primary key could not be found
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularInstance deleteAngularInstance(
		long instanceId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularInstanceLocalService.deleteAngularInstance(instanceId);
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularInstance fetchAngularInstance(
		long instanceId) {
		return _angularInstanceLocalService.fetchAngularInstance(instanceId);
	}

	/**
	* Returns the Instance with the primary key.
	*
	* @param instanceId the primary key of the Instance
	* @return the Instance
	* @throws PortalException if a Instance with the primary key could not be found
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularInstance getAngularInstance(
		long instanceId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularInstanceLocalService.getAngularInstance(instanceId);
	}

	/**
	* Updates the Instance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param angularInstance the Instance
	* @return the Instance that was updated
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularInstance updateAngularInstance(
		eu.gerhards.liferay.services.angular.model.AngularInstance angularInstance) {
		return _angularInstanceLocalService.updateAngularInstance(angularInstance);
	}

	/**
	* Returns the number of Instances.
	*
	* @return the number of Instances
	*/
	@Override
	public int getAngularInstancesCount() {
		return _angularInstanceLocalService.getAngularInstancesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _angularInstanceLocalService.getOSGiServiceIdentifier();
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
		return _angularInstanceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _angularInstanceLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _angularInstanceLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the Instances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Instances
	* @param end the upper bound of the range of Instances (not inclusive)
	* @return the range of Instances
	*/
	@Override
	public java.util.List<eu.gerhards.liferay.services.angular.model.AngularInstance> getAngularInstances(
		int start, int end) {
		return _angularInstanceLocalService.getAngularInstances(start, end);
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
		return _angularInstanceLocalService.dynamicQueryCount(dynamicQuery);
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
		return _angularInstanceLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public AngularInstanceLocalService getWrappedService() {
		return _angularInstanceLocalService;
	}

	@Override
	public void setWrappedService(
		AngularInstanceLocalService angularInstanceLocalService) {
		_angularInstanceLocalService = angularInstanceLocalService;
	}

	private AngularInstanceLocalService _angularInstanceLocalService;
}