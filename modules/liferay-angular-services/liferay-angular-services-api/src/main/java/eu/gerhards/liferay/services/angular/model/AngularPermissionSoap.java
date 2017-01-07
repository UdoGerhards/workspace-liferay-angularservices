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
 * This class is used by SOAP remote services, specifically {@link eu.gerhards.liferay.services.angular.service.http.AngularPermissionServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.http.AngularPermissionServiceSoap
 * @generated
 */
@ProviderType
public class AngularPermissionSoap implements Serializable {
	public static AngularPermissionSoap toSoapModel(AngularPermission model) {
		AngularPermissionSoap soapModel = new AngularPermissionSoap();

		soapModel.setPermissionId(model.getPermissionId());

		return soapModel;
	}

	public static AngularPermissionSoap[] toSoapModels(
		AngularPermission[] models) {
		AngularPermissionSoap[] soapModels = new AngularPermissionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AngularPermissionSoap[][] toSoapModels(
		AngularPermission[][] models) {
		AngularPermissionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AngularPermissionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AngularPermissionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AngularPermissionSoap[] toSoapModels(
		List<AngularPermission> models) {
		List<AngularPermissionSoap> soapModels = new ArrayList<AngularPermissionSoap>(models.size());

		for (AngularPermission model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AngularPermissionSoap[soapModels.size()]);
	}

	public AngularPermissionSoap() {
	}

	public long getPrimaryKey() {
		return _permissionId;
	}

	public void setPrimaryKey(long pk) {
		setPermissionId(pk);
	}

	public long getPermissionId() {
		return _permissionId;
	}

	public void setPermissionId(long permissionId) {
		_permissionId = permissionId;
	}

	private long _permissionId;
}