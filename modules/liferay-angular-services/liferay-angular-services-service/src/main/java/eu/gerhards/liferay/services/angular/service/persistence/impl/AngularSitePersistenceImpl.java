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
import eu.gerhards.liferay.services.angular.exception.NoSuchAngularSiteException;
import eu.gerhards.liferay.services.angular.model.AngularSite;
import eu.gerhards.liferay.services.angular.model.impl.AngularSiteImpl;
import eu.gerhards.liferay.services.angular.model.impl.AngularSiteModelImpl;
import eu.gerhards.liferay.services.angular.service.persistence.AngularSitePersistence;

import java.io.Serializable;
import java.util.*;

/**
 * The persistence implementation for the Site service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularSitePersistence
 * @see eu.gerhards.liferay.services.angular.service.persistence.AngularSiteUtil
 * @generated
 */
@ProviderType
public class AngularSitePersistenceImpl extends BasePersistenceImpl<AngularSite>
	implements AngularSitePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AngularSiteUtil} to access the Site persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AngularSiteImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AngularSiteModelImpl.ENTITY_CACHE_ENABLED,
			AngularSiteModelImpl.FINDER_CACHE_ENABLED, AngularSiteImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AngularSiteModelImpl.ENTITY_CACHE_ENABLED,
			AngularSiteModelImpl.FINDER_CACHE_ENABLED, AngularSiteImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AngularSiteModelImpl.ENTITY_CACHE_ENABLED,
			AngularSiteModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public AngularSitePersistenceImpl() {
		setModelClass(AngularSite.class);
	}

	/**
	 * Caches the Site in the entity cache if it is enabled.
	 *
	 * @param angularSite the Site
	 */
	@Override
	public void cacheResult(AngularSite angularSite) {
		entityCache.putResult(AngularSiteModelImpl.ENTITY_CACHE_ENABLED,
			AngularSiteImpl.class, angularSite.getPrimaryKey(), angularSite);

		angularSite.resetOriginalValues();
	}

	/**
	 * Caches the Sites in the entity cache if it is enabled.
	 *
	 * @param angularSites the Sites
	 */
	@Override
	public void cacheResult(List<AngularSite> angularSites) {
		for (AngularSite angularSite : angularSites) {
			if (entityCache.getResult(
						AngularSiteModelImpl.ENTITY_CACHE_ENABLED,
						AngularSiteImpl.class, angularSite.getPrimaryKey()) == null) {
				cacheResult(angularSite);
			}
			else {
				angularSite.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all Sites.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AngularSiteImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the Site.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AngularSite angularSite) {
		entityCache.removeResult(AngularSiteModelImpl.ENTITY_CACHE_ENABLED,
			AngularSiteImpl.class, angularSite.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AngularSite> angularSites) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AngularSite angularSite : angularSites) {
			entityCache.removeResult(AngularSiteModelImpl.ENTITY_CACHE_ENABLED,
				AngularSiteImpl.class, angularSite.getPrimaryKey());
		}
	}

	/**
	 * Creates a new Site with the primary key. Does not add the Site to the database.
	 *
	 * @param siteId the primary key for the new Site
	 * @return the new Site
	 */
	@Override
	public AngularSite create(long siteId) {
		AngularSite angularSite = new AngularSiteImpl();

		angularSite.setNew(true);
		angularSite.setPrimaryKey(siteId);

		return angularSite;
	}

	/**
	 * Removes the Site with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param siteId the primary key of the Site
	 * @return the Site that was removed
	 * @throws NoSuchAngularSiteException if a Site with the primary key could not be found
	 */
	@Override
	public AngularSite remove(long siteId) throws NoSuchAngularSiteException {
		return remove((Serializable)siteId);
	}

	/**
	 * Removes the Site with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the Site
	 * @return the Site that was removed
	 * @throws NoSuchAngularSiteException if a Site with the primary key could not be found
	 */
	@Override
	public AngularSite remove(Serializable primaryKey)
		throws NoSuchAngularSiteException {
		Session session = null;

		try {
			session = openSession();

			AngularSite angularSite = (AngularSite)session.get(AngularSiteImpl.class,
					primaryKey);

			if (angularSite == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAngularSiteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(angularSite);
		}
		catch (NoSuchAngularSiteException nsee) {
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
	protected AngularSite removeImpl(AngularSite angularSite) {
		angularSite = toUnwrappedModel(angularSite);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(angularSite)) {
				angularSite = (AngularSite)session.get(AngularSiteImpl.class,
						angularSite.getPrimaryKeyObj());
			}

			if (angularSite != null) {
				session.delete(angularSite);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (angularSite != null) {
			clearCache(angularSite);
		}

		return angularSite;
	}

	@Override
	public AngularSite updateImpl(AngularSite angularSite) {
		angularSite = toUnwrappedModel(angularSite);

		boolean isNew = angularSite.isNew();

		Session session = null;

		try {
			session = openSession();

			if (angularSite.isNew()) {
				session.save(angularSite);

				angularSite.setNew(false);
			}
			else {
				angularSite = (AngularSite)session.merge(angularSite);
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

		entityCache.putResult(AngularSiteModelImpl.ENTITY_CACHE_ENABLED,
			AngularSiteImpl.class, angularSite.getPrimaryKey(), angularSite,
			false);

		angularSite.resetOriginalValues();

		return angularSite;
	}

	protected AngularSite toUnwrappedModel(AngularSite angularSite) {
		if (angularSite instanceof AngularSiteImpl) {
			return angularSite;
		}

		AngularSiteImpl angularSiteImpl = new AngularSiteImpl();

		angularSiteImpl.setNew(angularSite.isNew());
		angularSiteImpl.setPrimaryKey(angularSite.getPrimaryKey());

		angularSiteImpl.setSiteId(angularSite.getSiteId());

		return angularSiteImpl;
	}

	/**
	 * Returns the Site with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the Site
	 * @return the Site
	 * @throws NoSuchAngularSiteException if a Site with the primary key could not be found
	 */
	@Override
	public AngularSite findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAngularSiteException {
		AngularSite angularSite = fetchByPrimaryKey(primaryKey);

		if (angularSite == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAngularSiteException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return angularSite;
	}

	/**
	 * Returns the Site with the primary key or throws a {@link NoSuchAngularSiteException} if it could not be found.
	 *
	 * @param siteId the primary key of the Site
	 * @return the Site
	 * @throws NoSuchAngularSiteException if a Site with the primary key could not be found
	 */
	@Override
	public AngularSite findByPrimaryKey(long siteId)
		throws NoSuchAngularSiteException {
		return findByPrimaryKey((Serializable)siteId);
	}

	/**
	 * Returns the Site with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the Site
	 * @return the Site, or <code>null</code> if a Site with the primary key could not be found
	 */
	@Override
	public AngularSite fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AngularSiteModelImpl.ENTITY_CACHE_ENABLED,
				AngularSiteImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AngularSite angularSite = (AngularSite)serializable;

		if (angularSite == null) {
			Session session = null;

			try {
				session = openSession();

				angularSite = (AngularSite)session.get(AngularSiteImpl.class,
						primaryKey);

				if (angularSite != null) {
					cacheResult(angularSite);
				}
				else {
					entityCache.putResult(AngularSiteModelImpl.ENTITY_CACHE_ENABLED,
						AngularSiteImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AngularSiteModelImpl.ENTITY_CACHE_ENABLED,
					AngularSiteImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return angularSite;
	}

	/**
	 * Returns the Site with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param siteId the primary key of the Site
	 * @return the Site, or <code>null</code> if a Site with the primary key could not be found
	 */
	@Override
	public AngularSite fetchByPrimaryKey(long siteId) {
		return fetchByPrimaryKey((Serializable)siteId);
	}

	@Override
	public Map<Serializable, AngularSite> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AngularSite> map = new HashMap<Serializable, AngularSite>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AngularSite angularSite = fetchByPrimaryKey(primaryKey);

			if (angularSite != null) {
				map.put(primaryKey, angularSite);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AngularSiteModelImpl.ENTITY_CACHE_ENABLED,
					AngularSiteImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AngularSite)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ANGULARSITE_WHERE_PKS_IN);

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

			for (AngularSite angularSite : (List<AngularSite>)q.list()) {
				map.put(angularSite.getPrimaryKeyObj(), angularSite);

				cacheResult(angularSite);

				uncachedPrimaryKeys.remove(angularSite.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AngularSiteModelImpl.ENTITY_CACHE_ENABLED,
					AngularSiteImpl.class, primaryKey, nullModel);
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
	 * Returns all the Sites.
	 *
	 * @return the Sites
	 */
	@Override
	public List<AngularSite> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularSiteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Sites
	 * @param end the upper bound of the range of Sites (not inclusive)
	 * @return the range of Sites
	 */
	@Override
	public List<AngularSite> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the Sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularSiteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Sites
	 * @param end the upper bound of the range of Sites (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of Sites
	 */
	@Override
	public List<AngularSite> findAll(int start, int end,
		OrderByComparator<AngularSite> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the Sites.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularSiteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Sites
	 * @param end the upper bound of the range of Sites (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of Sites
	 */
	@Override
	public List<AngularSite> findAll(int start, int end,
		OrderByComparator<AngularSite> orderByComparator,
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

		List<AngularSite> list = null;

		if (retrieveFromCache) {
			list = (List<AngularSite>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ANGULARSITE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ANGULARSITE;

				if (pagination) {
					sql = sql.concat(AngularSiteModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AngularSite>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AngularSite>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the Sites from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AngularSite angularSite : findAll()) {
			remove(angularSite);
		}
	}

	/**
	 * Returns the number of Sites.
	 *
	 * @return the number of Sites
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ANGULARSITE);

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
		return AngularSiteModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the Site persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AngularSiteImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ANGULARSITE = "SELECT angularSite FROM AngularSite angularSite";
	private static final String _SQL_SELECT_ANGULARSITE_WHERE_PKS_IN = "SELECT angularSite FROM AngularSite angularSite WHERE siteId IN (";
	private static final String _SQL_COUNT_ANGULARSITE = "SELECT COUNT(angularSite) FROM AngularSite angularSite";
	private static final String _ORDER_BY_ENTITY_ALIAS = "angularSite.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AngularSite exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(AngularSitePersistenceImpl.class);
}