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

import eu.gerhards.liferay.services.angular.exception.NoSuchAngularInstanceException;
import eu.gerhards.liferay.services.angular.model.AngularInstance;
import eu.gerhards.liferay.services.angular.model.impl.AngularInstanceImpl;
import eu.gerhards.liferay.services.angular.model.impl.AngularInstanceModelImpl;
import eu.gerhards.liferay.services.angular.service.persistence.AngularInstancePersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the Instance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularInstancePersistence
 * @see eu.gerhards.liferay.services.angular.service.persistence.AngularInstanceUtil
 * @generated
 */
@ProviderType
public class AngularInstancePersistenceImpl extends BasePersistenceImpl<AngularInstance>
	implements AngularInstancePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AngularInstanceUtil} to access the Instance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AngularInstanceImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AngularInstanceModelImpl.ENTITY_CACHE_ENABLED,
			AngularInstanceModelImpl.FINDER_CACHE_ENABLED,
			AngularInstanceImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AngularInstanceModelImpl.ENTITY_CACHE_ENABLED,
			AngularInstanceModelImpl.FINDER_CACHE_ENABLED,
			AngularInstanceImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AngularInstanceModelImpl.ENTITY_CACHE_ENABLED,
			AngularInstanceModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public AngularInstancePersistenceImpl() {
		setModelClass(AngularInstance.class);
	}

	/**
	 * Caches the Instance in the entity cache if it is enabled.
	 *
	 * @param angularInstance the Instance
	 */
	@Override
	public void cacheResult(AngularInstance angularInstance) {
		entityCache.putResult(AngularInstanceModelImpl.ENTITY_CACHE_ENABLED,
			AngularInstanceImpl.class, angularInstance.getPrimaryKey(),
			angularInstance);

		angularInstance.resetOriginalValues();
	}

	/**
	 * Caches the Instances in the entity cache if it is enabled.
	 *
	 * @param angularInstances the Instances
	 */
	@Override
	public void cacheResult(List<AngularInstance> angularInstances) {
		for (AngularInstance angularInstance : angularInstances) {
			if (entityCache.getResult(
						AngularInstanceModelImpl.ENTITY_CACHE_ENABLED,
						AngularInstanceImpl.class,
						angularInstance.getPrimaryKey()) == null) {
				cacheResult(angularInstance);
			}
			else {
				angularInstance.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all Instances.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AngularInstanceImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the Instance.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AngularInstance angularInstance) {
		entityCache.removeResult(AngularInstanceModelImpl.ENTITY_CACHE_ENABLED,
			AngularInstanceImpl.class, angularInstance.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AngularInstance> angularInstances) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AngularInstance angularInstance : angularInstances) {
			entityCache.removeResult(AngularInstanceModelImpl.ENTITY_CACHE_ENABLED,
				AngularInstanceImpl.class, angularInstance.getPrimaryKey());
		}
	}

	/**
	 * Creates a new Instance with the primary key. Does not add the Instance to the database.
	 *
	 * @param instanceId the primary key for the new Instance
	 * @return the new Instance
	 */
	@Override
	public AngularInstance create(long instanceId) {
		AngularInstance angularInstance = new AngularInstanceImpl();

		angularInstance.setNew(true);
		angularInstance.setPrimaryKey(instanceId);

		return angularInstance;
	}

	/**
	 * Removes the Instance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param instanceId the primary key of the Instance
	 * @return the Instance that was removed
	 * @throws NoSuchAngularInstanceException if a Instance with the primary key could not be found
	 */
	@Override
	public AngularInstance remove(long instanceId)
		throws NoSuchAngularInstanceException {
		return remove((Serializable)instanceId);
	}

	/**
	 * Removes the Instance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the Instance
	 * @return the Instance that was removed
	 * @throws NoSuchAngularInstanceException if a Instance with the primary key could not be found
	 */
	@Override
	public AngularInstance remove(Serializable primaryKey)
		throws NoSuchAngularInstanceException {
		Session session = null;

		try {
			session = openSession();

			AngularInstance angularInstance = (AngularInstance)session.get(AngularInstanceImpl.class,
					primaryKey);

			if (angularInstance == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAngularInstanceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(angularInstance);
		}
		catch (NoSuchAngularInstanceException nsee) {
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
	protected AngularInstance removeImpl(AngularInstance angularInstance) {
		angularInstance = toUnwrappedModel(angularInstance);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(angularInstance)) {
				angularInstance = (AngularInstance)session.get(AngularInstanceImpl.class,
						angularInstance.getPrimaryKeyObj());
			}

			if (angularInstance != null) {
				session.delete(angularInstance);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (angularInstance != null) {
			clearCache(angularInstance);
		}

		return angularInstance;
	}

	@Override
	public AngularInstance updateImpl(AngularInstance angularInstance) {
		angularInstance = toUnwrappedModel(angularInstance);

		boolean isNew = angularInstance.isNew();

		Session session = null;

		try {
			session = openSession();

			if (angularInstance.isNew()) {
				session.save(angularInstance);

				angularInstance.setNew(false);
			}
			else {
				angularInstance = (AngularInstance)session.merge(angularInstance);
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

		entityCache.putResult(AngularInstanceModelImpl.ENTITY_CACHE_ENABLED,
			AngularInstanceImpl.class, angularInstance.getPrimaryKey(),
			angularInstance, false);

		angularInstance.resetOriginalValues();

		return angularInstance;
	}

	protected AngularInstance toUnwrappedModel(AngularInstance angularInstance) {
		if (angularInstance instanceof AngularInstanceImpl) {
			return angularInstance;
		}

		AngularInstanceImpl angularInstanceImpl = new AngularInstanceImpl();

		angularInstanceImpl.setNew(angularInstance.isNew());
		angularInstanceImpl.setPrimaryKey(angularInstance.getPrimaryKey());

		angularInstanceImpl.setInstanceId(angularInstance.getInstanceId());

		return angularInstanceImpl;
	}

	/**
	 * Returns the Instance with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the Instance
	 * @return the Instance
	 * @throws NoSuchAngularInstanceException if a Instance with the primary key could not be found
	 */
	@Override
	public AngularInstance findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAngularInstanceException {
		AngularInstance angularInstance = fetchByPrimaryKey(primaryKey);

		if (angularInstance == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAngularInstanceException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return angularInstance;
	}

	/**
	 * Returns the Instance with the primary key or throws a {@link NoSuchAngularInstanceException} if it could not be found.
	 *
	 * @param instanceId the primary key of the Instance
	 * @return the Instance
	 * @throws NoSuchAngularInstanceException if a Instance with the primary key could not be found
	 */
	@Override
	public AngularInstance findByPrimaryKey(long instanceId)
		throws NoSuchAngularInstanceException {
		return findByPrimaryKey((Serializable)instanceId);
	}

	/**
	 * Returns the Instance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the Instance
	 * @return the Instance, or <code>null</code> if a Instance with the primary key could not be found
	 */
	@Override
	public AngularInstance fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AngularInstanceModelImpl.ENTITY_CACHE_ENABLED,
				AngularInstanceImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AngularInstance angularInstance = (AngularInstance)serializable;

		if (angularInstance == null) {
			Session session = null;

			try {
				session = openSession();

				angularInstance = (AngularInstance)session.get(AngularInstanceImpl.class,
						primaryKey);

				if (angularInstance != null) {
					cacheResult(angularInstance);
				}
				else {
					entityCache.putResult(AngularInstanceModelImpl.ENTITY_CACHE_ENABLED,
						AngularInstanceImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AngularInstanceModelImpl.ENTITY_CACHE_ENABLED,
					AngularInstanceImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return angularInstance;
	}

	/**
	 * Returns the Instance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param instanceId the primary key of the Instance
	 * @return the Instance, or <code>null</code> if a Instance with the primary key could not be found
	 */
	@Override
	public AngularInstance fetchByPrimaryKey(long instanceId) {
		return fetchByPrimaryKey((Serializable)instanceId);
	}

	@Override
	public Map<Serializable, AngularInstance> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AngularInstance> map = new HashMap<Serializable, AngularInstance>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AngularInstance angularInstance = fetchByPrimaryKey(primaryKey);

			if (angularInstance != null) {
				map.put(primaryKey, angularInstance);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AngularInstanceModelImpl.ENTITY_CACHE_ENABLED,
					AngularInstanceImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AngularInstance)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ANGULARINSTANCE_WHERE_PKS_IN);

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

			for (AngularInstance angularInstance : (List<AngularInstance>)q.list()) {
				map.put(angularInstance.getPrimaryKeyObj(), angularInstance);

				cacheResult(angularInstance);

				uncachedPrimaryKeys.remove(angularInstance.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AngularInstanceModelImpl.ENTITY_CACHE_ENABLED,
					AngularInstanceImpl.class, primaryKey, nullModel);
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
	 * Returns all the Instances.
	 *
	 * @return the Instances
	 */
	@Override
	public List<AngularInstance> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Instances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Instances
	 * @param end the upper bound of the range of Instances (not inclusive)
	 * @return the range of Instances
	 */
	@Override
	public List<AngularInstance> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the Instances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Instances
	 * @param end the upper bound of the range of Instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of Instances
	 */
	@Override
	public List<AngularInstance> findAll(int start, int end,
		OrderByComparator<AngularInstance> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the Instances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularInstanceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Instances
	 * @param end the upper bound of the range of Instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of Instances
	 */
	@Override
	public List<AngularInstance> findAll(int start, int end,
		OrderByComparator<AngularInstance> orderByComparator,
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

		List<AngularInstance> list = null;

		if (retrieveFromCache) {
			list = (List<AngularInstance>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ANGULARINSTANCE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ANGULARINSTANCE;

				if (pagination) {
					sql = sql.concat(AngularInstanceModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AngularInstance>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AngularInstance>)QueryUtil.list(q,
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
	 * Removes all the Instances from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AngularInstance angularInstance : findAll()) {
			remove(angularInstance);
		}
	}

	/**
	 * Returns the number of Instances.
	 *
	 * @return the number of Instances
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ANGULARINSTANCE);

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
		return AngularInstanceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the Instance persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AngularInstanceImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ANGULARINSTANCE = "SELECT angularInstance FROM AngularInstance angularInstance";
	private static final String _SQL_SELECT_ANGULARINSTANCE_WHERE_PKS_IN = "SELECT angularInstance FROM AngularInstance angularInstance WHERE instanceId IN (";
	private static final String _SQL_COUNT_ANGULARINSTANCE = "SELECT COUNT(angularInstance) FROM AngularInstance angularInstance";
	private static final String _ORDER_BY_ENTITY_ALIAS = "angularInstance.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AngularInstance exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(AngularInstancePersistenceImpl.class);
}