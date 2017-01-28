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
 * Provides a wrapper for {@link AngularLayoutSetLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AngularLayoutSetLocalService
 * @generated
 */
@ProviderType
public class AngularLayoutSetLocalServiceWrapper
	implements AngularLayoutSetLocalService,
		ServiceWrapper<AngularLayoutSetLocalService> {
	public AngularLayoutSetLocalServiceWrapper(
		AngularLayoutSetLocalService angularLayoutSetLocalService) {
		_angularLayoutSetLocalService = angularLayoutSetLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _angularLayoutSetLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _angularLayoutSetLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _angularLayoutSetLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularLayoutSetLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularLayoutSetLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the LayoutSet to the database. Also notifies the appropriate model listeners.
	*
	* @param angularLayoutSet the LayoutSet
	* @return the LayoutSet that was added
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularLayoutSet addAngularLayoutSet(
		eu.gerhards.liferay.services.angular.model.AngularLayoutSet angularLayoutSet) {
		return _angularLayoutSetLocalService.addAngularLayoutSet(angularLayoutSet);
	}

	/**
	* Creates a new LayoutSet with the primary key. Does not add the LayoutSet to the database.
	*
	* @param layoutSetId the primary key for the new LayoutSet
	* @return the new LayoutSet
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularLayoutSet createAngularLayoutSet(
		long layoutSetId) {
		return _angularLayoutSetLocalService.createAngularLayoutSet(layoutSetId);
	}

	/**
	* Deletes the LayoutSet from the database. Also notifies the appropriate model listeners.
	*
	* @param angularLayoutSet the LayoutSet
	* @return the LayoutSet that was removed
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularLayoutSet deleteAngularLayoutSet(
		eu.gerhards.liferay.services.angular.model.AngularLayoutSet angularLayoutSet) {
		return _angularLayoutSetLocalService.deleteAngularLayoutSet(angularLayoutSet);
	}

	/**
	* Deletes the LayoutSet with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param layoutSetId the primary key of the LayoutSet
	* @return the LayoutSet that was removed
	* @throws PortalException if a LayoutSet with the primary key could not be found
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularLayoutSet deleteAngularLayoutSet(
		long layoutSetId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularLayoutSetLocalService.deleteAngularLayoutSet(layoutSetId);
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularLayoutSet fetchAngularLayoutSet(
		long layoutSetId) {
		return _angularLayoutSetLocalService.fetchAngularLayoutSet(layoutSetId);
	}

	/**
	* Returns the LayoutSet with the primary key.
	*
	* @param layoutSetId the primary key of the LayoutSet
	* @return the LayoutSet
	* @throws PortalException if a LayoutSet with the primary key could not be found
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularLayoutSet getAngularLayoutSet(
		long layoutSetId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularLayoutSetLocalService.getAngularLayoutSet(layoutSetId);
	}

	/**
	* Updates the LayoutSet in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param angularLayoutSet the LayoutSet
	* @return the LayoutSet that was updated
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularLayoutSet updateAngularLayoutSet(
		eu.gerhards.liferay.services.angular.model.AngularLayoutSet angularLayoutSet) {
		return _angularLayoutSetLocalService.updateAngularLayoutSet(angularLayoutSet);
	}

	/**
	* Returns the number of LayoutSets.
	*
	* @return the number of LayoutSets
	*/
	@Override
	public int getAngularLayoutSetsCount() {
		return _angularLayoutSetLocalService.getAngularLayoutSetsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _angularLayoutSetLocalService.getOSGiServiceIdentifier();
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
		return _angularLayoutSetLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularLayoutSetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _angularLayoutSetLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularLayoutSetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _angularLayoutSetLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the LayoutSets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularLayoutSetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of LayoutSets
	* @param end the upper bound of the range of LayoutSets (not inclusive)
	* @return the range of LayoutSets
	*/
	@Override
	public java.util.List<eu.gerhards.liferay.services.angular.model.AngularLayoutSet> getAngularLayoutSets(
		int start, int end) {
		return _angularLayoutSetLocalService.getAngularLayoutSets(start, end);
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
		return _angularLayoutSetLocalService.dynamicQueryCount(dynamicQuery);
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
		return _angularLayoutSetLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public AngularLayoutSetLocalService getWrappedService() {
		return _angularLayoutSetLocalService;
	}

	@Override
	public void setWrappedService(
		AngularLayoutSetLocalService angularLayoutSetLocalService) {
		_angularLayoutSetLocalService = angularLayoutSetLocalService;
	}

	private AngularLayoutSetLocalService _angularLayoutSetLocalService;
}