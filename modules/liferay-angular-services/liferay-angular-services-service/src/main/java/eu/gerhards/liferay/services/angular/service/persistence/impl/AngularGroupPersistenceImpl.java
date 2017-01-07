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

import eu.gerhards.liferay.services.angular.exception.NoSuchAngularGroupException;
import eu.gerhards.liferay.services.angular.model.AngularGroup;
import eu.gerhards.liferay.services.angular.model.impl.AngularGroupImpl;
import eu.gerhards.liferay.services.angular.model.impl.AngularGroupModelImpl;
import eu.gerhards.liferay.services.angular.service.persistence.AngularGroupPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the Group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularGroupPersistence
 * @see eu.gerhards.liferay.services.angular.service.persistence.AngularGroupUtil
 * @generated
 */
@ProviderType
public class AngularGroupPersistenceImpl extends BasePersistenceImpl<AngularGroup>
	implements AngularGroupPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AngularGroupUtil} to access the Group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AngularGroupImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AngularGroupModelImpl.ENTITY_CACHE_ENABLED,
			AngularGroupModelImpl.FINDER_CACHE_ENABLED, AngularGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AngularGroupModelImpl.ENTITY_CACHE_ENABLED,
			AngularGroupModelImpl.FINDER_CACHE_ENABLED, AngularGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AngularGroupModelImpl.ENTITY_CACHE_ENABLED,
			AngularGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public AngularGroupPersistenceImpl() {
		setModelClass(AngularGroup.class);
	}

	/**
	 * Caches the Group in the entity cache if it is enabled.
	 *
	 * @param angularGroup the Group
	 */
	@Override
	public void cacheResult(AngularGroup angularGroup) {
		entityCache.putResult(AngularGroupModelImpl.ENTITY_CACHE_ENABLED,
			AngularGroupImpl.class, angularGroup.getPrimaryKey(), angularGroup);

		angularGroup.resetOriginalValues();
	}

	/**
	 * Caches the Groups in the entity cache if it is enabled.
	 *
	 * @param angularGroups the Groups
	 */
	@Override
	public void cacheResult(List<AngularGroup> angularGroups) {
		for (AngularGroup angularGroup : angularGroups) {
			if (entityCache.getResult(
						AngularGroupModelImpl.ENTITY_CACHE_ENABLED,
						AngularGroupImpl.class, angularGroup.getPrimaryKey()) == null) {
				cacheResult(angularGroup);
			}
			else {
				angularGroup.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all Groups.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AngularGroupImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the Group.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AngularGroup angularGroup) {
		entityCache.removeResult(AngularGroupModelImpl.ENTITY_CACHE_ENABLED,
			AngularGroupImpl.class, angularGroup.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AngularGroup> angularGroups) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AngularGroup angularGroup : angularGroups) {
			entityCache.removeResult(AngularGroupModelImpl.ENTITY_CACHE_ENABLED,
				AngularGroupImpl.class, angularGroup.getPrimaryKey());
		}
	}

	/**
	 * Creates a new Group with the primary key. Does not add the Group to the database.
	 *
	 * @param groupId the primary key for the new Group
	 * @return the new Group
	 */
	@Override
	public AngularGroup create(long groupId) {
		AngularGroup angularGroup = new AngularGroupImpl();

		angularGroup.setNew(true);
		angularGroup.setPrimaryKey(groupId);

		return angularGroup;
	}

	/**
	 * Removes the Group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param groupId the primary key of the Group
	 * @return the Group that was removed
	 * @throws NoSuchAngularGroupException if a Group with the primary key could not be found
	 */
	@Override
	public AngularGroup remove(long groupId) throws NoSuchAngularGroupException {
		return remove((Serializable)groupId);
	}

	/**
	 * Removes the Group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the Group
	 * @return the Group that was removed
	 * @throws NoSuchAngularGroupException if a Group with the primary key could not be found
	 */
	@Override
	public AngularGroup remove(Serializable primaryKey)
		throws NoSuchAngularGroupException {
		Session session = null;

		try {
			session = openSession();

			AngularGroup angularGroup = (AngularGroup)session.get(AngularGroupImpl.class,
					primaryKey);

			if (angularGroup == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAngularGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(angularGroup);
		}
		catch (NoSuchAngularGroupException nsee) {
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
	protected AngularGroup removeImpl(AngularGroup angularGroup) {
		angularGroup = toUnwrappedModel(angularGroup);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(angularGroup)) {
				angularGroup = (AngularGroup)session.get(AngularGroupImpl.class,
						angularGroup.getPrimaryKeyObj());
			}

			if (angularGroup != null) {
				session.delete(angularGroup);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (angularGroup != null) {
			clearCache(angularGroup);
		}

		return angularGroup;
	}

	@Override
	public AngularGroup updateImpl(AngularGroup angularGroup) {
		angularGroup = toUnwrappedModel(angularGroup);

		boolean isNew = angularGroup.isNew();

		Session session = null;

		try {
			session = openSession();

			if (angularGroup.isNew()) {
				session.save(angularGroup);

				angularGroup.setNew(false);
			}
			else {
				angularGroup = (AngularGroup)session.merge(angularGroup);
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

		entityCache.putResult(AngularGroupModelImpl.ENTITY_CACHE_ENABLED,
			AngularGroupImpl.class, angularGroup.getPrimaryKey(), angularGroup,
			false);

		angularGroup.resetOriginalValues();

		return angularGroup;
	}

	protected AngularGroup toUnwrappedModel(AngularGroup angularGroup) {
		if (angularGroup instanceof AngularGroupImpl) {
			return angularGroup;
		}

		AngularGroupImpl angularGroupImpl = new AngularGroupImpl();

		angularGroupImpl.setNew(angularGroup.isNew());
		angularGroupImpl.setPrimaryKey(angularGroup.getPrimaryKey());

		angularGroupImpl.setGroupId(angularGroup.getGroupId());

		return angularGroupImpl;
	}

	/**
	 * Returns the Group with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the Group
	 * @return the Group
	 * @throws NoSuchAngularGroupException if a Group with the primary key could not be found
	 */
	@Override
	public AngularGroup findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAngularGroupException {
		AngularGroup angularGroup = fetchByPrimaryKey(primaryKey);

		if (angularGroup == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAngularGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return angularGroup;
	}

	/**
	 * Returns the Group with the primary key or throws a {@link NoSuchAngularGroupException} if it could not be found.
	 *
	 * @param groupId the primary key of the Group
	 * @return the Group
	 * @throws NoSuchAngularGroupException if a Group with the primary key could not be found
	 */
	@Override
	public AngularGroup findByPrimaryKey(long groupId)
		throws NoSuchAngularGroupException {
		return findByPrimaryKey((Serializable)groupId);
	}

	/**
	 * Returns the Group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the Group
	 * @return the Group, or <code>null</code> if a Group with the primary key could not be found
	 */
	@Override
	public AngularGroup fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AngularGroupModelImpl.ENTITY_CACHE_ENABLED,
				AngularGroupImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AngularGroup angularGroup = (AngularGroup)serializable;

		if (angularGroup == null) {
			Session session = null;

			try {
				session = openSession();

				angularGroup = (AngularGroup)session.get(AngularGroupImpl.class,
						primaryKey);

				if (angularGroup != null) {
					cacheResult(angularGroup);
				}
				else {
					entityCache.putResult(AngularGroupModelImpl.ENTITY_CACHE_ENABLED,
						AngularGroupImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AngularGroupModelImpl.ENTITY_CACHE_ENABLED,
					AngularGroupImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return angularGroup;
	}

	/**
	 * Returns the Group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param groupId the primary key of the Group
	 * @return the Group, or <code>null</code> if a Group with the primary key could not be found
	 */
	@Override
	public AngularGroup fetchByPrimaryKey(long groupId) {
		return fetchByPrimaryKey((Serializable)groupId);
	}

	@Override
	public Map<Serializable, AngularGroup> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AngularGroup> map = new HashMap<Serializable, AngularGroup>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AngularGroup angularGroup = fetchByPrimaryKey(primaryKey);

			if (angularGroup != null) {
				map.put(primaryKey, angularGroup);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AngularGroupModelImpl.ENTITY_CACHE_ENABLED,
					AngularGroupImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AngularGroup)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ANGULARGROUP_WHERE_PKS_IN);

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

			for (AngularGroup angularGroup : (List<AngularGroup>)q.list()) {
				map.put(angularGroup.getPrimaryKeyObj(), angularGroup);

				cacheResult(angularGroup);

				uncachedPrimaryKeys.remove(angularGroup.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AngularGroupModelImpl.ENTITY_CACHE_ENABLED,
					AngularGroupImpl.class, primaryKey, nullModel);
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
	 * Returns all the Groups.
	 *
	 * @return the Groups
	 */
	@Override
	public List<AngularGroup> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Groups
	 * @param end the upper bound of the range of Groups (not inclusive)
	 * @return the range of Groups
	 */
	@Override
	public List<AngularGroup> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the Groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Groups
	 * @param end the upper bound of the range of Groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of Groups
	 */
	@Override
	public List<AngularGroup> findAll(int start, int end,
		OrderByComparator<AngularGroup> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the Groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Groups
	 * @param end the upper bound of the range of Groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of Groups
	 */
	@Override
	public List<AngularGroup> findAll(int start, int end,
		OrderByComparator<AngularGroup> orderByComparator,
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

		List<AngularGroup> list = null;

		if (retrieveFromCache) {
			list = (List<AngularGroup>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ANGULARGROUP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ANGULARGROUP;

				if (pagination) {
					sql = sql.concat(AngularGroupModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AngularGroup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AngularGroup>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the Groups from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AngularGroup angularGroup : findAll()) {
			remove(angularGroup);
		}
	}

	/**
	 * Returns the number of Groups.
	 *
	 * @return the number of Groups
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ANGULARGROUP);

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
		return AngularGroupModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the Group persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AngularGroupImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ANGULARGROUP = "SELECT angularGroup FROM AngularGroup angularGroup";
	private static final String _SQL_SELECT_ANGULARGROUP_WHERE_PKS_IN = "SELECT angularGroup FROM AngularGroup angularGroup WHERE groupId IN (";
	private static final String _SQL_COUNT_ANGULARGROUP = "SELECT COUNT(angularGroup) FROM AngularGroup angularGroup";
	private static final String _ORDER_BY_ENTITY_ALIAS = "angularGroup.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AngularGroup exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(AngularGroupPersistenceImpl.class);
}