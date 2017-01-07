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
import com.liferay.portal.kernel.dao.orm.*;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;
import eu.gerhards.liferay.services.angular.exception.NoSuchAngularBootstrapException;
import eu.gerhards.liferay.services.angular.model.AngularBootstrap;
import eu.gerhards.liferay.services.angular.model.impl.AngularBootstrapImpl;
import eu.gerhards.liferay.services.angular.model.impl.AngularBootstrapModelImpl;
import eu.gerhards.liferay.services.angular.service.persistence.AngularBootstrapPersistence;

import java.io.Serializable;
import java.util.*;

/**
 * The persistence implementation for the Bootstrap service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularBootstrapPersistence
 * @see eu.gerhards.liferay.services.angular.service.persistence.AngularBootstrapUtil
 * @generated
 */
@ProviderType
public class AngularBootstrapPersistenceImpl extends BasePersistenceImpl<AngularBootstrap>
	implements AngularBootstrapPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AngularBootstrapUtil} to access the Bootstrap persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AngularBootstrapImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AngularBootstrapModelImpl.ENTITY_CACHE_ENABLED,
			AngularBootstrapModelImpl.FINDER_CACHE_ENABLED,
			AngularBootstrapImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AngularBootstrapModelImpl.ENTITY_CACHE_ENABLED,
			AngularBootstrapModelImpl.FINDER_CACHE_ENABLED,
			AngularBootstrapImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AngularBootstrapModelImpl.ENTITY_CACHE_ENABLED,
			AngularBootstrapModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public AngularBootstrapPersistenceImpl() {
		setModelClass(AngularBootstrap.class);
	}

	/**
	 * Caches the Bootstrap in the entity cache if it is enabled.
	 *
	 * @param angularBootstrap the Bootstrap
	 */
	@Override
	public void cacheResult(AngularBootstrap angularBootstrap) {
		entityCache.putResult(AngularBootstrapModelImpl.ENTITY_CACHE_ENABLED,
			AngularBootstrapImpl.class, angularBootstrap.getPrimaryKey(),
			angularBootstrap);

		angularBootstrap.resetOriginalValues();
	}

	/**
	 * Caches the Bootstraps in the entity cache if it is enabled.
	 *
	 * @param angularBootstraps the Bootstraps
	 */
	@Override
	public void cacheResult(List<AngularBootstrap> angularBootstraps) {
		for (AngularBootstrap angularBootstrap : angularBootstraps) {
			if (entityCache.getResult(
						AngularBootstrapModelImpl.ENTITY_CACHE_ENABLED,
						AngularBootstrapImpl.class,
						angularBootstrap.getPrimaryKey()) == null) {
				cacheResult(angularBootstrap);
			}
			else {
				angularBootstrap.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all Bootstraps.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AngularBootstrapImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the Bootstrap.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AngularBootstrap angularBootstrap) {
		entityCache.removeResult(AngularBootstrapModelImpl.ENTITY_CACHE_ENABLED,
			AngularBootstrapImpl.class, angularBootstrap.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AngularBootstrap> angularBootstraps) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AngularBootstrap angularBootstrap : angularBootstraps) {
			entityCache.removeResult(AngularBootstrapModelImpl.ENTITY_CACHE_ENABLED,
				AngularBootstrapImpl.class, angularBootstrap.getPrimaryKey());
		}
	}

	/**
	 * Creates a new Bootstrap with the primary key. Does not add the Bootstrap to the database.
	 *
	 * @param bootId the primary key for the new Bootstrap
	 * @return the new Bootstrap
	 */
	@Override
	public AngularBootstrap create(long bootId) {
		AngularBootstrap angularBootstrap = new AngularBootstrapImpl();

		angularBootstrap.setNew(true);
		angularBootstrap.setPrimaryKey(bootId);

		return angularBootstrap;
	}

	/**
	 * Removes the Bootstrap with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bootId the primary key of the Bootstrap
	 * @return the Bootstrap that was removed
	 * @throws NoSuchAngularBootstrapException if a Bootstrap with the primary key could not be found
	 */
	@Override
	public AngularBootstrap remove(long bootId)
		throws NoSuchAngularBootstrapException {
		return remove((Serializable)bootId);
	}

	/**
	 * Removes the Bootstrap with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the Bootstrap
	 * @return the Bootstrap that was removed
	 * @throws NoSuchAngularBootstrapException if a Bootstrap with the primary key could not be found
	 */
	@Override
	public AngularBootstrap remove(Serializable primaryKey)
		throws NoSuchAngularBootstrapException {
		Session session = null;

		try {
			session = openSession();

			AngularBootstrap angularBootstrap = (AngularBootstrap)session.get(AngularBootstrapImpl.class,
					primaryKey);

			if (angularBootstrap == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAngularBootstrapException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(angularBootstrap);
		}
		catch (NoSuchAngularBootstrapException nsee) {
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
	protected AngularBootstrap removeImpl(AngularBootstrap angularBootstrap) {
		angularBootstrap = toUnwrappedModel(angularBootstrap);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(angularBootstrap)) {
				angularBootstrap = (AngularBootstrap)session.get(AngularBootstrapImpl.class,
						angularBootstrap.getPrimaryKeyObj());
			}

			if (angularBootstrap != null) {
				session.delete(angularBootstrap);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (angularBootstrap != null) {
			clearCache(angularBootstrap);
		}

		return angularBootstrap;
	}

	@Override
	public AngularBootstrap updateImpl(AngularBootstrap angularBootstrap) {
		angularBootstrap = toUnwrappedModel(angularBootstrap);

		boolean isNew = angularBootstrap.isNew();

		Session session = null;

		try {
			session = openSession();

			if (angularBootstrap.isNew()) {
				session.save(angularBootstrap);

				angularBootstrap.setNew(false);
			}
			else {
				angularBootstrap = (AngularBootstrap)session.merge(angularBootstrap);
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

		entityCache.putResult(AngularBootstrapModelImpl.ENTITY_CACHE_ENABLED,
			AngularBootstrapImpl.class, angularBootstrap.getPrimaryKey(),
			angularBootstrap, false);

		angularBootstrap.resetOriginalValues();

		return angularBootstrap;
	}

	protected AngularBootstrap toUnwrappedModel(
		AngularBootstrap angularBootstrap) {
		if (angularBootstrap instanceof AngularBootstrapImpl) {
			return angularBootstrap;
		}

		AngularBootstrapImpl angularBootstrapImpl = new AngularBootstrapImpl();

		angularBootstrapImpl.setNew(angularBootstrap.isNew());
		angularBootstrapImpl.setPrimaryKey(angularBootstrap.getPrimaryKey());

		angularBootstrapImpl.setBootId(angularBootstrap.getBootId());

		return angularBootstrapImpl;
	}

	/**
	 * Returns the Bootstrap with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the Bootstrap
	 * @return the Bootstrap
	 * @throws NoSuchAngularBootstrapException if a Bootstrap with the primary key could not be found
	 */
	@Override
	public AngularBootstrap findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAngularBootstrapException {
		AngularBootstrap angularBootstrap = fetchByPrimaryKey(primaryKey);

		if (angularBootstrap == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAngularBootstrapException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return angularBootstrap;
	}

	/**
	 * Returns the Bootstrap with the primary key or throws a {@link NoSuchAngularBootstrapException} if it could not be found.
	 *
	 * @param bootId the primary key of the Bootstrap
	 * @return the Bootstrap
	 * @throws NoSuchAngularBootstrapException if a Bootstrap with the primary key could not be found
	 */
	@Override
	public AngularBootstrap findByPrimaryKey(long bootId)
		throws NoSuchAngularBootstrapException {
		return findByPrimaryKey((Serializable)bootId);
	}

	/**
	 * Returns the Bootstrap with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the Bootstrap
	 * @return the Bootstrap, or <code>null</code> if a Bootstrap with the primary key could not be found
	 */
	@Override
	public AngularBootstrap fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AngularBootstrapModelImpl.ENTITY_CACHE_ENABLED,
				AngularBootstrapImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AngularBootstrap angularBootstrap = (AngularBootstrap)serializable;

		if (angularBootstrap == null) {
			Session session = null;

			try {
				session = openSession();

				angularBootstrap = (AngularBootstrap)session.get(AngularBootstrapImpl.class,
						primaryKey);

				if (angularBootstrap != null) {
					cacheResult(angularBootstrap);
				}
				else {
					entityCache.putResult(AngularBootstrapModelImpl.ENTITY_CACHE_ENABLED,
						AngularBootstrapImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AngularBootstrapModelImpl.ENTITY_CACHE_ENABLED,
					AngularBootstrapImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return angularBootstrap;
	}

	/**
	 * Returns the Bootstrap with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bootId the primary key of the Bootstrap
	 * @return the Bootstrap, or <code>null</code> if a Bootstrap with the primary key could not be found
	 */
	@Override
	public AngularBootstrap fetchByPrimaryKey(long bootId) {
		return fetchByPrimaryKey((Serializable)bootId);
	}

	@Override
	public Map<Serializable, AngularBootstrap> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AngularBootstrap> map = new HashMap<Serializable, AngularBootstrap>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AngularBootstrap angularBootstrap = fetchByPrimaryKey(primaryKey);

			if (angularBootstrap != null) {
				map.put(primaryKey, angularBootstrap);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AngularBootstrapModelImpl.ENTITY_CACHE_ENABLED,
					AngularBootstrapImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AngularBootstrap)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ANGULARBOOTSTRAP_WHERE_PKS_IN);

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

			for (AngularBootstrap angularBootstrap : (List<AngularBootstrap>)q.list()) {
				map.put(angularBootstrap.getPrimaryKeyObj(), angularBootstrap);

				cacheResult(angularBootstrap);

				uncachedPrimaryKeys.remove(angularBootstrap.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AngularBootstrapModelImpl.ENTITY_CACHE_ENABLED,
					AngularBootstrapImpl.class, primaryKey, nullModel);
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
	 * Returns all the Bootstraps.
	 *
	 * @return the Bootstraps
	 */
	@Override
	public List<AngularBootstrap> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Bootstraps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularBootstrapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Bootstraps
	 * @param end the upper bound of the range of Bootstraps (not inclusive)
	 * @return the range of Bootstraps
	 */
	@Override
	public List<AngularBootstrap> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the Bootstraps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularBootstrapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Bootstraps
	 * @param end the upper bound of the range of Bootstraps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of Bootstraps
	 */
	@Override
	public List<AngularBootstrap> findAll(int start, int end,
		OrderByComparator<AngularBootstrap> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the Bootstraps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularBootstrapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Bootstraps
	 * @param end the upper bound of the range of Bootstraps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of Bootstraps
	 */
	@Override
	public List<AngularBootstrap> findAll(int start, int end,
		OrderByComparator<AngularBootstrap> orderByComparator,
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

		List<AngularBootstrap> list = null;

		if (retrieveFromCache) {
			list = (List<AngularBootstrap>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ANGULARBOOTSTRAP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ANGULARBOOTSTRAP;

				if (pagination) {
					sql = sql.concat(AngularBootstrapModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AngularBootstrap>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AngularBootstrap>)QueryUtil.list(q,
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
	 * Removes all the Bootstraps from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AngularBootstrap angularBootstrap : findAll()) {
			remove(angularBootstrap);
		}
	}

	/**
	 * Returns the number of Bootstraps.
	 *
	 * @return the number of Bootstraps
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ANGULARBOOTSTRAP);

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
		return AngularBootstrapModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the Bootstrap persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AngularBootstrapImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ANGULARBOOTSTRAP = "SELECT angularBootstrap FROM AngularBootstrap angularBootstrap";
	private static final String _SQL_SELECT_ANGULARBOOTSTRAP_WHERE_PKS_IN = "SELECT angularBootstrap FROM AngularBootstrap angularBootstrap WHERE bootId IN (";
	private static final String _SQL_COUNT_ANGULARBOOTSTRAP = "SELECT COUNT(angularBootstrap) FROM AngularBootstrap angularBootstrap";
	private static final String _ORDER_BY_ENTITY_ALIAS = "angularBootstrap.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AngularBootstrap exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(AngularBootstrapPersistenceImpl.class);
}