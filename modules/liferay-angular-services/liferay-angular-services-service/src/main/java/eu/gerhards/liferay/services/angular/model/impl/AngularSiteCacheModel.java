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

package eu.gerhards.liferay.services.angular.model.impl;

import aQute.bnd.annotation.ProviderType;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import eu.gerhards.liferay.services.angular.model.AngularSite;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing AngularSite in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see AngularSite
 * @generated
 */
@ProviderType
public class AngularSiteCacheModel implements CacheModel<AngularSite>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AngularSiteCacheModel)) {
			return false;
		}

		AngularSiteCacheModel angularSiteCacheModel = (AngularSiteCacheModel)obj;

		if (siteId == angularSiteCacheModel.siteId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, siteId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(3);

		sb.append("{siteId=");
		sb.append(siteId);

		return sb.toString();
	}

	@Override
	public AngularSite toEntityModel() {
		AngularSiteImpl angularSiteImpl = new AngularSiteImpl();

		angularSiteImpl.setSiteId(siteId);

		angularSiteImpl.resetOriginalValues();

		return angularSiteImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		siteId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(siteId);
	}

	public long siteId;
}