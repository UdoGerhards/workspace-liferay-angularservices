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

package eu.gerhards.liferay.services.angular.service;

import aQute.bnd.annotation.ProviderType;
import com.liferay.osgi.util.ServiceTrackerFactory;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for AngularVirtualInstance. This utility wraps
 * {@link eu.gerhards.liferay.services.angular.service.impl.AngularVirtualInstanceLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AngularVirtualInstanceLocalService
 * @see eu.gerhards.liferay.services.angular.service.base.AngularVirtualInstanceLocalServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.impl.AngularVirtualInstanceLocalServiceImpl
 * @generated
 */
@ProviderType
public class AngularVirtualInstanceLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link eu.gerhards.liferay.services.angular.service.impl.AngularVirtualInstanceLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the Virtual instance to the database. Also notifies the appropriate model listeners.
	*
	* @param angularVirtualInstance the Virtual instance
	* @return the Virtual instance that was added
	*/
	public static eu.gerhards.liferay.services.angular.model.AngularVirtualInstance addAngularVirtualInstance(
		eu.gerhards.liferay.services.angular.model.AngularVirtualInstance angularVirtualInstance) {
		return getService().addAngularVirtualInstance(angularVirtualInstance);
	}

	/**
	* Creates a new Virtual instance with the primary key. Does not add the Virtual instance to the database.
	*
	* @param virtualInstanceId the primary key for the new Virtual instance
	* @return the new Virtual instance
	*/
	public static eu.gerhards.liferay.services.angular.model.AngularVirtualInstance createAngularVirtualInstance(
		long virtualInstanceId) {
		return getService().createAngularVirtualInstance(virtualInstanceId);
	}

	/**
	* Deletes the Virtual instance from the database. Also notifies the appropriate model listeners.
	*
	* @param angularVirtualInstance the Virtual instance
	* @return the Virtual instance that was removed
	*/
	public static eu.gerhards.liferay.services.angular.model.AngularVirtualInstance deleteAngularVirtualInstance(
		eu.gerhards.liferay.services.angular.model.AngularVirtualInstance angularVirtualInstance) {
		return getService().deleteAngularVirtualInstance(angularVirtualInstance);
	}

	/**
	* Deletes the Virtual instance with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param virtualInstanceId the primary key of the Virtual instance
	* @return the Virtual instance that was removed
	* @throws PortalException if a Virtual instance with the primary key could not be found
	*/
	public static eu.gerhards.liferay.services.angular.model.AngularVirtualInstance deleteAngularVirtualInstance(
		long virtualInstanceId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteAngularVirtualInstance(virtualInstanceId);
	}

	public static eu.gerhards.liferay.services.angular.model.AngularVirtualInstance fetchAngularVirtualInstance(
		long virtualInstanceId) {
		return getService().fetchAngularVirtualInstance(virtualInstanceId);
	}

	/**
	* Returns the Virtual instance with the primary key.
	*
	* @param virtualInstanceId the primary key of the Virtual instance
	* @return the Virtual instance
	* @throws PortalException if a Virtual instance with the primary key could not be found
	*/
	public static eu.gerhards.liferay.services.angular.model.AngularVirtualInstance getAngularVirtualInstance(
		long virtualInstanceId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getAngularVirtualInstance(virtualInstanceId);
	}

	/**
	* Updates the Virtual instance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param angularVirtualInstance the Virtual instance
	* @return the Virtual instance that was updated
	*/
	public static eu.gerhards.liferay.services.angular.model.AngularVirtualInstance updateAngularVirtualInstance(
		eu.gerhards.liferay.services.angular.model.AngularVirtualInstance angularVirtualInstance) {
		return getService().updateAngularVirtualInstance(angularVirtualInstance);
	}

	/**
	* Returns the number of Virtual instances.
	*
	* @return the number of Virtual instances
	*/
	public static int getAngularVirtualInstancesCount() {
		return getService().getAngularVirtualInstancesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularVirtualInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularVirtualInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the Virtual instances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link eu.gerhards.liferay.services.angular.model.impl.AngularVirtualInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of Virtual instances
	* @param end the upper bound of the range of Virtual instances (not inclusive)
	* @return the range of Virtual instances
	*/
	public static java.util.List<eu.gerhards.liferay.services.angular.model.AngularVirtualInstance> getAngularVirtualInstances(
		int start, int end) {
		return getService().getAngularVirtualInstances(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static AngularVirtualInstanceLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AngularVirtualInstanceLocalService, AngularVirtualInstanceLocalService> _serviceTracker =
		ServiceTrackerFactory.open(AngularVirtualInstanceLocalService.class);
}