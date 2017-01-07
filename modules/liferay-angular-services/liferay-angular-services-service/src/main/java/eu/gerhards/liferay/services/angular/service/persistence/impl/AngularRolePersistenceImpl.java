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

import eu.gerhards.liferay.services.angular.exception.NoSuchAngularRoleException;
import eu.gerhards.liferay.services.angular.model.AngularRole;
import eu.gerhards.liferay.services.angular.model.impl.AngularRoleImpl;
import eu.gerhards.liferay.services.angular.model.impl.AngularRoleModelImpl;
import eu.gerhards.liferay.services.angular.service.persistence.AngularRolePersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the Role service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularRolePersistence
 * @see eu.gerhards.liferay.services.angular.service.persistence.AngularRoleUtil
 * @generated
 */
@ProviderType
public class AngularRolePersistenceImpl extends BasePersistenceImpl<AngularRole>
	implements AngularRolePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AngularRoleUtil} to access the Role persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AngularRoleImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AngularRoleModelImpl.ENTITY_CACHE_ENABLED,
			AngularRoleModelImpl.FINDER_CACHE_ENABLED, AngularRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AngularRoleModelImpl.ENTITY_CACHE_ENABLED,
			AngularRoleModelImpl.FINDER_CACHE_ENABLED, AngularRoleImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AngularRoleModelImpl.ENTITY_CACHE_ENABLED,
			AngularRoleModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public AngularRolePersistenceImpl() {
		setModelClass(AngularRole.class);
	}

	/**
	 * Caches the Role in the entity cache if it is enabled.
	 *
	 * @param angularRole the Role
	 */
	@Override
	public void cacheResult(AngularRole angularRole) {
		entityCache.putResult(AngularRoleModelImpl.ENTITY_CACHE_ENABLED,
			AngularRoleImpl.class, angularRole.getPrimaryKey(), angularRole);

		angularRole.resetOriginalValues();
	}

	/**
	 * Caches the Roles in the entity cache if it is enabled.
	 *
	 * @param angularRoles the Roles
	 */
	@Override
	public void cacheResult(List<AngularRole> angularRoles) {
		for (AngularRole angularRole : angularRoles) {
			if (entityCache.getResult(
						AngularRoleModelImpl.ENTITY_CACHE_ENABLED,
						AngularRoleImpl.class, angularRole.getPrimaryKey()) == null) {
				cacheResult(angularRole);
			}
			else {
				angularRole.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all Roles.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AngularRoleImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the Role.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AngularRole angularRole) {
		entityCache.removeResult(AngularRoleModelImpl.ENTITY_CACHE_ENABLED,
			AngularRoleImpl.class, angularRole.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AngularRole> angularRoles) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AngularRole angularRole : angularRoles) {
			entityCache.removeResult(AngularRoleModelImpl.ENTITY_CACHE_ENABLED,
				AngularRoleImpl.class, angularRole.getPrimaryKey());
		}
	}

	/**
	 * Creates a new Role with the primary key. Does not add the Role to the database.
	 *
	 * @param roleId the primary key for the new Role
	 * @return the new Role
	 */
	@Override
	public AngularRole create(long roleId) {
		AngularRole angularRole = new AngularRoleImpl();

		angularRole.setNew(true);
		angularRole.setPrimaryKey(roleId);

		return angularRole;
	}

	/**
	 * Removes the Role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param roleId the primary key of the Role
	 * @return the Role that was removed
	 * @throws NoSuchAngularRoleException if a Role with the primary key could not be found
	 */
	@Override
	public AngularRole remove(long roleId) throws NoSuchAngularRoleException {
		return remove((Serializable)roleId);
	}

	/**
	 * Removes the Role with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the Role
	 * @return the Role that was removed
	 * @throws NoSuchAngularRoleException if a Role with the primary key could not be found
	 */
	@Override
	public AngularRole remove(Serializable primaryKey)
		throws NoSuchAngularRoleException {
		Session session = null;

		try {
			session = openSession();

			AngularRole angularRole = (AngularRole)session.get(AngularRoleImpl.class,
					primaryKey);

			if (angularRole == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAngularRoleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(angularRole);
		}
		catch (NoSuchAngularRoleException nsee) {
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
	protected AngularRole removeImpl(AngularRole angularRole) {
		angularRole = toUnwrappedModel(angularRole);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(angularRole)) {
				angularRole = (AngularRole)session.get(AngularRoleImpl.class,
						angularRole.getPrimaryKeyObj());
			}

			if (angularRole != null) {
				session.delete(angularRole);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (angularRole != null) {
			clearCache(angularRole);
		}

		return angularRole;
	}

	@Override
	public AngularRole updateImpl(AngularRole angularRole) {
		angularRole = toUnwrappedModel(angularRole);

		boolean isNew = angularRole.isNew();

		Session session = null;

		try {
			session = openSession();

			if (angularRole.isNew()) {
				session.save(angularRole);

				angularRole.setNew(false);
			}
			else {
				angularRole = (AngularRole)session.merge(angularRole);
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

		entityCache.putResult(AngularRoleModelImpl.ENTITY_CACHE_ENABLED,
			AngularRoleImpl.class, angularRole.getPrimaryKey(), angularRole,
			false);

		angularRole.resetOriginalValues();

		return angularRole;
	}

	protected AngularRole toUnwrappedModel(AngularRole angularRole) {
		if (angularRole instanceof AngularRoleImpl) {
			return angularRole;
		}

		AngularRoleImpl angularRoleImpl = new AngularRoleImpl();

		angularRoleImpl.setNew(angularRole.isNew());
		angularRoleImpl.setPrimaryKey(angularRole.getPrimaryKey());

		angularRoleImpl.setRoleId(angularRole.getRoleId());

		return angularRoleImpl;
	}

	/**
	 * Returns the Role with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the Role
	 * @return the Role
	 * @throws NoSuchAngularRoleException if a Role with the primary key could not be found
	 */
	@Override
	public AngularRole findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAngularRoleException {
		AngularRole angularRole = fetchByPrimaryKey(primaryKey);

		if (angularRole == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAngularRoleException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return angularRole;
	}

	/**
	 * Returns the Role with the primary key or throws a {@link NoSuchAngularRoleException} if it could not be found.
	 *
	 * @param roleId the primary key of the Role
	 * @return the Role
	 * @throws NoSuchAngularRoleException if a Role with the primary key could not be found
	 */
	@Override
	public AngularRole findByPrimaryKey(long roleId)
		throws NoSuchAngularRoleException {
		return findByPrimaryKey((Serializable)roleId);
	}

	/**
	 * Returns the Role with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the Role
	 * @return the Role, or <code>null</code> if a Role with the primary key could not be found
	 */
	@Override
	public AngularRole fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AngularRoleModelImpl.ENTITY_CACHE_ENABLED,
				AngularRoleImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AngularRole angularRole = (AngularRole)serializable;

		if (angularRole == null) {
			Session session = null;

			try {
				session = openSession();

				angularRole = (AngularRole)session.get(AngularRoleImpl.class,
						primaryKey);

				if (angularRole != null) {
					cacheResult(angularRole);
				}
				else {
					entityCache.putResult(AngularRoleModelImpl.ENTITY_CACHE_ENABLED,
						AngularRoleImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AngularRoleModelImpl.ENTITY_CACHE_ENABLED,
					AngularRoleImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return angularRole;
	}

	/**
	 * Returns the Role with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param roleId the primary key of the Role
	 * @return the Role, or <code>null</code> if a Role with the primary key could not be found
	 */
	@Override
	public AngularRole fetchByPrimaryKey(long roleId) {
		return fetchByPrimaryKey((Serializable)roleId);
	}

	@Override
	public Map<Serializable, AngularRole> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AngularRole> map = new HashMap<Serializable, AngularRole>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AngularRole angularRole = fetchByPrimaryKey(primaryKey);

			if (angularRole != null) {
				map.put(primaryKey, angularRole);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AngularRoleModelImpl.ENTITY_CACHE_ENABLED,
					AngularRoleImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AngularRole)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ANGULARROLE_WHERE_PKS_IN);

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

			for (AngularRole angularRole : (List<AngularRole>)q.list()) {
				map.put(angularRole.getPrimaryKeyObj(), angularRole);

				cacheResult(angularRole);

				uncachedPrimaryKeys.remove(angularRole.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AngularRoleModelImpl.ENTITY_CACHE_ENABLED,
					AngularRoleImpl.class, primaryKey, nullModel);
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
	 * Returns all the Roles.
	 *
	 * @return the Roles
	 */
	@Override
	public List<AngularRole> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Roles
	 * @param end the upper bound of the range of Roles (not inclusive)
	 * @return the range of Roles
	 */
	@Override
	public List<AngularRole> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the Roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Roles
	 * @param end the upper bound of the range of Roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of Roles
	 */
	@Override
	public List<AngularRole> findAll(int start, int end,
		OrderByComparator<AngularRole> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the Roles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularRoleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Roles
	 * @param end the upper bound of the range of Roles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of Roles
	 */
	@Override
	public List<AngularRole> findAll(int start, int end,
		OrderByComparator<AngularRole> orderByComparator,
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

		List<AngularRole> list = null;

		if (retrieveFromCache) {
			list = (List<AngularRole>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ANGULARROLE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ANGULARROLE;

				if (pagination) {
					sql = sql.concat(AngularRoleModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AngularRole>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AngularRole>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the Roles from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AngularRole angularRole : findAll()) {
			remove(angularRole);
		}
	}

	/**
	 * Returns the number of Roles.
	 *
	 * @return the number of Roles
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ANGULARROLE);

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
		return AngularRoleModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the Role persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AngularRoleImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ANGULARROLE = "SELECT angularRole FROM AngularRole angularRole";
	private static final String _SQL_SELECT_ANGULARROLE_WHERE_PKS_IN = "SELECT angularRole FROM AngularRole angularRole WHERE roleId IN (";
	private static final String _SQL_COUNT_ANGULARROLE = "SELECT COUNT(angularRole) FROM AngularRole angularRole";
	private static final String _ORDER_BY_ENTITY_ALIAS = "angularRole.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AngularRole exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(AngularRolePersistenceImpl.class);
}