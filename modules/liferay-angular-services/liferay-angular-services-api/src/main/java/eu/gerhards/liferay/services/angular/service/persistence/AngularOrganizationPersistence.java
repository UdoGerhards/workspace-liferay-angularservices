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

import eu.gerhards.liferay.services.angular.exception.NoSuchAngularOrganizationException;
import eu.gerhards.liferay.services.angular.model.AngularOrganization;

/**
 * The persistence interface for the Organization service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.persistence.impl.AngularOrganizationPersistenceImpl
 * @see AngularOrganizationUtil
 * @generated
 */
@ProviderType
public interface AngularOrganizationPersistence extends BasePersistence<AngularOrganization> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AngularOrganizationUtil} to access the Organization persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the Organization in the entity cache if it is enabled.
	*
	* @param angularOrganization the Organization
	*/
	public void cacheResult(AngularOrganization angularOrganization);

	/**
	* Caches the Organizations in the entity cache if it is enabled.
	*
	* @param angularOrganizations the Organizations
	*/
	public void cacheResult(
		java.util.List<AngularOrganization> angularOrganizations);

	/**
	* Creates a new Organization with the primary key. Does not add the Organization to the database.
	*
	* @param organizationId the primary key for the new Organization
	* @return the new Organization
	*/
	public AngularOrganization create(long organizationId);

	/**
	* Removes the Organization with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param organizationId the primary key of the Organization
	* @return the Organization that was removed
	* @throws NoSuchAngularOrganizationException if a Organization with the primary key could not be found
	*/
	public AngularOrganization remove(long organizationId)
		throws NoSuchAngularOrganizationException;

	public AngularOrganization updateImpl(
		AngularOrganization angularOrganization);

	/**
	* Returns the Organization with the primary key or throws a {@link NoSuchAngularOrganizationException} if it could not be found.
	*
	* @param organizationId the primary key of the Organization
	* @return the Organization
	* @throws NoSuchAngularOrganizationException if a Organization with the primary key could not be found
	*/
	public AngularOrganization findByPrimaryKey(long organizationId)
		throws NoSuchAngularOrganizationException;

	/**
	* Returns the Organization with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param organizationId the primary key of the Organization
	* @return the Organization, or <code>null</code> if a Organization with the primary key could not be found
	*/
	public AngularOrganization fetchByPrimaryKey(long organizationId);

	@Override
	public java.util.Map<java.io.Serializable, AngularOrganization> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the Organizations.
	*
	* @return the Organizations
	*/
	public java.util.List<AngularOrganization> findAll();

	/**
	* Returns a range of all the Organizations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Organizations
	* @param end the upper bound of the range of Organizations (not inclusive)
	* @return the range of Organizations
	*/
	public java.util.List<AngularOrganization> findAll(int start, int end);

	/**
	* Returns an ordered range of all the Organizations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Organizations
	* @param end the upper bound of the range of Organizations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Organizations
	*/
	public java.util.List<AngularOrganization> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularOrganization> orderByComparator);

	/**
	* Returns an ordered range of all the Organizations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Organizations
	* @param end the upper bound of the range of Organizations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of Organizations
	*/
	public java.util.List<AngularOrganization> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AngularOrganization> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the Organizations from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of Organizations.
	*
	* @return the number of Organizations
	*/
	public int countAll();
}