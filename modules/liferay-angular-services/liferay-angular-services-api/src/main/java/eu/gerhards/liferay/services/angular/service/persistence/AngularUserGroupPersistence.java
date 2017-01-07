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

import eu.gerhards.liferay.services.angular.exception.NoSuchAngularUserGroupException;
import eu.gerhards.liferay.services.angular.model.AngularUserGroup;

/**
 * The persistence interface for the User group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.persistence.impl.AngularUserGroupPersistenceImpl
 * @see AngularUserGroupUtil
 * @generated
 */
@ProviderType
public interface AngularUserGroupPersistence extends BasePersistence<AngularUserGroup> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AngularUserGroupUtil} to access the User group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the User group in the entity cache if it is enabled.
	*
	* @param angularUserGroup the User group
	*/
	public void cacheResult(AngularUserGroup angularUserGroup);

	/**
	* Caches the User groups in the entity cache if it is enabled.
	*
	* @param angularUserGroups the User groups
	*/
	public void cacheResult(java.util.List<AngularUserGroup> angularUserGroups);

	/**
	* Creates a new User group with the primary key. Does not add the User group to the database.
	*
	* @param groupId the primary key for the new User group
	* @return the new User group
	*/
	public AngularUserGroup create(long groupId);

	/**
	* Removes the User group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param groupId the primary key of the User group
	* @return the User group that was removed
	* @throws NoSuchAngularUserGroupException if a User group with the primary key could not be found
	*/
	public AngularUserGroup remove(long groupId)
		throws NoSuchAngularUserGroupException;

	public AngularUserGroup updateImpl(AngularUserGroup angularUserGroup);

	/**
	* Returns the User group with the primary key or throws a {@link NoSuchAngularUserGroupException} if it could not be found.
	*
	* @param groupId the primary key of the User group
	* @return the User group
	* @throws NoSuchAngularUserGroupException if a User group with the primary key could not be found
	*/
	public AngularUserGroup findByPrimaryKey(long groupId)
		throws NoSuchAngularUserGroupException;

	/**
	* Returns the User group with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param groupId the primary key of the User group
	* @return the User group, or <code>null</code> if a User group with the primary key could not be found
	*/
	public AngularUserGroup fetchByPrimaryKey(long groupId);

	@Override
	public java.util.Map<java.io.Serializable, AngularUserGroup> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the User groups.
	*
	* @return the User groups
	*/
	public java.util.List<AngularUserGroup> findAll();

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
	public java.util.List<AngularUserGroup> findAll(int start, int end);

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
	public java.util.List<AngularUserGroup> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularUserGroup> orderByComparator);

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
	public java.util.List<AngularUserGroup> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularUserGroup> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the User groups from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of User groups.
	*
	* @return the number of User groups
	*/
	public int countAll();
}