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

package eu.gerhards.liferay.services.angular.service.http;

import aQute.bnd.annotation.ProviderType;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.*;
import eu.gerhards.liferay.services.angular.service.AngularOrganizationServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link AngularOrganizationServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link eu.gerhards.liferay.services.angular.model.AngularOrganizationSoap}.
 * If the method in the service utility returns a
 * {@link eu.gerhards.liferay.services.angular.model.AngularOrganization}, that is translated to a
 * {@link eu.gerhards.liferay.services.angular.model.AngularOrganizationSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularOrganizationServiceHttp
 * @see eu.gerhards.liferay.services.angular.model.AngularOrganizationSoap
 * @see AngularOrganizationServiceUtil
 * @generated
 */
@ProviderType
public class AngularOrganizationServiceSoap {
	public static com.liferay.portal.kernel.model.Organization getOrganization(long organizationId)
		throws RemoteException {
		try {
			com.liferay.portal.kernel.model.Organization returnValue = AngularOrganizationServiceUtil.getOrganization(organizationId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static UserSoap[] getOrganizationUsers(long organizationId)
		throws RemoteException {
		try {
			java.util.List<User> returnValue = AngularOrganizationServiceUtil.getOrganizationUsers(organizationId);

			return UserSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static AddressSoap[] getOrganizationAdresses(long organizationId)
		throws RemoteException {
		try {
			java.util.List<Address> returnValue = AngularOrganizationServiceUtil.getOrganizationAdresses(organizationId);

			return AddressSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static PhoneSoap[] getOrganizationPhones(long organizationId)
		throws RemoteException {
		try {
			java.util.List<Phone> returnValue = AngularOrganizationServiceUtil.getOrganizationPhones(organizationId);

			return PhoneSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static EmailAddressSoap[] getOrganizationEmailAddresses(
		long organizationId) throws RemoteException {
		try {
			java.util.List<EmailAddress> returnValue = AngularOrganizationServiceUtil.getOrganizationEmailAddresses(organizationId);

			return EmailAddressSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static WebsiteSoap[] getOrganizationWebsites(long organizationId)
		throws RemoteException {
		try {
			java.util.List<Website> returnValue = AngularOrganizationServiceUtil.getOrganizationWebsites(organizationId);

			return WebsiteSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.model.Organization createOrganization(java.lang.String name,
		java.lang.String type, long regionId, long countryId, long statusId,
		java.lang.String comment, boolean site, long[] addresses,
		long[] emailAddresses, long[] phones, long[] websites, long[] orgLabors)
		throws RemoteException {
		try {
			Organization returnValue = AngularOrganizationServiceUtil.createOrganization(name,
					type, regionId, countryId, statusId, comment, site,
					addresses, emailAddresses, phones, websites, orgLabors);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.model.Organization updateOrganization(long organizationId,
		java.lang.String name, java.lang.String type, long regionId,
		long countryId, long statusId, java.lang.String comment, boolean site,
		long[] addresses, long[] emailAddresses, long[] phones,
		long[] websites, long[] orgLabors) throws RemoteException {
		try {
			Organization returnValue = AngularOrganizationServiceUtil.updateOrganization(organizationId,
					name, type, regionId, countryId, statusId, comment, site,
					addresses, emailAddresses, phones, websites, orgLabors);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.portal.kernel.model.Organization deleteOrganization(long organizationId)
		throws RemoteException {
		try {
			Organization returnValue = AngularOrganizationServiceUtil.deleteOrganization(organizationId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static long[] checkOrganizations(long userId, long[] organizationIds)
		throws RemoteException {
		try {
			long[] returnValue = AngularOrganizationServiceUtil.checkOrganizations(userId,
					organizationIds);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(AngularOrganizationServiceSoap.class);
}