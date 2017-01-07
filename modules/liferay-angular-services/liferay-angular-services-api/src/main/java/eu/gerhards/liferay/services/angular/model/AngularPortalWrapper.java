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
 * This class is a wrapper for {@link AngularPortal}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularPortal
 * @generated
 */
@ProviderType
public class AngularPortalWrapper implements AngularPortal,
	ModelWrapper<AngularPortal> {
	public AngularPortalWrapper(AngularPortal angularPortal) {
		_angularPortal = angularPortal;
	}

	@Override
	public Class<?> getModelClass() {
		return AngularPortal.class;
	}

	@Override
	public String getModelClassName() {
		return AngularPortal.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("portalId", getPortalId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long portalId = (Long)attributes.get("portalId");

		if (portalId != null) {
			setPortalId(portalId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _angularPortal.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _angularPortal.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _angularPortal.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _angularPortal.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<eu.gerhards.liferay.services.angular.model.AngularPortal> toCacheModel() {
		return _angularPortal.toCacheModel();
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularPortal toEscapedModel() {
		return new AngularPortalWrapper(_angularPortal.toEscapedModel());
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularPortal toUnescapedModel() {
		return new AngularPortalWrapper(_angularPortal.toUnescapedModel());
	}

	@Override
	public int compareTo(
		eu.gerhards.liferay.services.angular.model.AngularPortal angularPortal) {
		return _angularPortal.compareTo(angularPortal);
	}

	@Override
	public int hashCode() {
		return _angularPortal.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _angularPortal.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AngularPortalWrapper((AngularPortal)_angularPortal.clone());
	}

	@Override
	public java.lang.String toString() {
		return _angularPortal.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _angularPortal.toXmlString();
	}

	/**
	* Returns the portal ID of this Portal.
	*
	* @return the portal ID of this Portal
	*/
	@Override
	public long getPortalId() {
		return _angularPortal.getPortalId();
	}

	/**
	* Returns the primary key of this Portal.
	*
	* @return the primary key of this Portal
	*/
	@Override
	public long getPrimaryKey() {
		return _angularPortal.getPrimaryKey();
	}

	@Override
	public void persist() {
		_angularPortal.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_angularPortal.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_angularPortal.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_angularPortal.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_angularPortal.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_angularPortal.setNew(n);
	}

	/**
	* Sets the portal ID of this Portal.
	*
	* @param portalId the portal ID of this Portal
	*/
	@Override
	public void setPortalId(long portalId) {
		_angularPortal.setPortalId(portalId);
	}

	/**
	* Sets the primary key of this Portal.
	*
	* @param primaryKey the primary key of this Portal
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_angularPortal.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_angularPortal.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AngularPortalWrapper)) {
			return false;
		}

		AngularPortalWrapper angularPortalWrapper = (AngularPortalWrapper)obj;

		if (Objects.equals(_angularPortal, angularPortalWrapper._angularPortal)) {
			return true;
		}

		return false;
	}

	@Override
	public AngularPortal getWrappedModel() {
		return _angularPortal;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _angularPortal.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _angularPortal.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_angularPortal.resetOriginalValues();
	}

	private final AngularPortal _angularPortal;
}