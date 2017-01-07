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

import eu.gerhards.liferay.services.angular.exception.NoSuchAngularVirtualHostException;
import eu.gerhards.liferay.services.angular.model.AngularVirtualHost;
import eu.gerhards.liferay.services.angular.model.impl.AngularVirtualHostImpl;
import eu.gerhards.liferay.services.angular.model.impl.AngularVirtualHostModelImpl;
import eu.gerhards.liferay.services.angular.service.persistence.AngularVirtualHostPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the Virtual host service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularVirtualHostPersistence
 * @see eu.gerhards.liferay.services.angular.service.persistence.AngularVirtualHostUtil
 * @generated
 */
@ProviderType
public class AngularVirtualHostPersistenceImpl extends BasePersistenceImpl<AngularVirtualHost>
	implements AngularVirtualHostPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AngularVirtualHostUtil} to access the Virtual host persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AngularVirtualHostImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AngularVirtualHostModelImpl.ENTITY_CACHE_ENABLED,
			AngularVirtualHostModelImpl.FINDER_CACHE_ENABLED,
			AngularVirtualHostImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AngularVirtualHostModelImpl.ENTITY_CACHE_ENABLED,
			AngularVirtualHostModelImpl.FINDER_CACHE_ENABLED,
			AngularVirtualHostImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AngularVirtualHostModelImpl.ENTITY_CACHE_ENABLED,
			AngularVirtualHostModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public AngularVirtualHostPersistenceImpl() {
		setModelClass(AngularVirtualHost.class);
	}

	/**
	 * Caches the Virtual host in the entity cache if it is enabled.
	 *
	 * @param angularVirtualHost the Virtual host
	 */
	@Override
	public void cacheResult(AngularVirtualHost angularVirtualHost) {
		entityCache.putResult(AngularVirtualHostModelImpl.ENTITY_CACHE_ENABLED,
			AngularVirtualHostImpl.class, angularVirtualHost.getPrimaryKey(),
			angularVirtualHost);

		angularVirtualHost.resetOriginalValues();
	}

	/**
	 * Caches the Virtual hosts in the entity cache if it is enabled.
	 *
	 * @param angularVirtualHosts the Virtual hosts
	 */
	@Override
	public void cacheResult(List<AngularVirtualHost> angularVirtualHosts) {
		for (AngularVirtualHost angularVirtualHost : angularVirtualHosts) {
			if (entityCache.getResult(
						AngularVirtualHostModelImpl.ENTITY_CACHE_ENABLED,
						AngularVirtualHostImpl.class,
						angularVirtualHost.getPrimaryKey()) == null) {
				cacheResult(angularVirtualHost);
			}
			else {
				angularVirtualHost.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all Virtual hosts.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AngularVirtualHostImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the Virtual host.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AngularVirtualHost angularVirtualHost) {
		entityCache.removeResult(AngularVirtualHostModelImpl.ENTITY_CACHE_ENABLED,
			AngularVirtualHostImpl.class, angularVirtualHost.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AngularVirtualHost> angularVirtualHosts) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AngularVirtualHost angularVirtualHost : angularVirtualHosts) {
			entityCache.removeResult(AngularVirtualHostModelImpl.ENTITY_CACHE_ENABLED,
				AngularVirtualHostImpl.class, angularVirtualHost.getPrimaryKey());
		}
	}

	/**
	 * Creates a new Virtual host with the primary key. Does not add the Virtual host to the database.
	 *
	 * @param virtualHostId the primary key for the new Virtual host
	 * @return the new Virtual host
	 */
	@Override
	public AngularVirtualHost create(long virtualHostId) {
		AngularVirtualHost angularVirtualHost = new AngularVirtualHostImpl();

		angularVirtualHost.setNew(true);
		angularVirtualHost.setPrimaryKey(virtualHostId);

		return angularVirtualHost;
	}

	/**
	 * Removes the Virtual host with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param virtualHostId the primary key of the Virtual host
	 * @return the Virtual host that was removed
	 * @throws NoSuchAngularVirtualHostException if a Virtual host with the primary key could not be found
	 */
	@Override
	public AngularVirtualHost remove(long virtualHostId)
		throws NoSuchAngularVirtualHostException {
		return remove((Serializable)virtualHostId);
	}

	/**
	 * Removes the Virtual host with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the Virtual host
	 * @return the Virtual host that was removed
	 * @throws NoSuchAngularVirtualHostException if a Virtual host with the primary key could not be found
	 */
	@Override
	public AngularVirtualHost remove(Serializable primaryKey)
		throws NoSuchAngularVirtualHostException {
		Session session = null;

		try {
			session = openSession();

			AngularVirtualHost angularVirtualHost = (AngularVirtualHost)session.get(AngularVirtualHostImpl.class,
					primaryKey);

			if (angularVirtualHost == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAngularVirtualHostException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(angularVirtualHost);
		}
		catch (NoSuchAngularVirtualHostException nsee) {
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
	protected AngularVirtualHost removeImpl(
		AngularVirtualHost angularVirtualHost) {
		angularVirtualHost = toUnwrappedModel(angularVirtualHost);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(angularVirtualHost)) {
				angularVirtualHost = (AngularVirtualHost)session.get(AngularVirtualHostImpl.class,
						angularVirtualHost.getPrimaryKeyObj());
			}

			if (angularVirtualHost != null) {
				session.delete(angularVirtualHost);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (angularVirtualHost != null) {
			clearCache(angularVirtualHost);
		}

		return angularVirtualHost;
	}

	@Override
	public AngularVirtualHost updateImpl(AngularVirtualHost angularVirtualHost) {
		angularVirtualHost = toUnwrappedModel(angularVirtualHost);

		boolean isNew = angularVirtualHost.isNew();

		Session session = null;

		try {
			session = openSession();

			if (angularVirtualHost.isNew()) {
				session.save(angularVirtualHost);

				angularVirtualHost.setNew(false);
			}
			else {
				angularVirtualHost = (AngularVirtualHost)session.merge(angularVirtualHost);
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

		entityCache.putResult(AngularVirtualHostModelImpl.ENTITY_CACHE_ENABLED,
			AngularVirtualHostImpl.class, angularVirtualHost.getPrimaryKey(),
			angularVirtualHost, false);

		angularVirtualHost.resetOriginalValues();

		return angularVirtualHost;
	}

	protected AngularVirtualHost toUnwrappedModel(
		AngularVirtualHost angularVirtualHost) {
		if (angularVirtualHost instanceof AngularVirtualHostImpl) {
			return angularVirtualHost;
		}

		AngularVirtualHostImpl angularVirtualHostImpl = new AngularVirtualHostImpl();

		angularVirtualHostImpl.setNew(angularVirtualHost.isNew());
		angularVirtualHostImpl.setPrimaryKey(angularVirtualHost.getPrimaryKey());

		angularVirtualHostImpl.setVirtualHostId(angularVirtualHost.getVirtualHostId());

		return angularVirtualHostImpl;
	}

	/**
	 * Returns the Virtual host with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the Virtual host
	 * @return the Virtual host
	 * @throws NoSuchAngularVirtualHostException if a Virtual host with the primary key could not be found
	 */
	@Override
	public AngularVirtualHost findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAngularVirtualHostException {
		AngularVirtualHost angularVirtualHost = fetchByPrimaryKey(primaryKey);

		if (angularVirtualHost == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAngularVirtualHostException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return angularVirtualHost;
	}

	/**
	 * Returns the Virtual host with the primary key or throws a {@link NoSuchAngularVirtualHostException} if it could not be found.
	 *
	 * @param virtualHostId the primary key of the Virtual host
	 * @return the Virtual host
	 * @throws NoSuchAngularVirtualHostException if a Virtual host with the primary key could not be found
	 */
	@Override
	public AngularVirtualHost findByPrimaryKey(long virtualHostId)
		throws NoSuchAngularVirtualHostException {
		return findByPrimaryKey((Serializable)virtualHostId);
	}

	/**
	 * Returns the Virtual host with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the Virtual host
	 * @return the Virtual host, or <code>null</code> if a Virtual host with the primary key could not be found
	 */
	@Override
	public AngularVirtualHost fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AngularVirtualHostModelImpl.ENTITY_CACHE_ENABLED,
				AngularVirtualHostImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AngularVirtualHost angularVirtualHost = (AngularVirtualHost)serializable;

		if (angularVirtualHost == null) {
			Session session = null;

			try {
				session = openSession();

				angularVirtualHost = (AngularVirtualHost)session.get(AngularVirtualHostImpl.class,
						primaryKey);

				if (angularVirtualHost != null) {
					cacheResult(angularVirtualHost);
				}
				else {
					entityCache.putResult(AngularVirtualHostModelImpl.ENTITY_CACHE_ENABLED,
						AngularVirtualHostImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AngularVirtualHostModelImpl.ENTITY_CACHE_ENABLED,
					AngularVirtualHostImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return angularVirtualHost;
	}

	/**
	 * Returns the Virtual host with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param virtualHostId the primary key of the Virtual host
	 * @return the Virtual host, or <code>null</code> if a Virtual host with the primary key could not be found
	 */
	@Override
	public AngularVirtualHost fetchByPrimaryKey(long virtualHostId) {
		return fetchByPrimaryKey((Serializable)virtualHostId);
	}

	@Override
	public Map<Serializable, AngularVirtualHost> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AngularVirtualHost> map = new HashMap<Serializable, AngularVirtualHost>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AngularVirtualHost angularVirtualHost = fetchByPrimaryKey(primaryKey);

			if (angularVirtualHost != null) {
				map.put(primaryKey, angularVirtualHost);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AngularVirtualHostModelImpl.ENTITY_CACHE_ENABLED,
					AngularVirtualHostImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AngularVirtualHost)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ANGULARVIRTUALHOST_WHERE_PKS_IN);

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

			for (AngularVirtualHost angularVirtualHost : (List<AngularVirtualHost>)q.list()) {
				map.put(angularVirtualHost.getPrimaryKeyObj(),
					angularVirtualHost);

				cacheResult(angularVirtualHost);

				uncachedPrimaryKeys.remove(angularVirtualHost.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AngularVirtualHostModelImpl.ENTITY_CACHE_ENABLED,
					AngularVirtualHostImpl.class, primaryKey, nullModel);
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
	 * Returns all the Virtual hosts.
	 *
	 * @return the Virtual hosts
	 */
	@Override
	public List<AngularVirtualHost> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Virtual hosts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularVirtualHostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Virtual hosts
	 * @param end the upper bound of the range of Virtual hosts (not inclusive)
	 * @return the range of Virtual hosts
	 */
	@Override
	public List<AngularVirtualHost> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the Virtual hosts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularVirtualHostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Virtual hosts
	 * @param end the upper bound of the range of Virtual hosts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of Virtual hosts
	 */
	@Override
	public List<AngularVirtualHost> findAll(int start, int end,
		OrderByComparator<AngularVirtualHost> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the Virtual hosts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularVirtualHostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Virtual hosts
	 * @param end the upper bound of the range of Virtual hosts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of Virtual hosts
	 */
	@Override
	public List<AngularVirtualHost> findAll(int start, int end,
		OrderByComparator<AngularVirtualHost> orderByComparator,
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

		List<AngularVirtualHost> list = null;

		if (retrieveFromCache) {
			list = (List<AngularVirtualHost>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ANGULARVIRTUALHOST);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ANGULARVIRTUALHOST;

				if (pagination) {
					sql = sql.concat(AngularVirtualHostModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AngularVirtualHost>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AngularVirtualHost>)QueryUtil.list(q,
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
	 * Removes all the Virtual hosts from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AngularVirtualHost angularVirtualHost : findAll()) {
			remove(angularVirtualHost);
		}
	}

	/**
	 * Returns the number of Virtual hosts.
	 *
	 * @return the number of Virtual hosts
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ANGULARVIRTUALHOST);

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
		return AngularVirtualHostModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the Virtual host persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AngularVirtualHostImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ANGULARVIRTUALHOST = "SELECT angularVirtualHost FROM AngularVirtualHost angularVirtualHost";
	private static final String _SQL_SELECT_ANGULARVIRTUALHOST_WHERE_PKS_IN = "SELECT angularVirtualHost FROM AngularVirtualHost angularVirtualHost WHERE virtualHostId IN (";
	private static final String _SQL_COUNT_ANGULARVIRTUALHOST = "SELECT COUNT(angularVirtualHost) FROM AngularVirtualHost angularVirtualHost";
	private static final String _ORDER_BY_ENTITY_ALIAS = "angularVirtualHost.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AngularVirtualHost exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(AngularVirtualHostPersistenceImpl.class);
}