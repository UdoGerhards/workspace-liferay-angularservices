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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link eu.gerhards.liferay.services.angular.service.http.AngularResourcePermissionServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.http.AngularResourcePermissionServiceSoap
 * @generated
 */
@ProviderType
public class AngularResourcePermissionSoap implements Serializable {
	public static AngularResourcePermissionSoap toSoapModel(
		AngularResourcePermission model) {
		AngularResourcePermissionSoap soapModel = new AngularResourcePermissionSoap();

		soapModel.setResourcePermissionId(model.getResourcePermissionId());

		return soapModel;
	}

	public static AngularResourcePermissionSoap[] toSoapModels(
		AngularResourcePermission[] models) {
		AngularResourcePermissionSoap[] soapModels = new AngularResourcePermissionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AngularResourcePermissionSoap[][] toSoapModels(
		AngularResourcePermission[][] models) {
		AngularResourcePermissionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AngularResourcePermissionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AngularResourcePermissionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AngularResourcePermissionSoap[] toSoapModels(
		List<AngularResourcePermission> models) {
		List<AngularResourcePermissionSoap> soapModels = new ArrayList<AngularResourcePermissionSoap>(models.size());

		for (AngularResourcePermission model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AngularResourcePermissionSoap[soapModels.size()]);
	}

	public AngularResourcePermissionSoap() {
	}

	public long getPrimaryKey() {
		return _resourcePermissionId;
	}

	public void setPrimaryKey(long pk) {
		setResourcePermissionId(pk);
	}

	public long getResourcePermissionId() {
		return _resourcePermissionId;
	}

	public void setResourcePermissionId(long resourcePermissionId) {
		_resourcePermissionId = resourcePermissionId;
	}

	private long _resourcePermissionId;
}