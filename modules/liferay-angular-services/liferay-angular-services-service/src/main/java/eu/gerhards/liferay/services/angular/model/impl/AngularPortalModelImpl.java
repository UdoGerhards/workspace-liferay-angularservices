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

import eu.gerhards.liferay.services.angular.model.AngularPortal;
import eu.gerhards.liferay.services.angular.model.AngularPortalModel;
import eu.gerhards.liferay.services.angular.model.AngularPortalSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the AngularPortal service. Represents a row in the &quot;AngularServices_AngularPortal&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link AngularPortalModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AngularPortalImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularPortalImpl
 * @see AngularPortal
 * @see AngularPortalModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class AngularPortalModelImpl extends BaseModelImpl<AngularPortal>
	implements AngularPortalModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a Portal model instance should use the {@link AngularPortal} interface instead.
	 */
	public static final String TABLE_NAME = "AngularServices_AngularPortal";
	public static final Object[][] TABLE_COLUMNS = {
			{ "portalId", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("portalId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table AngularServices_AngularPortal (portalId LONG not null primary key)";
	public static final String TABLE_SQL_DROP = "drop table AngularServices_AngularPortal";
	public static final String ORDER_BY_JPQL = " ORDER BY angularPortal.portalId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY AngularServices_AngularPortal.portalId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(eu.gerhards.liferay.services.angular.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.eu.gerhards.liferay.services.angular.model.AngularPortal"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(eu.gerhards.liferay.services.angular.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.eu.gerhards.liferay.services.angular.model.AngularPortal"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static AngularPortal toModel(AngularPortalSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		AngularPortal model = new AngularPortalImpl();

		model.setPortalId(soapModel.getPortalId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<AngularPortal> toModels(AngularPortalSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<AngularPortal> models = new ArrayList<AngularPortal>(soapModels.length);

		for (AngularPortalSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(eu.gerhards.liferay.services.angular.service.util.ServiceProps.get(
				"lock.expiration.time.eu.gerhards.liferay.services.angular.model.AngularPortal"));

	public AngularPortalModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _portalId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPortalId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _portalId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long portalId = (Long)attributes.get("portalId");

		if (portalId != null) {
			setPortalId(portalId);
		}
	}

	@JSON
	@Override
	public long getPortalId() {
		return _portalId;
	}

	@Override
	public void setPortalId(long portalId) {
		_portalId = portalId;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			AngularPortal.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public AngularPortal toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (AngularPortal)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		AngularPortalImpl angularPortalImpl = new AngularPortalImpl();

		angularPortalImpl.setPortalId(getPortalId());

		angularPortalImpl.resetOriginalValues();

		return angularPortalImpl;
	}

	@Override
	public int compareTo(AngularPortal angularPortal) {
		int value = 0;

		if (getPortalId() < angularPortal.getPortalId()) {
			value = -1;
		}
		else if (getPortalId() > angularPortal.getPortalId()) {
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

		if (!(obj instanceof AngularPortal)) {
			return false;
		}

		AngularPortal angularPortal = (AngularPortal)obj;

		long primaryKey = angularPortal.getPrimaryKey();

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
	public CacheModel<AngularPortal> toCacheModel() {
		AngularPortalCacheModel angularPortalCacheModel = new AngularPortalCacheModel();

		angularPortalCacheModel.portalId = getPortalId();

		return angularPortalCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(3);

		sb.append("{portalId=");
		sb.append(getPortalId());

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(7);

		sb.append("<model><model-name>");
		sb.append("eu.gerhards.liferay.services.angular.model.AngularPortal");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>portalId</column-name><column-value><![CDATA[");
		sb.append(getPortalId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = AngularPortal.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			AngularPortal.class
		};
	private long _portalId;
	private AngularPortal _escapedModel;
}