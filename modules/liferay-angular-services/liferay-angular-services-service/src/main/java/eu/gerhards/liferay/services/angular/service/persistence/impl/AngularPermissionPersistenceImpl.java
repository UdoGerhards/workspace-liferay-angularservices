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

import eu.gerhards.liferay.services.angular.exception.NoSuchAngularPermissionException;
import eu.gerhards.liferay.services.angular.model.AngularPermission;
import eu.gerhards.liferay.services.angular.model.impl.AngularPermissionImpl;
import eu.gerhards.liferay.services.angular.model.impl.AngularPermissionModelImpl;
import eu.gerhards.liferay.services.angular.service.persistence.AngularPermissionPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the Permission service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularPermissionPersistence
 * @see eu.gerhards.liferay.services.angular.service.persistence.AngularPermissionUtil
 * @generated
 */
@ProviderType
public class AngularPermissionPersistenceImpl extends BasePersistenceImpl<AngularPermission>
	implements AngularPermissionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AngularPermissionUtil} to access the Permission persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AngularPermissionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AngularPermissionModelImpl.ENTITY_CACHE_ENABLED,
			AngularPermissionModelImpl.FINDER_CACHE_ENABLED,
			AngularPermissionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AngularPermissionModelImpl.ENTITY_CACHE_ENABLED,
			AngularPermissionModelImpl.FINDER_CACHE_ENABLED,
			AngularPermissionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AngularPermissionModelImpl.ENTITY_CACHE_ENABLED,
			AngularPermissionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public AngularPermissionPersistenceImpl() {
		setModelClass(AngularPermission.class);
	}

	/**
	 * Caches the Permission in the entity cache if it is enabled.
	 *
	 * @param angularPermission the Permission
	 */
	@Override
	public void cacheResult(AngularPermission angularPermission) {
		entityCache.putResult(AngularPermissionModelImpl.ENTITY_CACHE_ENABLED,
			AngularPermissionImpl.class, angularPermission.getPrimaryKey(),
			angularPermission);

		angularPermission.resetOriginalValues();
	}

	/**
	 * Caches the Permissions in the entity cache if it is enabled.
	 *
	 * @param angularPermissions the Permissions
	 */
	@Override
	public void cacheResult(List<AngularPermission> angularPermissions) {
		for (AngularPermission angularPermission : angularPermissions) {
			if (entityCache.getResult(
						AngularPermissionModelImpl.ENTITY_CACHE_ENABLED,
						AngularPermissionImpl.class,
						angularPermission.getPrimaryKey()) == null) {
				cacheResult(angularPermission);
			}
			else {
				angularPermission.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all Permissions.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AngularPermissionImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the Permission.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AngularPermission angularPermission) {
		entityCache.removeResult(AngularPermissionModelImpl.ENTITY_CACHE_ENABLED,
			AngularPermissionImpl.class, angularPermission.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AngularPermission> angularPermissions) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AngularPermission angularPermission : angularPermissions) {
			entityCache.removeResult(AngularPermissionModelImpl.ENTITY_CACHE_ENABLED,
				AngularPermissionImpl.class, angularPermission.getPrimaryKey());
		}
	}

	/**
	 * Creates a new Permission with the primary key. Does not add the Permission to the database.
	 *
	 * @param permissionId the primary key for the new Permission
	 * @return the new Permission
	 */
	@Override
	public AngularPermission create(long permissionId) {
		AngularPermission angularPermission = new AngularPermissionImpl();

		angularPermission.setNew(true);
		angularPermission.setPrimaryKey(permissionId);

		return angularPermission;
	}

	/**
	 * Removes the Permission with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param permissionId the primary key of the Permission
	 * @return the Permission that was removed
	 * @throws NoSuchAngularPermissionException if a Permission with the primary key could not be found
	 */
	@Override
	public AngularPermission remove(long permissionId)
		throws NoSuchAngularPermissionException {
		return remove((Serializable)permissionId);
	}

	/**
	 * Removes the Permission with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the Permission
	 * @return the Permission that was removed
	 * @throws NoSuchAngularPermissionException if a Permission with the primary key could not be found
	 */
	@Override
	public AngularPermission remove(Serializable primaryKey)
		throws NoSuchAngularPermissionException {
		Session session = null;

		try {
			session = openSession();

			AngularPermission angularPermission = (AngularPermission)session.get(AngularPermissionImpl.class,
					primaryKey);

			if (angularPermission == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAngularPermissionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(angularPermission);
		}
		catch (NoSuchAngularPermissionException nsee) {
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
	protected AngularPermission removeImpl(AngularPermission angularPermission) {
		angularPermission = toUnwrappedModel(angularPermission);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(angularPermission)) {
				angularPermission = (AngularPermission)session.get(AngularPermissionImpl.class,
						angularPermission.getPrimaryKeyObj());
			}

			if (angularPermission != null) {
				session.delete(angularPermission);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (angularPermission != null) {
			clearCache(angularPermission);
		}

		return angularPermission;
	}

	@Override
	public AngularPermission updateImpl(AngularPermission angularPermission) {
		angularPermission = toUnwrappedModel(angularPermission);

		boolean isNew = angularPermission.isNew();

		Session session = null;

		try {
			session = openSession();

			if (angularPermission.isNew()) {
				session.save(angularPermission);

				angularPermission.setNew(false);
			}
			else {
				angularPermission = (AngularPermission)session.merge(angularPermission);
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

		entityCache.putResult(AngularPermissionModelImpl.ENTITY_CACHE_ENABLED,
			AngularPermissionImpl.class, angularPermission.getPrimaryKey(),
			angularPermission, false);

		angularPermission.resetOriginalValues();

		return angularPermission;
	}

	protected AngularPermission toUnwrappedModel(
		AngularPermission angularPermission) {
		if (angularPermission instanceof AngularPermissionImpl) {
			return angularPermission;
		}

		AngularPermissionImpl angularPermissionImpl = new AngularPermissionImpl();

		angularPermissionImpl.setNew(angularPermission.isNew());
		angularPermissionImpl.setPrimaryKey(angularPermission.getPrimaryKey());

		angularPermissionImpl.setPermissionId(angularPermission.getPermissionId());

		return angularPermissionImpl;
	}

	/**
	 * Returns the Permission with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the Permission
	 * @return the Permission
	 * @throws NoSuchAngularPermissionException if a Permission with the primary key could not be found
	 */
	@Override
	public AngularPermission findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAngularPermissionException {
		AngularPermission angularPermission = fetchByPrimaryKey(primaryKey);

		if (angularPermission == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAngularPermissionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return angularPermission;
	}

	/**
	 * Returns the Permission with the primary key or throws a {@link NoSuchAngularPermissionException} if it could not be found.
	 *
	 * @param permissionId the primary key of the Permission
	 * @return the Permission
	 * @throws NoSuchAngularPermissionException if a Permission with the primary key could not be found
	 */
	@Override
	public AngularPermission findByPrimaryKey(long permissionId)
		throws NoSuchAngularPermissionException {
		return findByPrimaryKey((Serializable)permissionId);
	}

	/**
	 * Returns the Permission with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the Permission
	 * @return the Permission, or <code>null</code> if a Permission with the primary key could not be found
	 */
	@Override
	public AngularPermission fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AngularPermissionModelImpl.ENTITY_CACHE_ENABLED,
				AngularPermissionImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AngularPermission angularPermission = (AngularPermission)serializable;

		if (angularPermission == null) {
			Session session = null;

			try {
				session = openSession();

				angularPermission = (AngularPermission)session.get(AngularPermissionImpl.class,
						primaryKey);

				if (angularPermission != null) {
					cacheResult(angularPermission);
				}
				else {
					entityCache.putResult(AngularPermissionModelImpl.ENTITY_CACHE_ENABLED,
						AngularPermissionImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AngularPermissionModelImpl.ENTITY_CACHE_ENABLED,
					AngularPermissionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return angularPermission;
	}

	/**
	 * Returns the Permission with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param permissionId the primary key of the Permission
	 * @return the Permission, or <code>null</code> if a Permission with the primary key could not be found
	 */
	@Override
	public AngularPermission fetchByPrimaryKey(long permissionId) {
		return fetchByPrimaryKey((Serializable)permissionId);
	}

	@Override
	public Map<Serializable, AngularPermission> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AngularPermission> map = new HashMap<Serializable, AngularPermission>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AngularPermission angularPermission = fetchByPrimaryKey(primaryKey);

			if (angularPermission != null) {
				map.put(primaryKey, angularPermission);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AngularPermissionModelImpl.ENTITY_CACHE_ENABLED,
					AngularPermissionImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AngularPermission)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ANGULARPERMISSION_WHERE_PKS_IN);

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

			for (AngularPermission angularPermission : (List<AngularPermission>)q.list()) {
				map.put(angularPermission.getPrimaryKeyObj(), angularPermission);

				cacheResult(angularPermission);

				uncachedPrimaryKeys.remove(angularPermission.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AngularPermissionModelImpl.ENTITY_CACHE_ENABLED,
					AngularPermissionImpl.class, primaryKey, nullModel);
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
	 * Returns all the Permissions.
	 *
	 * @return the Permissions
	 */
	@Override
	public List<AngularPermission> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Permissions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularPermissionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Permissions
	 * @param end the upper bound of the range of Permissions (not inclusive)
	 * @return the range of Permissions
	 */
	@Override
	public List<AngularPermission> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the Permissions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularPermissionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Permissions
	 * @param end the upper bound of the range of Permissions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of Permissions
	 */
	@Override
	public List<AngularPermission> findAll(int start, int end,
		OrderByComparator<AngularPermission> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the Permissions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularPermissionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Permissions
	 * @param end the upper bound of the range of Permissions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of Permissions
	 */
	@Override
	public List<AngularPermission> findAll(int start, int end,
		OrderByComparator<AngularPermission> orderByComparator,
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

		List<AngularPermission> list = null;

		if (retrieveFromCache) {
			list = (List<AngularPermission>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ANGULARPERMISSION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ANGULARPERMISSION;

				if (pagination) {
					sql = sql.concat(AngularPermissionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AngularPermission>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AngularPermission>)QueryUtil.list(q,
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
	 * Removes all the Permissions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AngularPermission angularPermission : findAll()) {
			remove(angularPermission);
		}
	}

	/**
	 * Returns the number of Permissions.
	 *
	 * @return the number of Permissions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ANGULARPERMISSION);

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
		return AngularPermissionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the Permission persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AngularPermissionImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ANGULARPERMISSION = "SELECT angularPermission FROM AngularPermission angularPermission";
	private static final String _SQL_SELECT_ANGULARPERMISSION_WHERE_PKS_IN = "SELECT angularPermission FROM AngularPermission angularPermission WHERE permissionId IN (";
	private static final String _SQL_COUNT_ANGULARPERMISSION = "SELECT COUNT(angularPermission) FROM AngularPermission angularPermission";
	private static final String _ORDER_BY_ENTITY_ALIAS = "angularPermission.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AngularPermission exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(AngularPermissionPersistenceImpl.class);
}