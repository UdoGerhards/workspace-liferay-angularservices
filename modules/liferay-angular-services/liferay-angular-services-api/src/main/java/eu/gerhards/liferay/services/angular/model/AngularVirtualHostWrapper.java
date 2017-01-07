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
 * This class is a wrapper for {@link AngularVirtualHost}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularVirtualHost
 * @generated
 */
@ProviderType
public class AngularVirtualHostWrapper implements AngularVirtualHost,
	ModelWrapper<AngularVirtualHost> {
	public AngularVirtualHostWrapper(AngularVirtualHost angularVirtualHost) {
		_angularVirtualHost = angularVirtualHost;
	}

	@Override
	public Class<?> getModelClass() {
		return AngularVirtualHost.class;
	}

	@Override
	public String getModelClassName() {
		return AngularVirtualHost.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("virtualHostId", getVirtualHostId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long virtualHostId = (Long)attributes.get("virtualHostId");

		if (virtualHostId != null) {
			setVirtualHostId(virtualHostId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _angularVirtualHost.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _angularVirtualHost.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _angularVirtualHost.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _angularVirtualHost.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<eu.gerhards.liferay.services.angular.model.AngularVirtualHost> toCacheModel() {
		return _angularVirtualHost.toCacheModel();
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularVirtualHost toEscapedModel() {
		return new AngularVirtualHostWrapper(_angularVirtualHost.toEscapedModel());
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularVirtualHost toUnescapedModel() {
		return new AngularVirtualHostWrapper(_angularVirtualHost.toUnescapedModel());
	}

	@Override
	public int compareTo(
		eu.gerhards.liferay.services.angular.model.AngularVirtualHost angularVirtualHost) {
		return _angularVirtualHost.compareTo(angularVirtualHost);
	}

	@Override
	public int hashCode() {
		return _angularVirtualHost.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _angularVirtualHost.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AngularVirtualHostWrapper((AngularVirtualHost)_angularVirtualHost.clone());
	}

	@Override
	public java.lang.String toString() {
		return _angularVirtualHost.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _angularVirtualHost.toXmlString();
	}

	/**
	* Returns the primary key of this Virtual host.
	*
	* @return the primary key of this Virtual host
	*/
	@Override
	public long getPrimaryKey() {
		return _angularVirtualHost.getPrimaryKey();
	}

	/**
	* Returns the virtual host ID of this Virtual host.
	*
	* @return the virtual host ID of this Virtual host
	*/
	@Override
	public long getVirtualHostId() {
		return _angularVirtualHost.getVirtualHostId();
	}

	@Override
	public void persist() {
		_angularVirtualHost.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_angularVirtualHost.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_angularVirtualHost.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_angularVirtualHost.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_angularVirtualHost.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_angularVirtualHost.setNew(n);
	}

	/**
	* Sets the primary key of this Virtual host.
	*
	* @param primaryKey the primary key of this Virtual host
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_angularVirtualHost.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_angularVirtualHost.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the virtual host ID of this Virtual host.
	*
	* @param virtualHostId the virtual host ID of this Virtual host
	*/
	@Override
	public void setVirtualHostId(long virtualHostId) {
		_angularVirtualHost.setVirtualHostId(virtualHostId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AngularVirtualHostWrapper)) {
			return false;
		}

		AngularVirtualHostWrapper angularVirtualHostWrapper = (AngularVirtualHostWrapper)obj;

		if (Objects.equals(_angularVirtualHost,
					angularVirtualHostWrapper._angularVirtualHost)) {
			return true;
		}

		return false;
	}

	@Override
	public AngularVirtualHost getWrappedModel() {
		return _angularVirtualHost;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _angularVirtualHost.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _angularVirtualHost.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_angularVirtualHost.resetOriginalValues();
	}

	private final AngularVirtualHost _angularVirtualHost;
}