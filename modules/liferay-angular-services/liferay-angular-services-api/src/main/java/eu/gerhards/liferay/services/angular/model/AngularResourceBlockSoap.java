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
 * This class is used by SOAP remote services, specifically {@link eu.gerhards.liferay.services.angular.service.http.AngularResourceBlockServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.http.AngularResourceBlockServiceSoap
 * @generated
 */
@ProviderType
public class AngularResourceBlockSoap implements Serializable {
	public static AngularResourceBlockSoap toSoapModel(
		AngularResourceBlock model) {
		AngularResourceBlockSoap soapModel = new AngularResourceBlockSoap();

		soapModel.setResourceBlockId(model.getResourceBlockId());

		return soapModel;
	}

	public static AngularResourceBlockSoap[] toSoapModels(
		AngularResourceBlock[] models) {
		AngularResourceBlockSoap[] soapModels = new AngularResourceBlockSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AngularResourceBlockSoap[][] toSoapModels(
		AngularResourceBlock[][] models) {
		AngularResourceBlockSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AngularResourceBlockSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AngularResourceBlockSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AngularResourceBlockSoap[] toSoapModels(
		List<AngularResourceBlock> models) {
		List<AngularResourceBlockSoap> soapModels = new ArrayList<AngularResourceBlockSoap>(models.size());

		for (AngularResourceBlock model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AngularResourceBlockSoap[soapModels.size()]);
	}

	public AngularResourceBlockSoap() {
	}

	public long getPrimaryKey() {
		return _resourceBlockId;
	}

	public void setPrimaryKey(long pk) {
		setResourceBlockId(pk);
	}

	public long getResourceBlockId() {
		return _resourceBlockId;
	}

	public void setResourceBlockId(long resourceBlockId) {
		_resourceBlockId = resourceBlockId;
	}

	private long _resourceBlockId;
}