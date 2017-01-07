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
 * This class is used by SOAP remote services, specifically {@link eu.gerhards.liferay.services.angular.service.http.AngularBootstrapServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.http.AngularBootstrapServiceSoap
 * @generated
 */
@ProviderType
public class AngularBootstrapSoap implements Serializable {
	public static AngularBootstrapSoap toSoapModel(AngularBootstrap model) {
		AngularBootstrapSoap soapModel = new AngularBootstrapSoap();

		soapModel.setBootId(model.getBootId());

		return soapModel;
	}

	public static AngularBootstrapSoap[] toSoapModels(AngularBootstrap[] models) {
		AngularBootstrapSoap[] soapModels = new AngularBootstrapSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AngularBootstrapSoap[][] toSoapModels(
		AngularBootstrap[][] models) {
		AngularBootstrapSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AngularBootstrapSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AngularBootstrapSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AngularBootstrapSoap[] toSoapModels(
		List<AngularBootstrap> models) {
		List<AngularBootstrapSoap> soapModels = new ArrayList<AngularBootstrapSoap>(models.size());

		for (AngularBootstrap model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AngularBootstrapSoap[soapModels.size()]);
	}

	public AngularBootstrapSoap() {
	}

	public long getPrimaryKey() {
		return _bootId;
	}

	public void setPrimaryKey(long pk) {
		setBootId(pk);
	}

	public long getBootId() {
		return _bootId;
	}

	public void setBootId(long bootId) {
		_bootId = bootId;
	}

	private long _bootId;
}