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

import eu.gerhards.liferay.services.angular.model.AngularOrganization;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the Organization service. This utility wraps {@link eu.gerhards.liferay.services.angular.service.persistence.impl.AngularOrganizationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularOrganizationPersistence
 * @see eu.gerhards.liferay.services.angular.service.persistence.impl.AngularOrganizationPersistenceImpl
 * @generated
 */
@ProviderType
public class AngularOrganizationUtil {
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
	public static void clearCache(AngularOrganization angularOrganization) {
		getPersistence().clearCache(angularOrganization);
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
	public static List<AngularOrganization> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AngularOrganization> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AngularOrganization> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AngularOrganization> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AngularOrganization update(
		AngularOrganization angularOrganization) {
		return getPersistence().update(angularOrganization);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AngularOrganization update(
		AngularOrganization angularOrganization, ServiceContext serviceContext) {
		return getPersistence().update(angularOrganization, serviceContext);
	}

	/**
	* Caches the Organization in the entity cache if it is enabled.
	*
	* @param angularOrganization the Organization
	*/
	public static void cacheResult(AngularOrganization angularOrganization) {
		getPersistence().cacheResult(angularOrganization);
	}

	/**
	* Caches the Organizations in the entity cache if it is enabled.
	*
	* @param angularOrganizations the Organizations
	*/
	public static void cacheResult(
		List<AngularOrganization> angularOrganizations) {
		getPersistence().cacheResult(angularOrganizations);
	}

	/**
	* Creates a new Organization with the primary key. Does not add the Organization to the database.
	*
	* @param organizationId the primary key for the new Organization
	* @return the new Organization
	*/
	public static AngularOrganization create(long organizationId) {
		return getPersistence().create(organizationId);
	}

	/**
	* Removes the Organization with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param organizationId the primary key of the Organization
	* @return the Organization that was removed
	* @throws NoSuchAngularOrganizationException if a Organization with the primary key could not be found
	*/
	public static AngularOrganization remove(long organizationId)
		throws eu.gerhards.liferay.services.angular.exception.NoSuchAngularOrganizationException {
		return getPersistence().remove(organizationId);
	}

	public static AngularOrganization updateImpl(
		AngularOrganization angularOrganization) {
		return getPersistence().updateImpl(angularOrganization);
	}

	/**
	* Returns the Organization with the primary key or throws a {@link NoSuchAngularOrganizationException} if it could not be found.
	*
	* @param organizationId the primary key of the Organization
	* @return the Organization
	* @throws NoSuchAngularOrganizationException if a Organization with the primary key could not be found
	*/
	public static AngularOrganization findByPrimaryKey(long organizationId)
		throws eu.gerhards.liferay.services.angular.exception.NoSuchAngularOrganizationException {
		return getPersistence().findByPrimaryKey(organizationId);
	}

	/**
	* Returns the Organization with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param organizationId the primary key of the Organization
	* @return the Organization, or <code>null</code> if a Organization with the primary key could not be found
	*/
	public static AngularOrganization fetchByPrimaryKey(long organizationId) {
		return getPersistence().fetchByPrimaryKey(organizationId);
	}

	public static java.util.Map<java.io.Serializable, AngularOrganization> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the Organizations.
	*
	* @return the Organizations
	*/
	public static List<AngularOrganization> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the Organizations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Organizations
	* @param end the upper bound of the range of Organizations (not inclusive)
	* @return the range of Organizations
	*/
	public static List<AngularOrganization> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the Organizations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Organizations
	* @param end the upper bound of the range of Organizations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Organizations
	*/
	public static List<AngularOrganization> findAll(int start, int end,
		OrderByComparator<AngularOrganization> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the Organizations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Organizations
	* @param end the upper bound of the range of Organizations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of Organizations
	*/
	public static List<AngularOrganization> findAll(int start, int end,
		OrderByComparator<AngularOrganization> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the Organizations from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of Organizations.
	*
	* @return the number of Organizations
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AngularOrganizationPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AngularOrganizationPersistence, AngularOrganizationPersistence> _serviceTracker =
		ServiceTrackerFactory.open(AngularOrganizationPersistence.class);
}