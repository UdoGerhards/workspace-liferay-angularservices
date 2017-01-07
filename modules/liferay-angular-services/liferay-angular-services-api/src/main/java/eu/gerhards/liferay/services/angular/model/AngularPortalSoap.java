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
 * This class is used by SOAP remote services, specifically {@link eu.gerhards.liferay.services.angular.service.http.AngularPortalServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.http.AngularPortalServiceSoap
 * @generated
 */
@ProviderType
public class AngularPortalSoap implements Serializable {
	public static AngularPortalSoap toSoapModel(AngularPortal model) {
		AngularPortalSoap soapModel = new AngularPortalSoap();

		soapModel.setPortalId(model.getPortalId());

		return soapModel;
	}

	public static AngularPortalSoap[] toSoapModels(AngularPortal[] models) {
		AngularPortalSoap[] soapModels = new AngularPortalSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AngularPortalSoap[][] toSoapModels(AngularPortal[][] models) {
		AngularPortalSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AngularPortalSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AngularPortalSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AngularPortalSoap[] toSoapModels(List<AngularPortal> models) {
		List<AngularPortalSoap> soapModels = new ArrayList<AngularPortalSoap>(models.size());

		for (AngularPortal model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AngularPortalSoap[soapModels.size()]);
	}

	public AngularPortalSoap() {
	}

	public long getPrimaryKey() {
		return _portalId;
	}

	public void setPrimaryKey(long pk) {
		setPortalId(pk);
	}

	public long getPortalId() {
		return _portalId;
	}

	public void setPortalId(long portalId) {
		_portalId = portalId;
	}

	private long _portalId;
}