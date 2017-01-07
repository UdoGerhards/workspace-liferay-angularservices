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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import eu.gerhards.liferay.services.angular.exception.NoSuchAngularTeamException;
import eu.gerhards.liferay.services.angular.model.AngularTeam;

/**
 * The persistence interface for the Team service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.persistence.impl.AngularTeamPersistenceImpl
 * @see AngularTeamUtil
 * @generated
 */
@ProviderType
public interface AngularTeamPersistence extends BasePersistence<AngularTeam> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AngularTeamUtil} to access the Team persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the Team in the entity cache if it is enabled.
	*
	* @param angularTeam the Team
	*/
	public void cacheResult(AngularTeam angularTeam);

	/**
	* Caches the Teams in the entity cache if it is enabled.
	*
	* @param angularTeams the Teams
	*/
	public void cacheResult(java.util.List<AngularTeam> angularTeams);

	/**
	* Creates a new Team with the primary key. Does not add the Team to the database.
	*
	* @param angularTeamId the primary key for the new Team
	* @return the new Team
	*/
	public AngularTeam create(long angularTeamId);

	/**
	* Removes the Team with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param angularTeamId the primary key of the Team
	* @return the Team that was removed
	* @throws NoSuchAngularTeamException if a Team with the primary key could not be found
	*/
	public AngularTeam remove(long angularTeamId)
		throws NoSuchAngularTeamException;

	public AngularTeam updateImpl(AngularTeam angularTeam);

	/**
	* Returns the Team with the primary key or throws a {@link NoSuchAngularTeamException} if it could not be found.
	*
	* @param angularTeamId the primary key of the Team
	* @return the Team
	* @throws NoSuchAngularTeamException if a Team with the primary key could not be found
	*/
	public AngularTeam findByPrimaryKey(long angularTeamId)
		throws NoSuchAngularTeamException;

	/**
	* Returns the Team with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param angularTeamId the primary key of the Team
	* @return the Team, or <code>null</code> if a Team with the primary key could not be found
	*/
	public AngularTeam fetchByPrimaryKey(long angularTeamId);

	@Override
	public java.util.Map<java.io.Serializable, AngularTeam> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the Teams.
	*
	* @return the Teams
	*/
	public java.util.List<AngularTeam> findAll();

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
	public java.util.List<AngularTeam> findAll(int start, int end);

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
	public java.util.List<AngularTeam> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularTeam> orderByComparator);

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
	public java.util.List<AngularTeam> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularTeam> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the Teams from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of Teams.
	*
	* @return the number of Teams
	*/
	public int countAll();
}