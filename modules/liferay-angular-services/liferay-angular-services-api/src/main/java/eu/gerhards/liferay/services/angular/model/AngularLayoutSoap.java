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
 * This class is used by SOAP remote services, specifically {@link eu.gerhards.liferay.services.angular.service.http.AngularLayoutServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.http.AngularLayoutServiceSoap
 * @generated
 */
@ProviderType
public class AngularLayoutSoap implements Serializable {
	public static AngularLayoutSoap toSoapModel(AngularLayout model) {
		AngularLayoutSoap soapModel = new AngularLayoutSoap();

		soapModel.setLayoutId(model.getLayoutId());

		return soapModel;
	}

	public static AngularLayoutSoap[] toSoapModels(AngularLayout[] models) {
		AngularLayoutSoap[] soapModels = new AngularLayoutSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AngularLayoutSoap[][] toSoapModels(AngularLayout[][] models) {
		AngularLayoutSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AngularLayoutSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AngularLayoutSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AngularLayoutSoap[] toSoapModels(List<AngularLayout> models) {
		List<AngularLayoutSoap> soapModels = new ArrayList<AngularLayoutSoap>(models.size());

		for (AngularLayout model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AngularLayoutSoap[soapModels.size()]);
	}

	public AngularLayoutSoap() {
	}

	public long getPrimaryKey() {
		return _layoutId;
	}

	public void setPrimaryKey(long pk) {
		setLayoutId(pk);
	}

	public long getLayoutId() {
		return _layoutId;
	}

	public void setLayoutId(long layoutId) {
		_layoutId = layoutId;
	}

	private long _layoutId;
}