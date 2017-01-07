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

import eu.gerhards.liferay.services.angular.model.AngularInstance;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the Instance service. This utility wraps {@link eu.gerhards.liferay.services.angular.service.persistence.impl.AngularInstancePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularInstancePersistence
 * @see eu.gerhards.liferay.services.angular.service.persistence.impl.AngularInstancePersistenceImpl
 * @generated
 */
@ProviderType
public class AngularInstanceUtil {
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
	public static void clearCache(AngularInstance angularInstance) {
		getPersistence().clearCache(angularInstance);
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
	public static List<AngularInstance> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AngularInstance> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AngularInstance> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AngularInstance> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AngularInstance update(AngularInstance angularInstance) {
		return getPersistence().update(angularInstance);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AngularInstance update(AngularInstance angularInstance,
		ServiceContext serviceContext) {
		return getPersistence().update(angularInstance, serviceContext);
	}

	/**
	* Caches the Instance in the entity cache if it is enabled.
	*
	* @param angularInstance the Instance
	*/
	public static void cacheResult(AngularInstance angularInstance) {
		getPersistence().cacheResult(angularInstance);
	}

	/**
	* Caches the Instances in the entity cache if it is enabled.
	*
	* @param angularInstances the Instances
	*/
	public static void cacheResult(List<AngularInstance> angularInstances) {
		getPersistence().cacheResult(angularInstances);
	}

	/**
	* Creates a new Instance with the primary key. Does not add the Instance to the database.
	*
	* @param instanceId the primary key for the new Instance
	* @return the new Instance
	*/
	public static AngularInstance create(long instanceId) {
		return getPersistence().create(instanceId);
	}

	/**
	* Removes the Instance with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param instanceId the primary key of the Instance
	* @return the Instance that was removed
	* @throws NoSuchAngularInstanceException if a Instance with the primary key could not be found
	*/
	public static AngularInstance remove(long instanceId)
		throws eu.gerhards.liferay.services.angular.exception.NoSuchAngularInstanceException {
		return getPersistence().remove(instanceId);
	}

	public static AngularInstance updateImpl(AngularInstance angularInstance) {
		return getPersistence().updateImpl(angularInstance);
	}

	/**
	* Returns the Instance with the primary key or throws a {@link NoSuchAngularInstanceException} if it could not be found.
	*
	* @param instanceId the primary key of the Instance
	* @return the Instance
	* @throws NoSuchAngularInstanceException if a Instance with the primary key could not be found
	*/
	public static AngularInstance findByPrimaryKey(long instanceId)
		throws eu.gerhards.liferay.services.angular.exception.NoSuchAngularInstanceException {
		return getPersistence().findByPrimaryKey(instanceId);
	}

	/**
	* Returns the Instance with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param instanceId the primary key of the Instance
	* @return the Instance, or <code>null</code> if a Instance with the primary key could not be found
	*/
	public static AngularInstance fetchByPrimaryKey(long instanceId) {
		return getPersistence().fetchByPrimaryKey(instanceId);
	}

	public static java.util.Map<java.io.Serializable, AngularInstance> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the Instances.
	*
	* @return the Instances
	*/
	public static List<AngularInstance> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the Instances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Instances
	* @param end the upper bound of the range of Instances (not inclusive)
	* @return the range of Instances
	*/
	public static List<AngularInstance> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the Instances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Instances
	* @param end the upper bound of the range of Instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Instances
	*/
	public static List<AngularInstance> findAll(int start, int end,
		OrderByComparator<AngularInstance> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the Instances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Instances
	* @param end the upper bound of the range of Instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of Instances
	*/
	public static List<AngularInstance> findAll(int start, int end,
		OrderByComparator<AngularInstance> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the Instances from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of Instances.
	*
	* @return the number of Instances
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AngularInstancePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AngularInstancePersistence, AngularInstancePersistence> _serviceTracker =
		ServiceTrackerFactory.open(AngularInstancePersistence.class);
}