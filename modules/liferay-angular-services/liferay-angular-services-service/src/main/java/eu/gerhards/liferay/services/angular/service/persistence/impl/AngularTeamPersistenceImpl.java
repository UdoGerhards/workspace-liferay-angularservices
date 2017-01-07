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

import eu.gerhards.liferay.services.angular.exception.NoSuchAngularTeamException;
import eu.gerhards.liferay.services.angular.model.AngularTeam;
import eu.gerhards.liferay.services.angular.model.impl.AngularTeamImpl;
import eu.gerhards.liferay.services.angular.model.impl.AngularTeamModelImpl;
import eu.gerhards.liferay.services.angular.service.persistence.AngularTeamPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the Team service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularTeamPersistence
 * @see eu.gerhards.liferay.services.angular.service.persistence.AngularTeamUtil
 * @generated
 */
@ProviderType
public class AngularTeamPersistenceImpl extends BasePersistenceImpl<AngularTeam>
	implements AngularTeamPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AngularTeamUtil} to access the Team persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AngularTeamImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AngularTeamModelImpl.ENTITY_CACHE_ENABLED,
			AngularTeamModelImpl.FINDER_CACHE_ENABLED, AngularTeamImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AngularTeamModelImpl.ENTITY_CACHE_ENABLED,
			AngularTeamModelImpl.FINDER_CACHE_ENABLED, AngularTeamImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AngularTeamModelImpl.ENTITY_CACHE_ENABLED,
			AngularTeamModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public AngularTeamPersistenceImpl() {
		setModelClass(AngularTeam.class);
	}

	/**
	 * Caches the Team in the entity cache if it is enabled.
	 *
	 * @param angularTeam the Team
	 */
	@Override
	public void cacheResult(AngularTeam angularTeam) {
		entityCache.putResult(AngularTeamModelImpl.ENTITY_CACHE_ENABLED,
			AngularTeamImpl.class, angularTeam.getPrimaryKey(), angularTeam);

		angularTeam.resetOriginalValues();
	}

	/**
	 * Caches the Teams in the entity cache if it is enabled.
	 *
	 * @param angularTeams the Teams
	 */
	@Override
	public void cacheResult(List<AngularTeam> angularTeams) {
		for (AngularTeam angularTeam : angularTeams) {
			if (entityCache.getResult(
						AngularTeamModelImpl.ENTITY_CACHE_ENABLED,
						AngularTeamImpl.class, angularTeam.getPrimaryKey()) == null) {
				cacheResult(angularTeam);
			}
			else {
				angularTeam.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all Teams.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AngularTeamImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the Team.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AngularTeam angularTeam) {
		entityCache.removeResult(AngularTeamModelImpl.ENTITY_CACHE_ENABLED,
			AngularTeamImpl.class, angularTeam.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AngularTeam> angularTeams) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AngularTeam angularTeam : angularTeams) {
			entityCache.removeResult(AngularTeamModelImpl.ENTITY_CACHE_ENABLED,
				AngularTeamImpl.class, angularTeam.getPrimaryKey());
		}
	}

	/**
	 * Creates a new Team with the primary key. Does not add the Team to the database.
	 *
	 * @param angularTeamId the primary key for the new Team
	 * @return the new Team
	 */
	@Override
	public AngularTeam create(long angularTeamId) {
		AngularTeam angularTeam = new AngularTeamImpl();

		angularTeam.setNew(true);
		angularTeam.setPrimaryKey(angularTeamId);

		return angularTeam;
	}

	/**
	 * Removes the Team with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param angularTeamId the primary key of the Team
	 * @return the Team that was removed
	 * @throws NoSuchAngularTeamException if a Team with the primary key could not be found
	 */
	@Override
	public AngularTeam remove(long angularTeamId)
		throws NoSuchAngularTeamException {
		return remove((Serializable)angularTeamId);
	}

	/**
	 * Removes the Team with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the Team
	 * @return the Team that was removed
	 * @throws NoSuchAngularTeamException if a Team with the primary key could not be found
	 */
	@Override
	public AngularTeam remove(Serializable primaryKey)
		throws NoSuchAngularTeamException {
		Session session = null;

		try {
			session = openSession();

			AngularTeam angularTeam = (AngularTeam)session.get(AngularTeamImpl.class,
					primaryKey);

			if (angularTeam == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAngularTeamException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(angularTeam);
		}
		catch (NoSuchAngularTeamException nsee) {
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
	protected AngularTeam removeImpl(AngularTeam angularTeam) {
		angularTeam = toUnwrappedModel(angularTeam);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(angularTeam)) {
				angularTeam = (AngularTeam)session.get(AngularTeamImpl.class,
						angularTeam.getPrimaryKeyObj());
			}

			if (angularTeam != null) {
				session.delete(angularTeam);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (angularTeam != null) {
			clearCache(angularTeam);
		}

		return angularTeam;
	}

	@Override
	public AngularTeam updateImpl(AngularTeam angularTeam) {
		angularTeam = toUnwrappedModel(angularTeam);

		boolean isNew = angularTeam.isNew();

		Session session = null;

		try {
			session = openSession();

			if (angularTeam.isNew()) {
				session.save(angularTeam);

				angularTeam.setNew(false);
			}
			else {
				angularTeam = (AngularTeam)session.merge(angularTeam);
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

		entityCache.putResult(AngularTeamModelImpl.ENTITY_CACHE_ENABLED,
			AngularTeamImpl.class, angularTeam.getPrimaryKey(), angularTeam,
			false);

		angularTeam.resetOriginalValues();

		return angularTeam;
	}

	protected AngularTeam toUnwrappedModel(AngularTeam angularTeam) {
		if (angularTeam instanceof AngularTeamImpl) {
			return angularTeam;
		}

		AngularTeamImpl angularTeamImpl = new AngularTeamImpl();

		angularTeamImpl.setNew(angularTeam.isNew());
		angularTeamImpl.setPrimaryKey(angularTeam.getPrimaryKey());

		angularTeamImpl.setAngularTeamId(angularTeam.getAngularTeamId());

		return angularTeamImpl;
	}

	/**
	 * Returns the Team with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the Team
	 * @return the Team
	 * @throws NoSuchAngularTeamException if a Team with the primary key could not be found
	 */
	@Override
	public AngularTeam findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAngularTeamException {
		AngularTeam angularTeam = fetchByPrimaryKey(primaryKey);

		if (angularTeam == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAngularTeamException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return angularTeam;
	}

	/**
	 * Returns the Team with the primary key or throws a {@link NoSuchAngularTeamException} if it could not be found.
	 *
	 * @param angularTeamId the primary key of the Team
	 * @return the Team
	 * @throws NoSuchAngularTeamException if a Team with the primary key could not be found
	 */
	@Override
	public AngularTeam findByPrimaryKey(long angularTeamId)
		throws NoSuchAngularTeamException {
		return findByPrimaryKey((Serializable)angularTeamId);
	}

	/**
	 * Returns the Team with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the Team
	 * @return the Team, or <code>null</code> if a Team with the primary key could not be found
	 */
	@Override
	public AngularTeam fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AngularTeamModelImpl.ENTITY_CACHE_ENABLED,
				AngularTeamImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AngularTeam angularTeam = (AngularTeam)serializable;

		if (angularTeam == null) {
			Session session = null;

			try {
				session = openSession();

				angularTeam = (AngularTeam)session.get(AngularTeamImpl.class,
						primaryKey);

				if (angularTeam != null) {
					cacheResult(angularTeam);
				}
				else {
					entityCache.putResult(AngularTeamModelImpl.ENTITY_CACHE_ENABLED,
						AngularTeamImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AngularTeamModelImpl.ENTITY_CACHE_ENABLED,
					AngularTeamImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return angularTeam;
	}

	/**
	 * Returns the Team with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param angularTeamId the primary key of the Team
	 * @return the Team, or <code>null</code> if a Team with the primary key could not be found
	 */
	@Override
	public AngularTeam fetchByPrimaryKey(long angularTeamId) {
		return fetchByPrimaryKey((Serializable)angularTeamId);
	}

	@Override
	public Map<Serializable, AngularTeam> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AngularTeam> map = new HashMap<Serializable, AngularTeam>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AngularTeam angularTeam = fetchByPrimaryKey(primaryKey);

			if (angularTeam != null) {
				map.put(primaryKey, angularTeam);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AngularTeamModelImpl.ENTITY_CACHE_ENABLED,
					AngularTeamImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AngularTeam)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ANGULARTEAM_WHERE_PKS_IN);

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

			for (AngularTeam angularTeam : (List<AngularTeam>)q.list()) {
				map.put(angularTeam.getPrimaryKeyObj(), angularTeam);

				cacheResult(angularTeam);

				uncachedPrimaryKeys.remove(angularTeam.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AngularTeamModelImpl.ENTITY_CACHE_ENABLED,
					AngularTeamImpl.class, primaryKey, nullModel);
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
	 * Returns all the Teams.
	 *
	 * @return the Teams
	 */
	@Override
	public List<AngularTeam> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Teams.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularTeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Teams
	 * @param end the upper bound of the range of Teams (not inclusive)
	 * @return the range of Teams
	 */
	@Override
	public List<AngularTeam> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the Teams.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularTeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Teams
	 * @param end the upper bound of the range of Teams (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of Teams
	 */
	@Override
	public List<AngularTeam> findAll(int start, int end,
		OrderByComparator<AngularTeam> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the Teams.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularTeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Teams
	 * @param end the upper bound of the range of Teams (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of Teams
	 */
	@Override
	public List<AngularTeam> findAll(int start, int end,
		OrderByComparator<AngularTeam> orderByComparator,
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

		List<AngularTeam> list = null;

		if (retrieveFromCache) {
			list = (List<AngularTeam>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ANGULARTEAM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ANGULARTEAM;

				if (pagination) {
					sql = sql.concat(AngularTeamModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AngularTeam>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AngularTeam>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the Teams from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AngularTeam angularTeam : findAll()) {
			remove(angularTeam);
		}
	}

	/**
	 * Returns the number of Teams.
	 *
	 * @return the number of Teams
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ANGULARTEAM);

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
		return AngularTeamModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the Team persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AngularTeamImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ANGULARTEAM = "SELECT angularTeam FROM AngularTeam angularTeam";
	private static final String _SQL_SELECT_ANGULARTEAM_WHERE_PKS_IN = "SELECT angularTeam FROM AngularTeam angularTeam WHERE angularTeamId IN (";
	private static final String _SQL_COUNT_ANGULARTEAM = "SELECT COUNT(angularTeam) FROM AngularTeam angularTeam";
	private static final String _ORDER_BY_ENTITY_ALIAS = "angularTeam.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AngularTeam exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(AngularTeamPersistenceImpl.class);
}