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

import eu.gerhards.liferay.services.angular.exception.NoSuchAngularUserException;
import eu.gerhards.liferay.services.angular.model.AngularUser;

/**
 * The persistence interface for the User service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.persistence.impl.AngularUserPersistenceImpl
 * @see AngularUserUtil
 * @generated
 */
@ProviderType
public interface AngularUserPersistence extends BasePersistence<AngularUser> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AngularUserUtil} to access the User persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the User in the entity cache if it is enabled.
	*
	* @param angularUser the User
	*/
	public void cacheResult(AngularUser angularUser);

	/**
	* Caches the Users in the entity cache if it is enabled.
	*
	* @param angularUsers the Users
	*/
	public void cacheResult(java.util.List<AngularUser> angularUsers);

	/**
	* Creates a new User with the primary key. Does not add the User to the database.
	*
	* @param userId the primary key for the new User
	* @return the new User
	*/
	public AngularUser create(long userId);

	/**
	* Removes the User with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userId the primary key of the User
	* @return the User that was removed
	* @throws NoSuchAngularUserException if a User with the primary key could not be found
	*/
	public AngularUser remove(long userId) throws NoSuchAngularUserException;

	public AngularUser updateImpl(AngularUser angularUser);

	/**
	* Returns the User with the primary key or throws a {@link NoSuchAngularUserException} if it could not be found.
	*
	* @param userId the primary key of the User
	* @return the User
	* @throws NoSuchAngularUserException if a User with the primary key could not be found
	*/
	public AngularUser findByPrimaryKey(long userId)
		throws NoSuchAngularUserException;

	/**
	* Returns the User with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param userId the primary key of the User
	* @return the User, or <code>null</code> if a User with the primary key could not be found
	*/
	public AngularUser fetchByPrimaryKey(long userId);

	@Override
	public java.util.Map<java.io.Serializable, AngularUser> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the Users.
	*
	* @return the Users
	*/
	public java.util.List<AngularUser> findAll();

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
	public java.util.List<AngularUser> findAll(int start, int end);

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
	public java.util.List<AngularUser> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularUser> orderByComparator);

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
	public java.util.List<AngularUser> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularUser> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the Users from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of Users.
	*
	* @return the number of Users
	*/
	public int countAll();
}