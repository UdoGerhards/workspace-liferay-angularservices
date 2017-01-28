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
import eu.gerhards.liferay.services.angular.exception.NoSuchAngularLayoutSetException;
import eu.gerhards.liferay.services.angular.model.AngularLayoutSet;
import eu.gerhards.liferay.services.angular.model.impl.AngularLayoutSetImpl;
import eu.gerhards.liferay.services.angular.model.impl.AngularLayoutSetModelImpl;
import eu.gerhards.liferay.services.angular.service.persistence.AngularLayoutSetPersistence;

import java.io.Serializable;
import java.util.*;

/**
 * The persistence implementation for the LayoutSet service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularLayoutSetPersistence
 * @see eu.gerhards.liferay.services.angular.service.persistence.AngularLayoutSetUtil
 * @generated
 */
@ProviderType
public class AngularLayoutSetPersistenceImpl extends BasePersistenceImpl<AngularLayoutSet>
	implements AngularLayoutSetPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AngularLayoutSetUtil} to access the LayoutSet persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AngularLayoutSetImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AngularLayoutSetModelImpl.ENTITY_CACHE_ENABLED,
			AngularLayoutSetModelImpl.FINDER_CACHE_ENABLED,
			AngularLayoutSetImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AngularLayoutSetModelImpl.ENTITY_CACHE_ENABLED,
			AngularLayoutSetModelImpl.FINDER_CACHE_ENABLED,
			AngularLayoutSetImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AngularLayoutSetModelImpl.ENTITY_CACHE_ENABLED,
			AngularLayoutSetModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public AngularLayoutSetPersistenceImpl() {
		setModelClass(AngularLayoutSet.class);
	}

	/**
	 * Caches the LayoutSet in the entity cache if it is enabled.
	 *
	 * @param angularLayoutSet the LayoutSet
	 */
	@Override
	public void cacheResult(AngularLayoutSet angularLayoutSet) {
		entityCache.putResult(AngularLayoutSetModelImpl.ENTITY_CACHE_ENABLED,
			AngularLayoutSetImpl.class, angularLayoutSet.getPrimaryKey(),
			angularLayoutSet);

		angularLayoutSet.resetOriginalValues();
	}

	/**
	 * Caches the LayoutSets in the entity cache if it is enabled.
	 *
	 * @param angularLayoutSets the LayoutSets
	 */
	@Override
	public void cacheResult(List<AngularLayoutSet> angularLayoutSets) {
		for (AngularLayoutSet angularLayoutSet : angularLayoutSets) {
			if (entityCache.getResult(
						AngularLayoutSetModelImpl.ENTITY_CACHE_ENABLED,
						AngularLayoutSetImpl.class,
						angularLayoutSet.getPrimaryKey()) == null) {
				cacheResult(angularLayoutSet);
			}
			else {
				angularLayoutSet.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all LayoutSets.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AngularLayoutSetImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the LayoutSet.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AngularLayoutSet angularLayoutSet) {
		entityCache.removeResult(AngularLayoutSetModelImpl.ENTITY_CACHE_ENABLED,
			AngularLayoutSetImpl.class, angularLayoutSet.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AngularLayoutSet> angularLayoutSets) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AngularLayoutSet angularLayoutSet : angularLayoutSets) {
			entityCache.removeResult(AngularLayoutSetModelImpl.ENTITY_CACHE_ENABLED,
				AngularLayoutSetImpl.class, angularLayoutSet.getPrimaryKey());
		}
	}

	/**
	 * Creates a new LayoutSet with the primary key. Does not add the LayoutSet to the database.
	 *
	 * @param layoutSetId the primary key for the new LayoutSet
	 * @return the new LayoutSet
	 */
	@Override
	public AngularLayoutSet create(long layoutSetId) {
		AngularLayoutSet angularLayoutSet = new AngularLayoutSetImpl();

		angularLayoutSet.setNew(true);
		angularLayoutSet.setPrimaryKey(layoutSetId);

		return angularLayoutSet;
	}

	/**
	 * Removes the LayoutSet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param layoutSetId the primary key of the LayoutSet
	 * @return the LayoutSet that was removed
	 * @throws NoSuchAngularLayoutSetException if a LayoutSet with the primary key could not be found
	 */
	@Override
	public AngularLayoutSet remove(long layoutSetId)
		throws NoSuchAngularLayoutSetException {
		return remove((Serializable)layoutSetId);
	}

	/**
	 * Removes the LayoutSet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the LayoutSet
	 * @return the LayoutSet that was removed
	 * @throws NoSuchAngularLayoutSetException if a LayoutSet with the primary key could not be found
	 */
	@Override
	public AngularLayoutSet remove(Serializable primaryKey)
		throws NoSuchAngularLayoutSetException {
		Session session = null;

		try {
			session = openSession();

			AngularLayoutSet angularLayoutSet = (AngularLayoutSet)session.get(AngularLayoutSetImpl.class,
					primaryKey);

			if (angularLayoutSet == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAngularLayoutSetException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(angularLayoutSet);
		}
		catch (NoSuchAngularLayoutSetException nsee) {
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
	protected AngularLayoutSet removeImpl(AngularLayoutSet angularLayoutSet) {
		angularLayoutSet = toUnwrappedModel(angularLayoutSet);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(angularLayoutSet)) {
				angularLayoutSet = (AngularLayoutSet)session.get(AngularLayoutSetImpl.class,
						angularLayoutSet.getPrimaryKeyObj());
			}

			if (angularLayoutSet != null) {
				session.delete(angularLayoutSet);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (angularLayoutSet != null) {
			clearCache(angularLayoutSet);
		}

		return angularLayoutSet;
	}

	@Override
	public AngularLayoutSet updateImpl(AngularLayoutSet angularLayoutSet) {
		angularLayoutSet = toUnwrappedModel(angularLayoutSet);

		boolean isNew = angularLayoutSet.isNew();

		Session session = null;

		try {
			session = openSession();

			if (angularLayoutSet.isNew()) {
				session.save(angularLayoutSet);

				angularLayoutSet.setNew(false);
			}
			else {
				angularLayoutSet = (AngularLayoutSet)session.merge(angularLayoutSet);
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

		entityCache.putResult(AngularLayoutSetModelImpl.ENTITY_CACHE_ENABLED,
			AngularLayoutSetImpl.class, angularLayoutSet.getPrimaryKey(),
			angularLayoutSet, false);

		angularLayoutSet.resetOriginalValues();

		return angularLayoutSet;
	}

	protected AngularLayoutSet toUnwrappedModel(
		AngularLayoutSet angularLayoutSet) {
		if (angularLayoutSet instanceof AngularLayoutSetImpl) {
			return angularLayoutSet;
		}

		AngularLayoutSetImpl angularLayoutSetImpl = new AngularLayoutSetImpl();

		angularLayoutSetImpl.setNew(angularLayoutSet.isNew());
		angularLayoutSetImpl.setPrimaryKey(angularLayoutSet.getPrimaryKey());

		angularLayoutSetImpl.setLayoutSetId(angularLayoutSet.getLayoutSetId());

		return angularLayoutSetImpl;
	}

	/**
	 * Returns the LayoutSet with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the LayoutSet
	 * @return the LayoutSet
	 * @throws NoSuchAngularLayoutSetException if a LayoutSet with the primary key could not be found
	 */
	@Override
	public AngularLayoutSet findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAngularLayoutSetException {
		AngularLayoutSet angularLayoutSet = fetchByPrimaryKey(primaryKey);

		if (angularLayoutSet == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAngularLayoutSetException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return angularLayoutSet;
	}

	/**
	 * Returns the LayoutSet with the primary key or throws a {@link NoSuchAngularLayoutSetException} if it could not be found.
	 *
	 * @param layoutSetId the primary key of the LayoutSet
	 * @return the LayoutSet
	 * @throws NoSuchAngularLayoutSetException if a LayoutSet with the primary key could not be found
	 */
	@Override
	public AngularLayoutSet findByPrimaryKey(long layoutSetId)
		throws NoSuchAngularLayoutSetException {
		return findByPrimaryKey((Serializable)layoutSetId);
	}

	/**
	 * Returns the LayoutSet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the LayoutSet
	 * @return the LayoutSet, or <code>null</code> if a LayoutSet with the primary key could not be found
	 */
	@Override
	public AngularLayoutSet fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AngularLayoutSetModelImpl.ENTITY_CACHE_ENABLED,
				AngularLayoutSetImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AngularLayoutSet angularLayoutSet = (AngularLayoutSet)serializable;

		if (angularLayoutSet == null) {
			Session session = null;

			try {
				session = openSession();

				angularLayoutSet = (AngularLayoutSet)session.get(AngularLayoutSetImpl.class,
						primaryKey);

				if (angularLayoutSet != null) {
					cacheResult(angularLayoutSet);
				}
				else {
					entityCache.putResult(AngularLayoutSetModelImpl.ENTITY_CACHE_ENABLED,
						AngularLayoutSetImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AngularLayoutSetModelImpl.ENTITY_CACHE_ENABLED,
					AngularLayoutSetImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return angularLayoutSet;
	}

	/**
	 * Returns the LayoutSet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param layoutSetId the primary key of the LayoutSet
	 * @return the LayoutSet, or <code>null</code> if a LayoutSet with the primary key could not be found
	 */
	@Override
	public AngularLayoutSet fetchByPrimaryKey(long layoutSetId) {
		return fetchByPrimaryKey((Serializable)layoutSetId);
	}

	@Override
	public Map<Serializable, AngularLayoutSet> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AngularLayoutSet> map = new HashMap<Serializable, AngularLayoutSet>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AngularLayoutSet angularLayoutSet = fetchByPrimaryKey(primaryKey);

			if (angularLayoutSet != null) {
				map.put(primaryKey, angularLayoutSet);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AngularLayoutSetModelImpl.ENTITY_CACHE_ENABLED,
					AngularLayoutSetImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AngularLayoutSet)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ANGULARLAYOUTSET_WHERE_PKS_IN);

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

			for (AngularLayoutSet angularLayoutSet : (List<AngularLayoutSet>)q.list()) {
				map.put(angularLayoutSet.getPrimaryKeyObj(), angularLayoutSet);

				cacheResult(angularLayoutSet);

				uncachedPrimaryKeys.remove(angularLayoutSet.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AngularLayoutSetModelImpl.ENTITY_CACHE_ENABLED,
					AngularLayoutSetImpl.class, primaryKey, nullModel);
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
	 * Returns all the LayoutSets.
	 *
	 * @return the LayoutSets
	 */
	@Override
	public List<AngularLayoutSet> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the LayoutSets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularLayoutSetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of LayoutSets
	 * @param end the upper bound of the range of LayoutSets (not inclusive)
	 * @return the range of LayoutSets
	 */
	@Override
	public List<AngularLayoutSet> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the LayoutSets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularLayoutSetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of LayoutSets
	 * @param end the upper bound of the range of LayoutSets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of LayoutSets
	 */
	@Override
	public List<AngularLayoutSet> findAll(int start, int end,
		OrderByComparator<AngularLayoutSet> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the LayoutSets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularLayoutSetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of LayoutSets
	 * @param end the upper bound of the range of LayoutSets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of LayoutSets
	 */
	@Override
	public List<AngularLayoutSet> findAll(int start, int end,
		OrderByComparator<AngularLayoutSet> orderByComparator,
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

		List<AngularLayoutSet> list = null;

		if (retrieveFromCache) {
			list = (List<AngularLayoutSet>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ANGULARLAYOUTSET);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ANGULARLAYOUTSET;

				if (pagination) {
					sql = sql.concat(AngularLayoutSetModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AngularLayoutSet>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AngularLayoutSet>)QueryUtil.list(q,
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
	 * Removes all the LayoutSets from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AngularLayoutSet angularLayoutSet : findAll()) {
			remove(angularLayoutSet);
		}
	}

	/**
	 * Returns the number of LayoutSets.
	 *
	 * @return the number of LayoutSets
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ANGULARLAYOUTSET);

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
		return AngularLayoutSetModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the LayoutSet persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AngularLayoutSetImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ANGULARLAYOUTSET = "SELECT angularLayoutSet FROM AngularLayoutSet angularLayoutSet";
	private static final String _SQL_SELECT_ANGULARLAYOUTSET_WHERE_PKS_IN = "SELECT angularLayoutSet FROM AngularLayoutSet angularLayoutSet WHERE layoutSetId IN (";
	private static final String _SQL_COUNT_ANGULARLAYOUTSET = "SELECT COUNT(angularLayoutSet) FROM AngularLayoutSet angularLayoutSet";
	private static final String _ORDER_BY_ENTITY_ALIAS = "angularLayoutSet.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AngularLayoutSet exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(AngularLayoutSetPersistenceImpl.class);
}