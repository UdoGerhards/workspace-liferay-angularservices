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
import eu.gerhards.liferay.services.angular.exception.NoSuchAngularSiteException;
import eu.gerhards.liferay.services.angular.model.AngularSite;

/**
 * The persistence interface for the Site service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.persistence.impl.AngularSitePersistenceImpl
 * @see AngularSiteUtil
 * @generated
 */
@ProviderType
public interface AngularSitePersistence extends BasePersistence<AngularSite> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AngularSiteUtil} to access the Site persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the Site in the entity cache if it is enabled.
	*
	* @param angularSite the Site
	*/
	public void cacheResult(AngularSite angularSite);

	/**
	* Caches the Sites in the entity cache if it is enabled.
	*
	* @param angularSites the Sites
	*/
	public void cacheResult(java.util.List<AngularSite> angularSites);

	/**
	* Creates a new Site with the primary key. Does not add the Site to the database.
	*
	* @param siteId the primary key for the new Site
	* @return the new Site
	*/
	public AngularSite create(long siteId);

	/**
	* Removes the Site with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param siteId the primary key of the Site
	* @return the Site that was removed
	* @throws NoSuchAngularSiteException if a Site with the primary key could not be found
	*/
	public AngularSite remove(long siteId) throws NoSuchAngularSiteException;

	public AngularSite updateImpl(AngularSite angularSite);

	/**
	* Returns the Site with the primary key or throws a {@link NoSuchAngularSiteException} if it could not be found.
	*
	* @param siteId the primary key of the Site
	* @return the Site
	* @throws NoSuchAngularSiteException if a Site with the primary key could not be found
	*/
	public AngularSite findByPrimaryKey(long siteId)
		throws NoSuchAngularSiteException;

	/**
	* Returns the Site with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param siteId the primary key of the Site
	* @return the Site, or <code>null</code> if a Site with the primary key could not be found
	*/
	public AngularSite fetchByPrimaryKey(long siteId);

	@Override
	public java.util.Map<java.io.Serializable, AngularSite> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the Sites.
	*
	* @return the Sites
	*/
	public java.util.List<AngularSite> findAll();

	/**
	* Returns a range of all the Sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularSiteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Sites
	* @param end the upper bound of the range of Sites (not inclusive)
	* @return the range of Sites
	*/
	public java.util.List<AngularSite> findAll(int start, int end);

	/**
	* Returns an ordered range of all the Sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularSiteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Sites
	* @param end the upper bound of the range of Sites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Sites
	*/
	public java.util.List<AngularSite> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularSite> orderByComparator);

	/**
	* Returns an ordered range of all the Sites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularSiteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Sites
	* @param end the upper bound of the range of Sites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of Sites
	*/
	public java.util.List<AngularSite> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularSite> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the Sites from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of Sites.
	*
	* @return the number of Sites
	*/
	public int countAll();
}