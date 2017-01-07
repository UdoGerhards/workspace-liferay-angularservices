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

import eu.gerhards.liferay.services.angular.exception.NoSuchAngularVirtualHostException;
import eu.gerhards.liferay.services.angular.model.AngularVirtualHost;

/**
 * The persistence interface for the Virtual host service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.persistence.impl.AngularVirtualHostPersistenceImpl
 * @see AngularVirtualHostUtil
 * @generated
 */
@ProviderType
public interface AngularVirtualHostPersistence extends BasePersistence<AngularVirtualHost> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AngularVirtualHostUtil} to access the Virtual host persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the Virtual host in the entity cache if it is enabled.
	*
	* @param angularVirtualHost the Virtual host
	*/
	public void cacheResult(AngularVirtualHost angularVirtualHost);

	/**
	* Caches the Virtual hosts in the entity cache if it is enabled.
	*
	* @param angularVirtualHosts the Virtual hosts
	*/
	public void cacheResult(
		java.util.List<AngularVirtualHost> angularVirtualHosts);

	/**
	* Creates a new Virtual host with the primary key. Does not add the Virtual host to the database.
	*
	* @param virtualHostId the primary key for the new Virtual host
	* @return the new Virtual host
	*/
	public AngularVirtualHost create(long virtualHostId);

	/**
	* Removes the Virtual host with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param virtualHostId the primary key of the Virtual host
	* @return the Virtual host that was removed
	* @throws NoSuchAngularVirtualHostException if a Virtual host with the primary key could not be found
	*/
	public AngularVirtualHost remove(long virtualHostId)
		throws NoSuchAngularVirtualHostException;

	public AngularVirtualHost updateImpl(AngularVirtualHost angularVirtualHost);

	/**
	* Returns the Virtual host with the primary key or throws a {@link NoSuchAngularVirtualHostException} if it could not be found.
	*
	* @param virtualHostId the primary key of the Virtual host
	* @return the Virtual host
	* @throws NoSuchAngularVirtualHostException if a Virtual host with the primary key could not be found
	*/
	public AngularVirtualHost findByPrimaryKey(long virtualHostId)
		throws NoSuchAngularVirtualHostException;

	/**
	* Returns the Virtual host with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param virtualHostId the primary key of the Virtual host
	* @return the Virtual host, or <code>null</code> if a Virtual host with the primary key could not be found
	*/
	public AngularVirtualHost fetchByPrimaryKey(long virtualHostId);

	@Override
	public java.util.Map<java.io.Serializable, AngularVirtualHost> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the Virtual hosts.
	*
	* @return the Virtual hosts
	*/
	public java.util.List<AngularVirtualHost> findAll();

	/**
	* Returns a range of all the Virtual hosts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularVirtualHostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Virtual hosts
	* @param end the upper bound of the range of Virtual hosts (not inclusive)
	* @return the range of Virtual hosts
	*/
	public java.util.List<AngularVirtualHost> findAll(int start, int end);

	/**
	* Returns an ordered range of all the Virtual hosts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularVirtualHostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Virtual hosts
	* @param end the upper bound of the range of Virtual hosts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Virtual hosts
	*/
	public java.util.List<AngularVirtualHost> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularVirtualHost> orderByComparator);

	/**
	* Returns an ordered range of all the Virtual hosts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularVirtualHostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Virtual hosts
	* @param end the upper bound of the range of Virtual hosts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of Virtual hosts
	*/
	public java.util.List<AngularVirtualHost> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularVirtualHost> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the Virtual hosts from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of Virtual hosts.
	*
	* @return the number of Virtual hosts
	*/
	public int countAll();
}