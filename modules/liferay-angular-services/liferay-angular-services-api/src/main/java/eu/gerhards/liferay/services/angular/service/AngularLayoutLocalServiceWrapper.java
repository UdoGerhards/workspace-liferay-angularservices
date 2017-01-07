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
 * Provides a wrapper for {@link AngularLayoutLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AngularLayoutLocalService
 * @generated
 */
@ProviderType
public class AngularLayoutLocalServiceWrapper
	implements AngularLayoutLocalService,
		ServiceWrapper<AngularLayoutLocalService> {
	public AngularLayoutLocalServiceWrapper(
		AngularLayoutLocalService angularLayoutLocalService) {
		_angularLayoutLocalService = angularLayoutLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _angularLayoutLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _angularLayoutLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _angularLayoutLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularLayoutLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularLayoutLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the Layout to the database. Also notifies the appropriate model listeners.
	*
	* @param angularLayout the Layout
	* @return the Layout that was added
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularLayout addAngularLayout(
		eu.gerhards.liferay.services.angular.model.AngularLayout angularLayout) {
		return _angularLayoutLocalService.addAngularLayout(angularLayout);
	}

	/**
	* Creates a new Layout with the primary key. Does not add the Layout to the database.
	*
	* @param layoutId the primary key for the new Layout
	* @return the new Layout
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularLayout createAngularLayout(
		long layoutId) {
		return _angularLayoutLocalService.createAngularLayout(layoutId);
	}

	/**
	* Deletes the Layout from the database. Also notifies the appropriate model listeners.
	*
	* @param angularLayout the Layout
	* @return the Layout that was removed
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularLayout deleteAngularLayout(
		eu.gerhards.liferay.services.angular.model.AngularLayout angularLayout) {
		return _angularLayoutLocalService.deleteAngularLayout(angularLayout);
	}

	/**
	* Deletes the Layout with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param layoutId the primary key of the Layout
	* @return the Layout that was removed
	* @throws PortalException if a Layout with the primary key could not be found
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularLayout deleteAngularLayout(
		long layoutId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularLayoutLocalService.deleteAngularLayout(layoutId);
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularLayout fetchAngularLayout(
		long layoutId) {
		return _angularLayoutLocalService.fetchAngularLayout(layoutId);
	}

	/**
	* Returns the Layout with the primary key.
	*
	* @param layoutId the primary key of the Layout
	* @return the Layout
	* @throws PortalException if a Layout with the primary key could not be found
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularLayout getAngularLayout(
		long layoutId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularLayoutLocalService.getAngularLayout(layoutId);
	}

	/**
	* Updates the Layout in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param angularLayout the Layout
	* @return the Layout that was updated
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularLayout updateAngularLayout(
		eu.gerhards.liferay.services.angular.model.AngularLayout angularLayout) {
		return _angularLayoutLocalService.updateAngularLayout(angularLayout);
	}

	/**
	* Returns the number of Layouts.
	*
	* @return the number of Layouts
	*/
	@Override
	public int getAngularLayoutsCount() {
		return _angularLayoutLocalService.getAngularLayoutsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _angularLayoutLocalService.getOSGiServiceIdentifier();
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
		return _angularLayoutLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularLayoutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _angularLayoutLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularLayoutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _angularLayoutLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the Layouts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularLayoutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Layouts
	* @param end the upper bound of the range of Layouts (not inclusive)
	* @return the range of Layouts
	*/
	@Override
	public java.util.List<eu.gerhards.liferay.services.angular.model.AngularLayout> getAngularLayouts(
		int start, int end) {
		return _angularLayoutLocalService.getAngularLayouts(start, end);
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
		return _angularLayoutLocalService.dynamicQueryCount(dynamicQuery);
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
		return _angularLayoutLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public AngularLayoutLocalService getWrappedService() {
		return _angularLayoutLocalService;
	}

	@Override
	public void setWrappedService(
		AngularLayoutLocalService angularLayoutLocalService) {
		_angularLayoutLocalService = angularLayoutLocalService;
	}

	private AngularLayoutLocalService _angularLayoutLocalService;
}