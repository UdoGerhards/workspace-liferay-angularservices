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
import eu.gerhards.liferay.services.angular.model.AngularBootstrap;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing AngularBootstrap in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see AngularBootstrap
 * @generated
 */
@ProviderType
public class AngularBootstrapCacheModel implements CacheModel<AngularBootstrap>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AngularBootstrapCacheModel)) {
			return false;
		}

		AngularBootstrapCacheModel angularBootstrapCacheModel = (AngularBootstrapCacheModel)obj;

		if (bootId == angularBootstrapCacheModel.bootId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, bootId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(3);

		sb.append("{bootId=");
		sb.append(bootId);

		return sb.toString();
	}

	@Override
	public AngularBootstrap toEntityModel() {
		AngularBootstrapImpl angularBootstrapImpl = new AngularBootstrapImpl();

		angularBootstrapImpl.setBootId(bootId);

		angularBootstrapImpl.resetOriginalValues();

		return angularBootstrapImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		bootId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(bootId);
	}

	public long bootId;
}