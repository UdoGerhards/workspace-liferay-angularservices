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
import eu.gerhards.liferay.services.angular.exception.NoSuchAngularVirtualInstanceException;
import eu.gerhards.liferay.services.angular.model.AngularVirtualInstance;

/**
 * The persistence interface for the Virtual instance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.persistence.impl.AngularVirtualInstancePersistenceImpl
 * @see AngularVirtualInstanceUtil
 * @generated
 */
@ProviderType
public interface AngularVirtualInstancePersistence extends BasePersistence<AngularVirtualInstance> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AngularVirtualInstanceUtil} to access the Virtual instance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the Virtual instance in the entity cache if it is enabled.
	*
	* @param angularVirtualInstance the Virtual instance
	*/
	public void cacheResult(AngularVirtualInstance angularVirtualInstance);

	/**
	* Caches the Virtual instances in the entity cache if it is enabled.
	*
	* @param angularVirtualInstances the Virtual instances
	*/
	public void cacheResult(
		java.util.List<AngularVirtualInstance> angularVirtualInstances);

	/**
	* Creates a new Virtual instance with the primary key. Does not add the Virtual instance to the database.
	*
	* @param virtualInstanceId the primary key for the new Virtual instance
	* @return the new Virtual instance
	*/
	public AngularVirtualInstance create(long virtualInstanceId);

	/**
	* Removes the Virtual instance with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param virtualInstanceId the primary key of the Virtual instance
	* @return the Virtual instance that was removed
	* @throws NoSuchAngularVirtualInstanceException if a Virtual instance with the primary key could not be found
	*/
	public AngularVirtualInstance remove(long virtualInstanceId)
		throws NoSuchAngularVirtualInstanceException;

	public AngularVirtualInstance updateImpl(
		AngularVirtualInstance angularVirtualInstance);

	/**
	* Returns the Virtual instance with the primary key or throws a {@link NoSuchAngularVirtualInstanceException} if it could not be found.
	*
	* @param virtualInstanceId the primary key of the Virtual instance
	* @return the Virtual instance
	* @throws NoSuchAngularVirtualInstanceException if a Virtual instance with the primary key could not be found
	*/
	public AngularVirtualInstance findByPrimaryKey(long virtualInstanceId)
		throws NoSuchAngularVirtualInstanceException;

	/**
	* Returns the Virtual instance with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param virtualInstanceId the primary key of the Virtual instance
	* @return the Virtual instance, or <code>null</code> if a Virtual instance with the primary key could not be found
	*/
	public AngularVirtualInstance fetchByPrimaryKey(long virtualInstanceId);

	@Override
	public java.util.Map<java.io.Serializable, AngularVirtualInstance> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the Virtual instances.
	*
	* @return the Virtual instances
	*/
	public java.util.List<AngularVirtualInstance> findAll();

	/**
	* Returns a range of all the Virtual instances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularVirtualInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Virtual instances
	* @param end the upper bound of the range of Virtual instances (not inclusive)
	* @return the range of Virtual instances
	*/
	public java.util.List<AngularVirtualInstance> findAll(int start, int end);

	/**
	* Returns an ordered range of all the Virtual instances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularVirtualInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Virtual instances
	* @param end the upper bound of the range of Virtual instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Virtual instances
	*/
	public java.util.List<AngularVirtualInstance> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularVirtualInstance> orderByComparator);

	/**
	* Returns an ordered range of all the Virtual instances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularVirtualInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Virtual instances
	* @param end the upper bound of the range of Virtual instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of Virtual instances
	*/
	public java.util.List<AngularVirtualInstance> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularVirtualInstance> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the Virtual instances from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of Virtual instances.
	*
	* @return the number of Virtual instances
	*/
	public int countAll();
}