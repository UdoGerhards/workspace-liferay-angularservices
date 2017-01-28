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
 * This class is a wrapper for {@link AngularLayoutSet}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularLayoutSet
 * @generated
 */
@ProviderType
public class AngularLayoutSetWrapper implements AngularLayoutSet,
	ModelWrapper<AngularLayoutSet> {
	public AngularLayoutSetWrapper(AngularLayoutSet angularLayoutSet) {
		_angularLayoutSet = angularLayoutSet;
	}

	@Override
	public Class<?> getModelClass() {
		return AngularLayoutSet.class;
	}

	@Override
	public String getModelClassName() {
		return AngularLayoutSet.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("layoutSetId", getLayoutSetId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long layoutSetId = (Long)attributes.get("layoutSetId");

		if (layoutSetId != null) {
			setLayoutSetId(layoutSetId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _angularLayoutSet.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _angularLayoutSet.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _angularLayoutSet.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _angularLayoutSet.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<eu.gerhards.liferay.services.angular.model.AngularLayoutSet> toCacheModel() {
		return _angularLayoutSet.toCacheModel();
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularLayoutSet toEscapedModel() {
		return new AngularLayoutSetWrapper(_angularLayoutSet.toEscapedModel());
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularLayoutSet toUnescapedModel() {
		return new AngularLayoutSetWrapper(_angularLayoutSet.toUnescapedModel());
	}

	@Override
	public int compareTo(
		eu.gerhards.liferay.services.angular.model.AngularLayoutSet angularLayoutSet) {
		return _angularLayoutSet.compareTo(angularLayoutSet);
	}

	@Override
	public int hashCode() {
		return _angularLayoutSet.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _angularLayoutSet.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AngularLayoutSetWrapper((AngularLayoutSet)_angularLayoutSet.clone());
	}

	@Override
	public java.lang.String toString() {
		return _angularLayoutSet.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _angularLayoutSet.toXmlString();
	}

	/**
	* Returns the layout set ID of this LayoutSet.
	*
	* @return the layout set ID of this LayoutSet
	*/
	@Override
	public long getLayoutSetId() {
		return _angularLayoutSet.getLayoutSetId();
	}

	/**
	* Returns the primary key of this LayoutSet.
	*
	* @return the primary key of this LayoutSet
	*/
	@Override
	public long getPrimaryKey() {
		return _angularLayoutSet.getPrimaryKey();
	}

	@Override
	public void persist() {
		_angularLayoutSet.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_angularLayoutSet.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_angularLayoutSet.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_angularLayoutSet.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_angularLayoutSet.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the layout set ID of this LayoutSet.
	*
	* @param layoutSetId the layout set ID of this LayoutSet
	*/
	@Override
	public void setLayoutSetId(long layoutSetId) {
		_angularLayoutSet.setLayoutSetId(layoutSetId);
	}

	@Override
	public void setNew(boolean n) {
		_angularLayoutSet.setNew(n);
	}

	/**
	* Sets the primary key of this LayoutSet.
	*
	* @param primaryKey the primary key of this LayoutSet
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_angularLayoutSet.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_angularLayoutSet.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AngularLayoutSetWrapper)) {
			return false;
		}

		AngularLayoutSetWrapper angularLayoutSetWrapper = (AngularLayoutSetWrapper)obj;

		if (Objects.equals(_angularLayoutSet,
					angularLayoutSetWrapper._angularLayoutSet)) {
			return true;
		}

		return false;
	}

	@Override
	public AngularLayoutSet getWrappedModel() {
		return _angularLayoutSet;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _angularLayoutSet.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _angularLayoutSet.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_angularLayoutSet.resetOriginalValues();
	}

	private final AngularLayoutSet _angularLayoutSet;
}