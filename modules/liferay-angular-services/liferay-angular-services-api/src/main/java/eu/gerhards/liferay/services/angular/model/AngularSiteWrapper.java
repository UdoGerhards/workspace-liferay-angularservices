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
 * This class is a wrapper for {@link AngularSite}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularSite
 * @generated
 */
@ProviderType
public class AngularSiteWrapper implements AngularSite,
	ModelWrapper<AngularSite> {
	public AngularSiteWrapper(AngularSite angularSite) {
		_angularSite = angularSite;
	}

	@Override
	public Class<?> getModelClass() {
		return AngularSite.class;
	}

	@Override
	public String getModelClassName() {
		return AngularSite.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("siteId", getSiteId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long siteId = (Long)attributes.get("siteId");

		if (siteId != null) {
			setSiteId(siteId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _angularSite.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _angularSite.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _angularSite.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _angularSite.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<eu.gerhards.liferay.services.angular.model.AngularSite> toCacheModel() {
		return _angularSite.toCacheModel();
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularSite toEscapedModel() {
		return new AngularSiteWrapper(_angularSite.toEscapedModel());
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularSite toUnescapedModel() {
		return new AngularSiteWrapper(_angularSite.toUnescapedModel());
	}

	@Override
	public int compareTo(
		eu.gerhards.liferay.services.angular.model.AngularSite angularSite) {
		return _angularSite.compareTo(angularSite);
	}

	@Override
	public int hashCode() {
		return _angularSite.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _angularSite.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AngularSiteWrapper((AngularSite)_angularSite.clone());
	}

	@Override
	public java.lang.String toString() {
		return _angularSite.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _angularSite.toXmlString();
	}

	/**
	* Returns the primary key of this Site.
	*
	* @return the primary key of this Site
	*/
	@Override
	public long getPrimaryKey() {
		return _angularSite.getPrimaryKey();
	}

	/**
	* Returns the site ID of this Site.
	*
	* @return the site ID of this Site
	*/
	@Override
	public long getSiteId() {
		return _angularSite.getSiteId();
	}

	@Override
	public void persist() {
		_angularSite.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_angularSite.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_angularSite.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_angularSite.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_angularSite.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_angularSite.setNew(n);
	}

	/**
	* Sets the primary key of this Site.
	*
	* @param primaryKey the primary key of this Site
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_angularSite.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_angularSite.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the site ID of this Site.
	*
	* @param siteId the site ID of this Site
	*/
	@Override
	public void setSiteId(long siteId) {
		_angularSite.setSiteId(siteId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AngularSiteWrapper)) {
			return false;
		}

		AngularSiteWrapper angularSiteWrapper = (AngularSiteWrapper)obj;

		if (Objects.equals(_angularSite, angularSiteWrapper._angularSite)) {
			return true;
		}

		return false;
	}

	@Override
	public AngularSite getWrappedModel() {
		return _angularSite;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _angularSite.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _angularSite.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_angularSite.resetOriginalValues();
	}

	private final AngularSite _angularSite;
}