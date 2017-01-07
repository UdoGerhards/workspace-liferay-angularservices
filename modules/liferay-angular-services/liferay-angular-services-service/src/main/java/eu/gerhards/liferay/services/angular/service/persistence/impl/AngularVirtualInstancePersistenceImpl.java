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
import eu.gerhards.liferay.services.angular.exception.NoSuchAngularVirtualInstanceException;
import eu.gerhards.liferay.services.angular.model.AngularVirtualInstance;
import eu.gerhards.liferay.services.angular.model.impl.AngularVirtualInstanceImpl;
import eu.gerhards.liferay.services.angular.model.impl.AngularVirtualInstanceModelImpl;
import eu.gerhards.liferay.services.angular.service.persistence.AngularVirtualInstancePersistence;

import java.io.Serializable;
import java.util.*;

/**
 * The persistence implementation for the Virtual instance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularVirtualInstancePersistence
 * @see eu.gerhards.liferay.services.angular.service.persistence.AngularVirtualInstanceUtil
 * @generated
 */
@ProviderType
public class AngularVirtualInstancePersistenceImpl extends BasePersistenceImpl<AngularVirtualInstance>
	implements AngularVirtualInstancePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AngularVirtualInstanceUtil} to access the Virtual instance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AngularVirtualInstanceImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AngularVirtualInstanceModelImpl.ENTITY_CACHE_ENABLED,
			AngularVirtualInstanceModelImpl.FINDER_CACHE_ENABLED,
			AngularVirtualInstanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AngularVirtualInstanceModelImpl.ENTITY_CACHE_ENABLED,
			AngularVirtualInstanceModelImpl.FINDER_CACHE_ENABLED,
			AngularVirtualInstanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AngularVirtualInstanceModelImpl.ENTITY_CACHE_ENABLED,
			AngularVirtualInstanceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public AngularVirtualInstancePersistenceImpl() {
		setModelClass(AngularVirtualInstance.class);
	}

	/**
	 * Caches the Virtual instance in the entity cache if it is enabled.
	 *
	 * @param angularVirtualInstance the Virtual instance
	 */
	@Override
	public void cacheResult(AngularVirtualInstance angularVirtualInstance) {
		entityCache.putResult(AngularVirtualInstanceModelImpl.ENTITY_CACHE_ENABLED,
			AngularVirtualInstanceImpl.class,
			angularVirtualInstance.getPrimaryKey(), angularVirtualInstance);

		angularVirtualInstance.resetOriginalValues();
	}

	/**
	 * Caches the Virtual instances in the entity cache if it is enabled.
	 *
	 * @param angularVirtualInstances the Virtual instances
	 */
	@Override
	public void cacheResult(
		List<AngularVirtualInstance> angularVirtualInstances) {
		for (AngularVirtualInstance angularVirtualInstance : angularVirtualInstances) {
			if (entityCache.getResult(
						AngularVirtualInstanceModelImpl.ENTITY_CACHE_ENABLED,
						AngularVirtualInstanceImpl.class,
						angularVirtualInstance.getPrimaryKey()) == null) {
				cacheResult(angularVirtualInstance);
			}
			else {
				angularVirtualInstance.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all Virtual instances.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AngularVirtualInstanceImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the Virtual instance.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AngularVirtualInstance angularVirtualInstance) {
		entityCache.removeResult(AngularVirtualInstanceModelImpl.ENTITY_CACHE_ENABLED,
			AngularVirtualInstanceImpl.class,
			angularVirtualInstance.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AngularVirtualInstance> angularVirtualInstances) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AngularVirtualInstance angularVirtualInstance : angularVirtualInstances) {
			entityCache.removeResult(AngularVirtualInstanceModelImpl.ENTITY_CACHE_ENABLED,
				AngularVirtualInstanceImpl.class,
				angularVirtualInstance.getPrimaryKey());
		}
	}

	/**
	 * Creates a new Virtual instance with the primary key. Does not add the Virtual instance to the database.
	 *
	 * @param virtualInstanceId the primary key for the new Virtual instance
	 * @return the new Virtual instance
	 */
	@Override
	public AngularVirtualInstance create(long virtualInstanceId) {
		AngularVirtualInstance angularVirtualInstance = new AngularVirtualInstanceImpl();

		angularVirtualInstance.setNew(true);
		angularVirtualInstance.setPrimaryKey(virtualInstanceId);

		return angularVirtualInstance;
	}

	/**
	 * Removes the Virtual instance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param virtualInstanceId the primary key of the Virtual instance
	 * @return the Virtual instance that was removed
	 * @throws NoSuchAngularVirtualInstanceException if a Virtual instance with the primary key could not be found
	 */
	@Override
	public AngularVirtualInstance remove(long virtualInstanceId)
		throws NoSuchAngularVirtualInstanceException {
		return remove((Serializable)virtualInstanceId);
	}

	/**
	 * Removes the Virtual instance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the Virtual instance
	 * @return the Virtual instance that was removed
	 * @throws NoSuchAngularVirtualInstanceException if a Virtual instance with the primary key could not be found
	 */
	@Override
	public AngularVirtualInstance remove(Serializable primaryKey)
		throws NoSuchAngularVirtualInstanceException {
		Session session = null;

		try {
			session = openSession();

			AngularVirtualInstance angularVirtualInstance = (AngularVirtualInstance)session.get(AngularVirtualInstanceImpl.class,
					primaryKey);

			if (angularVirtualInstance == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAngularVirtualInstanceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(angularVirtualInstance);
		}
		catch (NoSuchAngularVirtualInstanceException nsee) {
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
	protected AngularVirtualInstance removeImpl(
		AngularVirtualInstance angularVirtualInstance) {
		angularVirtualInstance = toUnwrappedModel(angularVirtualInstance);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(angularVirtualInstance)) {
				angularVirtualInstance = (AngularVirtualInstance)session.get(AngularVirtualInstanceImpl.class,
						angularVirtualInstance.getPrimaryKeyObj());
			}

			if (angularVirtualInstance != null) {
				session.delete(angularVirtualInstance);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (angularVirtualInstance != null) {
			clearCache(angularVirtualInstance);
		}

		return angularVirtualInstance;
	}

	@Override
	public AngularVirtualInstance updateImpl(
		AngularVirtualInstance angularVirtualInstance) {
		angularVirtualInstance = toUnwrappedModel(angularVirtualInstance);

		boolean isNew = angularVirtualInstance.isNew();

		Session session = null;

		try {
			session = openSession();

			if (angularVirtualInstance.isNew()) {
				session.save(angularVirtualInstance);

				angularVirtualInstance.setNew(false);
			}
			else {
				angularVirtualInstance = (AngularVirtualInstance)session.merge(angularVirtualInstance);
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

		entityCache.putResult(AngularVirtualInstanceModelImpl.ENTITY_CACHE_ENABLED,
			AngularVirtualInstanceImpl.class,
			angularVirtualInstance.getPrimaryKey(), angularVirtualInstance,
			false);

		angularVirtualInstance.resetOriginalValues();

		return angularVirtualInstance;
	}

	protected AngularVirtualInstance toUnwrappedModel(
		AngularVirtualInstance angularVirtualInstance) {
		if (angularVirtualInstance instanceof AngularVirtualInstanceImpl) {
			return angularVirtualInstance;
		}

		AngularVirtualInstanceImpl angularVirtualInstanceImpl = new AngularVirtualInstanceImpl();

		angularVirtualInstanceImpl.setNew(angularVirtualInstance.isNew());
		angularVirtualInstanceImpl.setPrimaryKey(angularVirtualInstance.getPrimaryKey());

		angularVirtualInstanceImpl.setVirtualInstanceId(angularVirtualInstance.getVirtualInstanceId());

		return angularVirtualInstanceImpl;
	}

	/**
	 * Returns the Virtual instance with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the Virtual instance
	 * @return the Virtual instance
	 * @throws NoSuchAngularVirtualInstanceException if a Virtual instance with the primary key could not be found
	 */
	@Override
	public AngularVirtualInstance findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAngularVirtualInstanceException {
		AngularVirtualInstance angularVirtualInstance = fetchByPrimaryKey(primaryKey);

		if (angularVirtualInstance == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAngularVirtualInstanceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return angularVirtualInstance;
	}

	/**
	 * Returns the Virtual instance with the primary key or throws a {@link NoSuchAngularVirtualInstanceException} if it could not be found.
	 *
	 * @param virtualInstanceId the primary key of the Virtual instance
	 * @return the Virtual instance
	 * @throws NoSuchAngularVirtualInstanceException if a Virtual instance with the primary key could not be found
	 */
	@Override
	public AngularVirtualInstance findByPrimaryKey(long virtualInstanceId)
		throws NoSuchAngularVirtualInstanceException {
		return findByPrimaryKey((Serializable)virtualInstanceId);
	}

	/**
	 * Returns the Virtual instance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the Virtual instance
	 * @return the Virtual instance, or <code>null</code> if a Virtual instance with the primary key could not be found
	 */
	@Override
	public AngularVirtualInstance fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AngularVirtualInstanceModelImpl.ENTITY_CACHE_ENABLED,
				AngularVirtualInstanceImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AngularVirtualInstance angularVirtualInstance = (AngularVirtualInstance)serializable;

		if (angularVirtualInstance == null) {
			Session session = null;

			try {
				session = openSession();

				angularVirtualInstance = (AngularVirtualInstance)session.get(AngularVirtualInstanceImpl.class,
						primaryKey);

				if (angularVirtualInstance != null) {
					cacheResult(angularVirtualInstance);
				}
				else {
					entityCache.putResult(AngularVirtualInstanceModelImpl.ENTITY_CACHE_ENABLED,
						AngularVirtualInstanceImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AngularVirtualInstanceModelImpl.ENTITY_CACHE_ENABLED,
					AngularVirtualInstanceImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return angularVirtualInstance;
	}

	/**
	 * Returns the Virtual instance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param virtualInstanceId the primary key of the Virtual instance
	 * @return the Virtual instance, or <code>null</code> if a Virtual instance with the primary key could not be found
	 */
	@Override
	public AngularVirtualInstance fetchByPrimaryKey(long virtualInstanceId) {
		return fetchByPrimaryKey((Serializable)virtualInstanceId);
	}

	@Override
	public Map<Serializable, AngularVirtualInstance> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AngularVirtualInstance> map = new HashMap<Serializable, AngularVirtualInstance>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AngularVirtualInstance angularVirtualInstance = fetchByPrimaryKey(primaryKey);

			if (angularVirtualInstance != null) {
				map.put(primaryKey, angularVirtualInstance);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AngularVirtualInstanceModelImpl.ENTITY_CACHE_ENABLED,
					AngularVirtualInstanceImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AngularVirtualInstance)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ANGULARVIRTUALINSTANCE_WHERE_PKS_IN);

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

			for (AngularVirtualInstance angularVirtualInstance : (List<AngularVirtualInstance>)q.list()) {
				map.put(angularVirtualInstance.getPrimaryKeyObj(),
					angularVirtualInstance);

				cacheResult(angularVirtualInstance);

				uncachedPrimaryKeys.remove(angularVirtualInstance.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AngularVirtualInstanceModelImpl.ENTITY_CACHE_ENABLED,
					AngularVirtualInstanceImpl.class, primaryKey, nullModel);
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
	 * Returns all the Virtual instances.
	 *
	 * @return the Virtual instances
	 */
	@Override
	public List<AngularVirtualInstance> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Virtual instances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularVirtualInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Virtual instances
	 * @param end the upper bound of the range of Virtual instances (not inclusive)
	 * @return the range of Virtual instances
	 */
	@Override
	public List<AngularVirtualInstance> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the Virtual instances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularVirtualInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Virtual instances
	 * @param end the upper bound of the range of Virtual instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of Virtual instances
	 */
	@Override
	public List<AngularVirtualInstance> findAll(int start, int end,
		OrderByComparator<AngularVirtualInstance> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the Virtual instances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularVirtualInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Virtual instances
	 * @param end the upper bound of the range of Virtual instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of Virtual instances
	 */
	@Override
	public List<AngularVirtualInstance> findAll(int start, int end,
		OrderByComparator<AngularVirtualInstance> orderByComparator,
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

		List<AngularVirtualInstance> list = null;

		if (retrieveFromCache) {
			list = (List<AngularVirtualInstance>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ANGULARVIRTUALINSTANCE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ANGULARVIRTUALINSTANCE;

				if (pagination) {
					sql = sql.concat(AngularVirtualInstanceModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AngularVirtualInstance>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AngularVirtualInstance>)QueryUtil.list(q,
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
	 * Removes all the Virtual instances from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AngularVirtualInstance angularVirtualInstance : findAll()) {
			remove(angularVirtualInstance);
		}
	}

	/**
	 * Returns the number of Virtual instances.
	 *
	 * @return the number of Virtual instances
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ANGULARVIRTUALINSTANCE);

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
		return AngularVirtualInstanceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the Virtual instance persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AngularVirtualInstanceImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ANGULARVIRTUALINSTANCE = "SELECT angularVirtualInstance FROM AngularVirtualInstance angularVirtualInstance";
	private static final String _SQL_SELECT_ANGULARVIRTUALINSTANCE_WHERE_PKS_IN = "SELECT angularVirtualInstance FROM AngularVirtualInstance angularVirtualInstance WHERE virtualInstanceId IN (";
	private static final String _SQL_COUNT_ANGULARVIRTUALINSTANCE = "SELECT COUNT(angularVirtualInstance) FROM AngularVirtualInstance angularVirtualInstance";
	private static final String _ORDER_BY_ENTITY_ALIAS = "angularVirtualInstance.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AngularVirtualInstance exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(AngularVirtualInstancePersistenceImpl.class);
}