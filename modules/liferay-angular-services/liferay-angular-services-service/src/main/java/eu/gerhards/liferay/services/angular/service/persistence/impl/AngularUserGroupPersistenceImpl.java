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

import eu.gerhards.liferay.services.angular.exception.NoSuchAngularUserGroupException;
import eu.gerhards.liferay.services.angular.model.AngularUserGroup;
import eu.gerhards.liferay.services.angular.model.impl.AngularUserGroupImpl;
import eu.gerhards.liferay.services.angular.model.impl.AngularUserGroupModelImpl;
import eu.gerhards.liferay.services.angular.service.persistence.AngularUserGroupPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the User group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularUserGroupPersistence
 * @see eu.gerhards.liferay.services.angular.service.persistence.AngularUserGroupUtil
 * @generated
 */
@ProviderType
public class AngularUserGroupPersistenceImpl extends BasePersistenceImpl<AngularUserGroup>
	implements AngularUserGroupPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AngularUserGroupUtil} to access the User group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AngularUserGroupImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AngularUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			AngularUserGroupModelImpl.FINDER_CACHE_ENABLED,
			AngularUserGroupImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AngularUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			AngularUserGroupModelImpl.FINDER_CACHE_ENABLED,
			AngularUserGroupImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AngularUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			AngularUserGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public AngularUserGroupPersistenceImpl() {
		setModelClass(AngularUserGroup.class);
	}

	/**
	 * Caches the User group in the entity cache if it is enabled.
	 *
	 * @param angularUserGroup the User group
	 */
	@Override
	public void cacheResult(AngularUserGroup angularUserGroup) {
		entityCache.putResult(AngularUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			AngularUserGroupImpl.class, angularUserGroup.getPrimaryKey(),
			angularUserGroup);

		angularUserGroup.resetOriginalValues();
	}

	/**
	 * Caches the User groups in the entity cache if it is enabled.
	 *
	 * @param angularUserGroups the User groups
	 */
	@Override
	public void cacheResult(List<AngularUserGroup> angularUserGroups) {
		for (AngularUserGroup angularUserGroup : angularUserGroups) {
			if (entityCache.getResult(
						AngularUserGroupModelImpl.ENTITY_CACHE_ENABLED,
						AngularUserGroupImpl.class,
						angularUserGroup.getPrimaryKey()) == null) {
				cacheResult(angularUserGroup);
			}
			else {
				angularUserGroup.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all User groups.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AngularUserGroupImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the User group.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AngularUserGroup angularUserGroup) {
		entityCache.removeResult(AngularUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			AngularUserGroupImpl.class, angularUserGroup.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AngularUserGroup> angularUserGroups) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AngularUserGroup angularUserGroup : angularUserGroups) {
			entityCache.removeResult(AngularUserGroupModelImpl.ENTITY_CACHE_ENABLED,
				AngularUserGroupImpl.class, angularUserGroup.getPrimaryKey());
		}
	}

	/**
	 * Creates a new User group with the primary key. Does not add the User group to the database.
	 *
	 * @param groupId the primary key for the new User group
	 * @return the new User group
	 */
	@Override
	public AngularUserGroup create(long groupId) {
		AngularUserGroup angularUserGroup = new AngularUserGroupImpl();

		angularUserGroup.setNew(true);
		angularUserGroup.setPrimaryKey(groupId);

		return angularUserGroup;
	}

	/**
	 * Removes the User group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param groupId the primary key of the User group
	 * @return the User group that was removed
	 * @throws NoSuchAngularUserGroupException if a User group with the primary key could not be found
	 */
	@Override
	public AngularUserGroup remove(long groupId)
		throws NoSuchAngularUserGroupException {
		return remove((Serializable)groupId);
	}

	/**
	 * Removes the User group with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the User group
	 * @return the User group that was removed
	 * @throws NoSuchAngularUserGroupException if a User group with the primary key could not be found
	 */
	@Override
	public AngularUserGroup remove(Serializable primaryKey)
		throws NoSuchAngularUserGroupException {
		Session session = null;

		try {
			session = openSession();

			AngularUserGroup angularUserGroup = (AngularUserGroup)session.get(AngularUserGroupImpl.class,
					primaryKey);

			if (angularUserGroup == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAngularUserGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(angularUserGroup);
		}
		catch (NoSuchAngularUserGroupException nsee) {
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
	protected AngularUserGroup removeImpl(AngularUserGroup angularUserGroup) {
		angularUserGroup = toUnwrappedModel(angularUserGroup);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(angularUserGroup)) {
				angularUserGroup = (AngularUserGroup)session.get(AngularUserGroupImpl.class,
						angularUserGroup.getPrimaryKeyObj());
			}

			if (angularUserGroup != null) {
				session.delete(angularUserGroup);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (angularUserGroup != null) {
			clearCache(angularUserGroup);
		}

		return angularUserGroup;
	}

	@Override
	public AngularUserGroup updateImpl(AngularUserGroup angularUserGroup) {
		angularUserGroup = toUnwrappedModel(angularUserGroup);

		boolean isNew = angularUserGroup.isNew();

		Session session = null;

		try {
			session = openSession();

			if (angularUserGroup.isNew()) {
				session.save(angularUserGroup);

				angularUserGroup.setNew(false);
			}
			else {
				angularUserGroup = (AngularUserGroup)session.merge(angularUserGroup);
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

		entityCache.putResult(AngularUserGroupModelImpl.ENTITY_CACHE_ENABLED,
			AngularUserGroupImpl.class, angularUserGroup.getPrimaryKey(),
			angularUserGroup, false);

		angularUserGroup.resetOriginalValues();

		return angularUserGroup;
	}

	protected AngularUserGroup toUnwrappedModel(
		AngularUserGroup angularUserGroup) {
		if (angularUserGroup instanceof AngularUserGroupImpl) {
			return angularUserGroup;
		}

		AngularUserGroupImpl angularUserGroupImpl = new AngularUserGroupImpl();

		angularUserGroupImpl.setNew(angularUserGroup.isNew());
		angularUserGroupImpl.setPrimaryKey(angularUserGroup.getPrimaryKey());

		angularUserGroupImpl.setGroupId(angularUserGroup.getGroupId());

		return angularUserGroupImpl;
	}

	/**
	 * Returns the User group with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the User group
	 * @return the User group
	 * @throws NoSuchAngularUserGroupException if a User group with the primary key could not be found
	 */
	@Override
	public AngularUserGroup findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAngularUserGroupException {
		AngularUserGroup angularUserGroup = fetchByPrimaryKey(primaryKey);

		if (angularUserGroup == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAngularUserGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return angularUserGroup;
	}

	/**
	 * Returns the User group with the primary key or throws a {@link NoSuchAngularUserGroupException} if it could not be found.
	 *
	 * @param groupId the primary key of the User group
	 * @return the User group
	 * @throws NoSuchAngularUserGroupException if a User group with the primary key could not be found
	 */
	@Override
	public AngularUserGroup findByPrimaryKey(long groupId)
		throws NoSuchAngularUserGroupException {
		return findByPrimaryKey((Serializable)groupId);
	}

	/**
	 * Returns the User group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the User group
	 * @return the User group, or <code>null</code> if a User group with the primary key could not be found
	 */
	@Override
	public AngularUserGroup fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AngularUserGroupModelImpl.ENTITY_CACHE_ENABLED,
				AngularUserGroupImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AngularUserGroup angularUserGroup = (AngularUserGroup)serializable;

		if (angularUserGroup == null) {
			Session session = null;

			try {
				session = openSession();

				angularUserGroup = (AngularUserGroup)session.get(AngularUserGroupImpl.class,
						primaryKey);

				if (angularUserGroup != null) {
					cacheResult(angularUserGroup);
				}
				else {
					entityCache.putResult(AngularUserGroupModelImpl.ENTITY_CACHE_ENABLED,
						AngularUserGroupImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AngularUserGroupModelImpl.ENTITY_CACHE_ENABLED,
					AngularUserGroupImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return angularUserGroup;
	}

	/**
	 * Returns the User group with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param groupId the primary key of the User group
	 * @return the User group, or <code>null</code> if a User group with the primary key could not be found
	 */
	@Override
	public AngularUserGroup fetchByPrimaryKey(long groupId) {
		return fetchByPrimaryKey((Serializable)groupId);
	}

	@Override
	public Map<Serializable, AngularUserGroup> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AngularUserGroup> map = new HashMap<Serializable, AngularUserGroup>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AngularUserGroup angularUserGroup = fetchByPrimaryKey(primaryKey);

			if (angularUserGroup != null) {
				map.put(primaryKey, angularUserGroup);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AngularUserGroupModelImpl.ENTITY_CACHE_ENABLED,
					AngularUserGroupImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AngularUserGroup)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ANGULARUSERGROUP_WHERE_PKS_IN);

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

			for (AngularUserGroup angularUserGroup : (List<AngularUserGroup>)q.list()) {
				map.put(angularUserGroup.getPrimaryKeyObj(), angularUserGroup);

				cacheResult(angularUserGroup);

				uncachedPrimaryKeys.remove(angularUserGroup.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AngularUserGroupModelImpl.ENTITY_CACHE_ENABLED,
					AngularUserGroupImpl.class, primaryKey, nullModel);
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
	 * Returns all the User groups.
	 *
	 * @return the User groups
	 */
	@Override
	public List<AngularUserGroup> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the User groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of User groups
	 * @param end the upper bound of the range of User groups (not inclusive)
	 * @return the range of User groups
	 */
	@Override
	public List<AngularUserGroup> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the User groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of User groups
	 * @param end the upper bound of the range of User groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of User groups
	 */
	@Override
	public List<AngularUserGroup> findAll(int start, int end,
		OrderByComparator<AngularUserGroup> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the User groups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularUserGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of User groups
	 * @param end the upper bound of the range of User groups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of User groups
	 */
	@Override
	public List<AngularUserGroup> findAll(int start, int end,
		OrderByComparator<AngularUserGroup> orderByComparator,
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

		List<AngularUserGroup> list = null;

		if (retrieveFromCache) {
			list = (List<AngularUserGroup>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ANGULARUSERGROUP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ANGULARUSERGROUP;

				if (pagination) {
					sql = sql.concat(AngularUserGroupModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AngularUserGroup>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AngularUserGroup>)QueryUtil.list(q,
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
	 * Removes all the User groups from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AngularUserGroup angularUserGroup : findAll()) {
			remove(angularUserGroup);
		}
	}

	/**
	 * Returns the number of User groups.
	 *
	 * @return the number of User groups
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ANGULARUSERGROUP);

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
		return AngularUserGroupModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the User group persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AngularUserGroupImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ANGULARUSERGROUP = "SELECT angularUserGroup FROM AngularUserGroup angularUserGroup";
	private static final String _SQL_SELECT_ANGULARUSERGROUP_WHERE_PKS_IN = "SELECT angularUserGroup FROM AngularUserGroup angularUserGroup WHERE groupId IN (";
	private static final String _SQL_COUNT_ANGULARUSERGROUP = "SELECT COUNT(angularUserGroup) FROM AngularUserGroup angularUserGroup";
	private static final String _ORDER_BY_ENTITY_ALIAS = "angularUserGroup.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AngularUserGroup exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(AngularUserGroupPersistenceImpl.class);
}