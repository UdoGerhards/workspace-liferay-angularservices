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
 * The extended model interface for the AngularTeam service. Represents a row in the &quot;AngularServices_AngularTeam&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AngularTeamModel
 * @see eu.gerhards.liferay.services.angular.model.impl.AngularTeamImpl
 * @see eu.gerhards.liferay.services.angular.model.impl.AngularTeamModelImpl
 * @generated
 */
@ImplementationClassName("eu.gerhards.liferay.services.angular.model.impl.AngularTeamImpl")
@ProviderType
public interface AngularTeam extends AngularTeamModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link eu.gerhards.liferay.services.angular.model.impl.AngularTeamImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AngularTeam, Long> ANGULAR_TEAM_ID_ACCESSOR = new Accessor<AngularTeam, Long>() {
			@Override
			public Long get(AngularTeam angularTeam) {
				return angularTeam.getAngularTeamId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<AngularTeam> getTypeClass() {
				return AngularTeam.class;
			}
		};
}