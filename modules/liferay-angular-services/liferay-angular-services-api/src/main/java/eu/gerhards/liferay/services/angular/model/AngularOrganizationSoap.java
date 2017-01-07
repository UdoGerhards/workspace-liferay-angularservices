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
 * This class is used by SOAP remote services, specifically {@link eu.gerhards.liferay.services.angular.service.http.AngularOrganizationServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.http.AngularOrganizationServiceSoap
 * @generated
 */
@ProviderType
public class AngularOrganizationSoap implements Serializable {
	public static AngularOrganizationSoap toSoapModel(AngularOrganization model) {
		AngularOrganizationSoap soapModel = new AngularOrganizationSoap();

		soapModel.setOrganizationId(model.getOrganizationId());

		return soapModel;
	}

	public static AngularOrganizationSoap[] toSoapModels(
		AngularOrganization[] models) {
		AngularOrganizationSoap[] soapModels = new AngularOrganizationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AngularOrganizationSoap[][] toSoapModels(
		AngularOrganization[][] models) {
		AngularOrganizationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AngularOrganizationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AngularOrganizationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AngularOrganizationSoap[] toSoapModels(
		List<AngularOrganization> models) {
		List<AngularOrganizationSoap> soapModels = new ArrayList<AngularOrganizationSoap>(models.size());

		for (AngularOrganization model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AngularOrganizationSoap[soapModels.size()]);
	}

	public AngularOrganizationSoap() {
	}

	public long getPrimaryKey() {
		return _organizationId;
	}

	public void setPrimaryKey(long pk) {
		setOrganizationId(pk);
	}

	public long getOrganizationId() {
		return _organizationId;
	}

	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;
	}

	private long _organizationId;
}