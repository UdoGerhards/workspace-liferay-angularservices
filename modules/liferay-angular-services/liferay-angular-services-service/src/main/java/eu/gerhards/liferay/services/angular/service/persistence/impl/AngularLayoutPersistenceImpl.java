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

import eu.gerhards.liferay.services.angular.exception.NoSuchAngularLayoutException;
import eu.gerhards.liferay.services.angular.model.AngularLayout;
import eu.gerhards.liferay.services.angular.model.impl.AngularLayoutImpl;
import eu.gerhards.liferay.services.angular.model.impl.AngularLayoutModelImpl;
import eu.gerhards.liferay.services.angular.service.persistence.AngularLayoutPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the Layout service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularLayoutPersistence
 * @see eu.gerhards.liferay.services.angular.service.persistence.AngularLayoutUtil
 * @generated
 */
@ProviderType
public class AngularLayoutPersistenceImpl extends BasePersistenceImpl<AngularLayout>
	implements AngularLayoutPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AngularLayoutUtil} to access the Layout persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AngularLayoutImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AngularLayoutModelImpl.ENTITY_CACHE_ENABLED,
			AngularLayoutModelImpl.FINDER_CACHE_ENABLED,
			AngularLayoutImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AngularLayoutModelImpl.ENTITY_CACHE_ENABLED,
			AngularLayoutModelImpl.FINDER_CACHE_ENABLED,
			AngularLayoutImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AngularLayoutModelImpl.ENTITY_CACHE_ENABLED,
			AngularLayoutModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public AngularLayoutPersistenceImpl() {
		setModelClass(AngularLayout.class);
	}

	/**
	 * Caches the Layout in the entity cache if it is enabled.
	 *
	 * @param angularLayout the Layout
	 */
	@Override
	public void cacheResult(AngularLayout angularLayout) {
		entityCache.putResult(AngularLayoutModelImpl.ENTITY_CACHE_ENABLED,
			AngularLayoutImpl.class, angularLayout.getPrimaryKey(),
			angularLayout);

		angularLayout.resetOriginalValues();
	}

	/**
	 * Caches the Layouts in the entity cache if it is enabled.
	 *
	 * @param angularLayouts the Layouts
	 */
	@Override
	public void cacheResult(List<AngularLayout> angularLayouts) {
		for (AngularLayout angularLayout : angularLayouts) {
			if (entityCache.getResult(
						AngularLayoutModelImpl.ENTITY_CACHE_ENABLED,
						AngularLayoutImpl.class, angularLayout.getPrimaryKey()) == null) {
				cacheResult(angularLayout);
			}
			else {
				angularLayout.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all Layouts.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AngularLayoutImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the Layout.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AngularLayout angularLayout) {
		entityCache.removeResult(AngularLayoutModelImpl.ENTITY_CACHE_ENABLED,
			AngularLayoutImpl.class, angularLayout.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AngularLayout> angularLayouts) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AngularLayout angularLayout : angularLayouts) {
			entityCache.removeResult(AngularLayoutModelImpl.ENTITY_CACHE_ENABLED,
				AngularLayoutImpl.class, angularLayout.getPrimaryKey());
		}
	}

	/**
	 * Creates a new Layout with the primary key. Does not add the Layout to the database.
	 *
	 * @param layoutId the primary key for the new Layout
	 * @return the new Layout
	 */
	@Override
	public AngularLayout create(long layoutId) {
		AngularLayout angularLayout = new AngularLayoutImpl();

		angularLayout.setNew(true);
		angularLayout.setPrimaryKey(layoutId);

		return angularLayout;
	}

	/**
	 * Removes the Layout with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param layoutId the primary key of the Layout
	 * @return the Layout that was removed
	 * @throws NoSuchAngularLayoutException if a Layout with the primary key could not be found
	 */
	@Override
	public AngularLayout remove(long layoutId)
		throws NoSuchAngularLayoutException {
		return remove((Serializable)layoutId);
	}

	/**
	 * Removes the Layout with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the Layout
	 * @return the Layout that was removed
	 * @throws NoSuchAngularLayoutException if a Layout with the primary key could not be found
	 */
	@Override
	public AngularLayout remove(Serializable primaryKey)
		throws NoSuchAngularLayoutException {
		Session session = null;

		try {
			session = openSession();

			AngularLayout angularLayout = (AngularLayout)session.get(AngularLayoutImpl.class,
					primaryKey);

			if (angularLayout == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAngularLayoutException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(angularLayout);
		}
		catch (NoSuchAngularLayoutException nsee) {
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
	protected AngularLayout removeImpl(AngularLayout angularLayout) {
		angularLayout = toUnwrappedModel(angularLayout);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(angularLayout)) {
				angularLayout = (AngularLayout)session.get(AngularLayoutImpl.class,
						angularLayout.getPrimaryKeyObj());
			}

			if (angularLayout != null) {
				session.delete(angularLayout);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (angularLayout != null) {
			clearCache(angularLayout);
		}

		return angularLayout;
	}

	@Override
	public AngularLayout updateImpl(AngularLayout angularLayout) {
		angularLayout = toUnwrappedModel(angularLayout);

		boolean isNew = angularLayout.isNew();

		Session session = null;

		try {
			session = openSession();

			if (angularLayout.isNew()) {
				session.save(angularLayout);

				angularLayout.setNew(false);
			}
			else {
				angularLayout = (AngularLayout)session.merge(angularLayout);
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

		entityCache.putResult(AngularLayoutModelImpl.ENTITY_CACHE_ENABLED,
			AngularLayoutImpl.class, angularLayout.getPrimaryKey(),
			angularLayout, false);

		angularLayout.resetOriginalValues();

		return angularLayout;
	}

	protected AngularLayout toUnwrappedModel(AngularLayout angularLayout) {
		if (angularLayout instanceof AngularLayoutImpl) {
			return angularLayout;
		}

		AngularLayoutImpl angularLayoutImpl = new AngularLayoutImpl();

		angularLayoutImpl.setNew(angularLayout.isNew());
		angularLayoutImpl.setPrimaryKey(angularLayout.getPrimaryKey());

		angularLayoutImpl.setLayoutId(angularLayout.getLayoutId());

		return angularLayoutImpl;
	}

	/**
	 * Returns the Layout with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the Layout
	 * @return the Layout
	 * @throws NoSuchAngularLayoutException if a Layout with the primary key could not be found
	 */
	@Override
	public AngularLayout findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAngularLayoutException {
		AngularLayout angularLayout = fetchByPrimaryKey(primaryKey);

		if (angularLayout == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAngularLayoutException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return angularLayout;
	}

	/**
	 * Returns the Layout with the primary key or throws a {@link NoSuchAngularLayoutException} if it could not be found.
	 *
	 * @param layoutId the primary key of the Layout
	 * @return the Layout
	 * @throws NoSuchAngularLayoutException if a Layout with the primary key could not be found
	 */
	@Override
	public AngularLayout findByPrimaryKey(long layoutId)
		throws NoSuchAngularLayoutException {
		return findByPrimaryKey((Serializable)layoutId);
	}

	/**
	 * Returns the Layout with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the Layout
	 * @return the Layout, or <code>null</code> if a Layout with the primary key could not be found
	 */
	@Override
	public AngularLayout fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AngularLayoutModelImpl.ENTITY_CACHE_ENABLED,
				AngularLayoutImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AngularLayout angularLayout = (AngularLayout)serializable;

		if (angularLayout == null) {
			Session session = null;

			try {
				session = openSession();

				angularLayout = (AngularLayout)session.get(AngularLayoutImpl.class,
						primaryKey);

				if (angularLayout != null) {
					cacheResult(angularLayout);
				}
				else {
					entityCache.putResult(AngularLayoutModelImpl.ENTITY_CACHE_ENABLED,
						AngularLayoutImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AngularLayoutModelImpl.ENTITY_CACHE_ENABLED,
					AngularLayoutImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return angularLayout;
	}

	/**
	 * Returns the Layout with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param layoutId the primary key of the Layout
	 * @return the Layout, or <code>null</code> if a Layout with the primary key could not be found
	 */
	@Override
	public AngularLayout fetchByPrimaryKey(long layoutId) {
		return fetchByPrimaryKey((Serializable)layoutId);
	}

	@Override
	public Map<Serializable, AngularLayout> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AngularLayout> map = new HashMap<Serializable, AngularLayout>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AngularLayout angularLayout = fetchByPrimaryKey(primaryKey);

			if (angularLayout != null) {
				map.put(primaryKey, angularLayout);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AngularLayoutModelImpl.ENTITY_CACHE_ENABLED,
					AngularLayoutImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AngularLayout)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ANGULARLAYOUT_WHERE_PKS_IN);

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

			for (AngularLayout angularLayout : (List<AngularLayout>)q.list()) {
				map.put(angularLayout.getPrimaryKeyObj(), angularLayout);

				cacheResult(angularLayout);

				uncachedPrimaryKeys.remove(angularLayout.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AngularLayoutModelImpl.ENTITY_CACHE_ENABLED,
					AngularLayoutImpl.class, primaryKey, nullModel);
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
	 * Returns all the Layouts.
	 *
	 * @return the Layouts
	 */
	@Override
	public List<AngularLayout> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Layouts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularLayoutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Layouts
	 * @param end the upper bound of the range of Layouts (not inclusive)
	 * @return the range of Layouts
	 */
	@Override
	public List<AngularLayout> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the Layouts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularLayoutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Layouts
	 * @param end the upper bound of the range of Layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of Layouts
	 */
	@Override
	public List<AngularLayout> findAll(int start, int end,
		OrderByComparator<AngularLayout> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the Layouts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularLayoutModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Layouts
	 * @param end the upper bound of the range of Layouts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of Layouts
	 */
	@Override
	public List<AngularLayout> findAll(int start, int end,
		OrderByComparator<AngularLayout> orderByComparator,
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

		List<AngularLayout> list = null;

		if (retrieveFromCache) {
			list = (List<AngularLayout>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ANGULARLAYOUT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ANGULARLAYOUT;

				if (pagination) {
					sql = sql.concat(AngularLayoutModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AngularLayout>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AngularLayout>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the Layouts from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AngularLayout angularLayout : findAll()) {
			remove(angularLayout);
		}
	}

	/**
	 * Returns the number of Layouts.
	 *
	 * @return the number of Layouts
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ANGULARLAYOUT);

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
		return AngularLayoutModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the Layout persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AngularLayoutImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ANGULARLAYOUT = "SELECT angularLayout FROM AngularLayout angularLayout";
	private static final String _SQL_SELECT_ANGULARLAYOUT_WHERE_PKS_IN = "SELECT angularLayout FROM AngularLayout angularLayout WHERE layoutId IN (";
	private static final String _SQL_COUNT_ANGULARLAYOUT = "SELECT COUNT(angularLayout) FROM AngularLayout angularLayout";
	private static final String _ORDER_BY_ENTITY_ALIAS = "angularLayout.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AngularLayout exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(AngularLayoutPersistenceImpl.class);
}