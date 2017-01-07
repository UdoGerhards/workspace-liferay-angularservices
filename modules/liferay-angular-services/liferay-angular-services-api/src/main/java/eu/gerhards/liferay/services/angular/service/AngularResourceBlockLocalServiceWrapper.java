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
 * Provides a wrapper for {@link AngularResourceBlockLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AngularResourceBlockLocalService
 * @generated
 */
@ProviderType
public class AngularResourceBlockLocalServiceWrapper
	implements AngularResourceBlockLocalService,
		ServiceWrapper<AngularResourceBlockLocalService> {
	public AngularResourceBlockLocalServiceWrapper(
		AngularResourceBlockLocalService angularResourceBlockLocalService) {
		_angularResourceBlockLocalService = angularResourceBlockLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _angularResourceBlockLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _angularResourceBlockLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _angularResourceBlockLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularResourceBlockLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularResourceBlockLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the Resource block to the database. Also notifies the appropriate model listeners.
	*
	* @param angularResourceBlock the Resource block
	* @return the Resource block that was added
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularResourceBlock addAngularResourceBlock(
		eu.gerhards.liferay.services.angular.model.AngularResourceBlock angularResourceBlock) {
		return _angularResourceBlockLocalService.addAngularResourceBlock(angularResourceBlock);
	}

	/**
	* Creates a new Resource block with the primary key. Does not add the Resource block to the database.
	*
	* @param resourceBlockId the primary key for the new Resource block
	* @return the new Resource block
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularResourceBlock createAngularResourceBlock(
		long resourceBlockId) {
		return _angularResourceBlockLocalService.createAngularResourceBlock(resourceBlockId);
	}

	/**
	* Deletes the Resource block from the database. Also notifies the appropriate model listeners.
	*
	* @param angularResourceBlock the Resource block
	* @return the Resource block that was removed
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularResourceBlock deleteAngularResourceBlock(
		eu.gerhards.liferay.services.angular.model.AngularResourceBlock angularResourceBlock) {
		return _angularResourceBlockLocalService.deleteAngularResourceBlock(angularResourceBlock);
	}

	/**
	* Deletes the Resource block with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param resourceBlockId the primary key of the Resource block
	* @return the Resource block that was removed
	* @throws PortalException if a Resource block with the primary key could not be found
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularResourceBlock deleteAngularResourceBlock(
		long resourceBlockId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularResourceBlockLocalService.deleteAngularResourceBlock(resourceBlockId);
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularResourceBlock fetchAngularResourceBlock(
		long resourceBlockId) {
		return _angularResourceBlockLocalService.fetchAngularResourceBlock(resourceBlockId);
	}

	/**
	* Returns the Resource block with the primary key.
	*
	* @param resourceBlockId the primary key of the Resource block
	* @return the Resource block
	* @throws PortalException if a Resource block with the primary key could not be found
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularResourceBlock getAngularResourceBlock(
		long resourceBlockId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _angularResourceBlockLocalService.getAngularResourceBlock(resourceBlockId);
	}

	/**
	* Updates the Resource block in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param angularResourceBlock the Resource block
	* @return the Resource block that was updated
	*/
	@Override
	public eu.gerhards.liferay.services.angular.model.AngularResourceBlock updateAngularResourceBlock(
		eu.gerhards.liferay.services.angular.model.AngularResourceBlock angularResourceBlock) {
		return _angularResourceBlockLocalService.updateAngularResourceBlock(angularResourceBlock);
	}

	/**
	* Returns the number of Resource blocks.
	*
	* @return the number of Resource blocks
	*/
	@Override
	public int getAngularResourceBlocksCount() {
		return _angularResourceBlockLocalService.getAngularResourceBlocksCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _angularResourceBlockLocalService.getOSGiServiceIdentifier();
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
		return _angularResourceBlockLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularResourceBlockModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _angularResourceBlockLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularResourceBlockModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _angularResourceBlockLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the Resource blocks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularResourceBlockModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Resource blocks
	* @param end the upper bound of the range of Resource blocks (not inclusive)
	* @return the range of Resource blocks
	*/
	@Override
	public java.util.List<eu.gerhards.liferay.services.angular.model.AngularResourceBlock> getAngularResourceBlocks(
		int start, int end) {
		return _angularResourceBlockLocalService.getAngularResourceBlocks(start,
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
		return _angularResourceBlockLocalService.dynamicQueryCount(dynamicQuery);
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
		return _angularResourceBlockLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public AngularResourceBlockLocalService getWrappedService() {
		return _angularResourceBlockLocalService;
	}

	@Override
	public void setWrappedService(
		AngularResourceBlockLocalService angularResourceBlockLocalService) {
		_angularResourceBlockLocalService = angularResourceBlockLocalService;
	}

	private AngularResourceBlockLocalService _angularResourceBlockLocalService;
}