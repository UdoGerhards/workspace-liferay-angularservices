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

import eu.gerhards.liferay.services.angular.exception.NoSuchAngularRoleException;
import eu.gerhards.liferay.services.angular.model.AngularRole;

/**
 * The persistence interface for the Role service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.persistence.impl.AngularRolePersistenceImpl
 * @see AngularRoleUtil
 * @generated
 */
@ProviderType
public interface AngularRolePersistence extends BasePersistence<AngularRole> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AngularRoleUtil} to access the Role persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the Role in the entity cache if it is enabled.
	*
	* @param angularRole the Role
	*/
	public void cacheResult(AngularRole angularRole);

	/**
	* Caches the Roles in the entity cache if it is enabled.
	*
	* @param angularRoles the Roles
	*/
	public void cacheResult(java.util.List<AngularRole> angularRoles);

	/**
	* Creates a new Role with the primary key. Does not add the Role to the database.
	*
	* @param roleId the primary key for the new Role
	* @return the new Role
	*/
	public AngularRole create(long roleId);

	/**
	* Removes the Role with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param roleId the primary key of the Role
	* @return the Role that was removed
	* @throws NoSuchAngularRoleException if a Role with the primary key could not be found
	*/
	public AngularRole remove(long roleId) throws NoSuchAngularRoleException;

	public AngularRole updateImpl(AngularRole angularRole);

	/**
	* Returns the Role with the primary key or throws a {@link NoSuchAngularRoleException} if it could not be found.
	*
	* @param roleId the primary key of the Role
	* @return the Role
	* @throws NoSuchAngularRoleException if a Role with the primary key could not be found
	*/
	public AngularRole findByPrimaryKey(long roleId)
		throws NoSuchAngularRoleException;

	/**
	* Returns the Role with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param roleId the primary key of the Role
	* @return the Role, or <code>null</code> if a Role with the primary key could not be found
	*/
	public AngularRole fetchByPrimaryKey(long roleId);

	@Override
	public java.util.Map<java.io.Serializable, AngularRole> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the Roles.
	*
	* @return the Roles
	*/
	public java.util.List<AngularRole> findAll();

	/**
	* Returns a range of all the Roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Roles
	* @param end the upper bound of the range of Roles (not inclusive)
	* @return the range of Roles
	*/
	public java.util.List<AngularRole> findAll(int start, int end);

	/**
	* Returns an ordered range of all the Roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Roles
	* @param end the upper bound of the range of Roles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Roles
	*/
	public java.util.List<AngularRole> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularRole> orderByComparator);

	/**
	* Returns an ordered range of all the Roles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Roles
	* @param end the upper bound of the range of Roles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of Roles
	*/
	public java.util.List<AngularRole> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularRole> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the Roles from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of Roles.
	*
	* @return the number of Roles
	*/
	public int countAll();
}