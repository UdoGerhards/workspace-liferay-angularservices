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
 * This class is used by SOAP remote services, specifically {@link eu.gerhards.liferay.services.angular.service.http.AngularGroupServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.http.AngularGroupServiceSoap
 * @generated
 */
@ProviderType
public class AngularGroupSoap implements Serializable {
	public static AngularGroupSoap toSoapModel(AngularGroup model) {
		AngularGroupSoap soapModel = new AngularGroupSoap();

		soapModel.setGroupId(model.getGroupId());

		return soapModel;
	}

	public static AngularGroupSoap[] toSoapModels(AngularGroup[] models) {
		AngularGroupSoap[] soapModels = new AngularGroupSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AngularGroupSoap[][] toSoapModels(AngularGroup[][] models) {
		AngularGroupSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AngularGroupSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AngularGroupSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AngularGroupSoap[] toSoapModels(List<AngularGroup> models) {
		List<AngularGroupSoap> soapModels = new ArrayList<AngularGroupSoap>(models.size());

		for (AngularGroup model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AngularGroupSoap[soapModels.size()]);
	}

	public AngularGroupSoap() {
	}

	public long getPrimaryKey() {
		return _groupId;
	}

	public void setPrimaryKey(long pk) {
		setGroupId(pk);
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	private long _groupId;
}