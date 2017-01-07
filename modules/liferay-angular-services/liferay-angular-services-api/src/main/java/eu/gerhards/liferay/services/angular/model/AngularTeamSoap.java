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
 * This class is used by SOAP remote services, specifically {@link eu.gerhards.liferay.services.angular.service.http.AngularTeamServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.http.AngularTeamServiceSoap
 * @generated
 */
@ProviderType
public class AngularTeamSoap implements Serializable {
	public static AngularTeamSoap toSoapModel(AngularTeam model) {
		AngularTeamSoap soapModel = new AngularTeamSoap();

		soapModel.setAngularTeamId(model.getAngularTeamId());

		return soapModel;
	}

	public static AngularTeamSoap[] toSoapModels(AngularTeam[] models) {
		AngularTeamSoap[] soapModels = new AngularTeamSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AngularTeamSoap[][] toSoapModels(AngularTeam[][] models) {
		AngularTeamSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AngularTeamSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AngularTeamSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AngularTeamSoap[] toSoapModels(List<AngularTeam> models) {
		List<AngularTeamSoap> soapModels = new ArrayList<AngularTeamSoap>(models.size());

		for (AngularTeam model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AngularTeamSoap[soapModels.size()]);
	}

	public AngularTeamSoap() {
	}

	public long getPrimaryKey() {
		return _angularTeamId;
	}

	public void setPrimaryKey(long pk) {
		setAngularTeamId(pk);
	}

	public long getAngularTeamId() {
		return _angularTeamId;
	}

	public void setAngularTeamId(long angularTeamId) {
		_angularTeamId = angularTeamId;
	}

	private long _angularTeamId;
}