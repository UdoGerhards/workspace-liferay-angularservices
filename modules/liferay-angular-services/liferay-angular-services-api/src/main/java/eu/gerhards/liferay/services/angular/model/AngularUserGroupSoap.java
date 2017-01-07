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
 * This class is used by SOAP remote services, specifically {@link eu.gerhards.liferay.services.angular.service.http.AngularUserGroupServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.http.AngularUserGroupServiceSoap
 * @generated
 */
@ProviderType
public class AngularUserGroupSoap implements Serializable {
	public static AngularUserGroupSoap toSoapModel(AngularUserGroup model) {
		AngularUserGroupSoap soapModel = new AngularUserGroupSoap();

		soapModel.setGroupId(model.getGroupId());

		return soapModel;
	}

	public static AngularUserGroupSoap[] toSoapModels(AngularUserGroup[] models) {
		AngularUserGroupSoap[] soapModels = new AngularUserGroupSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AngularUserGroupSoap[][] toSoapModels(
		AngularUserGroup[][] models) {
		AngularUserGroupSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AngularUserGroupSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AngularUserGroupSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AngularUserGroupSoap[] toSoapModels(
		List<AngularUserGroup> models) {
		List<AngularUserGroupSoap> soapModels = new ArrayList<AngularUserGroupSoap>(models.size());

		for (AngularUserGroup model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AngularUserGroupSoap[soapModels.size()]);
	}

	public AngularUserGroupSoap() {
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