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

package eu.gerhards.liferay.services.angular.service.impl;

import aQute.bnd.annotation.ProviderType;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.VirtualHost;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.service.VirtualHostLocalServiceUtil;
import com.liferay.portal.kernel.service.permission.PortalPermissionUtil;
import eu.gerhards.liferay.services.angular.service.base.AngularVirtualHostServiceBaseImpl;

/**
 * The implementation of the Virtual host remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link eu.gerhards.liferay.services.angular.service.AngularVirtualHostService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularVirtualHostServiceBaseImpl
 * @see eu.gerhards.liferay.services.angular.service.AngularVirtualHostServiceUtil
 */
@ProviderType
public class AngularVirtualHostServiceImpl
	extends AngularVirtualHostServiceBaseImpl {

	public static Log _log = LogFactoryUtil.getLog(AngularVirtualHostServiceImpl.class);
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link eu.gerhards.liferay.services.angular.service.AngularVirtualHostServiceUtil} to access the Virtual host remote service.
	 */

	@Override
	public VirtualHost createVirtualHost(long companyId, String virtualHostName) throws PortalException {

		_log.info("creating virtual host id: "+virtualHostName);

		_log.debug("    ... security check ...");

		// TODO: Right
		PortalPermissionUtil.check(getPermissionChecker(), ActionKeys.VIEW);

		_log.debug("    ... creating ...");

		long nextVhostId = CounterLocalServiceUtil.increment(VirtualHost.class.getName());

		VirtualHost vhost = VirtualHostLocalServiceUtil.createVirtualHost(nextVhostId);
		vhost.setCompanyId(companyId);
		vhost.setHostname(virtualHostName);

		vhost = VirtualHostLocalServiceUtil.updateVirtualHost(vhost);

		return vhost;
	}

	@Override
	public void deleteVirtualHost() throws PortalException {

	}

	@Override
	public VirtualHost updateVirtualHost(long companyId, long layoutSetId, String hostname) throws PortalException {
		_log.info("Updating virtual host with name: "+hostname);

		_log.debug("    ... security check ...");

		// TODO: Right
		PortalPermissionUtil.check(getPermissionChecker(), ActionKeys.VIEW);

		_log.debug("    ... updating ... ");

		VirtualHost vhost = VirtualHostLocalServiceUtil.updateVirtualHost(companyId, layoutSetId, hostname);

		return vhost;
	}
}