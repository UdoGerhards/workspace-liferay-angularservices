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
import eu.gerhards.liferay.services.angular.model.AngularLayoutSet;
import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the LayoutSet service. This utility wraps {@link eu.gerhards.liferay.services.angular.service.persistence.impl.AngularLayoutSetPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularLayoutSetPersistence
 * @see eu.gerhards.liferay.services.angular.service.persistence.impl.AngularLayoutSetPersistenceImpl
 * @generated
 */
@ProviderType
public class AngularLayoutSetUtil {
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
	public static void clearCache(AngularLayoutSet angularLayoutSet) {
		getPersistence().clearCache(angularLayoutSet);
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
	public static List<AngularLayoutSet> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AngularLayoutSet> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AngularLayoutSet> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AngularLayoutSet> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AngularLayoutSet update(AngularLayoutSet angularLayoutSet) {
		return getPersistence().update(angularLayoutSet);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AngularLayoutSet update(AngularLayoutSet angularLayoutSet,
		ServiceContext serviceContext) {
		return getPersistence().update(angularLayoutSet, serviceContext);
	}

	/**
	* Caches the LayoutSet in the entity cache if it is enabled.
	*
	* @param angularLayoutSet the LayoutSet
	*/
	public static void cacheResult(AngularLayoutSet angularLayoutSet) {
		getPersistence().cacheResult(angularLayoutSet);
	}

	/**
	* Caches the LayoutSets in the entity cache if it is enabled.
	*
	* @param angularLayoutSets the LayoutSets
	*/
	public static void cacheResult(List<AngularLayoutSet> angularLayoutSets) {
		getPersistence().cacheResult(angularLayoutSets);
	}

	/**
	* Creates a new LayoutSet with the primary key. Does not add the LayoutSet to the database.
	*
	* @param layoutSetId the primary key for the new LayoutSet
	* @return the new LayoutSet
	*/
	public static AngularLayoutSet create(long layoutSetId) {
		return getPersistence().create(layoutSetId);
	}

	/**
	* Removes the LayoutSet with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param layoutSetId the primary key of the LayoutSet
	* @return the LayoutSet that was removed
	* @throws NoSuchAngularLayoutSetException if a LayoutSet with the primary key could not be found
	*/
	public static AngularLayoutSet remove(long layoutSetId)
		throws eu.gerhards.liferay.services.angular.exception.NoSuchAngularLayoutSetException {
		return getPersistence().remove(layoutSetId);
	}

	public static AngularLayoutSet updateImpl(AngularLayoutSet angularLayoutSet) {
		return getPersistence().updateImpl(angularLayoutSet);
	}

	/**
	* Returns the LayoutSet with the primary key or throws a {@link NoSuchAngularLayoutSetException} if it could not be found.
	*
	* @param layoutSetId the primary key of the LayoutSet
	* @return the LayoutSet
	* @throws NoSuchAngularLayoutSetException if a LayoutSet with the primary key could not be found
	*/
	public static AngularLayoutSet findByPrimaryKey(long layoutSetId)
		throws eu.gerhards.liferay.services.angular.exception.NoSuchAngularLayoutSetException {
		return getPersistence().findByPrimaryKey(layoutSetId);
	}

	/**
	* Returns the LayoutSet with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param layoutSetId the primary key of the LayoutSet
	* @return the LayoutSet, or <code>null</code> if a LayoutSet with the primary key could not be found
	*/
	public static AngularLayoutSet fetchByPrimaryKey(long layoutSetId) {
		return getPersistence().fetchByPrimaryKey(layoutSetId);
	}

	public static java.util.Map<java.io.Serializable, AngularLayoutSet> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the LayoutSets.
	*
	* @return the LayoutSets
	*/
	public static List<AngularLayoutSet> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the LayoutSets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularLayoutSetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of LayoutSets
	* @param end the upper bound of the range of LayoutSets (not inclusive)
	* @return the range of LayoutSets
	*/
	public static List<AngularLayoutSet> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the LayoutSets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularLayoutSetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of LayoutSets
	* @param end the upper bound of the range of LayoutSets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of LayoutSets
	*/
	public static List<AngularLayoutSet> findAll(int start, int end,
		OrderByComparator<AngularLayoutSet> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the LayoutSets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularLayoutSetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of LayoutSets
	* @param end the upper bound of the range of LayoutSets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of LayoutSets
	*/
	public static List<AngularLayoutSet> findAll(int start, int end,
		OrderByComparator<AngularLayoutSet> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the LayoutSets from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of LayoutSets.
	*
	* @return the number of LayoutSets
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AngularLayoutSetPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AngularLayoutSetPersistence, AngularLayoutSetPersistence> _serviceTracker =
		ServiceTrackerFactory.open(AngularLayoutSetPersistence.class);
}