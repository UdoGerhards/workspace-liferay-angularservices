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
import eu.gerhards.liferay.services.angular.model.AngularBootstrap;
import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the Bootstrap service. This utility wraps {@link eu.gerhards.liferay.services.angular.service.persistence.impl.AngularBootstrapPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularBootstrapPersistence
 * @see eu.gerhards.liferay.services.angular.service.persistence.impl.AngularBootstrapPersistenceImpl
 * @generated
 */
@ProviderType
public class AngularBootstrapUtil {
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
	public static void clearCache(AngularBootstrap angularBootstrap) {
		getPersistence().clearCache(angularBootstrap);
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
	public static List<AngularBootstrap> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AngularBootstrap> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AngularBootstrap> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AngularBootstrap> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AngularBootstrap update(AngularBootstrap angularBootstrap) {
		return getPersistence().update(angularBootstrap);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AngularBootstrap update(AngularBootstrap angularBootstrap,
		ServiceContext serviceContext) {
		return getPersistence().update(angularBootstrap, serviceContext);
	}

	/**
	* Caches the Bootstrap in the entity cache if it is enabled.
	*
	* @param angularBootstrap the Bootstrap
	*/
	public static void cacheResult(AngularBootstrap angularBootstrap) {
		getPersistence().cacheResult(angularBootstrap);
	}

	/**
	* Caches the Bootstraps in the entity cache if it is enabled.
	*
	* @param angularBootstraps the Bootstraps
	*/
	public static void cacheResult(List<AngularBootstrap> angularBootstraps) {
		getPersistence().cacheResult(angularBootstraps);
	}

	/**
	* Creates a new Bootstrap with the primary key. Does not add the Bootstrap to the database.
	*
	* @param bootId the primary key for the new Bootstrap
	* @return the new Bootstrap
	*/
	public static AngularBootstrap create(long bootId) {
		return getPersistence().create(bootId);
	}

	/**
	* Removes the Bootstrap with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bootId the primary key of the Bootstrap
	* @return the Bootstrap that was removed
	* @throws NoSuchAngularBootstrapException if a Bootstrap with the primary key could not be found
	*/
	public static AngularBootstrap remove(long bootId)
		throws eu.gerhards.liferay.services.angular.exception.NoSuchAngularBootstrapException {
		return getPersistence().remove(bootId);
	}

	public static AngularBootstrap updateImpl(AngularBootstrap angularBootstrap) {
		return getPersistence().updateImpl(angularBootstrap);
	}

	/**
	* Returns the Bootstrap with the primary key or throws a {@link NoSuchAngularBootstrapException} if it could not be found.
	*
	* @param bootId the primary key of the Bootstrap
	* @return the Bootstrap
	* @throws NoSuchAngularBootstrapException if a Bootstrap with the primary key could not be found
	*/
	public static AngularBootstrap findByPrimaryKey(long bootId)
		throws eu.gerhards.liferay.services.angular.exception.NoSuchAngularBootstrapException {
		return getPersistence().findByPrimaryKey(bootId);
	}

	/**
	* Returns the Bootstrap with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bootId the primary key of the Bootstrap
	* @return the Bootstrap, or <code>null</code> if a Bootstrap with the primary key could not be found
	*/
	public static AngularBootstrap fetchByPrimaryKey(long bootId) {
		return getPersistence().fetchByPrimaryKey(bootId);
	}

	public static java.util.Map<java.io.Serializable, AngularBootstrap> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the Bootstraps.
	*
	* @return the Bootstraps
	*/
	public static List<AngularBootstrap> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the Bootstraps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularBootstrapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Bootstraps
	* @param end the upper bound of the range of Bootstraps (not inclusive)
	* @return the range of Bootstraps
	*/
	public static List<AngularBootstrap> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the Bootstraps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularBootstrapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Bootstraps
	* @param end the upper bound of the range of Bootstraps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Bootstraps
	*/
	public static List<AngularBootstrap> findAll(int start, int end,
		OrderByComparator<AngularBootstrap> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the Bootstraps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularBootstrapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Bootstraps
	* @param end the upper bound of the range of Bootstraps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of Bootstraps
	*/
	public static List<AngularBootstrap> findAll(int start, int end,
		OrderByComparator<AngularBootstrap> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the Bootstraps from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of Bootstraps.
	*
	* @return the number of Bootstraps
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AngularBootstrapPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AngularBootstrapPersistence, AngularBootstrapPersistence> _serviceTracker =
		ServiceTrackerFactory.open(AngularBootstrapPersistence.class);
}