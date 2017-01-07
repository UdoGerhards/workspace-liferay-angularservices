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

import eu.gerhards.liferay.services.angular.exception.NoSuchAngularResourcePermissionException;
import eu.gerhards.liferay.services.angular.model.AngularResourcePermission;
import eu.gerhards.liferay.services.angular.model.impl.AngularResourcePermissionImpl;
import eu.gerhards.liferay.services.angular.model.impl.AngularResourcePermissionModelImpl;
import eu.gerhards.liferay.services.angular.service.persistence.AngularResourcePermissionPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the Resource permission service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularResourcePermissionPersistence
 * @see eu.gerhards.liferay.services.angular.service.persistence.AngularResourcePermissionUtil
 * @generated
 */
@ProviderType
public class AngularResourcePermissionPersistenceImpl
	extends BasePersistenceImpl<AngularResourcePermission>
	implements AngularResourcePermissionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AngularResourcePermissionUtil} to access the Resource permission persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AngularResourcePermissionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AngularResourcePermissionModelImpl.ENTITY_CACHE_ENABLED,
			AngularResourcePermissionModelImpl.FINDER_CACHE_ENABLED,
			AngularResourcePermissionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AngularResourcePermissionModelImpl.ENTITY_CACHE_ENABLED,
			AngularResourcePermissionModelImpl.FINDER_CACHE_ENABLED,
			AngularResourcePermissionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AngularResourcePermissionModelImpl.ENTITY_CACHE_ENABLED,
			AngularResourcePermissionModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public AngularResourcePermissionPersistenceImpl() {
		setModelClass(AngularResourcePermission.class);
	}

	/**
	 * Caches the Resource permission in the entity cache if it is enabled.
	 *
	 * @param angularResourcePermission the Resource permission
	 */
	@Override
	public void cacheResult(AngularResourcePermission angularResourcePermission) {
		entityCache.putResult(AngularResourcePermissionModelImpl.ENTITY_CACHE_ENABLED,
			AngularResourcePermissionImpl.class,
			angularResourcePermission.getPrimaryKey(), angularResourcePermission);

		angularResourcePermission.resetOriginalValues();
	}

	/**
	 * Caches the Resource permissions in the entity cache if it is enabled.
	 *
	 * @param angularResourcePermissions the Resource permissions
	 */
	@Override
	public void cacheResult(
		List<AngularResourcePermission> angularResourcePermissions) {
		for (AngularResourcePermission angularResourcePermission : angularResourcePermissions) {
			if (entityCache.getResult(
						AngularResourcePermissionModelImpl.ENTITY_CACHE_ENABLED,
						AngularResourcePermissionImpl.class,
						angularResourcePermission.getPrimaryKey()) == null) {
				cacheResult(angularResourcePermission);
			}
			else {
				angularResourcePermission.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all Resource permissions.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AngularResourcePermissionImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the Resource permission.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AngularResourcePermission angularResourcePermission) {
		entityCache.removeResult(AngularResourcePermissionModelImpl.ENTITY_CACHE_ENABLED,
			AngularResourcePermissionImpl.class,
			angularResourcePermission.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<AngularResourcePermission> angularResourcePermissions) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AngularResourcePermission angularResourcePermission : angularResourcePermissions) {
			entityCache.removeResult(AngularResourcePermissionModelImpl.ENTITY_CACHE_ENABLED,
				AngularResourcePermissionImpl.class,
				angularResourcePermission.getPrimaryKey());
		}
	}

	/**
	 * Creates a new Resource permission with the primary key. Does not add the Resource permission to the database.
	 *
	 * @param resourcePermissionId the primary key for the new Resource permission
	 * @return the new Resource permission
	 */
	@Override
	public AngularResourcePermission create(long resourcePermissionId) {
		AngularResourcePermission angularResourcePermission = new AngularResourcePermissionImpl();

		angularResourcePermission.setNew(true);
		angularResourcePermission.setPrimaryKey(resourcePermissionId);

		return angularResourcePermission;
	}

	/**
	 * Removes the Resource permission with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param resourcePermissionId the primary key of the Resource permission
	 * @return the Resource permission that was removed
	 * @throws NoSuchAngularResourcePermissionException if a Resource permission with the primary key could not be found
	 */
	@Override
	public AngularResourcePermission remove(long resourcePermissionId)
		throws NoSuchAngularResourcePermissionException {
		return remove((Serializable)resourcePermissionId);
	}

	/**
	 * Removes the Resource permission with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the Resource permission
	 * @return the Resource permission that was removed
	 * @throws NoSuchAngularResourcePermissionException if a Resource permission with the primary key could not be found
	 */
	@Override
	public AngularResourcePermission remove(Serializable primaryKey)
		throws NoSuchAngularResourcePermissionException {
		Session session = null;

		try {
			session = openSession();

			AngularResourcePermission angularResourcePermission = (AngularResourcePermission)session.get(AngularResourcePermissionImpl.class,
					primaryKey);

			if (angularResourcePermission == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAngularResourcePermissionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(angularResourcePermission);
		}
		catch (NoSuchAngularResourcePermissionException nsee) {
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
	protected AngularResourcePermission removeImpl(
		AngularResourcePermission angularResourcePermission) {
		angularResourcePermission = toUnwrappedModel(angularResourcePermission);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(angularResourcePermission)) {
				angularResourcePermission = (AngularResourcePermission)session.get(AngularResourcePermissionImpl.class,
						angularResourcePermission.getPrimaryKeyObj());
			}

			if (angularResourcePermission != null) {
				session.delete(angularResourcePermission);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (angularResourcePermission != null) {
			clearCache(angularResourcePermission);
		}

		return angularResourcePermission;
	}

	@Override
	public AngularResourcePermission updateImpl(
		AngularResourcePermission angularResourcePermission) {
		angularResourcePermission = toUnwrappedModel(angularResourcePermission);

		boolean isNew = angularResourcePermission.isNew();

		Session session = null;

		try {
			session = openSession();

			if (angularResourcePermission.isNew()) {
				session.save(angularResourcePermission);

				angularResourcePermission.setNew(false);
			}
			else {
				angularResourcePermission = (AngularResourcePermission)session.merge(angularResourcePermission);
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

		entityCache.putResult(AngularResourcePermissionModelImpl.ENTITY_CACHE_ENABLED,
			AngularResourcePermissionImpl.class,
			angularResourcePermission.getPrimaryKey(),
			angularResourcePermission, false);

		angularResourcePermission.resetOriginalValues();

		return angularResourcePermission;
	}

	protected AngularResourcePermission toUnwrappedModel(
		AngularResourcePermission angularResourcePermission) {
		if (angularResourcePermission instanceof AngularResourcePermissionImpl) {
			return angularResourcePermission;
		}

		AngularResourcePermissionImpl angularResourcePermissionImpl = new AngularResourcePermissionImpl();

		angularResourcePermissionImpl.setNew(angularResourcePermission.isNew());
		angularResourcePermissionImpl.setPrimaryKey(angularResourcePermission.getPrimaryKey());

		angularResourcePermissionImpl.setResourcePermissionId(angularResourcePermission.getResourcePermissionId());

		return angularResourcePermissionImpl;
	}

	/**
	 * Returns the Resource permission with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the Resource permission
	 * @return the Resource permission
	 * @throws NoSuchAngularResourcePermissionException if a Resource permission with the primary key could not be found
	 */
	@Override
	public AngularResourcePermission findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAngularResourcePermissionException {
		AngularResourcePermission angularResourcePermission = fetchByPrimaryKey(primaryKey);

		if (angularResourcePermission == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAngularResourcePermissionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return angularResourcePermission;
	}

	/**
	 * Returns the Resource permission with the primary key or throws a {@link NoSuchAngularResourcePermissionException} if it could not be found.
	 *
	 * @param resourcePermissionId the primary key of the Resource permission
	 * @return the Resource permission
	 * @throws NoSuchAngularResourcePermissionException if a Resource permission with the primary key could not be found
	 */
	@Override
	public AngularResourcePermission findByPrimaryKey(long resourcePermissionId)
		throws NoSuchAngularResourcePermissionException {
		return findByPrimaryKey((Serializable)resourcePermissionId);
	}

	/**
	 * Returns the Resource permission with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the Resource permission
	 * @return the Resource permission, or <code>null</code> if a Resource permission with the primary key could not be found
	 */
	@Override
	public AngularResourcePermission fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AngularResourcePermissionModelImpl.ENTITY_CACHE_ENABLED,
				AngularResourcePermissionImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AngularResourcePermission angularResourcePermission = (AngularResourcePermission)serializable;

		if (angularResourcePermission == null) {
			Session session = null;

			try {
				session = openSession();

				angularResourcePermission = (AngularResourcePermission)session.get(AngularResourcePermissionImpl.class,
						primaryKey);

				if (angularResourcePermission != null) {
					cacheResult(angularResourcePermission);
				}
				else {
					entityCache.putResult(AngularResourcePermissionModelImpl.ENTITY_CACHE_ENABLED,
						AngularResourcePermissionImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AngularResourcePermissionModelImpl.ENTITY_CACHE_ENABLED,
					AngularResourcePermissionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return angularResourcePermission;
	}

	/**
	 * Returns the Resource permission with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param resourcePermissionId the primary key of the Resource permission
	 * @return the Resource permission, or <code>null</code> if a Resource permission with the primary key could not be found
	 */
	@Override
	public AngularResourcePermission fetchByPrimaryKey(
		long resourcePermissionId) {
		return fetchByPrimaryKey((Serializable)resourcePermissionId);
	}

	@Override
	public Map<Serializable, AngularResourcePermission> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AngularResourcePermission> map = new HashMap<Serializable, AngularResourcePermission>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AngularResourcePermission angularResourcePermission = fetchByPrimaryKey(primaryKey);

			if (angularResourcePermission != null) {
				map.put(primaryKey, angularResourcePermission);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AngularResourcePermissionModelImpl.ENTITY_CACHE_ENABLED,
					AngularResourcePermissionImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AngularResourcePermission)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ANGULARRESOURCEPERMISSION_WHERE_PKS_IN);

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

			for (AngularResourcePermission angularResourcePermission : (List<AngularResourcePermission>)q.list()) {
				map.put(angularResourcePermission.getPrimaryKeyObj(),
					angularResourcePermission);

				cacheResult(angularResourcePermission);

				uncachedPrimaryKeys.remove(angularResourcePermission.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AngularResourcePermissionModelImpl.ENTITY_CACHE_ENABLED,
					AngularResourcePermissionImpl.class, primaryKey, nullModel);
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
	 * Returns all the Resource permissions.
	 *
	 * @return the Resource permissions
	 */
	@Override
	public List<AngularResourcePermission> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Resource permissions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularResourcePermissionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Resource permissions
	 * @param end the upper bound of the range of Resource permissions (not inclusive)
	 * @return the range of Resource permissions
	 */
	@Override
	public List<AngularResourcePermission> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the Resource permissions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularResourcePermissionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Resource permissions
	 * @param end the upper bound of the range of Resource permissions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of Resource permissions
	 */
	@Override
	public List<AngularResourcePermission> findAll(int start, int end,
		OrderByComparator<AngularResourcePermission> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the Resource permissions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularResourcePermissionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Resource permissions
	 * @param end the upper bound of the range of Resource permissions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of Resource permissions
	 */
	@Override
	public List<AngularResourcePermission> findAll(int start, int end,
		OrderByComparator<AngularResourcePermission> orderByComparator,
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

		List<AngularResourcePermission> list = null;

		if (retrieveFromCache) {
			list = (List<AngularResourcePermission>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ANGULARRESOURCEPERMISSION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ANGULARRESOURCEPERMISSION;

				if (pagination) {
					sql = sql.concat(AngularResourcePermissionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AngularResourcePermission>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AngularResourcePermission>)QueryUtil.list(q,
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
	 * Removes all the Resource permissions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AngularResourcePermission angularResourcePermission : findAll()) {
			remove(angularResourcePermission);
		}
	}

	/**
	 * Returns the number of Resource permissions.
	 *
	 * @return the number of Resource permissions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ANGULARRESOURCEPERMISSION);

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
		return AngularResourcePermissionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the Resource permission persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AngularResourcePermissionImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ANGULARRESOURCEPERMISSION = "SELECT angularResourcePermission FROM AngularResourcePermission angularResourcePermission";
	private static final String _SQL_SELECT_ANGULARRESOURCEPERMISSION_WHERE_PKS_IN =
		"SELECT angularResourcePermission FROM AngularResourcePermission angularResourcePermission WHERE resourcePermissionId IN (";
	private static final String _SQL_COUNT_ANGULARRESOURCEPERMISSION = "SELECT COUNT(angularResourcePermission) FROM AngularResourcePermission angularResourcePermission";
	private static final String _ORDER_BY_ENTITY_ALIAS = "angularResourcePermission.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AngularResourcePermission exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(AngularResourcePermissionPersistenceImpl.class);
}