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

import eu.gerhards.liferay.services.angular.exception.NoSuchAngularUserException;
import eu.gerhards.liferay.services.angular.model.AngularUser;
import eu.gerhards.liferay.services.angular.model.impl.AngularUserImpl;
import eu.gerhards.liferay.services.angular.model.impl.AngularUserModelImpl;
import eu.gerhards.liferay.services.angular.service.persistence.AngularUserPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the User service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularUserPersistence
 * @see eu.gerhards.liferay.services.angular.service.persistence.AngularUserUtil
 * @generated
 */
@ProviderType
public class AngularUserPersistenceImpl extends BasePersistenceImpl<AngularUser>
	implements AngularUserPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AngularUserUtil} to access the User persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AngularUserImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AngularUserModelImpl.ENTITY_CACHE_ENABLED,
			AngularUserModelImpl.FINDER_CACHE_ENABLED, AngularUserImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AngularUserModelImpl.ENTITY_CACHE_ENABLED,
			AngularUserModelImpl.FINDER_CACHE_ENABLED, AngularUserImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AngularUserModelImpl.ENTITY_CACHE_ENABLED,
			AngularUserModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public AngularUserPersistenceImpl() {
		setModelClass(AngularUser.class);
	}

	/**
	 * Caches the User in the entity cache if it is enabled.
	 *
	 * @param angularUser the User
	 */
	@Override
	public void cacheResult(AngularUser angularUser) {
		entityCache.putResult(AngularUserModelImpl.ENTITY_CACHE_ENABLED,
			AngularUserImpl.class, angularUser.getPrimaryKey(), angularUser);

		angularUser.resetOriginalValues();
	}

	/**
	 * Caches the Users in the entity cache if it is enabled.
	 *
	 * @param angularUsers the Users
	 */
	@Override
	public void cacheResult(List<AngularUser> angularUsers) {
		for (AngularUser angularUser : angularUsers) {
			if (entityCache.getResult(
						AngularUserModelImpl.ENTITY_CACHE_ENABLED,
						AngularUserImpl.class, angularUser.getPrimaryKey()) == null) {
				cacheResult(angularUser);
			}
			else {
				angularUser.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all Users.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AngularUserImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the User.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AngularUser angularUser) {
		entityCache.removeResult(AngularUserModelImpl.ENTITY_CACHE_ENABLED,
			AngularUserImpl.class, angularUser.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AngularUser> angularUsers) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AngularUser angularUser : angularUsers) {
			entityCache.removeResult(AngularUserModelImpl.ENTITY_CACHE_ENABLED,
				AngularUserImpl.class, angularUser.getPrimaryKey());
		}
	}

	/**
	 * Creates a new User with the primary key. Does not add the User to the database.
	 *
	 * @param userId the primary key for the new User
	 * @return the new User
	 */
	@Override
	public AngularUser create(long userId) {
		AngularUser angularUser = new AngularUserImpl();

		angularUser.setNew(true);
		angularUser.setPrimaryKey(userId);

		return angularUser;
	}

	/**
	 * Removes the User with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userId the primary key of the User
	 * @return the User that was removed
	 * @throws NoSuchAngularUserException if a User with the primary key could not be found
	 */
	@Override
	public AngularUser remove(long userId) throws NoSuchAngularUserException {
		return remove((Serializable)userId);
	}

	/**
	 * Removes the User with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the User
	 * @return the User that was removed
	 * @throws NoSuchAngularUserException if a User with the primary key could not be found
	 */
	@Override
	public AngularUser remove(Serializable primaryKey)
		throws NoSuchAngularUserException {
		Session session = null;

		try {
			session = openSession();

			AngularUser angularUser = (AngularUser)session.get(AngularUserImpl.class,
					primaryKey);

			if (angularUser == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAngularUserException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(angularUser);
		}
		catch (NoSuchAngularUserException nsee) {
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
	protected AngularUser removeImpl(AngularUser angularUser) {
		angularUser = toUnwrappedModel(angularUser);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(angularUser)) {
				angularUser = (AngularUser)session.get(AngularUserImpl.class,
						angularUser.getPrimaryKeyObj());
			}

			if (angularUser != null) {
				session.delete(angularUser);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (angularUser != null) {
			clearCache(angularUser);
		}

		return angularUser;
	}

	@Override
	public AngularUser updateImpl(AngularUser angularUser) {
		angularUser = toUnwrappedModel(angularUser);

		boolean isNew = angularUser.isNew();

		Session session = null;

		try {
			session = openSession();

			if (angularUser.isNew()) {
				session.save(angularUser);

				angularUser.setNew(false);
			}
			else {
				angularUser = (AngularUser)session.merge(angularUser);
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

		entityCache.putResult(AngularUserModelImpl.ENTITY_CACHE_ENABLED,
			AngularUserImpl.class, angularUser.getPrimaryKey(), angularUser,
			false);

		angularUser.resetOriginalValues();

		return angularUser;
	}

	protected AngularUser toUnwrappedModel(AngularUser angularUser) {
		if (angularUser instanceof AngularUserImpl) {
			return angularUser;
		}

		AngularUserImpl angularUserImpl = new AngularUserImpl();

		angularUserImpl.setNew(angularUser.isNew());
		angularUserImpl.setPrimaryKey(angularUser.getPrimaryKey());

		angularUserImpl.setUserId(angularUser.getUserId());

		return angularUserImpl;
	}

	/**
	 * Returns the User with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the User
	 * @return the User
	 * @throws NoSuchAngularUserException if a User with the primary key could not be found
	 */
	@Override
	public AngularUser findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAngularUserException {
		AngularUser angularUser = fetchByPrimaryKey(primaryKey);

		if (angularUser == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAngularUserException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return angularUser;
	}

	/**
	 * Returns the User with the primary key or throws a {@link NoSuchAngularUserException} if it could not be found.
	 *
	 * @param userId the primary key of the User
	 * @return the User
	 * @throws NoSuchAngularUserException if a User with the primary key could not be found
	 */
	@Override
	public AngularUser findByPrimaryKey(long userId)
		throws NoSuchAngularUserException {
		return findByPrimaryKey((Serializable)userId);
	}

	/**
	 * Returns the User with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the User
	 * @return the User, or <code>null</code> if a User with the primary key could not be found
	 */
	@Override
	public AngularUser fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AngularUserModelImpl.ENTITY_CACHE_ENABLED,
				AngularUserImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AngularUser angularUser = (AngularUser)serializable;

		if (angularUser == null) {
			Session session = null;

			try {
				session = openSession();

				angularUser = (AngularUser)session.get(AngularUserImpl.class,
						primaryKey);

				if (angularUser != null) {
					cacheResult(angularUser);
				}
				else {
					entityCache.putResult(AngularUserModelImpl.ENTITY_CACHE_ENABLED,
						AngularUserImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AngularUserModelImpl.ENTITY_CACHE_ENABLED,
					AngularUserImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return angularUser;
	}

	/**
	 * Returns the User with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userId the primary key of the User
	 * @return the User, or <code>null</code> if a User with the primary key could not be found
	 */
	@Override
	public AngularUser fetchByPrimaryKey(long userId) {
		return fetchByPrimaryKey((Serializable)userId);
	}

	@Override
	public Map<Serializable, AngularUser> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AngularUser> map = new HashMap<Serializable, AngularUser>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AngularUser angularUser = fetchByPrimaryKey(primaryKey);

			if (angularUser != null) {
				map.put(primaryKey, angularUser);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AngularUserModelImpl.ENTITY_CACHE_ENABLED,
					AngularUserImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AngularUser)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ANGULARUSER_WHERE_PKS_IN);

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

			for (AngularUser angularUser : (List<AngularUser>)q.list()) {
				map.put(angularUser.getPrimaryKeyObj(), angularUser);

				cacheResult(angularUser);

				uncachedPrimaryKeys.remove(angularUser.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AngularUserModelImpl.ENTITY_CACHE_ENABLED,
					AngularUserImpl.class, primaryKey, nullModel);
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
	 * Returns all the Users.
	 *
	 * @return the Users
	 */
	@Override
	public List<AngularUser> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Users
	 * @param end the upper bound of the range of Users (not inclusive)
	 * @return the range of Users
	 */
	@Override
	public List<AngularUser> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the Users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Users
	 * @param end the upper bound of the range of Users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of Users
	 */
	@Override
	public List<AngularUser> findAll(int start, int end,
		OrderByComparator<AngularUser> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the Users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Users
	 * @param end the upper bound of the range of Users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of Users
	 */
	@Override
	public List<AngularUser> findAll(int start, int end,
		OrderByComparator<AngularUser> orderByComparator,
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

		List<AngularUser> list = null;

		if (retrieveFromCache) {
			list = (List<AngularUser>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ANGULARUSER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ANGULARUSER;

				if (pagination) {
					sql = sql.concat(AngularUserModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AngularUser>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AngularUser>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the Users from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AngularUser angularUser : findAll()) {
			remove(angularUser);
		}
	}

	/**
	 * Returns the number of Users.
	 *
	 * @return the number of Users
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ANGULARUSER);

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
		return AngularUserModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the User persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AngularUserImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ANGULARUSER = "SELECT angularUser FROM AngularUser angularUser";
	private static final String _SQL_SELECT_ANGULARUSER_WHERE_PKS_IN = "SELECT angularUser FROM AngularUser angularUser WHERE userId IN (";
	private static final String _SQL_COUNT_ANGULARUSER = "SELECT COUNT(angularUser) FROM AngularUser angularUser";
	private static final String _ORDER_BY_ENTITY_ALIAS = "angularUser.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AngularUser exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(AngularUserPersistenceImpl.class);
}