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

import eu.gerhards.liferay.services.angular.exception.NoSuchAngularPortalException;
import eu.gerhards.liferay.services.angular.model.AngularPortal;
import eu.gerhards.liferay.services.angular.model.impl.AngularPortalImpl;
import eu.gerhards.liferay.services.angular.model.impl.AngularPortalModelImpl;
import eu.gerhards.liferay.services.angular.service.persistence.AngularPortalPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the Portal service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularPortalPersistence
 * @see eu.gerhards.liferay.services.angular.service.persistence.AngularPortalUtil
 * @generated
 */
@ProviderType
public class AngularPortalPersistenceImpl extends BasePersistenceImpl<AngularPortal>
	implements AngularPortalPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AngularPortalUtil} to access the Portal persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AngularPortalImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AngularPortalModelImpl.ENTITY_CACHE_ENABLED,
			AngularPortalModelImpl.FINDER_CACHE_ENABLED,
			AngularPortalImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AngularPortalModelImpl.ENTITY_CACHE_ENABLED,
			AngularPortalModelImpl.FINDER_CACHE_ENABLED,
			AngularPortalImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AngularPortalModelImpl.ENTITY_CACHE_ENABLED,
			AngularPortalModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public AngularPortalPersistenceImpl() {
		setModelClass(AngularPortal.class);
	}

	/**
	 * Caches the Portal in the entity cache if it is enabled.
	 *
	 * @param angularPortal the Portal
	 */
	@Override
	public void cacheResult(AngularPortal angularPortal) {
		entityCache.putResult(AngularPortalModelImpl.ENTITY_CACHE_ENABLED,
			AngularPortalImpl.class, angularPortal.getPrimaryKey(),
			angularPortal);

		angularPortal.resetOriginalValues();
	}

	/**
	 * Caches the Portals in the entity cache if it is enabled.
	 *
	 * @param angularPortals the Portals
	 */
	@Override
	public void cacheResult(List<AngularPortal> angularPortals) {
		for (AngularPortal angularPortal : angularPortals) {
			if (entityCache.getResult(
						AngularPortalModelImpl.ENTITY_CACHE_ENABLED,
						AngularPortalImpl.class, angularPortal.getPrimaryKey()) == null) {
				cacheResult(angularPortal);
			}
			else {
				angularPortal.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all Portals.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AngularPortalImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the Portal.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AngularPortal angularPortal) {
		entityCache.removeResult(AngularPortalModelImpl.ENTITY_CACHE_ENABLED,
			AngularPortalImpl.class, angularPortal.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AngularPortal> angularPortals) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AngularPortal angularPortal : angularPortals) {
			entityCache.removeResult(AngularPortalModelImpl.ENTITY_CACHE_ENABLED,
				AngularPortalImpl.class, angularPortal.getPrimaryKey());
		}
	}

	/**
	 * Creates a new Portal with the primary key. Does not add the Portal to the database.
	 *
	 * @param portalId the primary key for the new Portal
	 * @return the new Portal
	 */
	@Override
	public AngularPortal create(long portalId) {
		AngularPortal angularPortal = new AngularPortalImpl();

		angularPortal.setNew(true);
		angularPortal.setPrimaryKey(portalId);

		return angularPortal;
	}

	/**
	 * Removes the Portal with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param portalId the primary key of the Portal
	 * @return the Portal that was removed
	 * @throws NoSuchAngularPortalException if a Portal with the primary key could not be found
	 */
	@Override
	public AngularPortal remove(long portalId)
		throws NoSuchAngularPortalException {
		return remove((Serializable)portalId);
	}

	/**
	 * Removes the Portal with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the Portal
	 * @return the Portal that was removed
	 * @throws NoSuchAngularPortalException if a Portal with the primary key could not be found
	 */
	@Override
	public AngularPortal remove(Serializable primaryKey)
		throws NoSuchAngularPortalException {
		Session session = null;

		try {
			session = openSession();

			AngularPortal angularPortal = (AngularPortal)session.get(AngularPortalImpl.class,
					primaryKey);

			if (angularPortal == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAngularPortalException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(angularPortal);
		}
		catch (NoSuchAngularPortalException nsee) {
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
	protected AngularPortal removeImpl(AngularPortal angularPortal) {
		angularPortal = toUnwrappedModel(angularPortal);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(angularPortal)) {
				angularPortal = (AngularPortal)session.get(AngularPortalImpl.class,
						angularPortal.getPrimaryKeyObj());
			}

			if (angularPortal != null) {
				session.delete(angularPortal);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (angularPortal != null) {
			clearCache(angularPortal);
		}

		return angularPortal;
	}

	@Override
	public AngularPortal updateImpl(AngularPortal angularPortal) {
		angularPortal = toUnwrappedModel(angularPortal);

		boolean isNew = angularPortal.isNew();

		Session session = null;

		try {
			session = openSession();

			if (angularPortal.isNew()) {
				session.save(angularPortal);

				angularPortal.setNew(false);
			}
			else {
				angularPortal = (AngularPortal)session.merge(angularPortal);
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

		entityCache.putResult(AngularPortalModelImpl.ENTITY_CACHE_ENABLED,
			AngularPortalImpl.class, angularPortal.getPrimaryKey(),
			angularPortal, false);

		angularPortal.resetOriginalValues();

		return angularPortal;
	}

	protected AngularPortal toUnwrappedModel(AngularPortal angularPortal) {
		if (angularPortal instanceof AngularPortalImpl) {
			return angularPortal;
		}

		AngularPortalImpl angularPortalImpl = new AngularPortalImpl();

		angularPortalImpl.setNew(angularPortal.isNew());
		angularPortalImpl.setPrimaryKey(angularPortal.getPrimaryKey());

		angularPortalImpl.setPortalId(angularPortal.getPortalId());

		return angularPortalImpl;
	}

	/**
	 * Returns the Portal with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the Portal
	 * @return the Portal
	 * @throws NoSuchAngularPortalException if a Portal with the primary key could not be found
	 */
	@Override
	public AngularPortal findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAngularPortalException {
		AngularPortal angularPortal = fetchByPrimaryKey(primaryKey);

		if (angularPortal == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAngularPortalException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return angularPortal;
	}

	/**
	 * Returns the Portal with the primary key or throws a {@link NoSuchAngularPortalException} if it could not be found.
	 *
	 * @param portalId the primary key of the Portal
	 * @return the Portal
	 * @throws NoSuchAngularPortalException if a Portal with the primary key could not be found
	 */
	@Override
	public AngularPortal findByPrimaryKey(long portalId)
		throws NoSuchAngularPortalException {
		return findByPrimaryKey((Serializable)portalId);
	}

	/**
	 * Returns the Portal with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the Portal
	 * @return the Portal, or <code>null</code> if a Portal with the primary key could not be found
	 */
	@Override
	public AngularPortal fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AngularPortalModelImpl.ENTITY_CACHE_ENABLED,
				AngularPortalImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AngularPortal angularPortal = (AngularPortal)serializable;

		if (angularPortal == null) {
			Session session = null;

			try {
				session = openSession();

				angularPortal = (AngularPortal)session.get(AngularPortalImpl.class,
						primaryKey);

				if (angularPortal != null) {
					cacheResult(angularPortal);
				}
				else {
					entityCache.putResult(AngularPortalModelImpl.ENTITY_CACHE_ENABLED,
						AngularPortalImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AngularPortalModelImpl.ENTITY_CACHE_ENABLED,
					AngularPortalImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return angularPortal;
	}

	/**
	 * Returns the Portal with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param portalId the primary key of the Portal
	 * @return the Portal, or <code>null</code> if a Portal with the primary key could not be found
	 */
	@Override
	public AngularPortal fetchByPrimaryKey(long portalId) {
		return fetchByPrimaryKey((Serializable)portalId);
	}

	@Override
	public Map<Serializable, AngularPortal> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AngularPortal> map = new HashMap<Serializable, AngularPortal>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AngularPortal angularPortal = fetchByPrimaryKey(primaryKey);

			if (angularPortal != null) {
				map.put(primaryKey, angularPortal);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AngularPortalModelImpl.ENTITY_CACHE_ENABLED,
					AngularPortalImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AngularPortal)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ANGULARPORTAL_WHERE_PKS_IN);

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

			for (AngularPortal angularPortal : (List<AngularPortal>)q.list()) {
				map.put(angularPortal.getPrimaryKeyObj(), angularPortal);

				cacheResult(angularPortal);

				uncachedPrimaryKeys.remove(angularPortal.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AngularPortalModelImpl.ENTITY_CACHE_ENABLED,
					AngularPortalImpl.class, primaryKey, nullModel);
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
	 * Returns all the Portals.
	 *
	 * @return the Portals
	 */
	@Override
	public List<AngularPortal> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Portals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularPortalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Portals
	 * @param end the upper bound of the range of Portals (not inclusive)
	 * @return the range of Portals
	 */
	@Override
	public List<AngularPortal> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the Portals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularPortalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Portals
	 * @param end the upper bound of the range of Portals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of Portals
	 */
	@Override
	public List<AngularPortal> findAll(int start, int end,
		OrderByComparator<AngularPortal> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the Portals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularPortalModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Portals
	 * @param end the upper bound of the range of Portals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of Portals
	 */
	@Override
	public List<AngularPortal> findAll(int start, int end,
		OrderByComparator<AngularPortal> orderByComparator,
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

		List<AngularPortal> list = null;

		if (retrieveFromCache) {
			list = (List<AngularPortal>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ANGULARPORTAL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ANGULARPORTAL;

				if (pagination) {
					sql = sql.concat(AngularPortalModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AngularPortal>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AngularPortal>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the Portals from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AngularPortal angularPortal : findAll()) {
			remove(angularPortal);
		}
	}

	/**
	 * Returns the number of Portals.
	 *
	 * @return the number of Portals
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ANGULARPORTAL);

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
		return AngularPortalModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the Portal persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AngularPortalImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ANGULARPORTAL = "SELECT angularPortal FROM AngularPortal angularPortal";
	private static final String _SQL_SELECT_ANGULARPORTAL_WHERE_PKS_IN = "SELECT angularPortal FROM AngularPortal angularPortal WHERE portalId IN (";
	private static final String _SQL_COUNT_ANGULARPORTAL = "SELECT COUNT(angularPortal) FROM AngularPortal angularPortal";
	private static final String _ORDER_BY_ENTITY_ALIAS = "angularPortal.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AngularPortal exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(AngularPortalPersistenceImpl.class);
}