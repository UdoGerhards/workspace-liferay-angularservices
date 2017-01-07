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

package eu.gerhards.liferay.services.angular.service.base;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import eu.gerhards.liferay.services.angular.model.AngularPortal;
import eu.gerhards.liferay.services.angular.service.AngularPortalLocalService;
import eu.gerhards.liferay.services.angular.service.persistence.AngularGroupPersistence;
import eu.gerhards.liferay.services.angular.service.persistence.AngularInstancePersistence;
import eu.gerhards.liferay.services.angular.service.persistence.AngularLayoutPersistence;
import eu.gerhards.liferay.services.angular.service.persistence.AngularOrganizationPersistence;
import eu.gerhards.liferay.services.angular.service.persistence.AngularPermissionPersistence;
import eu.gerhards.liferay.services.angular.service.persistence.AngularPortalPersistence;
import eu.gerhards.liferay.services.angular.service.persistence.AngularResourceBlockPersistence;
import eu.gerhards.liferay.services.angular.service.persistence.AngularResourcePermissionPersistence;
import eu.gerhards.liferay.services.angular.service.persistence.AngularRolePersistence;
import eu.gerhards.liferay.services.angular.service.persistence.AngularTeamPersistence;
import eu.gerhards.liferay.services.angular.service.persistence.AngularUserGroupPersistence;
import eu.gerhards.liferay.services.angular.service.persistence.AngularUserPersistence;
import eu.gerhards.liferay.services.angular.service.persistence.AngularVirtualHostPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the Portal local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link eu.gerhards.liferay.services.angular.service.impl.AngularPortalLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.impl.AngularPortalLocalServiceImpl
 * @see eu.gerhards.liferay.services.angular.service.AngularPortalLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class AngularPortalLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements AngularPortalLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link eu.gerhards.liferay.services.angular.service.AngularPortalLocalServiceUtil} to access the Portal local service.
	 */

	/**
	 * Adds the Portal to the database. Also notifies the appropriate model listeners.
	 *
	 * @param angularPortal the Portal
	 * @return the Portal that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AngularPortal addAngularPortal(AngularPortal angularPortal) {
		angularPortal.setNew(true);

		return angularPortalPersistence.update(angularPortal);
	}

	/**
	 * Creates a new Portal with the primary key. Does not add the Portal to the database.
	 *
	 * @param portalId the primary key for the new Portal
	 * @return the new Portal
	 */
	@Override
	public AngularPortal createAngularPortal(long portalId) {
		return angularPortalPersistence.create(portalId);
	}

	/**
	 * Deletes the Portal with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param portalId the primary key of the Portal
	 * @return the Portal that was removed
	 * @throws PortalException if a Portal with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AngularPortal deleteAngularPortal(long portalId)
		throws PortalException {
		return angularPortalPersistence.remove(portalId);
	}

	/**
	 * Deletes the Portal from the database. Also notifies the appropriate model listeners.
	 *
	 * @param angularPortal the Portal
	 * @return the Portal that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public AngularPortal deleteAngularPortal(AngularPortal angularPortal) {
		return angularPortalPersistence.remove(angularPortal);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(AngularPortal.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return angularPortalPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularPortalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end) {
		return angularPortalPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularPortalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator) {
		return angularPortalPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return angularPortalPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) {
		return angularPortalPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public AngularPortal fetchAngularPortal(long portalId) {
		return angularPortalPersistence.fetchByPrimaryKey(portalId);
	}

	/**
	 * Returns the Portal with the primary key.
	 *
	 * @param portalId the primary key of the Portal
	 * @return the Portal
	 * @throws PortalException if a Portal with the primary key could not be found
	 */
	@Override
	public AngularPortal getAngularPortal(long portalId)
		throws PortalException {
		return angularPortalPersistence.findByPrimaryKey(portalId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(angularPortalLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(AngularPortal.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("portalId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(angularPortalLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(AngularPortal.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("portalId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(angularPortalLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(AngularPortal.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("portalId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return angularPortalLocalService.deleteAngularPortal((AngularPortal)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return angularPortalPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the Portals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularPortalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Portals
	 * @param end the upper bound of the range of Portals (not inclusive)
	 * @return the range of Portals
	 */
	@Override
	public List<AngularPortal> getAngularPortals(int start, int end) {
		return angularPortalPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of Portals.
	 *
	 * @return the number of Portals
	 */
	@Override
	public int getAngularPortalsCount() {
		return angularPortalPersistence.countAll();
	}

	/**
	 * Updates the Portal in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param angularPortal the Portal
	 * @return the Portal that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public AngularPortal updateAngularPortal(AngularPortal angularPortal) {
		return angularPortalPersistence.update(angularPortal);
	}

	/**
	 * Returns the Group local service.
	 *
	 * @return the Group local service
	 */
	public eu.gerhards.liferay.services.angular.service.AngularGroupLocalService getAngularGroupLocalService() {
		return angularGroupLocalService;
	}

	/**
	 * Sets the Group local service.
	 *
	 * @param angularGroupLocalService the Group local service
	 */
	public void setAngularGroupLocalService(
		eu.gerhards.liferay.services.angular.service.AngularGroupLocalService angularGroupLocalService) {
		this.angularGroupLocalService = angularGroupLocalService;
	}

	/**
	 * Returns the Group persistence.
	 *
	 * @return the Group persistence
	 */
	public AngularGroupPersistence getAngularGroupPersistence() {
		return angularGroupPersistence;
	}

	/**
	 * Sets the Group persistence.
	 *
	 * @param angularGroupPersistence the Group persistence
	 */
	public void setAngularGroupPersistence(
		AngularGroupPersistence angularGroupPersistence) {
		this.angularGroupPersistence = angularGroupPersistence;
	}

	/**
	 * Returns the Instance local service.
	 *
	 * @return the Instance local service
	 */
	public eu.gerhards.liferay.services.angular.service.AngularInstanceLocalService getAngularInstanceLocalService() {
		return angularInstanceLocalService;
	}

	/**
	 * Sets the Instance local service.
	 *
	 * @param angularInstanceLocalService the Instance local service
	 */
	public void setAngularInstanceLocalService(
		eu.gerhards.liferay.services.angular.service.AngularInstanceLocalService angularInstanceLocalService) {
		this.angularInstanceLocalService = angularInstanceLocalService;
	}

	/**
	 * Returns the Instance persistence.
	 *
	 * @return the Instance persistence
	 */
	public AngularInstancePersistence getAngularInstancePersistence() {
		return angularInstancePersistence;
	}

	/**
	 * Sets the Instance persistence.
	 *
	 * @param angularInstancePersistence the Instance persistence
	 */
	public void setAngularInstancePersistence(
		AngularInstancePersistence angularInstancePersistence) {
		this.angularInstancePersistence = angularInstancePersistence;
	}

	/**
	 * Returns the Layout local service.
	 *
	 * @return the Layout local service
	 */
	public eu.gerhards.liferay.services.angular.service.AngularLayoutLocalService getAngularLayoutLocalService() {
		return angularLayoutLocalService;
	}

	/**
	 * Sets the Layout local service.
	 *
	 * @param angularLayoutLocalService the Layout local service
	 */
	public void setAngularLayoutLocalService(
		eu.gerhards.liferay.services.angular.service.AngularLayoutLocalService angularLayoutLocalService) {
		this.angularLayoutLocalService = angularLayoutLocalService;
	}

	/**
	 * Returns the Layout persistence.
	 *
	 * @return the Layout persistence
	 */
	public AngularLayoutPersistence getAngularLayoutPersistence() {
		return angularLayoutPersistence;
	}

	/**
	 * Sets the Layout persistence.
	 *
	 * @param angularLayoutPersistence the Layout persistence
	 */
	public void setAngularLayoutPersistence(
		AngularLayoutPersistence angularLayoutPersistence) {
		this.angularLayoutPersistence = angularLayoutPersistence;
	}

	/**
	 * Returns the Organization local service.
	 *
	 * @return the Organization local service
	 */
	public eu.gerhards.liferay.services.angular.service.AngularOrganizationLocalService getAngularOrganizationLocalService() {
		return angularOrganizationLocalService;
	}

	/**
	 * Sets the Organization local service.
	 *
	 * @param angularOrganizationLocalService the Organization local service
	 */
	public void setAngularOrganizationLocalService(
		eu.gerhards.liferay.services.angular.service.AngularOrganizationLocalService angularOrganizationLocalService) {
		this.angularOrganizationLocalService = angularOrganizationLocalService;
	}

	/**
	 * Returns the Organization persistence.
	 *
	 * @return the Organization persistence
	 */
	public AngularOrganizationPersistence getAngularOrganizationPersistence() {
		return angularOrganizationPersistence;
	}

	/**
	 * Sets the Organization persistence.
	 *
	 * @param angularOrganizationPersistence the Organization persistence
	 */
	public void setAngularOrganizationPersistence(
		AngularOrganizationPersistence angularOrganizationPersistence) {
		this.angularOrganizationPersistence = angularOrganizationPersistence;
	}

	/**
	 * Returns the Permission local service.
	 *
	 * @return the Permission local service
	 */
	public eu.gerhards.liferay.services.angular.service.AngularPermissionLocalService getAngularPermissionLocalService() {
		return angularPermissionLocalService;
	}

	/**
	 * Sets the Permission local service.
	 *
	 * @param angularPermissionLocalService the Permission local service
	 */
	public void setAngularPermissionLocalService(
		eu.gerhards.liferay.services.angular.service.AngularPermissionLocalService angularPermissionLocalService) {
		this.angularPermissionLocalService = angularPermissionLocalService;
	}

	/**
	 * Returns the Permission persistence.
	 *
	 * @return the Permission persistence
	 */
	public AngularPermissionPersistence getAngularPermissionPersistence() {
		return angularPermissionPersistence;
	}

	/**
	 * Sets the Permission persistence.
	 *
	 * @param angularPermissionPersistence the Permission persistence
	 */
	public void setAngularPermissionPersistence(
		AngularPermissionPersistence angularPermissionPersistence) {
		this.angularPermissionPersistence = angularPermissionPersistence;
	}

	/**
	 * Returns the Portal local service.
	 *
	 * @return the Portal local service
	 */
	public AngularPortalLocalService getAngularPortalLocalService() {
		return angularPortalLocalService;
	}

	/**
	 * Sets the Portal local service.
	 *
	 * @param angularPortalLocalService the Portal local service
	 */
	public void setAngularPortalLocalService(
		AngularPortalLocalService angularPortalLocalService) {
		this.angularPortalLocalService = angularPortalLocalService;
	}

	/**
	 * Returns the Portal persistence.
	 *
	 * @return the Portal persistence
	 */
	public AngularPortalPersistence getAngularPortalPersistence() {
		return angularPortalPersistence;
	}

	/**
	 * Sets the Portal persistence.
	 *
	 * @param angularPortalPersistence the Portal persistence
	 */
	public void setAngularPortalPersistence(
		AngularPortalPersistence angularPortalPersistence) {
		this.angularPortalPersistence = angularPortalPersistence;
	}

	/**
	 * Returns the Resource block local service.
	 *
	 * @return the Resource block local service
	 */
	public eu.gerhards.liferay.services.angular.service.AngularResourceBlockLocalService getAngularResourceBlockLocalService() {
		return angularResourceBlockLocalService;
	}

	/**
	 * Sets the Resource block local service.
	 *
	 * @param angularResourceBlockLocalService the Resource block local service
	 */
	public void setAngularResourceBlockLocalService(
		eu.gerhards.liferay.services.angular.service.AngularResourceBlockLocalService angularResourceBlockLocalService) {
		this.angularResourceBlockLocalService = angularResourceBlockLocalService;
	}

	/**
	 * Returns the Resource block persistence.
	 *
	 * @return the Resource block persistence
	 */
	public AngularResourceBlockPersistence getAngularResourceBlockPersistence() {
		return angularResourceBlockPersistence;
	}

	/**
	 * Sets the Resource block persistence.
	 *
	 * @param angularResourceBlockPersistence the Resource block persistence
	 */
	public void setAngularResourceBlockPersistence(
		AngularResourceBlockPersistence angularResourceBlockPersistence) {
		this.angularResourceBlockPersistence = angularResourceBlockPersistence;
	}

	/**
	 * Returns the Resource permission local service.
	 *
	 * @return the Resource permission local service
	 */
	public eu.gerhards.liferay.services.angular.service.AngularResourcePermissionLocalService getAngularResourcePermissionLocalService() {
		return angularResourcePermissionLocalService;
	}

	/**
	 * Sets the Resource permission local service.
	 *
	 * @param angularResourcePermissionLocalService the Resource permission local service
	 */
	public void setAngularResourcePermissionLocalService(
		eu.gerhards.liferay.services.angular.service.AngularResourcePermissionLocalService angularResourcePermissionLocalService) {
		this.angularResourcePermissionLocalService = angularResourcePermissionLocalService;
	}

	/**
	 * Returns the Resource permission persistence.
	 *
	 * @return the Resource permission persistence
	 */
	public AngularResourcePermissionPersistence getAngularResourcePermissionPersistence() {
		return angularResourcePermissionPersistence;
	}

	/**
	 * Sets the Resource permission persistence.
	 *
	 * @param angularResourcePermissionPersistence the Resource permission persistence
	 */
	public void setAngularResourcePermissionPersistence(
		AngularResourcePermissionPersistence angularResourcePermissionPersistence) {
		this.angularResourcePermissionPersistence = angularResourcePermissionPersistence;
	}

	/**
	 * Returns the Role local service.
	 *
	 * @return the Role local service
	 */
	public eu.gerhards.liferay.services.angular.service.AngularRoleLocalService getAngularRoleLocalService() {
		return angularRoleLocalService;
	}

	/**
	 * Sets the Role local service.
	 *
	 * @param angularRoleLocalService the Role local service
	 */
	public void setAngularRoleLocalService(
		eu.gerhards.liferay.services.angular.service.AngularRoleLocalService angularRoleLocalService) {
		this.angularRoleLocalService = angularRoleLocalService;
	}

	/**
	 * Returns the Role persistence.
	 *
	 * @return the Role persistence
	 */
	public AngularRolePersistence getAngularRolePersistence() {
		return angularRolePersistence;
	}

	/**
	 * Sets the Role persistence.
	 *
	 * @param angularRolePersistence the Role persistence
	 */
	public void setAngularRolePersistence(
		AngularRolePersistence angularRolePersistence) {
		this.angularRolePersistence = angularRolePersistence;
	}

	/**
	 * Returns the Team local service.
	 *
	 * @return the Team local service
	 */
	public eu.gerhards.liferay.services.angular.service.AngularTeamLocalService getAngularTeamLocalService() {
		return angularTeamLocalService;
	}

	/**
	 * Sets the Team local service.
	 *
	 * @param angularTeamLocalService the Team local service
	 */
	public void setAngularTeamLocalService(
		eu.gerhards.liferay.services.angular.service.AngularTeamLocalService angularTeamLocalService) {
		this.angularTeamLocalService = angularTeamLocalService;
	}

	/**
	 * Returns the Team persistence.
	 *
	 * @return the Team persistence
	 */
	public AngularTeamPersistence getAngularTeamPersistence() {
		return angularTeamPersistence;
	}

	/**
	 * Sets the Team persistence.
	 *
	 * @param angularTeamPersistence the Team persistence
	 */
	public void setAngularTeamPersistence(
		AngularTeamPersistence angularTeamPersistence) {
		this.angularTeamPersistence = angularTeamPersistence;
	}

	/**
	 * Returns the User local service.
	 *
	 * @return the User local service
	 */
	public eu.gerhards.liferay.services.angular.service.AngularUserLocalService getAngularUserLocalService() {
		return angularUserLocalService;
	}

	/**
	 * Sets the User local service.
	 *
	 * @param angularUserLocalService the User local service
	 */
	public void setAngularUserLocalService(
		eu.gerhards.liferay.services.angular.service.AngularUserLocalService angularUserLocalService) {
		this.angularUserLocalService = angularUserLocalService;
	}

	/**
	 * Returns the User persistence.
	 *
	 * @return the User persistence
	 */
	public AngularUserPersistence getAngularUserPersistence() {
		return angularUserPersistence;
	}

	/**
	 * Sets the User persistence.
	 *
	 * @param angularUserPersistence the User persistence
	 */
	public void setAngularUserPersistence(
		AngularUserPersistence angularUserPersistence) {
		this.angularUserPersistence = angularUserPersistence;
	}

	/**
	 * Returns the User group local service.
	 *
	 * @return the User group local service
	 */
	public eu.gerhards.liferay.services.angular.service.AngularUserGroupLocalService getAngularUserGroupLocalService() {
		return angularUserGroupLocalService;
	}

	/**
	 * Sets the User group local service.
	 *
	 * @param angularUserGroupLocalService the User group local service
	 */
	public void setAngularUserGroupLocalService(
		eu.gerhards.liferay.services.angular.service.AngularUserGroupLocalService angularUserGroupLocalService) {
		this.angularUserGroupLocalService = angularUserGroupLocalService;
	}

	/**
	 * Returns the User group persistence.
	 *
	 * @return the User group persistence
	 */
	public AngularUserGroupPersistence getAngularUserGroupPersistence() {
		return angularUserGroupPersistence;
	}

	/**
	 * Sets the User group persistence.
	 *
	 * @param angularUserGroupPersistence the User group persistence
	 */
	public void setAngularUserGroupPersistence(
		AngularUserGroupPersistence angularUserGroupPersistence) {
		this.angularUserGroupPersistence = angularUserGroupPersistence;
	}

	/**
	 * Returns the Virtual host local service.
	 *
	 * @return the Virtual host local service
	 */
	public eu.gerhards.liferay.services.angular.service.AngularVirtualHostLocalService getAngularVirtualHostLocalService() {
		return angularVirtualHostLocalService;
	}

	/**
	 * Sets the Virtual host local service.
	 *
	 * @param angularVirtualHostLocalService the Virtual host local service
	 */
	public void setAngularVirtualHostLocalService(
		eu.gerhards.liferay.services.angular.service.AngularVirtualHostLocalService angularVirtualHostLocalService) {
		this.angularVirtualHostLocalService = angularVirtualHostLocalService;
	}

	/**
	 * Returns the Virtual host persistence.
	 *
	 * @return the Virtual host persistence
	 */
	public AngularVirtualHostPersistence getAngularVirtualHostPersistence() {
		return angularVirtualHostPersistence;
	}

	/**
	 * Sets the Virtual host persistence.
	 *
	 * @param angularVirtualHostPersistence the Virtual host persistence
	 */
	public void setAngularVirtualHostPersistence(
		AngularVirtualHostPersistence angularVirtualHostPersistence) {
		this.angularVirtualHostPersistence = angularVirtualHostPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		persistedModelLocalServiceRegistry.register("eu.gerhards.liferay.services.angular.model.AngularPortal",
			angularPortalLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"eu.gerhards.liferay.services.angular.model.AngularPortal");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return AngularPortalLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return AngularPortal.class;
	}

	protected String getModelClassName() {
		return AngularPortal.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = angularPortalPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = eu.gerhards.liferay.services.angular.service.AngularGroupLocalService.class)
	protected eu.gerhards.liferay.services.angular.service.AngularGroupLocalService angularGroupLocalService;
	@BeanReference(type = AngularGroupPersistence.class)
	protected AngularGroupPersistence angularGroupPersistence;
	@BeanReference(type = eu.gerhards.liferay.services.angular.service.AngularInstanceLocalService.class)
	protected eu.gerhards.liferay.services.angular.service.AngularInstanceLocalService angularInstanceLocalService;
	@BeanReference(type = AngularInstancePersistence.class)
	protected AngularInstancePersistence angularInstancePersistence;
	@BeanReference(type = eu.gerhards.liferay.services.angular.service.AngularLayoutLocalService.class)
	protected eu.gerhards.liferay.services.angular.service.AngularLayoutLocalService angularLayoutLocalService;
	@BeanReference(type = AngularLayoutPersistence.class)
	protected AngularLayoutPersistence angularLayoutPersistence;
	@BeanReference(type = eu.gerhards.liferay.services.angular.service.AngularOrganizationLocalService.class)
	protected eu.gerhards.liferay.services.angular.service.AngularOrganizationLocalService angularOrganizationLocalService;
	@BeanReference(type = AngularOrganizationPersistence.class)
	protected AngularOrganizationPersistence angularOrganizationPersistence;
	@BeanReference(type = eu.gerhards.liferay.services.angular.service.AngularPermissionLocalService.class)
	protected eu.gerhards.liferay.services.angular.service.AngularPermissionLocalService angularPermissionLocalService;
	@BeanReference(type = AngularPermissionPersistence.class)
	protected AngularPermissionPersistence angularPermissionPersistence;
	@BeanReference(type = AngularPortalLocalService.class)
	protected AngularPortalLocalService angularPortalLocalService;
	@BeanReference(type = AngularPortalPersistence.class)
	protected AngularPortalPersistence angularPortalPersistence;
	@BeanReference(type = eu.gerhards.liferay.services.angular.service.AngularResourceBlockLocalService.class)
	protected eu.gerhards.liferay.services.angular.service.AngularResourceBlockLocalService angularResourceBlockLocalService;
	@BeanReference(type = AngularResourceBlockPersistence.class)
	protected AngularResourceBlockPersistence angularResourceBlockPersistence;
	@BeanReference(type = eu.gerhards.liferay.services.angular.service.AngularResourcePermissionLocalService.class)
	protected eu.gerhards.liferay.services.angular.service.AngularResourcePermissionLocalService angularResourcePermissionLocalService;
	@BeanReference(type = AngularResourcePermissionPersistence.class)
	protected AngularResourcePermissionPersistence angularResourcePermissionPersistence;
	@BeanReference(type = eu.gerhards.liferay.services.angular.service.AngularRoleLocalService.class)
	protected eu.gerhards.liferay.services.angular.service.AngularRoleLocalService angularRoleLocalService;
	@BeanReference(type = AngularRolePersistence.class)
	protected AngularRolePersistence angularRolePersistence;
	@BeanReference(type = eu.gerhards.liferay.services.angular.service.AngularTeamLocalService.class)
	protected eu.gerhards.liferay.services.angular.service.AngularTeamLocalService angularTeamLocalService;
	@BeanReference(type = AngularTeamPersistence.class)
	protected AngularTeamPersistence angularTeamPersistence;
	@BeanReference(type = eu.gerhards.liferay.services.angular.service.AngularUserLocalService.class)
	protected eu.gerhards.liferay.services.angular.service.AngularUserLocalService angularUserLocalService;
	@BeanReference(type = AngularUserPersistence.class)
	protected AngularUserPersistence angularUserPersistence;
	@BeanReference(type = eu.gerhards.liferay.services.angular.service.AngularUserGroupLocalService.class)
	protected eu.gerhards.liferay.services.angular.service.AngularUserGroupLocalService angularUserGroupLocalService;
	@BeanReference(type = AngularUserGroupPersistence.class)
	protected AngularUserGroupPersistence angularUserGroupPersistence;
	@BeanReference(type = eu.gerhards.liferay.services.angular.service.AngularVirtualHostLocalService.class)
	protected eu.gerhards.liferay.services.angular.service.AngularVirtualHostLocalService angularVirtualHostLocalService;
	@BeanReference(type = AngularVirtualHostPersistence.class)
	protected AngularVirtualHostPersistence angularVirtualHostPersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry persistedModelLocalServiceRegistry;
}