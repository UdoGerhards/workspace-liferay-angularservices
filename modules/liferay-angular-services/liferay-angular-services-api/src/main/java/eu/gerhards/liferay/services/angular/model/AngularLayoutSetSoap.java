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
 * This class is used by SOAP remote services, specifically {@link eu.gerhards.liferay.services.angular.service.http.AngularLayoutSetServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.http.AngularLayoutSetServiceSoap
 * @generated
 */
@ProviderType
public class AngularLayoutSetSoap implements Serializable {
	public static AngularLayoutSetSoap toSoapModel(AngularLayoutSet model) {
		AngularLayoutSetSoap soapModel = new AngularLayoutSetSoap();

		soapModel.setLayoutSetId(model.getLayoutSetId());

		return soapModel;
	}

	public static AngularLayoutSetSoap[] toSoapModels(AngularLayoutSet[] models) {
		AngularLayoutSetSoap[] soapModels = new AngularLayoutSetSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AngularLayoutSetSoap[][] toSoapModels(
		AngularLayoutSet[][] models) {
		AngularLayoutSetSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AngularLayoutSetSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AngularLayoutSetSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AngularLayoutSetSoap[] toSoapModels(
		List<AngularLayoutSet> models) {
		List<AngularLayoutSetSoap> soapModels = new ArrayList<AngularLayoutSetSoap>(models.size());

		for (AngularLayoutSet model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AngularLayoutSetSoap[soapModels.size()]);
	}

	public AngularLayoutSetSoap() {
	}

	public long getPrimaryKey() {
		return _layoutSetId;
	}

	public void setPrimaryKey(long pk) {
		setLayoutSetId(pk);
	}

	public long getLayoutSetId() {
		return _layoutSetId;
	}

	public void setLayoutSetId(long layoutSetId) {
		_layoutSetId = layoutSetId;
	}

	private long _layoutSetId;
}