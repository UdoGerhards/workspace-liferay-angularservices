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
import eu.gerhards.liferay.services.angular.exception.NoSuchAngularBootstrapException;
import eu.gerhards.liferay.services.angular.model.AngularBootstrap;

/**
 * The persistence interface for the Bootstrap service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.persistence.impl.AngularBootstrapPersistenceImpl
 * @see AngularBootstrapUtil
 * @generated
 */
@ProviderType
public interface AngularBootstrapPersistence extends BasePersistence<AngularBootstrap> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AngularBootstrapUtil} to access the Bootstrap persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the Bootstrap in the entity cache if it is enabled.
	*
	* @param angularBootstrap the Bootstrap
	*/
	public void cacheResult(AngularBootstrap angularBootstrap);

	/**
	* Caches the Bootstraps in the entity cache if it is enabled.
	*
	* @param angularBootstraps the Bootstraps
	*/
	public void cacheResult(java.util.List<AngularBootstrap> angularBootstraps);

	/**
	* Creates a new Bootstrap with the primary key. Does not add the Bootstrap to the database.
	*
	* @param bootId the primary key for the new Bootstrap
	* @return the new Bootstrap
	*/
	public AngularBootstrap create(long bootId);

	/**
	* Removes the Bootstrap with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param bootId the primary key of the Bootstrap
	* @return the Bootstrap that was removed
	* @throws NoSuchAngularBootstrapException if a Bootstrap with the primary key could not be found
	*/
	public AngularBootstrap remove(long bootId)
		throws NoSuchAngularBootstrapException;

	public AngularBootstrap updateImpl(AngularBootstrap angularBootstrap);

	/**
	* Returns the Bootstrap with the primary key or throws a {@link NoSuchAngularBootstrapException} if it could not be found.
	*
	* @param bootId the primary key of the Bootstrap
	* @return the Bootstrap
	* @throws NoSuchAngularBootstrapException if a Bootstrap with the primary key could not be found
	*/
	public AngularBootstrap findByPrimaryKey(long bootId)
		throws NoSuchAngularBootstrapException;

	/**
	* Returns the Bootstrap with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param bootId the primary key of the Bootstrap
	* @return the Bootstrap, or <code>null</code> if a Bootstrap with the primary key could not be found
	*/
	public AngularBootstrap fetchByPrimaryKey(long bootId);

	@Override
	public java.util.Map<java.io.Serializable, AngularBootstrap> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the Bootstraps.
	*
	* @return the Bootstraps
	*/
	public java.util.List<AngularBootstrap> findAll();

	/**
	* Returns a range of all the Bootstraps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularBootstrapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Bootstraps
	* @param end the upper bound of the range of Bootstraps (not inclusive)
	* @return the range of Bootstraps
	*/
	public java.util.List<AngularBootstrap> findAll(int start, int end);

	/**
	* Returns an ordered range of all the Bootstraps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularBootstrapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Bootstraps
	* @param end the upper bound of the range of Bootstraps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Bootstraps
	*/
	public java.util.List<AngularBootstrap> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularBootstrap> orderByComparator);

	/**
	* Returns an ordered range of all the Bootstraps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularBootstrapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Bootstraps
	* @param end the upper bound of the range of Bootstraps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of Bootstraps
	*/
	public java.util.List<AngularBootstrap> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularBootstrap> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the Bootstraps from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of Bootstraps.
	*
	* @return the number of Bootstraps
	*/
	public int countAll();
}