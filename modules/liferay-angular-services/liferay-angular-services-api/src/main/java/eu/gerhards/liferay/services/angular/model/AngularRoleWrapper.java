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
 * This class is a wrapper for {@link AngularRole}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularRole
 * @generated
 */
@ProviderType
public class AngularRoleWrapper implements AngularRole,
	ModelWrapper<AngularRole> {
	public AngularRoleWrapper(AngularRole angularRole) {
		_angularRole = angularRole;
	}

	@Override
	public Class<?> getModelClass() {
		return AngularRole.class;
	}

	@Override
	public String getModelClassName() {
		return AngularRole.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("roleId", getRoleId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long roleId = (Long)attributes.get("roleId");

		if (roleId != null) {
			setRoleId(roleId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _angularRole.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _angularRole.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _angularRole.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _angularRole.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<eu.gerhards.liferay.services.angular.model.AngularRole> toCacheModel() {
		return _angularRole.toCacheModel();
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularRole toEscapedModel() {
		return new AngularRoleWrapper(_angularRole.toEscapedModel());
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularRole toUnescapedModel() {
		return new AngularRoleWrapper(_angularRole.toUnescapedModel());
	}

	@Override
	public int compareTo(
		eu.gerhards.liferay.services.angular.model.AngularRole angularRole) {
		return _angularRole.compareTo(angularRole);
	}

	@Override
	public int hashCode() {
		return _angularRole.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _angularRole.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AngularRoleWrapper((AngularRole)_angularRole.clone());
	}

	@Override
	public java.lang.String toString() {
		return _angularRole.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _angularRole.toXmlString();
	}

	/**
	* Returns the primary key of this Role.
	*
	* @return the primary key of this Role
	*/
	@Override
	public long getPrimaryKey() {
		return _angularRole.getPrimaryKey();
	}

	/**
	* Returns the role ID of this Role.
	*
	* @return the role ID of this Role
	*/
	@Override
	public long getRoleId() {
		return _angularRole.getRoleId();
	}

	@Override
	public void persist() {
		_angularRole.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_angularRole.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_angularRole.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_angularRole.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_angularRole.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_angularRole.setNew(n);
	}

	/**
	* Sets the primary key of this Role.
	*
	* @param primaryKey the primary key of this Role
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_angularRole.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_angularRole.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the role ID of this Role.
	*
	* @param roleId the role ID of this Role
	*/
	@Override
	public void setRoleId(long roleId) {
		_angularRole.setRoleId(roleId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AngularRoleWrapper)) {
			return false;
		}

		AngularRoleWrapper angularRoleWrapper = (AngularRoleWrapper)obj;

		if (Objects.equals(_angularRole, angularRoleWrapper._angularRole)) {
			return true;
		}

		return false;
	}

	@Override
	public AngularRole getWrappedModel() {
		return _angularRole;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _angularRole.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _angularRole.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_angularRole.resetOriginalValues();
	}

	private final AngularRole _angularRole;
}