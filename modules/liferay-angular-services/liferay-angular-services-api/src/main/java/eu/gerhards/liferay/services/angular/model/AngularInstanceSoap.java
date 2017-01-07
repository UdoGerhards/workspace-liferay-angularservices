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
 * This class is used by SOAP remote services, specifically {@link eu.gerhards.liferay.services.angular.service.http.AngularInstanceServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.http.AngularInstanceServiceSoap
 * @generated
 */
@ProviderType
public class AngularInstanceSoap implements Serializable {
	public static AngularInstanceSoap toSoapModel(AngularInstance model) {
		AngularInstanceSoap soapModel = new AngularInstanceSoap();

		soapModel.setInstanceId(model.getInstanceId());

		return soapModel;
	}

	public static AngularInstanceSoap[] toSoapModels(AngularInstance[] models) {
		AngularInstanceSoap[] soapModels = new AngularInstanceSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AngularInstanceSoap[][] toSoapModels(
		AngularInstance[][] models) {
		AngularInstanceSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AngularInstanceSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AngularInstanceSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AngularInstanceSoap[] toSoapModels(
		List<AngularInstance> models) {
		List<AngularInstanceSoap> soapModels = new ArrayList<AngularInstanceSoap>(models.size());

		for (AngularInstance model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AngularInstanceSoap[soapModels.size()]);
	}

	public AngularInstanceSoap() {
	}

	public long getPrimaryKey() {
		return _instanceId;
	}

	public void setPrimaryKey(long pk) {
		setInstanceId(pk);
	}

	public long getInstanceId() {
		return _instanceId;
	}

	public void setInstanceId(long instanceId) {
		_instanceId = instanceId;
	}

	private long _instanceId;
}