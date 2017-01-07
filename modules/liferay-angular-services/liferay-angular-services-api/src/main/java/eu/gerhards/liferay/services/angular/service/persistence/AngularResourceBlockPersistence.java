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

import eu.gerhards.liferay.services.angular.exception.NoSuchAngularResourceBlockException;
import eu.gerhards.liferay.services.angular.model.AngularResourceBlock;

/**
 * The persistence interface for the Resource block service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.persistence.impl.AngularResourceBlockPersistenceImpl
 * @see AngularResourceBlockUtil
 * @generated
 */
@ProviderType
public interface AngularResourceBlockPersistence extends BasePersistence<AngularResourceBlock> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AngularResourceBlockUtil} to access the Resource block persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the Resource blocks where resourceBlockId = &#63;.
	*
	* @param resourceBlockId the resource block ID
	* @return the matching Resource blocks
	*/
	public java.util.List<AngularResourceBlock> findByResourceBlockId(
		long resourceBlockId);

	/**
	* Returns a range of all the Resource blocks where resourceBlockId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularResourceBlockModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param resourceBlockId the resource block ID
	* @param start the lower bound of the range of Resource blocks
	* @param end the upper bound of the range of Resource blocks (not inclusive)
	* @return the range of matching Resource blocks
	*/
	public java.util.List<AngularResourceBlock> findByResourceBlockId(
		long resourceBlockId, int start, int end);

	/**
	* Returns an ordered range of all the Resource blocks where resourceBlockId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularResourceBlockModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param resourceBlockId the resource block ID
	* @param start the lower bound of the range of Resource blocks
	* @param end the upper bound of the range of Resource blocks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Resource blocks
	*/
	public java.util.List<AngularResourceBlock> findByResourceBlockId(
		long resourceBlockId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularResourceBlock> orderByComparator);

	/**
	* Returns an ordered range of all the Resource blocks where resourceBlockId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularResourceBlockModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param resourceBlockId the resource block ID
	* @param start the lower bound of the range of Resource blocks
	* @param end the upper bound of the range of Resource blocks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching Resource blocks
	*/
	public java.util.List<AngularResourceBlock> findByResourceBlockId(
		long resourceBlockId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularResourceBlock> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first Resource block in the ordered set where resourceBlockId = &#63;.
	*
	* @param resourceBlockId the resource block ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Resource block
	* @throws NoSuchAngularResourceBlockException if a matching Resource block could not be found
	*/
	public AngularResourceBlock findByResourceBlockId_First(
		long resourceBlockId,
		com.liferay.portal.kernel.util.OrderByComparator<AngularResourceBlock> orderByComparator)
		throws NoSuchAngularResourceBlockException;

	/**
	* Returns the first Resource block in the ordered set where resourceBlockId = &#63;.
	*
	* @param resourceBlockId the resource block ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Resource block, or <code>null</code> if a matching Resource block could not be found
	*/
	public AngularResourceBlock fetchByResourceBlockId_First(
		long resourceBlockId,
		com.liferay.portal.kernel.util.OrderByComparator<AngularResourceBlock> orderByComparator);

	/**
	* Returns the last Resource block in the ordered set where resourceBlockId = &#63;.
	*
	* @param resourceBlockId the resource block ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Resource block
	* @throws NoSuchAngularResourceBlockException if a matching Resource block could not be found
	*/
	public AngularResourceBlock findByResourceBlockId_Last(
		long resourceBlockId,
		com.liferay.portal.kernel.util.OrderByComparator<AngularResourceBlock> orderByComparator)
		throws NoSuchAngularResourceBlockException;

	/**
	* Returns the last Resource block in the ordered set where resourceBlockId = &#63;.
	*
	* @param resourceBlockId the resource block ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Resource block, or <code>null</code> if a matching Resource block could not be found
	*/
	public AngularResourceBlock fetchByResourceBlockId_Last(
		long resourceBlockId,
		com.liferay.portal.kernel.util.OrderByComparator<AngularResourceBlock> orderByComparator);

	/**
	* Removes all the Resource blocks where resourceBlockId = &#63; from the database.
	*
	* @param resourceBlockId the resource block ID
	*/
	public void removeByResourceBlockId(long resourceBlockId);

	/**
	* Returns the number of Resource blocks where resourceBlockId = &#63;.
	*
	* @param resourceBlockId the resource block ID
	* @return the number of matching Resource blocks
	*/
	public int countByResourceBlockId(long resourceBlockId);

	/**
	* Caches the Resource block in the entity cache if it is enabled.
	*
	* @param angularResourceBlock the Resource block
	*/
	public void cacheResult(AngularResourceBlock angularResourceBlock);

	/**
	* Caches the Resource blocks in the entity cache if it is enabled.
	*
	* @param angularResourceBlocks the Resource blocks
	*/
	public void cacheResult(
		java.util.List<AngularResourceBlock> angularResourceBlocks);

	/**
	* Creates a new Resource block with the primary key. Does not add the Resource block to the database.
	*
	* @param resourceBlockId the primary key for the new Resource block
	* @return the new Resource block
	*/
	public AngularResourceBlock create(long resourceBlockId);

	/**
	* Removes the Resource block with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param resourceBlockId the primary key of the Resource block
	* @return the Resource block that was removed
	* @throws NoSuchAngularResourceBlockException if a Resource block with the primary key could not be found
	*/
	public AngularResourceBlock remove(long resourceBlockId)
		throws NoSuchAngularResourceBlockException;

	public AngularResourceBlock updateImpl(
		AngularResourceBlock angularResourceBlock);

	/**
	* Returns the Resource block with the primary key or throws a {@link NoSuchAngularResourceBlockException} if it could not be found.
	*
	* @param resourceBlockId the primary key of the Resource block
	* @return the Resource block
	* @throws NoSuchAngularResourceBlockException if a Resource block with the primary key could not be found
	*/
	public AngularResourceBlock findByPrimaryKey(long resourceBlockId)
		throws NoSuchAngularResourceBlockException;

	/**
	* Returns the Resource block with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param resourceBlockId the primary key of the Resource block
	* @return the Resource block, or <code>null</code> if a Resource block with the primary key could not be found
	*/
	public AngularResourceBlock fetchByPrimaryKey(long resourceBlockId);

	@Override
	public java.util.Map<java.io.Serializable, AngularResourceBlock> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the Resource blocks.
	*
	* @return the Resource blocks
	*/
	public java.util.List<AngularResourceBlock> findAll();

	/**
	* Returns a range of all the Resource blocks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularResourceBlockModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Resource blocks
	* @param end the upper bound of the range of Resource blocks (not inclusive)
	* @return the range of Resource blocks
	*/
	public java.util.List<AngularResourceBlock> findAll(int start, int end);

	/**
	* Returns an ordered range of all the Resource blocks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularResourceBlockModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Resource blocks
	* @param end the upper bound of the range of Resource blocks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Resource blocks
	*/
	public java.util.List<AngularResourceBlock> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularResourceBlock> orderByComparator);

	/**
	* Returns an ordered range of all the Resource blocks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularResourceBlockModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Resource blocks
	* @param end the upper bound of the range of Resource blocks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of Resource blocks
	*/
	public java.util.List<AngularResourceBlock> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularResourceBlock> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the Resource blocks from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of Resource blocks.
	*
	* @return the number of Resource blocks
	*/
	public int countAll();
}