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
 * This class is a wrapper for {@link AngularInstance}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularInstance
 * @generated
 */
@ProviderType
public class AngularInstanceWrapper implements AngularInstance,
	ModelWrapper<AngularInstance> {
	public AngularInstanceWrapper(AngularInstance angularInstance) {
		_angularInstance = angularInstance;
	}

	@Override
	public Class<?> getModelClass() {
		return AngularInstance.class;
	}

	@Override
	public String getModelClassName() {
		return AngularInstance.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("instanceId", getInstanceId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long instanceId = (Long)attributes.get("instanceId");

		if (instanceId != null) {
			setInstanceId(instanceId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _angularInstance.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _angularInstance.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _angularInstance.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _angularInstance.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<eu.gerhards.liferay.services.angular.model.AngularInstance> toCacheModel() {
		return _angularInstance.toCacheModel();
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularInstance toEscapedModel() {
		return new AngularInstanceWrapper(_angularInstance.toEscapedModel());
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularInstance toUnescapedModel() {
		return new AngularInstanceWrapper(_angularInstance.toUnescapedModel());
	}

	@Override
	public int compareTo(
		eu.gerhards.liferay.services.angular.model.AngularInstance angularInstance) {
		return _angularInstance.compareTo(angularInstance);
	}

	@Override
	public int hashCode() {
		return _angularInstance.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _angularInstance.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AngularInstanceWrapper((AngularInstance)_angularInstance.clone());
	}

	@Override
	public java.lang.String toString() {
		return _angularInstance.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _angularInstance.toXmlString();
	}

	/**
	* Returns the instance ID of this Instance.
	*
	* @return the instance ID of this Instance
	*/
	@Override
	public long getInstanceId() {
		return _angularInstance.getInstanceId();
	}

	/**
	* Returns the primary key of this Instance.
	*
	* @return the primary key of this Instance
	*/
	@Override
	public long getPrimaryKey() {
		return _angularInstance.getPrimaryKey();
	}

	@Override
	public void persist() {
		_angularInstance.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_angularInstance.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_angularInstance.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_angularInstance.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_angularInstance.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the instance ID of this Instance.
	*
	* @param instanceId the instance ID of this Instance
	*/
	@Override
	public void setInstanceId(long instanceId) {
		_angularInstance.setInstanceId(instanceId);
	}

	@Override
	public void setNew(boolean n) {
		_angularInstance.setNew(n);
	}

	/**
	* Sets the primary key of this Instance.
	*
	* @param primaryKey the primary key of this Instance
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_angularInstance.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_angularInstance.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AngularInstanceWrapper)) {
			return false;
		}

		AngularInstanceWrapper angularInstanceWrapper = (AngularInstanceWrapper)obj;

		if (Objects.equals(_angularInstance,
					angularInstanceWrapper._angularInstance)) {
			return true;
		}

		return false;
	}

	@Override
	public AngularInstance getWrappedModel() {
		return _angularInstance;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _angularInstance.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _angularInstance.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_angularInstance.resetOriginalValues();
	}

	private final AngularInstance _angularInstance;
}