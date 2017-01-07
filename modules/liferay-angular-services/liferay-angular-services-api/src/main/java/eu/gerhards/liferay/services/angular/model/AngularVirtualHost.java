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
 * The extended model interface for the AngularVirtualHost service. Represents a row in the &quot;AngularServices_AngularVirtualHost&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AngularVirtualHostModel
 * @see eu.gerhards.liferay.services.angular.model.impl.AngularVirtualHostImpl
 * @see eu.gerhards.liferay.services.angular.model.impl.AngularVirtualHostModelImpl
 * @generated
 */
@ImplementationClassName("eu.gerhards.liferay.services.angular.model.impl.AngularVirtualHostImpl")
@ProviderType
public interface AngularVirtualHost extends AngularVirtualHostModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link eu.gerhards.liferay.services.angular.model.impl.AngularVirtualHostImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AngularVirtualHost, Long> VIRTUAL_HOST_ID_ACCESSOR =
		new Accessor<AngularVirtualHost, Long>() {
			@Override
			public Long get(AngularVirtualHost angularVirtualHost) {
				return angularVirtualHost.getVirtualHostId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<AngularVirtualHost> getTypeClass() {
				return AngularVirtualHost.class;
			}
		};
}