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

import eu.gerhards.liferay.services.angular.exception.NoSuchAngularLayoutException;
import eu.gerhards.liferay.services.angular.model.AngularLayout;

/**
 * The persistence interface for the Layout service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.persistence.impl.AngularLayoutPersistenceImpl
 * @see AngularLayoutUtil
 * @generated
 */
@ProviderType
public interface AngularLayoutPersistence extends BasePersistence<AngularLayout> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AngularLayoutUtil} to access the Layout persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the Layout in the entity cache if it is enabled.
	*
	* @param angularLayout the Layout
	*/
	public void cacheResult(AngularLayout angularLayout);

	/**
	* Caches the Layouts in the entity cache if it is enabled.
	*
	* @param angularLayouts the Layouts
	*/
	public void cacheResult(java.util.List<AngularLayout> angularLayouts);

	/**
	* Creates a new Layout with the primary key. Does not add the Layout to the database.
	*
	* @param layoutId the primary key for the new Layout
	* @return the new Layout
	*/
	public AngularLayout create(long layoutId);

	/**
	* Removes the Layout with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param layoutId the primary key of the Layout
	* @return the Layout that was removed
	* @throws NoSuchAngularLayoutException if a Layout with the primary key could not be found
	*/
	public AngularLayout remove(long layoutId)
		throws NoSuchAngularLayoutException;

	public AngularLayout updateImpl(AngularLayout angularLayout);

	/**
	* Returns the Layout with the primary key or throws a {@link NoSuchAngularLayoutException} if it could not be found.
	*
	* @param layoutId the primary key of the Layout
	* @return the Layout
	* @throws NoSuchAngularLayoutException if a Layout with the primary key could not be found
	*/
	public AngularLayout findByPrimaryKey(long layoutId)
		throws NoSuchAngularLayoutException;

	/**
	* Returns the Layout with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param layoutId the primary key of the Layout
	* @return the Layout, or <code>null</code> if a Layout with the primary key could not be found
	*/
	public AngularLayout fetchByPrimaryKey(long layoutId);

	@Override
	public java.util.Map<java.io.Serializable, AngularLayout> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the Layouts.
	*
	* @return the Layouts
	*/
	public java.util.List<AngularLayout> findAll();

	/**
	* Returns a range of all the Layouts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularLayoutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Layouts
	* @param end the upper bound of the range of Layouts (not inclusive)
	* @return the range of Layouts
	*/
	public java.util.List<AngularLayout> findAll(int start, int end);

	/**
	* Returns an ordered range of all the Layouts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularLayoutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Layouts
	* @param end the upper bound of the range of Layouts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Layouts
	*/
	public java.util.List<AngularLayout> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularLayout> orderByComparator);

	/**
	* Returns an ordered range of all the Layouts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularLayoutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Layouts
	* @param end the upper bound of the range of Layouts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of Layouts
	*/
	public java.util.List<AngularLayout> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularLayout> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the Layouts from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of Layouts.
	*
	* @return the number of Layouts
	*/
	public int countAll();
}