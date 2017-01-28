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
import eu.gerhards.liferay.services.angular.model.AngularLayoutSet;
import eu.gerhards.liferay.services.angular.service.AngularLayoutSetLocalServiceUtil;

/**
 * The extended model base implementation for the AngularLayoutSet service. Represents a row in the &quot;AngularServices_AngularLayoutSet&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AngularLayoutSetImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularLayoutSetImpl
 * @see AngularLayoutSet
 * @generated
 */
@ProviderType
public abstract class AngularLayoutSetBaseImpl extends AngularLayoutSetModelImpl
	implements AngularLayoutSet {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a LayoutSet model instance should use the {@link AngularLayoutSet} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			AngularLayoutSetLocalServiceUtil.addAngularLayoutSet(this);
		}
		else {
			AngularLayoutSetLocalServiceUtil.updateAngularLayoutSet(this);
		}
	}
}