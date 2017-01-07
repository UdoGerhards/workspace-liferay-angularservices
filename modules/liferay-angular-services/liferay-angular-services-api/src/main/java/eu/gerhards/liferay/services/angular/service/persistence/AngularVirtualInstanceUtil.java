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
import eu.gerhards.liferay.services.angular.model.AngularVirtualInstance;
import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the Virtual instance service. This utility wraps {@link eu.gerhards.liferay.services.angular.service.persistence.impl.AngularVirtualInstancePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularVirtualInstancePersistence
 * @see eu.gerhards.liferay.services.angular.service.persistence.impl.AngularVirtualInstancePersistenceImpl
 * @generated
 */
@ProviderType
public class AngularVirtualInstanceUtil {
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
	public static void clearCache(AngularVirtualInstance angularVirtualInstance) {
		getPersistence().clearCache(angularVirtualInstance);
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
	public static List<AngularVirtualInstance> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AngularVirtualInstance> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AngularVirtualInstance> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AngularVirtualInstance> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AngularVirtualInstance update(
		AngularVirtualInstance angularVirtualInstance) {
		return getPersistence().update(angularVirtualInstance);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AngularVirtualInstance update(
		AngularVirtualInstance angularVirtualInstance,
		ServiceContext serviceContext) {
		return getPersistence().update(angularVirtualInstance, serviceContext);
	}

	/**
	* Caches the Virtual instance in the entity cache if it is enabled.
	*
	* @param angularVirtualInstance the Virtual instance
	*/
	public static void cacheResult(
		AngularVirtualInstance angularVirtualInstance) {
		getPersistence().cacheResult(angularVirtualInstance);
	}

	/**
	* Caches the Virtual instances in the entity cache if it is enabled.
	*
	* @param angularVirtualInstances the Virtual instances
	*/
	public static void cacheResult(
		List<AngularVirtualInstance> angularVirtualInstances) {
		getPersistence().cacheResult(angularVirtualInstances);
	}

	/**
	* Creates a new Virtual instance with the primary key. Does not add the Virtual instance to the database.
	*
	* @param virtualInstanceId the primary key for the new Virtual instance
	* @return the new Virtual instance
	*/
	public static AngularVirtualInstance create(long virtualInstanceId) {
		return getPersistence().create(virtualInstanceId);
	}

	/**
	* Removes the Virtual instance with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param virtualInstanceId the primary key of the Virtual instance
	* @return the Virtual instance that was removed
	* @throws NoSuchAngularVirtualInstanceException if a Virtual instance with the primary key could not be found
	*/
	public static AngularVirtualInstance remove(long virtualInstanceId)
		throws eu.gerhards.liferay.services.angular.exception.NoSuchAngularVirtualInstanceException {
		return getPersistence().remove(virtualInstanceId);
	}

	public static AngularVirtualInstance updateImpl(
		AngularVirtualInstance angularVirtualInstance) {
		return getPersistence().updateImpl(angularVirtualInstance);
	}

	/**
	* Returns the Virtual instance with the primary key or throws a {@link NoSuchAngularVirtualInstanceException} if it could not be found.
	*
	* @param virtualInstanceId the primary key of the Virtual instance
	* @return the Virtual instance
	* @throws NoSuchAngularVirtualInstanceException if a Virtual instance with the primary key could not be found
	*/
	public static AngularVirtualInstance findByPrimaryKey(
		long virtualInstanceId)
		throws eu.gerhards.liferay.services.angular.exception.NoSuchAngularVirtualInstanceException {
		return getPersistence().findByPrimaryKey(virtualInstanceId);
	}

	/**
	* Returns the Virtual instance with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param virtualInstanceId the primary key of the Virtual instance
	* @return the Virtual instance, or <code>null</code> if a Virtual instance with the primary key could not be found
	*/
	public static AngularVirtualInstance fetchByPrimaryKey(
		long virtualInstanceId) {
		return getPersistence().fetchByPrimaryKey(virtualInstanceId);
	}

	public static java.util.Map<java.io.Serializable, AngularVirtualInstance> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the Virtual instances.
	*
	* @return the Virtual instances
	*/
	public static List<AngularVirtualInstance> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the Virtual instances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularVirtualInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Virtual instances
	* @param end the upper bound of the range of Virtual instances (not inclusive)
	* @return the range of Virtual instances
	*/
	public static List<AngularVirtualInstance> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the Virtual instances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularVirtualInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Virtual instances
	* @param end the upper bound of the range of Virtual instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Virtual instances
	*/
	public static List<AngularVirtualInstance> findAll(int start, int end,
		OrderByComparator<AngularVirtualInstance> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the Virtual instances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularVirtualInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Virtual instances
	* @param end the upper bound of the range of Virtual instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of Virtual instances
	*/
	public static List<AngularVirtualInstance> findAll(int start, int end,
		OrderByComparator<AngularVirtualInstance> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the Virtual instances from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of Virtual instances.
	*
	* @return the number of Virtual instances
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AngularVirtualInstancePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AngularVirtualInstancePersistence, AngularVirtualInstancePersistence> _serviceTracker =
		ServiceTrackerFactory.open(AngularVirtualInstancePersistence.class);
}