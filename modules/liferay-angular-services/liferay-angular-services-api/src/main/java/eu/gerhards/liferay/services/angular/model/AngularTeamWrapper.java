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
 * This class is a wrapper for {@link AngularTeam}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularTeam
 * @generated
 */
@ProviderType
public class AngularTeamWrapper implements AngularTeam,
	ModelWrapper<AngularTeam> {
	public AngularTeamWrapper(AngularTeam angularTeam) {
		_angularTeam = angularTeam;
	}

	@Override
	public Class<?> getModelClass() {
		return AngularTeam.class;
	}

	@Override
	public String getModelClassName() {
		return AngularTeam.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("angularTeamId", getAngularTeamId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long angularTeamId = (Long)attributes.get("angularTeamId");

		if (angularTeamId != null) {
			setAngularTeamId(angularTeamId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _angularTeam.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _angularTeam.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _angularTeam.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _angularTeam.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<eu.gerhards.liferay.services.angular.model.AngularTeam> toCacheModel() {
		return _angularTeam.toCacheModel();
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularTeam toEscapedModel() {
		return new AngularTeamWrapper(_angularTeam.toEscapedModel());
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularTeam toUnescapedModel() {
		return new AngularTeamWrapper(_angularTeam.toUnescapedModel());
	}

	@Override
	public int compareTo(
		eu.gerhards.liferay.services.angular.model.AngularTeam angularTeam) {
		return _angularTeam.compareTo(angularTeam);
	}

	@Override
	public int hashCode() {
		return _angularTeam.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _angularTeam.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AngularTeamWrapper((AngularTeam)_angularTeam.clone());
	}

	@Override
	public java.lang.String toString() {
		return _angularTeam.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _angularTeam.toXmlString();
	}

	/**
	* Returns the angular team ID of this Team.
	*
	* @return the angular team ID of this Team
	*/
	@Override
	public long getAngularTeamId() {
		return _angularTeam.getAngularTeamId();
	}

	/**
	* Returns the primary key of this Team.
	*
	* @return the primary key of this Team
	*/
	@Override
	public long getPrimaryKey() {
		return _angularTeam.getPrimaryKey();
	}

	@Override
	public void persist() {
		_angularTeam.persist();
	}

	/**
	* Sets the angular team ID of this Team.
	*
	* @param angularTeamId the angular team ID of this Team
	*/
	@Override
	public void setAngularTeamId(long angularTeamId) {
		_angularTeam.setAngularTeamId(angularTeamId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_angularTeam.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_angularTeam.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_angularTeam.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_angularTeam.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_angularTeam.setNew(n);
	}

	/**
	* Sets the primary key of this Team.
	*
	* @param primaryKey the primary key of this Team
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_angularTeam.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_angularTeam.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AngularTeamWrapper)) {
			return false;
		}

		AngularTeamWrapper angularTeamWrapper = (AngularTeamWrapper)obj;

		if (Objects.equals(_angularTeam, angularTeamWrapper._angularTeam)) {
			return true;
		}

		return false;
	}

	@Override
	public AngularTeam getWrappedModel() {
		return _angularTeam;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _angularTeam.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _angularTeam.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_angularTeam.resetOriginalValues();
	}

	private final AngularTeam _angularTeam;
}