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

import eu.gerhards.liferay.services.angular.model.AngularPortal;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the Portal service. This utility wraps {@link eu.gerhards.liferay.services.angular.service.persistence.impl.AngularPortalPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularPortalPersistence
 * @see eu.gerhards.liferay.services.angular.service.persistence.impl.AngularPortalPersistenceImpl
 * @generated
 */
@ProviderType
public class AngularPortalUtil {
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
	public static void clearCache(AngularPortal angularPortal) {
		getPersistence().clearCache(angularPortal);
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
	public static List<AngularPortal> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AngularPortal> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AngularPortal> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AngularPortal> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AngularPortal update(AngularPortal angularPortal) {
		return getPersistence().update(angularPortal);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AngularPortal update(AngularPortal angularPortal,
		ServiceContext serviceContext) {
		return getPersistence().update(angularPortal, serviceContext);
	}

	/**
	* Caches the Portal in the entity cache if it is enabled.
	*
	* @param angularPortal the Portal
	*/
	public static void cacheResult(AngularPortal angularPortal) {
		getPersistence().cacheResult(angularPortal);
	}

	/**
	* Caches the Portals in the entity cache if it is enabled.
	*
	* @param angularPortals the Portals
	*/
	public static void cacheResult(List<AngularPortal> angularPortals) {
		getPersistence().cacheResult(angularPortals);
	}

	/**
	* Creates a new Portal with the primary key. Does not add the Portal to the database.
	*
	* @param portalId the primary key for the new Portal
	* @return the new Portal
	*/
	public static AngularPortal create(long portalId) {
		return getPersistence().create(portalId);
	}

	/**
	* Removes the Portal with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param portalId the primary key of the Portal
	* @return the Portal that was removed
	* @throws NoSuchAngularPortalException if a Portal with the primary key could not be found
	*/
	public static AngularPortal remove(long portalId)
		throws eu.gerhards.liferay.services.angular.exception.NoSuchAngularPortalException {
		return getPersistence().remove(portalId);
	}

	public static AngularPortal updateImpl(AngularPortal angularPortal) {
		return getPersistence().updateImpl(angularPortal);
	}

	/**
	* Returns the Portal with the primary key or throws a {@link NoSuchAngularPortalException} if it could not be found.
	*
	* @param portalId the primary key of the Portal
	* @return the Portal
	* @throws NoSuchAngularPortalException if a Portal with the primary key could not be found
	*/
	public static AngularPortal findByPrimaryKey(long portalId)
		throws eu.gerhards.liferay.services.angular.exception.NoSuchAngularPortalException {
		return getPersistence().findByPrimaryKey(portalId);
	}

	/**
	* Returns the Portal with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param portalId the primary key of the Portal
	* @return the Portal, or <code>null</code> if a Portal with the primary key could not be found
	*/
	public static AngularPortal fetchByPrimaryKey(long portalId) {
		return getPersistence().fetchByPrimaryKey(portalId);
	}

	public static java.util.Map<java.io.Serializable, AngularPortal> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the Portals.
	*
	* @return the Portals
	*/
	public static List<AngularPortal> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the Portals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularPortalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Portals
	* @param end the upper bound of the range of Portals (not inclusive)
	* @return the range of Portals
	*/
	public static List<AngularPortal> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the Portals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularPortalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Portals
	* @param end the upper bound of the range of Portals (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Portals
	*/
	public static List<AngularPortal> findAll(int start, int end,
		OrderByComparator<AngularPortal> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the Portals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularPortalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Portals
	* @param end the upper bound of the range of Portals (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of Portals
	*/
	public static List<AngularPortal> findAll(int start, int end,
		OrderByComparator<AngularPortal> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the Portals from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of Portals.
	*
	* @return the number of Portals
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AngularPortalPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AngularPortalPersistence, AngularPortalPersistence> _serviceTracker =
		ServiceTrackerFactory.open(AngularPortalPersistence.class);
}