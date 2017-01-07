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

import eu.gerhards.liferay.services.angular.exception.NoSuchAngularGroupException;
import eu.gerhards.liferay.services.angular.model.AngularGroup;

/**
 * The persistence interface for the Group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.persistence.impl.AngularGroupPersistenceImpl
 * @see AngularGroupUtil
 * @generated
 */
@ProviderType
public interface AngularGroupPersistence extends BasePersistence<AngularGroup> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AngularGroupUtil} to access the Group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the Group in the entity cache if it is enabled.
	*
	* @param angularGroup the Group
	*/
	public void cacheResult(AngularGroup angularGroup);

	/**
	* Caches the Groups in the entity cache if it is enabled.
	*
	* @param angularGroups the Groups
	*/
	public void cacheResult(java.util.List<AngularGroup> angularGroups);

	/**
	* Creates a new Group with the primary key. Does not add the Group to the database.
	*
	* @param groupId the primary key for the new Group
	* @return the new Group
	*/
	public AngularGroup create(long groupId);

	/**
	* Removes the Group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param groupId the primary key of the Group
	* @return the Group that was removed
	* @throws NoSuchAngularGroupException if a Group with the primary key could not be found
	*/
	public AngularGroup remove(long groupId) throws NoSuchAngularGroupException;

	public AngularGroup updateImpl(AngularGroup angularGroup);

	/**
	* Returns the Group with the primary key or throws a {@link NoSuchAngularGroupException} if it could not be found.
	*
	* @param groupId the primary key of the Group
	* @return the Group
	* @throws NoSuchAngularGroupException if a Group with the primary key could not be found
	*/
	public AngularGroup findByPrimaryKey(long groupId)
		throws NoSuchAngularGroupException;

	/**
	* Returns the Group with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param groupId the primary key of the Group
	* @return the Group, or <code>null</code> if a Group with the primary key could not be found
	*/
	public AngularGroup fetchByPrimaryKey(long groupId);

	@Override
	public java.util.Map<java.io.Serializable, AngularGroup> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the Groups.
	*
	* @return the Groups
	*/
	public java.util.List<AngularGroup> findAll();

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
	public java.util.List<AngularGroup> findAll(int start, int end);

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
	public java.util.List<AngularGroup> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularGroup> orderByComparator);

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
	public java.util.List<AngularGroup> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularGroup> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the Groups from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of Groups.
	*
	* @return the number of Groups
	*/
	public int countAll();
}