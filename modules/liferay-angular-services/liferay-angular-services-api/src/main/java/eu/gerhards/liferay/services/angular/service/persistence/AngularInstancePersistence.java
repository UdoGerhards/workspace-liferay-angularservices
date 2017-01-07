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

import eu.gerhards.liferay.services.angular.exception.NoSuchAngularInstanceException;
import eu.gerhards.liferay.services.angular.model.AngularInstance;

/**
 * The persistence interface for the Instance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.persistence.impl.AngularInstancePersistenceImpl
 * @see AngularInstanceUtil
 * @generated
 */
@ProviderType
public interface AngularInstancePersistence extends BasePersistence<AngularInstance> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AngularInstanceUtil} to access the Instance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the Instance in the entity cache if it is enabled.
	*
	* @param angularInstance the Instance
	*/
	public void cacheResult(AngularInstance angularInstance);

	/**
	* Caches the Instances in the entity cache if it is enabled.
	*
	* @param angularInstances the Instances
	*/
	public void cacheResult(java.util.List<AngularInstance> angularInstances);

	/**
	* Creates a new Instance with the primary key. Does not add the Instance to the database.
	*
	* @param instanceId the primary key for the new Instance
	* @return the new Instance
	*/
	public AngularInstance create(long instanceId);

	/**
	* Removes the Instance with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param instanceId the primary key of the Instance
	* @return the Instance that was removed
	* @throws NoSuchAngularInstanceException if a Instance with the primary key could not be found
	*/
	public AngularInstance remove(long instanceId)
		throws NoSuchAngularInstanceException;

	public AngularInstance updateImpl(AngularInstance angularInstance);

	/**
	* Returns the Instance with the primary key or throws a {@link NoSuchAngularInstanceException} if it could not be found.
	*
	* @param instanceId the primary key of the Instance
	* @return the Instance
	* @throws NoSuchAngularInstanceException if a Instance with the primary key could not be found
	*/
	public AngularInstance findByPrimaryKey(long instanceId)
		throws NoSuchAngularInstanceException;

	/**
	* Returns the Instance with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param instanceId the primary key of the Instance
	* @return the Instance, or <code>null</code> if a Instance with the primary key could not be found
	*/
	public AngularInstance fetchByPrimaryKey(long instanceId);

	@Override
	public java.util.Map<java.io.Serializable, AngularInstance> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the Instances.
	*
	* @return the Instances
	*/
	public java.util.List<AngularInstance> findAll();

	/**
	* Returns a range of all the Instances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Instances
	* @param end the upper bound of the range of Instances (not inclusive)
	* @return the range of Instances
	*/
	public java.util.List<AngularInstance> findAll(int start, int end);

	/**
	* Returns an ordered range of all the Instances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Instances
	* @param end the upper bound of the range of Instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Instances
	*/
	public java.util.List<AngularInstance> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularInstance> orderByComparator);

	/**
	* Returns an ordered range of all the Instances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Instances
	* @param end the upper bound of the range of Instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of Instances
	*/
	public java.util.List<AngularInstance> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularInstance> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the Instances from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of Instances.
	*
	* @return the number of Instances
	*/
	public int countAll();
}