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
 * This class is a wrapper for {@link AngularUserGroup}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularUserGroup
 * @generated
 */
@ProviderType
public class AngularUserGroupWrapper implements AngularUserGroup,
	ModelWrapper<AngularUserGroup> {
	public AngularUserGroupWrapper(AngularUserGroup angularUserGroup) {
		_angularUserGroup = angularUserGroup;
	}

	@Override
	public Class<?> getModelClass() {
		return AngularUserGroup.class;
	}

	@Override
	public String getModelClassName() {
		return AngularUserGroup.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("groupId", getGroupId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _angularUserGroup.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _angularUserGroup.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _angularUserGroup.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _angularUserGroup.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<eu.gerhards.liferay.services.angular.model.AngularUserGroup> toCacheModel() {
		return _angularUserGroup.toCacheModel();
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularUserGroup toEscapedModel() {
		return new AngularUserGroupWrapper(_angularUserGroup.toEscapedModel());
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularUserGroup toUnescapedModel() {
		return new AngularUserGroupWrapper(_angularUserGroup.toUnescapedModel());
	}

	@Override
	public int compareTo(
		eu.gerhards.liferay.services.angular.model.AngularUserGroup angularUserGroup) {
		return _angularUserGroup.compareTo(angularUserGroup);
	}

	@Override
	public int hashCode() {
		return _angularUserGroup.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _angularUserGroup.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AngularUserGroupWrapper((AngularUserGroup)_angularUserGroup.clone());
	}

	@Override
	public java.lang.String toString() {
		return _angularUserGroup.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _angularUserGroup.toXmlString();
	}

	/**
	* Returns the group ID of this User group.
	*
	* @return the group ID of this User group
	*/
	@Override
	public long getGroupId() {
		return _angularUserGroup.getGroupId();
	}

	/**
	* Returns the primary key of this User group.
	*
	* @return the primary key of this User group
	*/
	@Override
	public long getPrimaryKey() {
		return _angularUserGroup.getPrimaryKey();
	}

	@Override
	public void persist() {
		_angularUserGroup.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_angularUserGroup.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_angularUserGroup.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_angularUserGroup.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_angularUserGroup.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this User group.
	*
	* @param groupId the group ID of this User group
	*/
	@Override
	public void setGroupId(long groupId) {
		_angularUserGroup.setGroupId(groupId);
	}

	@Override
	public void setNew(boolean n) {
		_angularUserGroup.setNew(n);
	}

	/**
	* Sets the primary key of this User group.
	*
	* @param primaryKey the primary key of this User group
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_angularUserGroup.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_angularUserGroup.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AngularUserGroupWrapper)) {
			return false;
		}

		AngularUserGroupWrapper angularUserGroupWrapper = (AngularUserGroupWrapper)obj;

		if (Objects.equals(_angularUserGroup,
					angularUserGroupWrapper._angularUserGroup)) {
			return true;
		}

		return false;
	}

	@Override
	public AngularUserGroup getWrappedModel() {
		return _angularUserGroup;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _angularUserGroup.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _angularUserGroup.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_angularUserGroup.resetOriginalValues();
	}

	private final AngularUserGroup _angularUserGroup;
}