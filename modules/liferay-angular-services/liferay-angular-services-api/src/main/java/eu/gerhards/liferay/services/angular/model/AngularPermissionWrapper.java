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
 * This class is a wrapper for {@link AngularPermission}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularPermission
 * @generated
 */
@ProviderType
public class AngularPermissionWrapper implements AngularPermission,
	ModelWrapper<AngularPermission> {
	public AngularPermissionWrapper(AngularPermission angularPermission) {
		_angularPermission = angularPermission;
	}

	@Override
	public Class<?> getModelClass() {
		return AngularPermission.class;
	}

	@Override
	public String getModelClassName() {
		return AngularPermission.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("permissionId", getPermissionId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long permissionId = (Long)attributes.get("permissionId");

		if (permissionId != null) {
			setPermissionId(permissionId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _angularPermission.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _angularPermission.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _angularPermission.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _angularPermission.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<eu.gerhards.liferay.services.angular.model.AngularPermission> toCacheModel() {
		return _angularPermission.toCacheModel();
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularPermission toEscapedModel() {
		return new AngularPermissionWrapper(_angularPermission.toEscapedModel());
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularPermission toUnescapedModel() {
		return new AngularPermissionWrapper(_angularPermission.toUnescapedModel());
	}

	@Override
	public int compareTo(
		eu.gerhards.liferay.services.angular.model.AngularPermission angularPermission) {
		return _angularPermission.compareTo(angularPermission);
	}

	@Override
	public int hashCode() {
		return _angularPermission.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _angularPermission.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AngularPermissionWrapper((AngularPermission)_angularPermission.clone());
	}

	@Override
	public java.lang.String toString() {
		return _angularPermission.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _angularPermission.toXmlString();
	}

	/**
	* Returns the permission ID of this Permission.
	*
	* @return the permission ID of this Permission
	*/
	@Override
	public long getPermissionId() {
		return _angularPermission.getPermissionId();
	}

	/**
	* Returns the primary key of this Permission.
	*
	* @return the primary key of this Permission
	*/
	@Override
	public long getPrimaryKey() {
		return _angularPermission.getPrimaryKey();
	}

	@Override
	public void persist() {
		_angularPermission.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_angularPermission.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_angularPermission.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_angularPermission.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_angularPermission.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_angularPermission.setNew(n);
	}

	/**
	* Sets the permission ID of this Permission.
	*
	* @param permissionId the permission ID of this Permission
	*/
	@Override
	public void setPermissionId(long permissionId) {
		_angularPermission.setPermissionId(permissionId);
	}

	/**
	* Sets the primary key of this Permission.
	*
	* @param primaryKey the primary key of this Permission
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_angularPermission.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_angularPermission.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AngularPermissionWrapper)) {
			return false;
		}

		AngularPermissionWrapper angularPermissionWrapper = (AngularPermissionWrapper)obj;

		if (Objects.equals(_angularPermission,
					angularPermissionWrapper._angularPermission)) {
			return true;
		}

		return false;
	}

	@Override
	public AngularPermission getWrappedModel() {
		return _angularPermission;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _angularPermission.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _angularPermission.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_angularPermission.resetOriginalValues();
	}

	private final AngularPermission _angularPermission;
}