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

package eu.gerhards.liferay.services.angular.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import eu.gerhards.liferay.services.angular.model.AngularResourceBlock;
import eu.gerhards.liferay.services.angular.model.AngularResourceBlockModel;
import eu.gerhards.liferay.services.angular.model.AngularResourceBlockSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the AngularResourceBlock service. Represents a row in the &quot;AngularServices_AngularResourceBlock&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link AngularResourceBlockModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AngularResourceBlockImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularResourceBlockImpl
 * @see AngularResourceBlock
 * @see AngularResourceBlockModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class AngularResourceBlockModelImpl extends BaseModelImpl<AngularResourceBlock>
	implements AngularResourceBlockModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a Resource block model instance should use the {@link AngularResourceBlock} interface instead.
	 */
	public static final String TABLE_NAME = "AngularServices_AngularResourceBlock";
	public static final Object[][] TABLE_COLUMNS = {
			{ "resourceBlockId", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("resourceBlockId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table AngularServices_AngularResourceBlock (resourceBlockId LONG not null primary key)";
	public static final String TABLE_SQL_DROP = "drop table AngularServices_AngularResourceBlock";
	public static final String ORDER_BY_JPQL = " ORDER BY angularResourceBlock.resourceBlockId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY AngularServices_AngularResourceBlock.resourceBlockId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(eu.gerhards.liferay.services.angular.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.eu.gerhards.liferay.services.angular.model.AngularResourceBlock"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(eu.gerhards.liferay.services.angular.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.eu.gerhards.liferay.services.angular.model.AngularResourceBlock"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(eu.gerhards.liferay.services.angular.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.eu.gerhards.liferay.services.angular.model.AngularResourceBlock"),
			true);
	public static final long RESOURCEBLOCKID_COLUMN_BITMASK = 1L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static AngularResourceBlock toModel(
		AngularResourceBlockSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		AngularResourceBlock model = new AngularResourceBlockImpl();

		model.setResourceBlockId(soapModel.getResourceBlockId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<AngularResourceBlock> toModels(
		AngularResourceBlockSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<AngularResourceBlock> models = new ArrayList<AngularResourceBlock>(soapModels.length);

		for (AngularResourceBlockSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(eu.gerhards.liferay.services.angular.service.util.ServiceProps.get(
				"lock.expiration.time.eu.gerhards.liferay.services.angular.model.AngularResourceBlock"));

	public AngularResourceBlockModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _resourceBlockId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setResourceBlockId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _resourceBlockId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long resourceBlockId = (Long)attributes.get("resourceBlockId");

		if (resourceBlockId != null) {
			setResourceBlockId(resourceBlockId);
		}
	}

	@JSON
	@Override
	public long getResourceBlockId() {
		return _resourceBlockId;
	}

	@Override
	public void setResourceBlockId(long resourceBlockId) {
		_columnBitmask = -1L;

		if (!_setOriginalResourceBlockId) {
			_setOriginalResourceBlockId = true;

			_originalResourceBlockId = _resourceBlockId;
		}

		_resourceBlockId = resourceBlockId;
	}

	public long getOriginalResourceBlockId() {
		return _originalResourceBlockId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			AngularResourceBlock.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public AngularResourceBlock toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (AngularResourceBlock)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		AngularResourceBlockImpl angularResourceBlockImpl = new AngularResourceBlockImpl();

		angularResourceBlockImpl.setResourceBlockId(getResourceBlockId());

		angularResourceBlockImpl.resetOriginalValues();

		return angularResourceBlockImpl;
	}

	@Override
	public int compareTo(AngularResourceBlock angularResourceBlock) {
		int value = 0;

		if (getResourceBlockId() < angularResourceBlock.getResourceBlockId()) {
			value = -1;
		}
		else if (getResourceBlockId() > angularResourceBlock.getResourceBlockId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AngularResourceBlock)) {
			return false;
		}

		AngularResourceBlock angularResourceBlock = (AngularResourceBlock)obj;

		long primaryKey = angularResourceBlock.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		AngularResourceBlockModelImpl angularResourceBlockModelImpl = this;

		angularResourceBlockModelImpl._originalResourceBlockId = angularResourceBlockModelImpl._resourceBlockId;

		angularResourceBlockModelImpl._setOriginalResourceBlockId = false;

		angularResourceBlockModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<AngularResourceBlock> toCacheModel() {
		AngularResourceBlockCacheModel angularResourceBlockCacheModel = new AngularResourceBlockCacheModel();

		angularResourceBlockCacheModel.resourceBlockId = getResourceBlockId();

		return angularResourceBlockCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(3);

		sb.append("{resourceBlockId=");
		sb.append(getResourceBlockId());

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(7);

		sb.append("<model><model-name>");
		sb.append(
			"eu.gerhards.liferay.services.angular.model.AngularResourceBlock");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>resourceBlockId</column-name><column-value><![CDATA[");
		sb.append(getResourceBlockId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = AngularResourceBlock.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			AngularResourceBlock.class
		};
	private long _resourceBlockId;
	private long _originalResourceBlockId;
	private boolean _setOriginalResourceBlockId;
	private long _columnBitmask;
	private AngularResourceBlock _escapedModel;
}