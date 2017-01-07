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
 * This class is a wrapper for {@link AngularLayout}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularLayout
 * @generated
 */
@ProviderType
public class AngularLayoutWrapper implements AngularLayout,
	ModelWrapper<AngularLayout> {
	public AngularLayoutWrapper(AngularLayout angularLayout) {
		_angularLayout = angularLayout;
	}

	@Override
	public Class<?> getModelClass() {
		return AngularLayout.class;
	}

	@Override
	public String getModelClassName() {
		return AngularLayout.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("layoutId", getLayoutId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long layoutId = (Long)attributes.get("layoutId");

		if (layoutId != null) {
			setLayoutId(layoutId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _angularLayout.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _angularLayout.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _angularLayout.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _angularLayout.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<eu.gerhards.liferay.services.angular.model.AngularLayout> toCacheModel() {
		return _angularLayout.toCacheModel();
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularLayout toEscapedModel() {
		return new AngularLayoutWrapper(_angularLayout.toEscapedModel());
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularLayout toUnescapedModel() {
		return new AngularLayoutWrapper(_angularLayout.toUnescapedModel());
	}

	@Override
	public int compareTo(
		eu.gerhards.liferay.services.angular.model.AngularLayout angularLayout) {
		return _angularLayout.compareTo(angularLayout);
	}

	@Override
	public int hashCode() {
		return _angularLayout.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _angularLayout.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AngularLayoutWrapper((AngularLayout)_angularLayout.clone());
	}

	@Override
	public java.lang.String toString() {
		return _angularLayout.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _angularLayout.toXmlString();
	}

	/**
	* Returns the layout ID of this Layout.
	*
	* @return the layout ID of this Layout
	*/
	@Override
	public long getLayoutId() {
		return _angularLayout.getLayoutId();
	}

	/**
	* Returns the primary key of this Layout.
	*
	* @return the primary key of this Layout
	*/
	@Override
	public long getPrimaryKey() {
		return _angularLayout.getPrimaryKey();
	}

	@Override
	public void persist() {
		_angularLayout.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_angularLayout.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_angularLayout.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_angularLayout.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_angularLayout.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the layout ID of this Layout.
	*
	* @param layoutId the layout ID of this Layout
	*/
	@Override
	public void setLayoutId(long layoutId) {
		_angularLayout.setLayoutId(layoutId);
	}

	@Override
	public void setNew(boolean n) {
		_angularLayout.setNew(n);
	}

	/**
	* Sets the primary key of this Layout.
	*
	* @param primaryKey the primary key of this Layout
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_angularLayout.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_angularLayout.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AngularLayoutWrapper)) {
			return false;
		}

		AngularLayoutWrapper angularLayoutWrapper = (AngularLayoutWrapper)obj;

		if (Objects.equals(_angularLayout, angularLayoutWrapper._angularLayout)) {
			return true;
		}

		return false;
	}

	@Override
	public AngularLayout getWrappedModel() {
		return _angularLayout;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _angularLayout.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _angularLayout.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_angularLayout.resetOriginalValues();
	}

	private final AngularLayout _angularLayout;
}