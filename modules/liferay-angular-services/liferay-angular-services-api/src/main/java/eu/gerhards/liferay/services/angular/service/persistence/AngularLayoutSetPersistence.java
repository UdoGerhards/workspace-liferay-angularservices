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
import eu.gerhards.liferay.services.angular.exception.NoSuchAngularLayoutSetException;
import eu.gerhards.liferay.services.angular.model.AngularLayoutSet;

/**
 * The persistence interface for the LayoutSet service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.persistence.impl.AngularLayoutSetPersistenceImpl
 * @see AngularLayoutSetUtil
 * @generated
 */
@ProviderType
public interface AngularLayoutSetPersistence extends BasePersistence<AngularLayoutSet> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AngularLayoutSetUtil} to access the LayoutSet persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the LayoutSet in the entity cache if it is enabled.
	*
	* @param angularLayoutSet the LayoutSet
	*/
	public void cacheResult(AngularLayoutSet angularLayoutSet);

	/**
	* Caches the LayoutSets in the entity cache if it is enabled.
	*
	* @param angularLayoutSets the LayoutSets
	*/
	public void cacheResult(java.util.List<AngularLayoutSet> angularLayoutSets);

	/**
	* Creates a new LayoutSet with the primary key. Does not add the LayoutSet to the database.
	*
	* @param layoutSetId the primary key for the new LayoutSet
	* @return the new LayoutSet
	*/
	public AngularLayoutSet create(long layoutSetId);

	/**
	* Removes the LayoutSet with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param layoutSetId the primary key of the LayoutSet
	* @return the LayoutSet that was removed
	* @throws NoSuchAngularLayoutSetException if a LayoutSet with the primary key could not be found
	*/
	public AngularLayoutSet remove(long layoutSetId)
		throws NoSuchAngularLayoutSetException;

	public AngularLayoutSet updateImpl(AngularLayoutSet angularLayoutSet);

	/**
	* Returns the LayoutSet with the primary key or throws a {@link NoSuchAngularLayoutSetException} if it could not be found.
	*
	* @param layoutSetId the primary key of the LayoutSet
	* @return the LayoutSet
	* @throws NoSuchAngularLayoutSetException if a LayoutSet with the primary key could not be found
	*/
	public AngularLayoutSet findByPrimaryKey(long layoutSetId)
		throws NoSuchAngularLayoutSetException;

	/**
	* Returns the LayoutSet with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param layoutSetId the primary key of the LayoutSet
	* @return the LayoutSet, or <code>null</code> if a LayoutSet with the primary key could not be found
	*/
	public AngularLayoutSet fetchByPrimaryKey(long layoutSetId);

	@Override
	public java.util.Map<java.io.Serializable, AngularLayoutSet> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the LayoutSets.
	*
	* @return the LayoutSets
	*/
	public java.util.List<AngularLayoutSet> findAll();

	/**
	* Returns a range of all the LayoutSets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularLayoutSetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of LayoutSets
	* @param end the upper bound of the range of LayoutSets (not inclusive)
	* @return the range of LayoutSets
	*/
	public java.util.List<AngularLayoutSet> findAll(int start, int end);

	/**
	* Returns an ordered range of all the LayoutSets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularLayoutSetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of LayoutSets
	* @param end the upper bound of the range of LayoutSets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of LayoutSets
	*/
	public java.util.List<AngularLayoutSet> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularLayoutSet> orderByComparator);

	/**
	* Returns an ordered range of all the LayoutSets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularLayoutSetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of LayoutSets
	* @param end the upper bound of the range of LayoutSets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of LayoutSets
	*/
	public java.util.List<AngularLayoutSet> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularLayoutSet> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the LayoutSets from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of LayoutSets.
	*
	* @return the number of LayoutSets
	*/
	public int countAll();
}