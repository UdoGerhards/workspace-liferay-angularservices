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

import eu.gerhards.liferay.services.angular.model.AngularLayout;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the Layout service. This utility wraps {@link eu.gerhards.liferay.services.angular.service.persistence.impl.AngularLayoutPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularLayoutPersistence
 * @see eu.gerhards.liferay.services.angular.service.persistence.impl.AngularLayoutPersistenceImpl
 * @generated
 */
@ProviderType
public class AngularLayoutUtil {
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
	public static void clearCache(AngularLayout angularLayout) {
		getPersistence().clearCache(angularLayout);
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
	public static List<AngularLayout> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AngularLayout> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AngularLayout> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AngularLayout> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AngularLayout update(AngularLayout angularLayout) {
		return getPersistence().update(angularLayout);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AngularLayout update(AngularLayout angularLayout,
		ServiceContext serviceContext) {
		return getPersistence().update(angularLayout, serviceContext);
	}

	/**
	* Caches the Layout in the entity cache if it is enabled.
	*
	* @param angularLayout the Layout
	*/
	public static void cacheResult(AngularLayout angularLayout) {
		getPersistence().cacheResult(angularLayout);
	}

	/**
	* Caches the Layouts in the entity cache if it is enabled.
	*
	* @param angularLayouts the Layouts
	*/
	public static void cacheResult(List<AngularLayout> angularLayouts) {
		getPersistence().cacheResult(angularLayouts);
	}

	/**
	* Creates a new Layout with the primary key. Does not add the Layout to the database.
	*
	* @param layoutId the primary key for the new Layout
	* @return the new Layout
	*/
	public static AngularLayout create(long layoutId) {
		return getPersistence().create(layoutId);
	}

	/**
	* Removes the Layout with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param layoutId the primary key of the Layout
	* @return the Layout that was removed
	* @throws NoSuchAngularLayoutException if a Layout with the primary key could not be found
	*/
	public static AngularLayout remove(long layoutId)
		throws eu.gerhards.liferay.services.angular.exception.NoSuchAngularLayoutException {
		return getPersistence().remove(layoutId);
	}

	public static AngularLayout updateImpl(AngularLayout angularLayout) {
		return getPersistence().updateImpl(angularLayout);
	}

	/**
	* Returns the Layout with the primary key or throws a {@link NoSuchAngularLayoutException} if it could not be found.
	*
	* @param layoutId the primary key of the Layout
	* @return the Layout
	* @throws NoSuchAngularLayoutException if a Layout with the primary key could not be found
	*/
	public static AngularLayout findByPrimaryKey(long layoutId)
		throws eu.gerhards.liferay.services.angular.exception.NoSuchAngularLayoutException {
		return getPersistence().findByPrimaryKey(layoutId);
	}

	/**
	* Returns the Layout with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param layoutId the primary key of the Layout
	* @return the Layout, or <code>null</code> if a Layout with the primary key could not be found
	*/
	public static AngularLayout fetchByPrimaryKey(long layoutId) {
		return getPersistence().fetchByPrimaryKey(layoutId);
	}

	public static java.util.Map<java.io.Serializable, AngularLayout> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the Layouts.
	*
	* @return the Layouts
	*/
	public static List<AngularLayout> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the Layouts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularLayoutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Layouts
	* @param end the upper bound of the range of Layouts (not inclusive)
	* @return the range of Layouts
	*/
	public static List<AngularLayout> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the Layouts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularLayoutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Layouts
	* @param end the upper bound of the range of Layouts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Layouts
	*/
	public static List<AngularLayout> findAll(int start, int end,
		OrderByComparator<AngularLayout> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the Layouts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularLayoutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Layouts
	* @param end the upper bound of the range of Layouts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of Layouts
	*/
	public static List<AngularLayout> findAll(int start, int end,
		OrderByComparator<AngularLayout> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the Layouts from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of Layouts.
	*
	* @return the number of Layouts
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AngularLayoutPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AngularLayoutPersistence, AngularLayoutPersistence> _serviceTracker =
		ServiceTrackerFactory.open(AngularLayoutPersistence.class);
}