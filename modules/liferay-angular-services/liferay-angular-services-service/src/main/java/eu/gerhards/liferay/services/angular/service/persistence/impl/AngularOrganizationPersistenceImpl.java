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

package eu.gerhards.liferay.services.angular.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import eu.gerhards.liferay.services.angular.exception.NoSuchAngularOrganizationException;
import eu.gerhards.liferay.services.angular.model.AngularOrganization;
import eu.gerhards.liferay.services.angular.model.impl.AngularOrganizationImpl;
import eu.gerhards.liferay.services.angular.model.impl.AngularOrganizationModelImpl;
import eu.gerhards.liferay.services.angular.service.persistence.AngularOrganizationPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the Organization service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularOrganizationPersistence
 * @see eu.gerhards.liferay.services.angular.service.persistence.AngularOrganizationUtil
 * @generated
 */
@ProviderType
public class AngularOrganizationPersistenceImpl extends BasePersistenceImpl<AngularOrganization>
	implements AngularOrganizationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AngularOrganizationUtil} to access the Organization persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AngularOrganizationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AngularOrganizationModelImpl.ENTITY_CACHE_ENABLED,
			AngularOrganizationModelImpl.FINDER_CACHE_ENABLED,
			AngularOrganizationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AngularOrganizationModelImpl.ENTITY_CACHE_ENABLED,
			AngularOrganizationModelImpl.FINDER_CACHE_ENABLED,
			AngularOrganizationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AngularOrganizationModelImpl.ENTITY_CACHE_ENABLED,
			AngularOrganizationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public AngularOrganizationPersistenceImpl() {
		setModelClass(AngularOrganization.class);
	}

	/**
	 * Caches the Organization in the entity cache if it is enabled.
	 *
	 * @param angularOrganization the Organization
	 */
	@Override
	public void cacheResult(AngularOrganization angularOrganization) {
		entityCache.putResult(AngularOrganizationModelImpl.ENTITY_CACHE_ENABLED,
			AngularOrganizationImpl.class, angularOrganization.getPrimaryKey(),
			angularOrganization);

		angularOrganization.resetOriginalValues();
	}

	/**
	 * Caches the Organizations in the entity cache if it is enabled.
	 *
	 * @param angularOrganizations the Organizations
	 */
	@Override
	public void cacheResult(List<AngularOrganization> angularOrganizations) {
		for (AngularOrganization angularOrganization : angularOrganizations) {
			if (entityCache.getResult(
						AngularOrganizationModelImpl.ENTITY_CACHE_ENABLED,
						AngularOrganizationImpl.class,
						angularOrganization.getPrimaryKey()) == null) {
				cacheResult(angularOrganization);
			}
			else {
				angularOrganization.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all Organizations.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AngularOrganizationImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the Organization.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AngularOrganization angularOrganization) {
		entityCache.removeResult(AngularOrganizationModelImpl.ENTITY_CACHE_ENABLED,
			AngularOrganizationImpl.class, angularOrganization.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AngularOrganization> angularOrganizations) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AngularOrganization angularOrganization : angularOrganizations) {
			entityCache.removeResult(AngularOrganizationModelImpl.ENTITY_CACHE_ENABLED,
				AngularOrganizationImpl.class,
				angularOrganization.getPrimaryKey());
		}
	}

	/**
	 * Creates a new Organization with the primary key. Does not add the Organization to the database.
	 *
	 * @param organizationId the primary key for the new Organization
	 * @return the new Organization
	 */
	@Override
	public AngularOrganization create(long organizationId) {
		AngularOrganization angularOrganization = new AngularOrganizationImpl();

		angularOrganization.setNew(true);
		angularOrganization.setPrimaryKey(organizationId);

		return angularOrganization;
	}

	/**
	 * Removes the Organization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param organizationId the primary key of the Organization
	 * @return the Organization that was removed
	 * @throws NoSuchAngularOrganizationException if a Organization with the primary key could not be found
	 */
	@Override
	public AngularOrganization remove(long organizationId)
		throws NoSuchAngularOrganizationException {
		return remove((Serializable)organizationId);
	}

	/**
	 * Removes the Organization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the Organization
	 * @return the Organization that was removed
	 * @throws NoSuchAngularOrganizationException if a Organization with the primary key could not be found
	 */
	@Override
	public AngularOrganization remove(Serializable primaryKey)
		throws NoSuchAngularOrganizationException {
		Session session = null;

		try {
			session = openSession();

			AngularOrganization angularOrganization = (AngularOrganization)session.get(AngularOrganizationImpl.class,
					primaryKey);

			if (angularOrganization == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAngularOrganizationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(angularOrganization);
		}
		catch (NoSuchAngularOrganizationException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected AngularOrganization removeImpl(
		AngularOrganization angularOrganization) {
		angularOrganization = toUnwrappedModel(angularOrganization);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(angularOrganization)) {
				angularOrganization = (AngularOrganization)session.get(AngularOrganizationImpl.class,
						angularOrganization.getPrimaryKeyObj());
			}

			if (angularOrganization != null) {
				session.delete(angularOrganization);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (angularOrganization != null) {
			clearCache(angularOrganization);
		}

		return angularOrganization;
	}

	@Override
	public AngularOrganization updateImpl(
		AngularOrganization angularOrganization) {
		angularOrganization = toUnwrappedModel(angularOrganization);

		boolean isNew = angularOrganization.isNew();

		Session session = null;

		try {
			session = openSession();

			if (angularOrganization.isNew()) {
				session.save(angularOrganization);

				angularOrganization.setNew(false);
			}
			else {
				angularOrganization = (AngularOrganization)session.merge(angularOrganization);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(AngularOrganizationModelImpl.ENTITY_CACHE_ENABLED,
			AngularOrganizationImpl.class, angularOrganization.getPrimaryKey(),
			angularOrganization, false);

		angularOrganization.resetOriginalValues();

		return angularOrganization;
	}

	protected AngularOrganization toUnwrappedModel(
		AngularOrganization angularOrganization) {
		if (angularOrganization instanceof AngularOrganizationImpl) {
			return angularOrganization;
		}

		AngularOrganizationImpl angularOrganizationImpl = new AngularOrganizationImpl();

		angularOrganizationImpl.setNew(angularOrganization.isNew());
		angularOrganizationImpl.setPrimaryKey(angularOrganization.getPrimaryKey());

		angularOrganizationImpl.setOrganizationId(angularOrganization.getOrganizationId());

		return angularOrganizationImpl;
	}

	/**
	 * Returns the Organization with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the Organization
	 * @return the Organization
	 * @throws NoSuchAngularOrganizationException if a Organization with the primary key could not be found
	 */
	@Override
	public AngularOrganization findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAngularOrganizationException {
		AngularOrganization angularOrganization = fetchByPrimaryKey(primaryKey);

		if (angularOrganization == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAngularOrganizationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return angularOrganization;
	}

	/**
	 * Returns the Organization with the primary key or throws a {@link NoSuchAngularOrganizationException} if it could not be found.
	 *
	 * @param organizationId the primary key of the Organization
	 * @return the Organization
	 * @throws NoSuchAngularOrganizationException if a Organization with the primary key could not be found
	 */
	@Override
	public AngularOrganization findByPrimaryKey(long organizationId)
		throws NoSuchAngularOrganizationException {
		return findByPrimaryKey((Serializable)organizationId);
	}

	/**
	 * Returns the Organization with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the Organization
	 * @return the Organization, or <code>null</code> if a Organization with the primary key could not be found
	 */
	@Override
	public AngularOrganization fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AngularOrganizationModelImpl.ENTITY_CACHE_ENABLED,
				AngularOrganizationImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AngularOrganization angularOrganization = (AngularOrganization)serializable;

		if (angularOrganization == null) {
			Session session = null;

			try {
				session = openSession();

				angularOrganization = (AngularOrganization)session.get(AngularOrganizationImpl.class,
						primaryKey);

				if (angularOrganization != null) {
					cacheResult(angularOrganization);
				}
				else {
					entityCache.putResult(AngularOrganizationModelImpl.ENTITY_CACHE_ENABLED,
						AngularOrganizationImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AngularOrganizationModelImpl.ENTITY_CACHE_ENABLED,
					AngularOrganizationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return angularOrganization;
	}

	/**
	 * Returns the Organization with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param organizationId the primary key of the Organization
	 * @return the Organization, or <code>null</code> if a Organization with the primary key could not be found
	 */
	@Override
	public AngularOrganization fetchByPrimaryKey(long organizationId) {
		return fetchByPrimaryKey((Serializable)organizationId);
	}

	@Override
	public Map<Serializable, AngularOrganization> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AngularOrganization> map = new HashMap<Serializable, AngularOrganization>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AngularOrganization angularOrganization = fetchByPrimaryKey(primaryKey);

			if (angularOrganization != null) {
				map.put(primaryKey, angularOrganization);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AngularOrganizationModelImpl.ENTITY_CACHE_ENABLED,
					AngularOrganizationImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AngularOrganization)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ANGULARORGANIZATION_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (AngularOrganization angularOrganization : (List<AngularOrganization>)q.list()) {
				map.put(angularOrganization.getPrimaryKeyObj(),
					angularOrganization);

				cacheResult(angularOrganization);

				uncachedPrimaryKeys.remove(angularOrganization.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AngularOrganizationModelImpl.ENTITY_CACHE_ENABLED,
					AngularOrganizationImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the Organizations.
	 *
	 * @return the Organizations
	 */
	@Override
	public List<AngularOrganization> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Organizations
	 * @param end the upper bound of the range of Organizations (not inclusive)
	 * @return the range of Organizations
	 */
	@Override
	public List<AngularOrganization> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the Organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Organizations
	 * @param end the upper bound of the range of Organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of Organizations
	 */
	@Override
	public List<AngularOrganization> findAll(int start, int end,
		OrderByComparator<AngularOrganization> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the Organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularOrganizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Organizations
	 * @param end the upper bound of the range of Organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of Organizations
	 */
	@Override
	public List<AngularOrganization> findAll(int start, int end,
		OrderByComparator<AngularOrganization> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<AngularOrganization> list = null;

		if (retrieveFromCache) {
			list = (List<AngularOrganization>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ANGULARORGANIZATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ANGULARORGANIZATION;

				if (pagination) {
					sql = sql.concat(AngularOrganizationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AngularOrganization>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AngularOrganization>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the Organizations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AngularOrganization angularOrganization : findAll()) {
			remove(angularOrganization);
		}
	}

	/**
	 * Returns the number of Organizations.
	 *
	 * @return the number of Organizations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ANGULARORGANIZATION);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AngularOrganizationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the Organization persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AngularOrganizationImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ANGULARORGANIZATION = "SELECT angularOrganization FROM AngularOrganization angularOrganization";
	private static final String _SQL_SELECT_ANGULARORGANIZATION_WHERE_PKS_IN = "SELECT angularOrganization FROM AngularOrganization angularOrganization WHERE organizationId IN (";
	private static final String _SQL_COUNT_ANGULARORGANIZATION = "SELECT COUNT(angularOrganization) FROM AngularOrganization angularOrganization";
	private static final String _ORDER_BY_ENTITY_ALIAS = "angularOrganization.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AngularOrganization exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(AngularOrganizationPersistenceImpl.class);
}