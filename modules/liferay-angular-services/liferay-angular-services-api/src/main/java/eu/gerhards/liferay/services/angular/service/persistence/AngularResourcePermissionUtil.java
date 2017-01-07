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

package eu.gerhards.liferay.services.angular.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import eu.gerhards.liferay.services.angular.model.AngularResourcePermission;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the Resource permission service. This utility wraps {@link eu.gerhards.liferay.services.angular.service.persistence.impl.AngularResourcePermissionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularResourcePermissionPersistence
 * @see eu.gerhards.liferay.services.angular.service.persistence.impl.AngularResourcePermissionPersistenceImpl
 * @generated
 */
@ProviderType
public class AngularResourcePermissionUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(
		AngularResourcePermission angularResourcePermission) {
		getPersistence().clearCache(angularResourcePermission);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AngularResourcePermission> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AngularResourcePermission> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AngularResourcePermission> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AngularResourcePermission> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AngularResourcePermission update(
		AngularResourcePermission angularResourcePermission) {
		return getPersistence().update(angularResourcePermission);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AngularResourcePermission update(
		AngularResourcePermission angularResourcePermission,
		ServiceContext serviceContext) {
		return getPersistence().update(angularResourcePermission, serviceContext);
	}

	/**
	* Caches the Resource permission in the entity cache if it is enabled.
	*
	* @param angularResourcePermission the Resource permission
	*/
	public static void cacheResult(
		AngularResourcePermission angularResourcePermission) {
		getPersistence().cacheResult(angularResourcePermission);
	}

	/**
	* Caches the Resource permissions in the entity cache if it is enabled.
	*
	* @param angularResourcePermissions the Resource permissions
	*/
	public static void cacheResult(
		List<AngularResourcePermission> angularResourcePermissions) {
		getPersistence().cacheResult(angularResourcePermissions);
	}

	/**
	* Creates a new Resource permission with the primary key. Does not add the Resource permission to the database.
	*
	* @param resourcePermissionId the primary key for the new Resource permission
	* @return the new Resource permission
	*/
	public static AngularResourcePermission create(long resourcePermissionId) {
		return getPersistence().create(resourcePermissionId);
	}

	/**
	* Removes the Resource permission with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param resourcePermissionId the primary key of the Resource permission
	* @return the Resource permission that was removed
	* @throws NoSuchAngularResourcePermissionException if a Resource permission with the primary key could not be found
	*/
	public static AngularResourcePermission remove(long resourcePermissionId)
		throws eu.gerhards.liferay.services.angular.exception.NoSuchAngularResourcePermissionException {
		return getPersistence().remove(resourcePermissionId);
	}

	public static AngularResourcePermission updateImpl(
		AngularResourcePermission angularResourcePermission) {
		return getPersistence().updateImpl(angularResourcePermission);
	}

	/**
	* Returns the Resource permission with the primary key or throws a {@link NoSuchAngularResourcePermissionException} if it could not be found.
	*
	* @param resourcePermissionId the primary key of the Resource permission
	* @return the Resource permission
	* @throws NoSuchAngularResourcePermissionException if a Resource permission with the primary key could not be found
	*/
	public static AngularResourcePermission findByPrimaryKey(
		long resourcePermissionId)
		throws eu.gerhards.liferay.services.angular.exception.NoSuchAngularResourcePermissionException {
		return getPersistence().findByPrimaryKey(resourcePermissionId);
	}

	/**
	* Returns the Resource permission with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param resourcePermissionId the primary key of the Resource permission
	* @return the Resource permission, or <code>null</code> if a Resource permission with the primary key could not be found
	*/
	public static AngularResourcePermission fetchByPrimaryKey(
		long resourcePermissionId) {
		return getPersistence().fetchByPrimaryKey(resourcePermissionId);
	}

	public static java.util.Map<java.io.Serializable, AngularResourcePermission> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the Resource permissions.
	*
	* @return the Resource permissions
	*/
	public static List<AngularResourcePermission> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the Resource permissions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularResourcePermissionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Resource permissions
	* @param end the upper bound of the range of Resource permissions (not inclusive)
	* @return the range of Resource permissions
	*/
	public static List<AngularResourcePermission> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the Resource permissions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularResourcePermissionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Resource permissions
	* @param end the upper bound of the range of Resource permissions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Resource permissions
	*/
	public static List<AngularResourcePermission> findAll(int start, int end,
		OrderByComparator<AngularResourcePermission> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the Resource permissions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularResourcePermissionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Resource permissions
	* @param end the upper bound of the range of Resource permissions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of Resource permissions
	*/
	public static List<AngularResourcePermission> findAll(int start, int end,
		OrderByComparator<AngularResourcePermission> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the Resource permissions from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of Resource permissions.
	*
	* @return the number of Resource permissions
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AngularResourcePermissionPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AngularResourcePermissionPersistence, AngularResourcePermissionPersistence> _serviceTracker =
		ServiceTrackerFactory.open(AngularResourcePermissionPersistence.class);
}