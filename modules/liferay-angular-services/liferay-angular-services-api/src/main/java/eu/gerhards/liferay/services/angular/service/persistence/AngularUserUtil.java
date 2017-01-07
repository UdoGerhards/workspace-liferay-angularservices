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

import eu.gerhards.liferay.services.angular.model.AngularUser;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the User service. This utility wraps {@link eu.gerhards.liferay.services.angular.service.persistence.impl.AngularUserPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularUserPersistence
 * @see eu.gerhards.liferay.services.angular.service.persistence.impl.AngularUserPersistenceImpl
 * @generated
 */
@ProviderType
public class AngularUserUtil {
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
	public static void clearCache(AngularUser angularUser) {
		getPersistence().clearCache(angularUser);
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
	public static List<AngularUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AngularUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AngularUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AngularUser> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AngularUser update(AngularUser angularUser) {
		return getPersistence().update(angularUser);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AngularUser update(AngularUser angularUser,
		ServiceContext serviceContext) {
		return getPersistence().update(angularUser, serviceContext);
	}

	/**
	* Caches the User in the entity cache if it is enabled.
	*
	* @param angularUser the User
	*/
	public static void cacheResult(AngularUser angularUser) {
		getPersistence().cacheResult(angularUser);
	}

	/**
	* Caches the Users in the entity cache if it is enabled.
	*
	* @param angularUsers the Users
	*/
	public static void cacheResult(List<AngularUser> angularUsers) {
		getPersistence().cacheResult(angularUsers);
	}

	/**
	* Creates a new User with the primary key. Does not add the User to the database.
	*
	* @param userId the primary key for the new User
	* @return the new User
	*/
	public static AngularUser create(long userId) {
		return getPersistence().create(userId);
	}

	/**
	* Removes the User with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userId the primary key of the User
	* @return the User that was removed
	* @throws NoSuchAngularUserException if a User with the primary key could not be found
	*/
	public static AngularUser remove(long userId)
		throws eu.gerhards.liferay.services.angular.exception.NoSuchAngularUserException {
		return getPersistence().remove(userId);
	}

	public static AngularUser updateImpl(AngularUser angularUser) {
		return getPersistence().updateImpl(angularUser);
	}

	/**
	* Returns the User with the primary key or throws a {@link NoSuchAngularUserException} if it could not be found.
	*
	* @param userId the primary key of the User
	* @return the User
	* @throws NoSuchAngularUserException if a User with the primary key could not be found
	*/
	public static AngularUser findByPrimaryKey(long userId)
		throws eu.gerhards.liferay.services.angular.exception.NoSuchAngularUserException {
		return getPersistence().findByPrimaryKey(userId);
	}

	/**
	* Returns the User with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param userId the primary key of the User
	* @return the User, or <code>null</code> if a User with the primary key could not be found
	*/
	public static AngularUser fetchByPrimaryKey(long userId) {
		return getPersistence().fetchByPrimaryKey(userId);
	}

	public static java.util.Map<java.io.Serializable, AngularUser> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the Users.
	*
	* @return the Users
	*/
	public static List<AngularUser> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the Users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Users
	* @param end the upper bound of the range of Users (not inclusive)
	* @return the range of Users
	*/
	public static List<AngularUser> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the Users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Users
	* @param end the upper bound of the range of Users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Users
	*/
	public static List<AngularUser> findAll(int start, int end,
		OrderByComparator<AngularUser> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the Users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Users
	* @param end the upper bound of the range of Users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of Users
	*/
	public static List<AngularUser> findAll(int start, int end,
		OrderByComparator<AngularUser> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the Users from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of Users.
	*
	* @return the number of Users
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AngularUserPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AngularUserPersistence, AngularUserPersistence> _serviceTracker =
		ServiceTrackerFactory.open(AngularUserPersistence.class);
}