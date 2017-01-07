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
 * This class is used by SOAP remote services, specifically {@link eu.gerhards.liferay.services.angular.service.http.AngularRoleServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.http.AngularRoleServiceSoap
 * @generated
 */
@ProviderType
public class AngularRoleSoap implements Serializable {
	public static AngularRoleSoap toSoapModel(AngularRole model) {
		AngularRoleSoap soapModel = new AngularRoleSoap();

		soapModel.setRoleId(model.getRoleId());

		return soapModel;
	}

	public static AngularRoleSoap[] toSoapModels(AngularRole[] models) {
		AngularRoleSoap[] soapModels = new AngularRoleSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AngularRoleSoap[][] toSoapModels(AngularRole[][] models) {
		AngularRoleSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AngularRoleSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AngularRoleSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AngularRoleSoap[] toSoapModels(List<AngularRole> models) {
		List<AngularRoleSoap> soapModels = new ArrayList<AngularRoleSoap>(models.size());

		for (AngularRole model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AngularRoleSoap[soapModels.size()]);
	}

	public AngularRoleSoap() {
	}

	public long getPrimaryKey() {
		return _roleId;
	}

	public void setPrimaryKey(long pk) {
		setRoleId(pk);
	}

	public long getRoleId() {
		return _roleId;
	}

	public void setRoleId(long roleId) {
		_roleId = roleId;
	}

	private long _roleId;
}