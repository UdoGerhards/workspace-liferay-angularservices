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

package eu.gerhards.liferay.services.angular.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link AngularResourcePermission}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularResourcePermission
 * @generated
 */
@ProviderType
public class AngularResourcePermissionWrapper
	implements AngularResourcePermission,
		ModelWrapper<AngularResourcePermission> {
	public AngularResourcePermissionWrapper(
		AngularResourcePermission angularResourcePermission) {
		_angularResourcePermission = angularResourcePermission;
	}

	@Override
	public Class<?> getModelClass() {
		return AngularResourcePermission.class;
	}

	@Override
	public String getModelClassName() {
		return AngularResourcePermission.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("resourcePermissionId", getResourcePermissionId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long resourcePermissionId = (Long)attributes.get("resourcePermissionId");

		if (resourcePermissionId != null) {
			setResourcePermissionId(resourcePermissionId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _angularResourcePermission.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _angularResourcePermission.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _angularResourcePermission.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _angularResourcePermission.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<eu.gerhards.liferay.services.angular.model.AngularResourcePermission> toCacheModel() {
		return _angularResourcePermission.toCacheModel();
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularResourcePermission toEscapedModel() {
		return new AngularResourcePermissionWrapper(_angularResourcePermission.toEscapedModel());
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularResourcePermission toUnescapedModel() {
		return new AngularResourcePermissionWrapper(_angularResourcePermission.toUnescapedModel());
	}

	@Override
	public int compareTo(
		eu.gerhards.liferay.services.angular.model.AngularResourcePermission angularResourcePermission) {
		return _angularResourcePermission.compareTo(angularResourcePermission);
	}

	@Override
	public int hashCode() {
		return _angularResourcePermission.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _angularResourcePermission.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AngularResourcePermissionWrapper((AngularResourcePermission)_angularResourcePermission.clone());
	}

	@Override
	public java.lang.String toString() {
		return _angularResourcePermission.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _angularResourcePermission.toXmlString();
	}

	/**
	* Returns the primary key of this Resource permission.
	*
	* @return the primary key of this Resource permission
	*/
	@Override
	public long getPrimaryKey() {
		return _angularResourcePermission.getPrimaryKey();
	}

	/**
	* Returns the resource permission ID of this Resource permission.
	*
	* @return the resource permission ID of this Resource permission
	*/
	@Override
	public long getResourcePermissionId() {
		return _angularResourcePermission.getResourcePermissionId();
	}

	@Override
	public void persist() {
		_angularResourcePermission.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_angularResourcePermission.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_angularResourcePermission.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_angularResourcePermission.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_angularResourcePermission.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_angularResourcePermission.setNew(n);
	}

	/**
	* Sets the primary key of this Resource permission.
	*
	* @param primaryKey the primary key of this Resource permission
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_angularResourcePermission.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_angularResourcePermission.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the resource permission ID of this Resource permission.
	*
	* @param resourcePermissionId the resource permission ID of this Resource permission
	*/
	@Override
	public void setResourcePermissionId(long resourcePermissionId) {
		_angularResourcePermission.setResourcePermissionId(resourcePermissionId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AngularResourcePermissionWrapper)) {
			return false;
		}

		AngularResourcePermissionWrapper angularResourcePermissionWrapper = (AngularResourcePermissionWrapper)obj;

		if (Objects.equals(_angularResourcePermission,
					angularResourcePermissionWrapper._angularResourcePermission)) {
			return true;
		}

		return false;
	}

	@Override
	public AngularResourcePermission getWrappedModel() {
		return _angularResourcePermission;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _angularResourcePermission.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _angularResourcePermission.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_angularResourcePermission.resetOriginalValues();
	}

	private final AngularResourcePermission _angularResourcePermission;
}