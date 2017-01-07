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
 * This class is used by SOAP remote services, specifically {@link eu.gerhards.liferay.services.angular.service.http.AngularSiteServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see eu.gerhards.liferay.services.angular.service.http.AngularSiteServiceSoap
 * @generated
 */
@ProviderType
public class AngularSiteSoap implements Serializable {
	public static AngularSiteSoap toSoapModel(AngularSite model) {
		AngularSiteSoap soapModel = new AngularSiteSoap();

		soapModel.setSiteId(model.getSiteId());

		return soapModel;
	}

	public static AngularSiteSoap[] toSoapModels(AngularSite[] models) {
		AngularSiteSoap[] soapModels = new AngularSiteSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AngularSiteSoap[][] toSoapModels(AngularSite[][] models) {
		AngularSiteSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AngularSiteSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AngularSiteSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AngularSiteSoap[] toSoapModels(List<AngularSite> models) {
		List<AngularSiteSoap> soapModels = new ArrayList<AngularSiteSoap>(models.size());

		for (AngularSite model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AngularSiteSoap[soapModels.size()]);
	}

	public AngularSiteSoap() {
	}

	public long getPrimaryKey() {
		return _siteId;
	}

	public void setPrimaryKey(long pk) {
		setSiteId(pk);
	}

	public long getSiteId() {
		return _siteId;
	}

	public void setSiteId(long siteId) {
		_siteId = siteId;
	}

	private long _siteId;
}