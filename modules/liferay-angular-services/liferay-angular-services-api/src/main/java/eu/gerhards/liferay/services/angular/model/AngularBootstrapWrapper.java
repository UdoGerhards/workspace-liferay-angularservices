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
 * This class is a wrapper for {@link AngularBootstrap}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularBootstrap
 * @generated
 */
@ProviderType
public class AngularBootstrapWrapper implements AngularBootstrap,
	ModelWrapper<AngularBootstrap> {
	public AngularBootstrapWrapper(AngularBootstrap angularBootstrap) {
		_angularBootstrap = angularBootstrap;
	}

	@Override
	public Class<?> getModelClass() {
		return AngularBootstrap.class;
	}

	@Override
	public String getModelClassName() {
		return AngularBootstrap.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("bootId", getBootId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long bootId = (Long)attributes.get("bootId");

		if (bootId != null) {
			setBootId(bootId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _angularBootstrap.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _angularBootstrap.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _angularBootstrap.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _angularBootstrap.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<eu.gerhards.liferay.services.angular.model.AngularBootstrap> toCacheModel() {
		return _angularBootstrap.toCacheModel();
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularBootstrap toEscapedModel() {
		return new AngularBootstrapWrapper(_angularBootstrap.toEscapedModel());
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularBootstrap toUnescapedModel() {
		return new AngularBootstrapWrapper(_angularBootstrap.toUnescapedModel());
	}

	@Override
	public int compareTo(
		eu.gerhards.liferay.services.angular.model.AngularBootstrap angularBootstrap) {
		return _angularBootstrap.compareTo(angularBootstrap);
	}

	@Override
	public int hashCode() {
		return _angularBootstrap.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _angularBootstrap.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AngularBootstrapWrapper((AngularBootstrap)_angularBootstrap.clone());
	}

	@Override
	public java.lang.String toString() {
		return _angularBootstrap.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _angularBootstrap.toXmlString();
	}

	/**
	* Returns the boot ID of this Bootstrap.
	*
	* @return the boot ID of this Bootstrap
	*/
	@Override
	public long getBootId() {
		return _angularBootstrap.getBootId();
	}

	/**
	* Returns the primary key of this Bootstrap.
	*
	* @return the primary key of this Bootstrap
	*/
	@Override
	public long getPrimaryKey() {
		return _angularBootstrap.getPrimaryKey();
	}

	@Override
	public void persist() {
		_angularBootstrap.persist();
	}

	/**
	* Sets the boot ID of this Bootstrap.
	*
	* @param bootId the boot ID of this Bootstrap
	*/
	@Override
	public void setBootId(long bootId) {
		_angularBootstrap.setBootId(bootId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_angularBootstrap.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_angularBootstrap.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_angularBootstrap.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_angularBootstrap.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_angularBootstrap.setNew(n);
	}

	/**
	* Sets the primary key of this Bootstrap.
	*
	* @param primaryKey the primary key of this Bootstrap
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_angularBootstrap.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_angularBootstrap.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AngularBootstrapWrapper)) {
			return false;
		}

		AngularBootstrapWrapper angularBootstrapWrapper = (AngularBootstrapWrapper)obj;

		if (Objects.equals(_angularBootstrap,
					angularBootstrapWrapper._angularBootstrap)) {
			return true;
		}

		return false;
	}

	@Override
	public AngularBootstrap getWrappedModel() {
		return _angularBootstrap;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _angularBootstrap.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _angularBootstrap.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_angularBootstrap.resetOriginalValues();
	}

	private final AngularBootstrap _angularBootstrap;
}