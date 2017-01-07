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

import eu.gerhards.liferay.services.angular.model.AngularLayout;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing AngularLayout in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see AngularLayout
 * @generated
 */
@ProviderType
public class AngularLayoutCacheModel implements CacheModel<AngularLayout>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AngularLayoutCacheModel)) {
			return false;
		}

		AngularLayoutCacheModel angularLayoutCacheModel = (AngularLayoutCacheModel)obj;

		if (layoutId == angularLayoutCacheModel.layoutId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, layoutId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(3);

		sb.append("{layoutId=");
		sb.append(layoutId);

		return sb.toString();
	}

	@Override
	public AngularLayout toEntityModel() {
		AngularLayoutImpl angularLayoutImpl = new AngularLayoutImpl();

		angularLayoutImpl.setLayoutId(layoutId);

		angularLayoutImpl.resetOriginalValues();

		return angularLayoutImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		layoutId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(layoutId);
	}

	public long layoutId;
}