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
 * This class is a wrapper for {@link AngularOrganization}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularOrganization
 * @generated
 */
@ProviderType
public class AngularOrganizationWrapper implements AngularOrganization,
	ModelWrapper<AngularOrganization> {
	public AngularOrganizationWrapper(AngularOrganization angularOrganization) {
		_angularOrganization = angularOrganization;
	}

	@Override
	public Class<?> getModelClass() {
		return AngularOrganization.class;
	}

	@Override
	public String getModelClassName() {
		return AngularOrganization.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("organizationId", getOrganizationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _angularOrganization.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _angularOrganization.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _angularOrganization.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _angularOrganization.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<eu.gerhards.liferay.services.angular.model.AngularOrganization> toCacheModel() {
		return _angularOrganization.toCacheModel();
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularOrganization toEscapedModel() {
		return new AngularOrganizationWrapper(_angularOrganization.toEscapedModel());
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularOrganization toUnescapedModel() {
		return new AngularOrganizationWrapper(_angularOrganization.toUnescapedModel());
	}

	@Override
	public int compareTo(
		eu.gerhards.liferay.services.angular.model.AngularOrganization angularOrganization) {
		return _angularOrganization.compareTo(angularOrganization);
	}

	@Override
	public int hashCode() {
		return _angularOrganization.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _angularOrganization.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AngularOrganizationWrapper((AngularOrganization)_angularOrganization.clone());
	}

	@Override
	public java.lang.String toString() {
		return _angularOrganization.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _angularOrganization.toXmlString();
	}

	/**
	* Returns the organization ID of this Organization.
	*
	* @return the organization ID of this Organization
	*/
	@Override
	public long getOrganizationId() {
		return _angularOrganization.getOrganizationId();
	}

	/**
	* Returns the primary key of this Organization.
	*
	* @return the primary key of this Organization
	*/
	@Override
	public long getPrimaryKey() {
		return _angularOrganization.getPrimaryKey();
	}

	@Override
	public void persist() {
		_angularOrganization.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_angularOrganization.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_angularOrganization.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_angularOrganization.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_angularOrganization.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_angularOrganization.setNew(n);
	}

	/**
	* Sets the organization ID of this Organization.
	*
	* @param organizationId the organization ID of this Organization
	*/
	@Override
	public void setOrganizationId(long organizationId) {
		_angularOrganization.setOrganizationId(organizationId);
	}

	/**
	* Sets the primary key of this Organization.
	*
	* @param primaryKey the primary key of this Organization
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_angularOrganization.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_angularOrganization.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AngularOrganizationWrapper)) {
			return false;
		}

		AngularOrganizationWrapper angularOrganizationWrapper = (AngularOrganizationWrapper)obj;

		if (Objects.equals(_angularOrganization,
					angularOrganizationWrapper._angularOrganization)) {
			return true;
		}

		return false;
	}

	@Override
	public AngularOrganization getWrappedModel() {
		return _angularOrganization;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _angularOrganization.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _angularOrganization.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_angularOrganization.resetOriginalValues();
	}

	private final AngularOrganization _angularOrganization;
}