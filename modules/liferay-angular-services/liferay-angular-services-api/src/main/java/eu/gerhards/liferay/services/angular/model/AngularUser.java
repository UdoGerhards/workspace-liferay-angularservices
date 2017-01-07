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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the AngularUser service. Represents a row in the &quot;AngularServices_AngularUser&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AngularUserModel
 * @see eu.gerhards.liferay.services.angular.model.impl.AngularUserImpl
 * @see eu.gerhards.liferay.services.angular.model.impl.AngularUserModelImpl
 * @generated
 */
@ImplementationClassName("eu.gerhards.liferay.services.angular.model.impl.AngularUserImpl")
@ProviderType
public interface AngularUser extends AngularUserModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link eu.gerhards.liferay.services.angular.model.impl.AngularUserImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AngularUser, Long> USER_ID_ACCESSOR = new Accessor<AngularUser, Long>() {
			@Override
			public Long get(AngularUser angularUser) {
				return angularUser.getUserId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<AngularUser> getTypeClass() {
				return AngularUser.class;
			}
		};
}