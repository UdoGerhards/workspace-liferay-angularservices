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

import eu.gerhards.liferay.services.angular.model.AngularVirtualHost;
import eu.gerhards.liferay.services.angular.model.AngularVirtualHostModel;
import eu.gerhards.liferay.services.angular.model.AngularVirtualHostSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the AngularVirtualHost service. Represents a row in the &quot;AngularServices_AngularVirtualHost&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link AngularVirtualHostModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AngularVirtualHostImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularVirtualHostImpl
 * @see AngularVirtualHost
 * @see AngularVirtualHostModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class AngularVirtualHostModelImpl extends BaseModelImpl<AngularVirtualHost>
	implements AngularVirtualHostModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a Virtual host model instance should use the {@link AngularVirtualHost} interface instead.
	 */
	public static final String TABLE_NAME = "AngularServices_AngularVirtualHost";
	public static final Object[][] TABLE_COLUMNS = {
			{ "virtualHostId", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("virtualHostId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table AngularServices_AngularVirtualHost (virtualHostId LONG not null primary key)";
	public static final String TABLE_SQL_DROP = "drop table AngularServices_AngularVirtualHost";
	public static final String ORDER_BY_JPQL = " ORDER BY angularVirtualHost.virtualHostId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY AngularServices_AngularVirtualHost.virtualHostId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(eu.gerhards.liferay.services.angular.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.eu.gerhards.liferay.services.angular.model.AngularVirtualHost"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(eu.gerhards.liferay.services.angular.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.eu.gerhards.liferay.services.angular.model.AngularVirtualHost"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static AngularVirtualHost toModel(AngularVirtualHostSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		AngularVirtualHost model = new AngularVirtualHostImpl();

		model.setVirtualHostId(soapModel.getVirtualHostId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<AngularVirtualHost> toModels(
		AngularVirtualHostSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<AngularVirtualHost> models = new ArrayList<AngularVirtualHost>(soapModels.length);

		for (AngularVirtualHostSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(eu.gerhards.liferay.services.angular.service.util.ServiceProps.get(
				"lock.expiration.time.eu.gerhards.liferay.services.angular.model.AngularVirtualHost"));

	public AngularVirtualHostModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _virtualHostId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setVirtualHostId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _virtualHostId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return AngularVirtualHost.class;
	}

	@Override
	public String getModelClassName() {
		return AngularVirtualHost.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("virtualHostId", getVirtualHostId());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long virtualHostId = (Long)attributes.get("virtualHostId");

		if (virtualHostId != null) {
			setVirtualHostId(virtualHostId);
		}
	}

	@JSON
	@Override
	public long getVirtualHostId() {
		return _virtualHostId;
	}

	@Override
	public void setVirtualHostId(long virtualHostId) {
		_virtualHostId = virtualHostId;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			AngularVirtualHost.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public AngularVirtualHost toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (AngularVirtualHost)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		AngularVirtualHostImpl angularVirtualHostImpl = new AngularVirtualHostImpl();

		angularVirtualHostImpl.setVirtualHostId(getVirtualHostId());

		angularVirtualHostImpl.resetOriginalValues();

		return angularVirtualHostImpl;
	}

	@Override
	public int compareTo(AngularVirtualHost angularVirtualHost) {
		int value = 0;

		if (getVirtualHostId() < angularVirtualHost.getVirtualHostId()) {
			value = -1;
		}
		else if (getVirtualHostId() > angularVirtualHost.getVirtualHostId()) {
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

		if (!(obj instanceof AngularVirtualHost)) {
			return false;
		}

		AngularVirtualHost angularVirtualHost = (AngularVirtualHost)obj;

		long primaryKey = angularVirtualHost.getPrimaryKey();

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
	}

	@Override
	public CacheModel<AngularVirtualHost> toCacheModel() {
		AngularVirtualHostCacheModel angularVirtualHostCacheModel = new AngularVirtualHostCacheModel();

		angularVirtualHostCacheModel.virtualHostId = getVirtualHostId();

		return angularVirtualHostCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(3);

		sb.append("{virtualHostId=");
		sb.append(getVirtualHostId());

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(7);

		sb.append("<model><model-name>");
		sb.append(
			"eu.gerhards.liferay.services.angular.model.AngularVirtualHost");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>virtualHostId</column-name><column-value><![CDATA[");
		sb.append(getVirtualHostId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = AngularVirtualHost.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			AngularVirtualHost.class
		};
	private long _virtualHostId;
	private AngularVirtualHost _escapedModel;
}