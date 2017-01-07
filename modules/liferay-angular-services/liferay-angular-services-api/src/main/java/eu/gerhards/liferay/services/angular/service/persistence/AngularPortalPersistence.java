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

import eu.gerhards.liferay.services.angular.exception.NoSuchAngularPortalException;
import eu.gerhards.liferay.services.angular.model.AngularPortal;

/**
 * The persistence interface for the Portal service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.persistence.impl.AngularPortalPersistenceImpl
 * @see AngularPortalUtil
 * @generated
 */
@ProviderType
public interface AngularPortalPersistence extends BasePersistence<AngularPortal> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AngularPortalUtil} to access the Portal persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the Portal in the entity cache if it is enabled.
	*
	* @param angularPortal the Portal
	*/
	public void cacheResult(AngularPortal angularPortal);

	/**
	* Caches the Portals in the entity cache if it is enabled.
	*
	* @param angularPortals the Portals
	*/
	public void cacheResult(java.util.List<AngularPortal> angularPortals);

	/**
	* Creates a new Portal with the primary key. Does not add the Portal to the database.
	*
	* @param portalId the primary key for the new Portal
	* @return the new Portal
	*/
	public AngularPortal create(long portalId);

	/**
	* Removes the Portal with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param portalId the primary key of the Portal
	* @return the Portal that was removed
	* @throws NoSuchAngularPortalException if a Portal with the primary key could not be found
	*/
	public AngularPortal remove(long portalId)
		throws NoSuchAngularPortalException;

	public AngularPortal updateImpl(AngularPortal angularPortal);

	/**
	* Returns the Portal with the primary key or throws a {@link NoSuchAngularPortalException} if it could not be found.
	*
	* @param portalId the primary key of the Portal
	* @return the Portal
	* @throws NoSuchAngularPortalException if a Portal with the primary key could not be found
	*/
	public AngularPortal findByPrimaryKey(long portalId)
		throws NoSuchAngularPortalException;

	/**
	* Returns the Portal with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param portalId the primary key of the Portal
	* @return the Portal, or <code>null</code> if a Portal with the primary key could not be found
	*/
	public AngularPortal fetchByPrimaryKey(long portalId);

	@Override
	public java.util.Map<java.io.Serializable, AngularPortal> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the Portals.
	*
	* @return the Portals
	*/
	public java.util.List<AngularPortal> findAll();

	/**
	* Returns a range of all the Portals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularPortalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Portals
	* @param end the upper bound of the range of Portals (not inclusive)
	* @return the range of Portals
	*/
	public java.util.List<AngularPortal> findAll(int start, int end);

	/**
	* Returns an ordered range of all the Portals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularPortalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Portals
	* @param end the upper bound of the range of Portals (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Portals
	*/
	public java.util.List<AngularPortal> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularPortal> orderByComparator);

	/**
	* Returns an ordered range of all the Portals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularPortalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Portals
	* @param end the upper bound of the range of Portals (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of Portals
	*/
	public java.util.List<AngularPortal> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularPortal> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the Portals from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of Portals.
	*
	* @return the number of Portals
	*/
	public int countAll();
}