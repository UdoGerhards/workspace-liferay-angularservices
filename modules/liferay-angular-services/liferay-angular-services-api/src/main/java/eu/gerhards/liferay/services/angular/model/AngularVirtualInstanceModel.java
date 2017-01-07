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
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the AngularVirtualInstance service. Represents a row in the &quot;AngularServices_AngularVirtualInstance&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link eu.gerhards.liferay.services.angular.model.impl.AngularVirtualInstanceModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link eu.gerhards.liferay.services.angular.model.impl.AngularVirtualInstanceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularVirtualInstance
 * @see eu.gerhards.liferay.services.angular.model.impl.AngularVirtualInstanceImpl
 * @see eu.gerhards.liferay.services.angular.model.impl.AngularVirtualInstanceModelImpl
 * @generated
 */
@ProviderType
public interface AngularVirtualInstanceModel extends BaseModel<AngularVirtualInstance> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a Virtual instance model instance should use the {@link AngularVirtualInstance} interface instead.
	 */

	/**
	 * Returns the primary key of this Virtual instance.
	 *
	 * @return the primary key of this Virtual instance
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this Virtual instance.
	 *
	 * @param primaryKey the primary key of this Virtual instance
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the virtual instance ID of this Virtual instance.
	 *
	 * @return the virtual instance ID of this Virtual instance
	 */
	public long getVirtualInstanceId();

	/**
	 * Sets the virtual instance ID of this Virtual instance.
	 *
	 * @param virtualInstanceId the virtual instance ID of this Virtual instance
	 */
	public void setVirtualInstanceId(long virtualInstanceId);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		eu.gerhards.liferay.services.angular.model.AngularVirtualInstance angularVirtualInstance);

	@Override
	public int hashCode();

	@Override
	public CacheModel<eu.gerhards.liferay.services.angular.model.AngularVirtualInstance> toCacheModel();

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularVirtualInstance toEscapedModel();

	@Override
	public eu.gerhards.liferay.services.angular.model.AngularVirtualInstance toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}