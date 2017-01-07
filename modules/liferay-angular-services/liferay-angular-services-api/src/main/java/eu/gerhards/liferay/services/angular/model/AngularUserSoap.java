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
 * This class is used by SOAP remote services, specifically {@link eu.gerhards.liferay.services.angular.service.http.AngularUserServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.http.AngularUserServiceSoap
 * @generated
 */
@ProviderType
public class AngularUserSoap implements Serializable {
	public static AngularUserSoap toSoapModel(AngularUser model) {
		AngularUserSoap soapModel = new AngularUserSoap();

		soapModel.setUserId(model.getUserId());

		return soapModel;
	}

	public static AngularUserSoap[] toSoapModels(AngularUser[] models) {
		AngularUserSoap[] soapModels = new AngularUserSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AngularUserSoap[][] toSoapModels(AngularUser[][] models) {
		AngularUserSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AngularUserSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AngularUserSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AngularUserSoap[] toSoapModels(List<AngularUser> models) {
		List<AngularUserSoap> soapModels = new ArrayList<AngularUserSoap>(models.size());

		for (AngularUser model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AngularUserSoap[soapModels.size()]);
	}

	public AngularUserSoap() {
	}

	public long getPrimaryKey() {
		return _userId;
	}

	public void setPrimaryKey(long pk) {
		setUserId(pk);
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	private long _userId;
}