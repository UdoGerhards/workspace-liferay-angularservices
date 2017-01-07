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

import eu.gerhards.liferay.services.angular.model.AngularTeam;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the Team service. This utility wraps {@link eu.gerhards.liferay.services.angular.service.persistence.impl.AngularTeamPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularTeamPersistence
 * @see eu.gerhards.liferay.services.angular.service.persistence.impl.AngularTeamPersistenceImpl
 * @generated
 */
@ProviderType
public class AngularTeamUtil {
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
	public static void clearCache(AngularTeam angularTeam) {
		getPersistence().clearCache(angularTeam);
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
	public static List<AngularTeam> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AngularTeam> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AngularTeam> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AngularTeam> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AngularTeam update(AngularTeam angularTeam) {
		return getPersistence().update(angularTeam);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AngularTeam update(AngularTeam angularTeam,
		ServiceContext serviceContext) {
		return getPersistence().update(angularTeam, serviceContext);
	}

	/**
	* Caches the Team in the entity cache if it is enabled.
	*
	* @param angularTeam the Team
	*/
	public static void cacheResult(AngularTeam angularTeam) {
		getPersistence().cacheResult(angularTeam);
	}

	/**
	* Caches the Teams in the entity cache if it is enabled.
	*
	* @param angularTeams the Teams
	*/
	public static void cacheResult(List<AngularTeam> angularTeams) {
		getPersistence().cacheResult(angularTeams);
	}

	/**
	* Creates a new Team with the primary key. Does not add the Team to the database.
	*
	* @param angularTeamId the primary key for the new Team
	* @return the new Team
	*/
	public static AngularTeam create(long angularTeamId) {
		return getPersistence().create(angularTeamId);
	}

	/**
	* Removes the Team with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param angularTeamId the primary key of the Team
	* @return the Team that was removed
	* @throws NoSuchAngularTeamException if a Team with the primary key could not be found
	*/
	public static AngularTeam remove(long angularTeamId)
		throws eu.gerhards.liferay.services.angular.exception.NoSuchAngularTeamException {
		return getPersistence().remove(angularTeamId);
	}

	public static AngularTeam updateImpl(AngularTeam angularTeam) {
		return getPersistence().updateImpl(angularTeam);
	}

	/**
	* Returns the Team with the primary key or throws a {@link NoSuchAngularTeamException} if it could not be found.
	*
	* @param angularTeamId the primary key of the Team
	* @return the Team
	* @throws NoSuchAngularTeamException if a Team with the primary key could not be found
	*/
	public static AngularTeam findByPrimaryKey(long angularTeamId)
		throws eu.gerhards.liferay.services.angular.exception.NoSuchAngularTeamException {
		return getPersistence().findByPrimaryKey(angularTeamId);
	}

	/**
	* Returns the Team with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param angularTeamId the primary key of the Team
	* @return the Team, or <code>null</code> if a Team with the primary key could not be found
	*/
	public static AngularTeam fetchByPrimaryKey(long angularTeamId) {
		return getPersistence().fetchByPrimaryKey(angularTeamId);
	}

	public static java.util.Map<java.io.Serializable, AngularTeam> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the Teams.
	*
	* @return the Teams
	*/
	public static List<AngularTeam> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the Teams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularTeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Teams
	* @param end the upper bound of the range of Teams (not inclusive)
	* @return the range of Teams
	*/
	public static List<AngularTeam> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the Teams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularTeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Teams
	* @param end the upper bound of the range of Teams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Teams
	*/
	public static List<AngularTeam> findAll(int start, int end,
		OrderByComparator<AngularTeam> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the Teams.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularTeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Teams
	* @param end the upper bound of the range of Teams (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of Teams
	*/
	public static List<AngularTeam> findAll(int start, int end,
		OrderByComparator<AngularTeam> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the Teams from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of Teams.
	*
	* @return the number of Teams
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AngularTeamPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AngularTeamPersistence, AngularTeamPersistence> _serviceTracker =
		ServiceTrackerFactory.open(AngularTeamPersistence.class);
}