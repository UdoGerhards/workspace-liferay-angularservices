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

import eu.gerhards.liferay.services.angular.model.AngularGroup;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the Group service. This utility wraps {@link eu.gerhards.liferay.services.angular.service.persistence.impl.AngularGroupPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularGroupPersistence
 * @see eu.gerhards.liferay.services.angular.service.persistence.impl.AngularGroupPersistenceImpl
 * @generated
 */
@ProviderType
public class AngularGroupUtil {
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
	public static void clearCache(AngularGroup angularGroup) {
		getPersistence().clearCache(angularGroup);
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
	public static List<AngularGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AngularGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AngularGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AngularGroup> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AngularGroup update(AngularGroup angularGroup) {
		return getPersistence().update(angularGroup);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AngularGroup update(AngularGroup angularGroup,
		ServiceContext serviceContext) {
		return getPersistence().update(angularGroup, serviceContext);
	}

	/**
	* Caches the Group in the entity cache if it is enabled.
	*
	* @param angularGroup the Group
	*/
	public static void cacheResult(AngularGroup angularGroup) {
		getPersistence().cacheResult(angularGroup);
	}

	/**
	* Caches the Groups in the entity cache if it is enabled.
	*
	* @param angularGroups the Groups
	*/
	public static void cacheResult(List<AngularGroup> angularGroups) {
		getPersistence().cacheResult(angularGroups);
	}

	/**
	* Creates a new Group with the primary key. Does not add the Group to the database.
	*
	* @param groupId the primary key for the new Group
	* @return the new Group
	*/
	public static AngularGroup create(long groupId) {
		return getPersistence().create(groupId);
	}

	/**
	* Removes the Group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param groupId the primary key of the Group
	* @return the Group that was removed
	* @throws NoSuchAngularGroupException if a Group with the primary key could not be found
	*/
	public static AngularGroup remove(long groupId)
		throws eu.gerhards.liferay.services.angular.exception.NoSuchAngularGroupException {
		return getPersistence().remove(groupId);
	}

	public static AngularGroup updateImpl(AngularGroup angularGroup) {
		return getPersistence().updateImpl(angularGroup);
	}

	/**
	* Returns the Group with the primary key or throws a {@link NoSuchAngularGroupException} if it could not be found.
	*
	* @param groupId the primary key of the Group
	* @return the Group
	* @throws NoSuchAngularGroupException if a Group with the primary key could not be found
	*/
	public static AngularGroup findByPrimaryKey(long groupId)
		throws eu.gerhards.liferay.services.angular.exception.NoSuchAngularGroupException {
		return getPersistence().findByPrimaryKey(groupId);
	}

	/**
	* Returns the Group with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param groupId the primary key of the Group
	* @return the Group, or <code>null</code> if a Group with the primary key could not be found
	*/
	public static AngularGroup fetchByPrimaryKey(long groupId) {
		return getPersistence().fetchByPrimaryKey(groupId);
	}

	public static java.util.Map<java.io.Serializable, AngularGroup> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the Groups.
	*
	* @return the Groups
	*/
	public static List<AngularGroup> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the Groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Groups
	* @param end the upper bound of the range of Groups (not inclusive)
	* @return the range of Groups
	*/
	public static List<AngularGroup> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the Groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Groups
	* @param end the upper bound of the range of Groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Groups
	*/
	public static List<AngularGroup> findAll(int start, int end,
		OrderByComparator<AngularGroup> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the Groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Groups
	* @param end the upper bound of the range of Groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of Groups
	*/
	public static List<AngularGroup> findAll(int start, int end,
		OrderByComparator<AngularGroup> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the Groups from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of Groups.
	*
	* @return the number of Groups
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AngularGroupPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AngularGroupPersistence, AngularGroupPersistence> _serviceTracker =
		ServiceTrackerFactory.open(AngularGroupPersistence.class);
}