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
 * This class is a wrapper for {@link AngularUser}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularUser
 * @generated
 */
@ProviderType
public class AngularUserWrapper implements AngularUser,
	ModelWrapper<AngularUser> {
	public AngularUserWrapper(AngularUser angularUser) {
		_angularUser = angularUser;
	}

	@Override
	public Class<?> getModelClass() {
		return AngularUser.class;
	}

	@Override
	public String getModelClassName() {
		return AngularUser.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userId", getUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _angularUser.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _angularUser.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _angularUser.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _angularUser.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<eu.gerhards.liferay.services.angular.model.AngularUser> toCacheModel() {
		return _angularUser.toCacheModel();
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularUser toEscapedModel() {
		return new AngularUserWrapper(_angularUser.toEscapedModel());
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularUser toUnescapedModel() {
		return new AngularUserWrapper(_angularUser.toUnescapedModel());
	}

	@Override
	public int compareTo(
		eu.gerhards.liferay.services.angular.model.AngularUser angularUser) {
		return _angularUser.compareTo(angularUser);
	}

	@Override
	public int hashCode() {
		return _angularUser.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _angularUser.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AngularUserWrapper((AngularUser)_angularUser.clone());
	}

	/**
	* Returns the user uuid of this User.
	*
	* @return the user uuid of this User
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _angularUser.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _angularUser.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _angularUser.toXmlString();
	}

	/**
	* Returns the primary key of this User.
	*
	* @return the primary key of this User
	*/
	@Override
	public long getPrimaryKey() {
		return _angularUser.getPrimaryKey();
	}

	/**
	* Returns the user ID of this User.
	*
	* @return the user ID of this User
	*/
	@Override
	public long getUserId() {
		return _angularUser.getUserId();
	}

	@Override
	public void persist() {
		_angularUser.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_angularUser.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_angularUser.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_angularUser.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_angularUser.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_angularUser.setNew(n);
	}

	/**
	* Sets the primary key of this User.
	*
	* @param primaryKey the primary key of this User
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_angularUser.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_angularUser.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this User.
	*
	* @param userId the user ID of this User
	*/
	@Override
	public void setUserId(long userId) {
		_angularUser.setUserId(userId);
	}

	/**
	* Sets the user uuid of this User.
	*
	* @param userUuid the user uuid of this User
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_angularUser.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AngularUserWrapper)) {
			return false;
		}

		AngularUserWrapper angularUserWrapper = (AngularUserWrapper)obj;

		if (Objects.equals(_angularUser, angularUserWrapper._angularUser)) {
			return true;
		}

		return false;
	}

	@Override
	public AngularUser getWrappedModel() {
		return _angularUser;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _angularUser.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _angularUser.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_angularUser.resetOriginalValues();
	}

	private final AngularUser _angularUser;
}