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
 * This class is used by SOAP remote services, specifically {@link eu.gerhards.liferay.services.angular.service.http.AngularVirtualHostServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.http.AngularVirtualHostServiceSoap
 * @generated
 */
@ProviderType
public class AngularVirtualHostSoap implements Serializable {
	public static AngularVirtualHostSoap toSoapModel(AngularVirtualHost model) {
		AngularVirtualHostSoap soapModel = new AngularVirtualHostSoap();

		soapModel.setVirtualHostId(model.getVirtualHostId());

		return soapModel;
	}

	public static AngularVirtualHostSoap[] toSoapModels(
		AngularVirtualHost[] models) {
		AngularVirtualHostSoap[] soapModels = new AngularVirtualHostSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AngularVirtualHostSoap[][] toSoapModels(
		AngularVirtualHost[][] models) {
		AngularVirtualHostSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AngularVirtualHostSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AngularVirtualHostSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AngularVirtualHostSoap[] toSoapModels(
		List<AngularVirtualHost> models) {
		List<AngularVirtualHostSoap> soapModels = new ArrayList<AngularVirtualHostSoap>(models.size());

		for (AngularVirtualHost model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AngularVirtualHostSoap[soapModels.size()]);
	}

	public AngularVirtualHostSoap() {
	}

	public long getPrimaryKey() {
		return _virtualHostId;
	}

	public void setPrimaryKey(long pk) {
		setVirtualHostId(pk);
	}

	public long getVirtualHostId() {
		return _virtualHostId;
	}

	public void setVirtualHostId(long virtualHostId) {
		_virtualHostId = virtualHostId;
	}

	private long _virtualHostId;
}