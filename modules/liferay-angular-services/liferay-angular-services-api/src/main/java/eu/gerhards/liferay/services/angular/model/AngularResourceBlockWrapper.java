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
 * This class is a wrapper for {@link AngularResourceBlock}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularResourceBlock
 * @generated
 */
@ProviderType
public class AngularResourceBlockWrapper implements AngularResourceBlock,
	ModelWrapper<AngularResourceBlock> {
	public AngularResourceBlockWrapper(
		AngularResourceBlock angularResourceBlock) {
		_angularResourceBlock = angularResourceBlock;
	}

	@Override
	public Class<?> getModelClass() {
		return AngularResourceBlock.class;
	}

	@Override
	public String getModelClassName() {
		return AngularResourceBlock.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("resourceBlockId", getResourceBlockId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long resourceBlockId = (Long)attributes.get("resourceBlockId");

		if (resourceBlockId != null) {
			setResourceBlockId(resourceBlockId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _angularResourceBlock.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _angularResourceBlock.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _angularResourceBlock.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _angularResourceBlock.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<eu.gerhards.liferay.services.angular.model.AngularResourceBlock> toCacheModel() {
		return _angularResourceBlock.toCacheModel();
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularResourceBlock toEscapedModel() {
		return new AngularResourceBlockWrapper(_angularResourceBlock.toEscapedModel());
	}

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularResourceBlock toUnescapedModel() {
		return new AngularResourceBlockWrapper(_angularResourceBlock.toUnescapedModel());
	}

	@Override
	public int compareTo(
		eu.gerhards.liferay.services.angular.model.AngularResourceBlock angularResourceBlock) {
		return _angularResourceBlock.compareTo(angularResourceBlock);
	}

	@Override
	public int hashCode() {
		return _angularResourceBlock.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _angularResourceBlock.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AngularResourceBlockWrapper((AngularResourceBlock)_angularResourceBlock.clone());
	}

	@Override
	public java.lang.String toString() {
		return _angularResourceBlock.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _angularResourceBlock.toXmlString();
	}

	/**
	* Returns the primary key of this Resource block.
	*
	* @return the primary key of this Resource block
	*/
	@Override
	public long getPrimaryKey() {
		return _angularResourceBlock.getPrimaryKey();
	}

	/**
	* Returns the resource block ID of this Resource block.
	*
	* @return the resource block ID of this Resource block
	*/
	@Override
	public long getResourceBlockId() {
		return _angularResourceBlock.getResourceBlockId();
	}

	@Override
	public void persist() {
		_angularResourceBlock.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_angularResourceBlock.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_angularResourceBlock.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_angularResourceBlock.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_angularResourceBlock.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_angularResourceBlock.setNew(n);
	}

	/**
	* Sets the primary key of this Resource block.
	*
	* @param primaryKey the primary key of this Resource block
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_angularResourceBlock.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_angularResourceBlock.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the resource block ID of this Resource block.
	*
	* @param resourceBlockId the resource block ID of this Resource block
	*/
	@Override
	public void setResourceBlockId(long resourceBlockId) {
		_angularResourceBlock.setResourceBlockId(resourceBlockId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AngularResourceBlockWrapper)) {
			return false;
		}

		AngularResourceBlockWrapper angularResourceBlockWrapper = (AngularResourceBlockWrapper)obj;

		if (Objects.equals(_angularResourceBlock,
					angularResourceBlockWrapper._angularResourceBlock)) {
			return true;
		}

		return false;
	}

	@Override
	public AngularResourceBlock getWrappedModel() {
		return _angularResourceBlock;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _angularResourceBlock.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _angularResourceBlock.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_angularResourceBlock.resetOriginalValues();
	}

	private final AngularResourceBlock _angularResourceBlock;
}