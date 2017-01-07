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
 * This class is used by SOAP remote services, specifically {@link eu.gerhards.liferay.services.angular.service.http.AngularVirtualInstanceServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.http.AngularVirtualInstanceServiceSoap
 * @generated
 */
@ProviderType
public class AngularVirtualInstanceSoap implements Serializable {
	public static AngularVirtualInstanceSoap toSoapModel(
		AngularVirtualInstance model) {
		AngularVirtualInstanceSoap soapModel = new AngularVirtualInstanceSoap();

		soapModel.setVirtualInstanceId(model.getVirtualInstanceId());

		return soapModel;
	}

	public static AngularVirtualInstanceSoap[] toSoapModels(
		AngularVirtualInstance[] models) {
		AngularVirtualInstanceSoap[] soapModels = new AngularVirtualInstanceSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AngularVirtualInstanceSoap[][] toSoapModels(
		AngularVirtualInstance[][] models) {
		AngularVirtualInstanceSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AngularVirtualInstanceSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AngularVirtualInstanceSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AngularVirtualInstanceSoap[] toSoapModels(
		List<AngularVirtualInstance> models) {
		List<AngularVirtualInstanceSoap> soapModels = new ArrayList<AngularVirtualInstanceSoap>(models.size());

		for (AngularVirtualInstance model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AngularVirtualInstanceSoap[soapModels.size()]);
	}

	public AngularVirtualInstanceSoap() {
	}

	public long getPrimaryKey() {
		return _virtualInstanceId;
	}

	public void setPrimaryKey(long pk) {
		setVirtualInstanceId(pk);
	}

	public long getVirtualInstanceId() {
		return _virtualInstanceId;
	}

	public void setVirtualInstanceId(long virtualInstanceId) {
		_virtualInstanceId = virtualInstanceId;
	}

	private long _virtualInstanceId;
}