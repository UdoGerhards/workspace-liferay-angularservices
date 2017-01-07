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
 * This class is a wrapper for {@link AngularGroup}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularGroup
 * @generated
 */
@ProviderType
public class AngularGroupWrapper implements AngularGroup,
	ModelWrapper<AngularGroup> {
	public AngularGroupWrapper(AngularGroup angularGroup) {
		_angularGroup = angularGroup;
	}

	@Override
	public Class<?> getModelClass() {
		return AngularGroup.class;
	}

	@Override
	public String getModelClassName() {
		return AngularGroup.class.getName();
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
		return _angularGroup.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _angularGroup.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _angularGroup.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _angularGroup.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<eu.gerhards.liferay.services.angular.model.AngularGroup> toCacheModel() {
		return _angularGroup.toCacheModel();
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularGroup toEscapedModel() {
		return new AngularGroupWrapper(_angularGroup.toEscapedModel());
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularGroup toUnescapedModel() {
		return new AngularGroupWrapper(_angularGroup.toUnescapedModel());
	}

	@Override
	public int compareTo(
		eu.gerhards.liferay.services.angular.model.AngularGroup angularGroup) {
		return _angularGroup.compareTo(angularGroup);
	}

	@Override
	public int hashCode() {
		return _angularGroup.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _angularGroup.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AngularGroupWrapper((AngularGroup)_angularGroup.clone());
	}

	@Override
	public java.lang.String toString() {
		return _angularGroup.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _angularGroup.toXmlString();
	}

	/**
	* Returns the group ID of this Group.
	*
	* @return the group ID of this Group
	*/
	@Override
	public long getGroupId() {
		return _angularGroup.getGroupId();
	}

	/**
	* Returns the primary key of this Group.
	*
	* @return the primary key of this Group
	*/
	@Override
	public long getPrimaryKey() {
		return _angularGroup.getPrimaryKey();
	}

	@Override
	public void persist() {
		_angularGroup.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_angularGroup.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_angularGroup.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_angularGroup.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_angularGroup.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this Group.
	*
	* @param groupId the group ID of this Group
	*/
	@Override
	public void setGroupId(long groupId) {
		_angularGroup.setGroupId(groupId);
	}

	@Override
	public void setNew(boolean n) {
		_angularGroup.setNew(n);
	}

	/**
	* Sets the primary key of this Group.
	*
	* @param primaryKey the primary key of this Group
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_angularGroup.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_angularGroup.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AngularGroupWrapper)) {
			return false;
		}

		AngularGroupWrapper angularGroupWrapper = (AngularGroupWrapper)obj;

		if (Objects.equals(_angularGroup, angularGroupWrapper._angularGroup)) {
			return true;
		}

		return false;
	}

	@Override
	public AngularGroup getWrappedModel() {
		return _angularGroup;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _angularGroup.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _angularGroup.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_angularGroup.resetOriginalValues();
	}

	private final AngularGroup _angularGroup;
}