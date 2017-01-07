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

import eu.gerhards.liferay.services.angular.model.AngularUserGroup;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the User group service. This utility wraps {@link eu.gerhards.liferay.services.angular.service.persistence.impl.AngularUserGroupPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularUserGroupPersistence
 * @see eu.gerhards.liferay.services.angular.service.persistence.impl.AngularUserGroupPersistenceImpl
 * @generated
 */
@ProviderType
public class AngularUserGroupUtil {
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
	public static void clearCache(AngularUserGroup angularUserGroup) {
		getPersistence().clearCache(angularUserGroup);
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
	public static List<AngularUserGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AngularUserGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AngularUserGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AngularUserGroup> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AngularUserGroup update(AngularUserGroup angularUserGroup) {
		return getPersistence().update(angularUserGroup);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AngularUserGroup update(AngularUserGroup angularUserGroup,
		ServiceContext serviceContext) {
		return getPersistence().update(angularUserGroup, serviceContext);
	}

	/**
	* Caches the User group in the entity cache if it is enabled.
	*
	* @param angularUserGroup the User group
	*/
	public static void cacheResult(AngularUserGroup angularUserGroup) {
		getPersistence().cacheResult(angularUserGroup);
	}

	/**
	* Caches the User groups in the entity cache if it is enabled.
	*
	* @param angularUserGroups the User groups
	*/
	public static void cacheResult(List<AngularUserGroup> angularUserGroups) {
		getPersistence().cacheResult(angularUserGroups);
	}

	/**
	* Creates a new User group with the primary key. Does not add the User group to the database.
	*
	* @param groupId the primary key for the new User group
	* @return the new User group
	*/
	public static AngularUserGroup create(long groupId) {
		return getPersistence().create(groupId);
	}

	/**
	* Removes the User group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param groupId the primary key of the User group
	* @return the User group that was removed
	* @throws NoSuchAngularUserGroupException if a User group with the primary key could not be found
	*/
	public static AngularUserGroup remove(long groupId)
		throws eu.gerhards.liferay.services.angular.exception.NoSuchAngularUserGroupException {
		return getPersistence().remove(groupId);
	}

	public static AngularUserGroup updateImpl(AngularUserGroup angularUserGroup) {
		return getPersistence().updateImpl(angularUserGroup);
	}

	/**
	* Returns the User group with the primary key or throws a {@link NoSuchAngularUserGroupException} if it could not be found.
	*
	* @param groupId the primary key of the User group
	* @return the User group
	* @throws NoSuchAngularUserGroupException if a User group with the primary key could not be found
	*/
	public static AngularUserGroup findByPrimaryKey(long groupId)
		throws eu.gerhards.liferay.services.angular.exception.NoSuchAngularUserGroupException {
		return getPersistence().findByPrimaryKey(groupId);
	}

	/**
	* Returns the User group with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param groupId the primary key of the User group
	* @return the User group, or <code>null</code> if a User group with the primary key could not be found
	*/
	public static AngularUserGroup fetchByPrimaryKey(long groupId) {
		return getPersistence().fetchByPrimaryKey(groupId);
	}

	public static java.util.Map<java.io.Serializable, AngularUserGroup> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the User groups.
	*
	* @return the User groups
	*/
	public static List<AngularUserGroup> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the User groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of User groups
	* @param end the upper bound of the range of User groups (not inclusive)
	* @return the range of User groups
	*/
	public static List<AngularUserGroup> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the User groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of User groups
	* @param end the upper bound of the range of User groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of User groups
	*/
	public static List<AngularUserGroup> findAll(int start, int end,
		OrderByComparator<AngularUserGroup> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the User groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of User groups
	* @param end the upper bound of the range of User groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of User groups
	*/
	public static List<AngularUserGroup> findAll(int start, int end,
		OrderByComparator<AngularUserGroup> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the User groups from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of User groups.
	*
	* @return the number of User groups
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AngularUserGroupPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AngularUserGroupPersistence, AngularUserGroupPersistence> _serviceTracker =
		ServiceTrackerFactory.open(AngularUserGroupPersistence.class);
}