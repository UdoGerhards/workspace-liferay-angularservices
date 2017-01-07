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

import eu.gerhards.liferay.services.angular.model.AngularRole;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the Role service. This utility wraps {@link eu.gerhards.liferay.services.angular.service.persistence.impl.AngularRolePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularRolePersistence
 * @see eu.gerhards.liferay.services.angular.service.persistence.impl.AngularRolePersistenceImpl
 * @generated
 */
@ProviderType
public class AngularRoleUtil {
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
	public static void clearCache(AngularRole angularRole) {
		getPersistence().clearCache(angularRole);
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
	public static List<AngularRole> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AngularRole> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AngularRole> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AngularRole> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AngularRole update(AngularRole angularRole) {
		return getPersistence().update(angularRole);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AngularRole update(AngularRole angularRole,
		ServiceContext serviceContext) {
		return getPersistence().update(angularRole, serviceContext);
	}

	/**
	* Caches the Role in the entity cache if it is enabled.
	*
	* @param angularRole the Role
	*/
	public static void cacheResult(AngularRole angularRole) {
		getPersistence().cacheResult(angularRole);
	}

	/**
	* Caches the Roles in the entity cache if it is enabled.
	*
	* @param angularRoles the Roles
	*/
	public static void cacheResult(List<AngularRole> angularRoles) {
		getPersistence().cacheResult(angularRoles);
	}

	/**
	* Creates a new Role with the primary key. Does not add the Role to the database.
	*
	* @param roleId the primary key for the new Role
	* @return the new Role
	*/
	public static AngularRole create(long roleId) {
		return getPersistence().create(roleId);
	}

	/**
	* Removes the Role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param roleId the primary key of the Role
	* @return the Role that was removed
	* @throws NoSuchAngularRoleException if a Role with the primary key could not be found
	*/
	public static AngularRole remove(long roleId)
		throws eu.gerhards.liferay.services.angular.exception.NoSuchAngularRoleException {
		return getPersistence().remove(roleId);
	}

	public static AngularRole updateImpl(AngularRole angularRole) {
		return getPersistence().updateImpl(angularRole);
	}

	/**
	* Returns the Role with the primary key or throws a {@link NoSuchAngularRoleException} if it could not be found.
	*
	* @param roleId the primary key of the Role
	* @return the Role
	* @throws NoSuchAngularRoleException if a Role with the primary key could not be found
	*/
	public static AngularRole findByPrimaryKey(long roleId)
		throws eu.gerhards.liferay.services.angular.exception.NoSuchAngularRoleException {
		return getPersistence().findByPrimaryKey(roleId);
	}

	/**
	* Returns the Role with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param roleId the primary key of the Role
	* @return the Role, or <code>null</code> if a Role with the primary key could not be found
	*/
	public static AngularRole fetchByPrimaryKey(long roleId) {
		return getPersistence().fetchByPrimaryKey(roleId);
	}

	public static java.util.Map<java.io.Serializable, AngularRole> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the Roles.
	*
	* @return the Roles
	*/
	public static List<AngularRole> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the Roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Roles
	* @param end the upper bound of the range of Roles (not inclusive)
	* @return the range of Roles
	*/
	public static List<AngularRole> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the Roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Roles
	* @param end the upper bound of the range of Roles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Roles
	*/
	public static List<AngularRole> findAll(int start, int end,
		OrderByComparator<AngularRole> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the Roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Roles
	* @param end the upper bound of the range of Roles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of Roles
	*/
	public static List<AngularRole> findAll(int start, int end,
		OrderByComparator<AngularRole> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the Roles from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of Roles.
	*
	* @return the number of Roles
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AngularRolePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AngularRolePersistence, AngularRolePersistence> _serviceTracker =
		ServiceTrackerFactory.open(AngularRolePersistence.class);
}