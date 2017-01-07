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
 * This class is a wrapper for {@link AngularVirtualInstance}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularVirtualInstance
 * @generated
 */
@ProviderType
public class AngularVirtualInstanceWrapper implements AngularVirtualInstance,
	ModelWrapper<AngularVirtualInstance> {
	public AngularVirtualInstanceWrapper(
		AngularVirtualInstance angularVirtualInstance) {
		_angularVirtualInstance = angularVirtualInstance;
	}

	@Override
	public Class<?> getModelClass() {
		return AngularVirtualInstance.class;
	}

	@Override
	public String getModelClassName() {
		return AngularVirtualInstance.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("virtualInstanceId", getVirtualInstanceId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long virtualInstanceId = (Long)attributes.get("virtualInstanceId");

		if (virtualInstanceId != null) {
			setVirtualInstanceId(virtualInstanceId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _angularVirtualInstance.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _angularVirtualInstance.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _angularVirtualInstance.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _angularVirtualInstance.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<eu.gerhards.liferay.services.angular.model.AngularVirtualInstance> toCacheModel() {
		return _angularVirtualInstance.toCacheModel();
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularVirtualInstance toEscapedModel() {
		return new AngularVirtualInstanceWrapper(_angularVirtualInstance.toEscapedModel());
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularVirtualInstance toUnescapedModel() {
		return new AngularVirtualInstanceWrapper(_angularVirtualInstance.toUnescapedModel());
	}

	@Override
	public int compareTo(
		eu.gerhards.liferay.services.angular.model.AngularVirtualInstance angularVirtualInstance) {
		return _angularVirtualInstance.compareTo(angularVirtualInstance);
	}

	@Override
	public int hashCode() {
		return _angularVirtualInstance.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _angularVirtualInstance.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AngularVirtualInstanceWrapper((AngularVirtualInstance)_angularVirtualInstance.clone());
	}

	@Override
	public java.lang.String toString() {
		return _angularVirtualInstance.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _angularVirtualInstance.toXmlString();
	}

	/**
	* Returns the primary key of this Virtual instance.
	*
	* @return the primary key of this Virtual instance
	*/
	@Override
	public long getPrimaryKey() {
		return _angularVirtualInstance.getPrimaryKey();
	}

	/**
	* Returns the virtual instance ID of this Virtual instance.
	*
	* @return the virtual instance ID of this Virtual instance
	*/
	@Override
	public long getVirtualInstanceId() {
		return _angularVirtualInstance.getVirtualInstanceId();
	}

	@Override
	public void persist() {
		_angularVirtualInstance.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_angularVirtualInstance.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_angularVirtualInstance.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_angularVirtualInstance.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_angularVirtualInstance.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_angularVirtualInstance.setNew(n);
	}

	/**
	* Sets the primary key of this Virtual instance.
	*
	* @param primaryKey the primary key of this Virtual instance
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_angularVirtualInstance.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_angularVirtualInstance.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the virtual instance ID of this Virtual instance.
	*
	* @param virtualInstanceId the virtual instance ID of this Virtual instance
	*/
	@Override
	public void setVirtualInstanceId(long virtualInstanceId) {
		_angularVirtualInstance.setVirtualInstanceId(virtualInstanceId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AngularVirtualInstanceWrapper)) {
			return false;
		}

		AngularVirtualInstanceWrapper angularVirtualInstanceWrapper = (AngularVirtualInstanceWrapper)obj;

		if (Objects.equals(_angularVirtualInstance,
					angularVirtualInstanceWrapper._angularVirtualInstance)) {
			return true;
		}

		return false;
	}

	@Override
	public AngularVirtualInstance getWrappedModel() {
		return _angularVirtualInstance;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _angularVirtualInstance.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _angularVirtualInstance.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_angularVirtualInstance.resetOriginalValues();
	}

	private final AngularVirtualInstance _angularVirtualInstance;
}