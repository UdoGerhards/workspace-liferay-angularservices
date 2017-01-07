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
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import eu.gerhards.liferay.services.angular.exception.NoSuchAngularResourceBlockException;
import eu.gerhards.liferay.services.angular.model.AngularResourceBlock;
import eu.gerhards.liferay.services.angular.model.impl.AngularResourceBlockImpl;
import eu.gerhards.liferay.services.angular.model.impl.AngularResourceBlockModelImpl;
import eu.gerhards.liferay.services.angular.service.persistence.AngularResourceBlockPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the Resource block service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AngularResourceBlockPersistence
 * @see eu.gerhards.liferay.services.angular.service.persistence.AngularResourceBlockUtil
 * @generated
 */
@ProviderType
public class AngularResourceBlockPersistenceImpl extends BasePersistenceImpl<AngularResourceBlock>
	implements AngularResourceBlockPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AngularResourceBlockUtil} to access the Resource block persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AngularResourceBlockImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AngularResourceBlockModelImpl.ENTITY_CACHE_ENABLED,
			AngularResourceBlockModelImpl.FINDER_CACHE_ENABLED,
			AngularResourceBlockImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AngularResourceBlockModelImpl.ENTITY_CACHE_ENABLED,
			AngularResourceBlockModelImpl.FINDER_CACHE_ENABLED,
			AngularResourceBlockImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AngularResourceBlockModelImpl.ENTITY_CACHE_ENABLED,
			AngularResourceBlockModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_RESOURCEBLOCKID =
		new FinderPath(AngularResourceBlockModelImpl.ENTITY_CACHE_ENABLED,
			AngularResourceBlockModelImpl.FINDER_CACHE_ENABLED,
			AngularResourceBlockImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByResourceBlockId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RESOURCEBLOCKID =
		new FinderPath(AngularResourceBlockModelImpl.ENTITY_CACHE_ENABLED,
			AngularResourceBlockModelImpl.FINDER_CACHE_ENABLED,
			AngularResourceBlockImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByResourceBlockId",
			new String[] { Long.class.getName() },
			AngularResourceBlockModelImpl.RESOURCEBLOCKID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_RESOURCEBLOCKID = new FinderPath(AngularResourceBlockModelImpl.ENTITY_CACHE_ENABLED,
			AngularResourceBlockModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByResourceBlockId", new String[] { Long.class.getName() });

	/**
	 * Returns all the Resource blocks where resourceBlockId = &#63;.
	 *
	 * @param resourceBlockId the resource block ID
	 * @return the matching Resource blocks
	 */
	@Override
	public List<AngularResourceBlock> findByResourceBlockId(
		long resourceBlockId) {
		return findByResourceBlockId(resourceBlockId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Resource blocks where resourceBlockId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularResourceBlockModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param resourceBlockId the resource block ID
	 * @param start the lower bound of the range of Resource blocks
	 * @param end the upper bound of the range of Resource blocks (not inclusive)
	 * @return the range of matching Resource blocks
	 */
	@Override
	public List<AngularResourceBlock> findByResourceBlockId(
		long resourceBlockId, int start, int end) {
		return findByResourceBlockId(resourceBlockId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the Resource blocks where resourceBlockId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularResourceBlockModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param resourceBlockId the resource block ID
	 * @param start the lower bound of the range of Resource blocks
	 * @param end the upper bound of the range of Resource blocks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching Resource blocks
	 */
	@Override
	public List<AngularResourceBlock> findByResourceBlockId(
		long resourceBlockId, int start, int end,
		OrderByComparator<AngularResourceBlock> orderByComparator) {
		return findByResourceBlockId(resourceBlockId, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the Resource blocks where resourceBlockId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularResourceBlockModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param resourceBlockId the resource block ID
	 * @param start the lower bound of the range of Resource blocks
	 * @param end the upper bound of the range of Resource blocks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching Resource blocks
	 */
	@Override
	public List<AngularResourceBlock> findByResourceBlockId(
		long resourceBlockId, int start, int end,
		OrderByComparator<AngularResourceBlock> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RESOURCEBLOCKID;
			finderArgs = new Object[] { resourceBlockId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_RESOURCEBLOCKID;
			finderArgs = new Object[] {
					resourceBlockId,
					
					start, end, orderByComparator
				};
		}

		List<AngularResourceBlock> list = null;

		if (retrieveFromCache) {
			list = (List<AngularResourceBlock>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AngularResourceBlock angularResourceBlock : list) {
					if ((resourceBlockId != angularResourceBlock.getResourceBlockId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_ANGULARRESOURCEBLOCK_WHERE);

			query.append(_FINDER_COLUMN_RESOURCEBLOCKID_RESOURCEBLOCKID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AngularResourceBlockModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(resourceBlockId);

				if (!pagination) {
					list = (List<AngularResourceBlock>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AngularResourceBlock>)QueryUtil.list(q,
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
	 * Returns the first Resource block in the ordered set where resourceBlockId = &#63;.
	 *
	 * @param resourceBlockId the resource block ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Resource block
	 * @throws NoSuchAngularResourceBlockException if a matching Resource block could not be found
	 */
	@Override
	public AngularResourceBlock findByResourceBlockId_First(
		long resourceBlockId,
		OrderByComparator<AngularResourceBlock> orderByComparator)
		throws NoSuchAngularResourceBlockException {
		AngularResourceBlock angularResourceBlock = fetchByResourceBlockId_First(resourceBlockId,
				orderByComparator);

		if (angularResourceBlock != null) {
			return angularResourceBlock;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("resourceBlockId=");
		msg.append(resourceBlockId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAngularResourceBlockException(msg.toString());
	}

	/**
	 * Returns the first Resource block in the ordered set where resourceBlockId = &#63;.
	 *
	 * @param resourceBlockId the resource block ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching Resource block, or <code>null</code> if a matching Resource block could not be found
	 */
	@Override
	public AngularResourceBlock fetchByResourceBlockId_First(
		long resourceBlockId,
		OrderByComparator<AngularResourceBlock> orderByComparator) {
		List<AngularResourceBlock> list = findByResourceBlockId(resourceBlockId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last Resource block in the ordered set where resourceBlockId = &#63;.
	 *
	 * @param resourceBlockId the resource block ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Resource block
	 * @throws NoSuchAngularResourceBlockException if a matching Resource block could not be found
	 */
	@Override
	public AngularResourceBlock findByResourceBlockId_Last(
		long resourceBlockId,
		OrderByComparator<AngularResourceBlock> orderByComparator)
		throws NoSuchAngularResourceBlockException {
		AngularResourceBlock angularResourceBlock = fetchByResourceBlockId_Last(resourceBlockId,
				orderByComparator);

		if (angularResourceBlock != null) {
			return angularResourceBlock;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("resourceBlockId=");
		msg.append(resourceBlockId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAngularResourceBlockException(msg.toString());
	}

	/**
	 * Returns the last Resource block in the ordered set where resourceBlockId = &#63;.
	 *
	 * @param resourceBlockId the resource block ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching Resource block, or <code>null</code> if a matching Resource block could not be found
	 */
	@Override
	public AngularResourceBlock fetchByResourceBlockId_Last(
		long resourceBlockId,
		OrderByComparator<AngularResourceBlock> orderByComparator) {
		int count = countByResourceBlockId(resourceBlockId);

		if (count == 0) {
			return null;
		}

		List<AngularResourceBlock> list = findByResourceBlockId(resourceBlockId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the Resource blocks where resourceBlockId = &#63; from the database.
	 *
	 * @param resourceBlockId the resource block ID
	 */
	@Override
	public void removeByResourceBlockId(long resourceBlockId) {
		for (AngularResourceBlock angularResourceBlock : findByResourceBlockId(
				resourceBlockId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(angularResourceBlock);
		}
	}

	/**
	 * Returns the number of Resource blocks where resourceBlockId = &#63;.
	 *
	 * @param resourceBlockId the resource block ID
	 * @return the number of matching Resource blocks
	 */
	@Override
	public int countByResourceBlockId(long resourceBlockId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_RESOURCEBLOCKID;

		Object[] finderArgs = new Object[] { resourceBlockId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ANGULARRESOURCEBLOCK_WHERE);

			query.append(_FINDER_COLUMN_RESOURCEBLOCKID_RESOURCEBLOCKID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(resourceBlockId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_RESOURCEBLOCKID_RESOURCEBLOCKID_2 =
		"angularResourceBlock.resourceBlockId = ?";

	public AngularResourceBlockPersistenceImpl() {
		setModelClass(AngularResourceBlock.class);
	}

	/**
	 * Caches the Resource block in the entity cache if it is enabled.
	 *
	 * @param angularResourceBlock the Resource block
	 */
	@Override
	public void cacheResult(AngularResourceBlock angularResourceBlock) {
		entityCache.putResult(AngularResourceBlockModelImpl.ENTITY_CACHE_ENABLED,
			AngularResourceBlockImpl.class,
			angularResourceBlock.getPrimaryKey(), angularResourceBlock);

		angularResourceBlock.resetOriginalValues();
	}

	/**
	 * Caches the Resource blocks in the entity cache if it is enabled.
	 *
	 * @param angularResourceBlocks the Resource blocks
	 */
	@Override
	public void cacheResult(List<AngularResourceBlock> angularResourceBlocks) {
		for (AngularResourceBlock angularResourceBlock : angularResourceBlocks) {
			if (entityCache.getResult(
						AngularResourceBlockModelImpl.ENTITY_CACHE_ENABLED,
						AngularResourceBlockImpl.class,
						angularResourceBlock.getPrimaryKey()) == null) {
				cacheResult(angularResourceBlock);
			}
			else {
				angularResourceBlock.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all Resource blocks.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AngularResourceBlockImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the Resource block.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AngularResourceBlock angularResourceBlock) {
		entityCache.removeResult(AngularResourceBlockModelImpl.ENTITY_CACHE_ENABLED,
			AngularResourceBlockImpl.class, angularResourceBlock.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AngularResourceBlock> angularResourceBlocks) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AngularResourceBlock angularResourceBlock : angularResourceBlocks) {
			entityCache.removeResult(AngularResourceBlockModelImpl.ENTITY_CACHE_ENABLED,
				AngularResourceBlockImpl.class,
				angularResourceBlock.getPrimaryKey());
		}
	}

	/**
	 * Creates a new Resource block with the primary key. Does not add the Resource block to the database.
	 *
	 * @param resourceBlockId the primary key for the new Resource block
	 * @return the new Resource block
	 */
	@Override
	public AngularResourceBlock create(long resourceBlockId) {
		AngularResourceBlock angularResourceBlock = new AngularResourceBlockImpl();

		angularResourceBlock.setNew(true);
		angularResourceBlock.setPrimaryKey(resourceBlockId);

		return angularResourceBlock;
	}

	/**
	 * Removes the Resource block with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param resourceBlockId the primary key of the Resource block
	 * @return the Resource block that was removed
	 * @throws NoSuchAngularResourceBlockException if a Resource block with the primary key could not be found
	 */
	@Override
	public AngularResourceBlock remove(long resourceBlockId)
		throws NoSuchAngularResourceBlockException {
		return remove((Serializable)resourceBlockId);
	}

	/**
	 * Removes the Resource block with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the Resource block
	 * @return the Resource block that was removed
	 * @throws NoSuchAngularResourceBlockException if a Resource block with the primary key could not be found
	 */
	@Override
	public AngularResourceBlock remove(Serializable primaryKey)
		throws NoSuchAngularResourceBlockException {
		Session session = null;

		try {
			session = openSession();

			AngularResourceBlock angularResourceBlock = (AngularResourceBlock)session.get(AngularResourceBlockImpl.class,
					primaryKey);

			if (angularResourceBlock == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAngularResourceBlockException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(angularResourceBlock);
		}
		catch (NoSuchAngularResourceBlockException nsee) {
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
	protected AngularResourceBlock removeImpl(
		AngularResourceBlock angularResourceBlock) {
		angularResourceBlock = toUnwrappedModel(angularResourceBlock);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(angularResourceBlock)) {
				angularResourceBlock = (AngularResourceBlock)session.get(AngularResourceBlockImpl.class,
						angularResourceBlock.getPrimaryKeyObj());
			}

			if (angularResourceBlock != null) {
				session.delete(angularResourceBlock);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (angularResourceBlock != null) {
			clearCache(angularResourceBlock);
		}

		return angularResourceBlock;
	}

	@Override
	public AngularResourceBlock updateImpl(
		AngularResourceBlock angularResourceBlock) {
		angularResourceBlock = toUnwrappedModel(angularResourceBlock);

		boolean isNew = angularResourceBlock.isNew();

		AngularResourceBlockModelImpl angularResourceBlockModelImpl = (AngularResourceBlockModelImpl)angularResourceBlock;

		Session session = null;

		try {
			session = openSession();

			if (angularResourceBlock.isNew()) {
				session.save(angularResourceBlock);

				angularResourceBlock.setNew(false);
			}
			else {
				angularResourceBlock = (AngularResourceBlock)session.merge(angularResourceBlock);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AngularResourceBlockModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((angularResourceBlockModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RESOURCEBLOCKID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						angularResourceBlockModelImpl.getOriginalResourceBlockId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_RESOURCEBLOCKID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RESOURCEBLOCKID,
					args);

				args = new Object[] {
						angularResourceBlockModelImpl.getResourceBlockId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_RESOURCEBLOCKID,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RESOURCEBLOCKID,
					args);
			}
		}

		entityCache.putResult(AngularResourceBlockModelImpl.ENTITY_CACHE_ENABLED,
			AngularResourceBlockImpl.class,
			angularResourceBlock.getPrimaryKey(), angularResourceBlock, false);

		angularResourceBlock.resetOriginalValues();

		return angularResourceBlock;
	}

	protected AngularResourceBlock toUnwrappedModel(
		AngularResourceBlock angularResourceBlock) {
		if (angularResourceBlock instanceof AngularResourceBlockImpl) {
			return angularResourceBlock;
		}

		AngularResourceBlockImpl angularResourceBlockImpl = new AngularResourceBlockImpl();

		angularResourceBlockImpl.setNew(angularResourceBlock.isNew());
		angularResourceBlockImpl.setPrimaryKey(angularResourceBlock.getPrimaryKey());

		angularResourceBlockImpl.setResourceBlockId(angularResourceBlock.getResourceBlockId());

		return angularResourceBlockImpl;
	}

	/**
	 * Returns the Resource block with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the Resource block
	 * @return the Resource block
	 * @throws NoSuchAngularResourceBlockException if a Resource block with the primary key could not be found
	 */
	@Override
	public AngularResourceBlock findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAngularResourceBlockException {
		AngularResourceBlock angularResourceBlock = fetchByPrimaryKey(primaryKey);

		if (angularResourceBlock == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAngularResourceBlockException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return angularResourceBlock;
	}

	/**
	 * Returns the Resource block with the primary key or throws a {@link NoSuchAngularResourceBlockException} if it could not be found.
	 *
	 * @param resourceBlockId the primary key of the Resource block
	 * @return the Resource block
	 * @throws NoSuchAngularResourceBlockException if a Resource block with the primary key could not be found
	 */
	@Override
	public AngularResourceBlock findByPrimaryKey(long resourceBlockId)
		throws NoSuchAngularResourceBlockException {
		return findByPrimaryKey((Serializable)resourceBlockId);
	}

	/**
	 * Returns the Resource block with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the Resource block
	 * @return the Resource block, or <code>null</code> if a Resource block with the primary key could not be found
	 */
	@Override
	public AngularResourceBlock fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AngularResourceBlockModelImpl.ENTITY_CACHE_ENABLED,
				AngularResourceBlockImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AngularResourceBlock angularResourceBlock = (AngularResourceBlock)serializable;

		if (angularResourceBlock == null) {
			Session session = null;

			try {
				session = openSession();

				angularResourceBlock = (AngularResourceBlock)session.get(AngularResourceBlockImpl.class,
						primaryKey);

				if (angularResourceBlock != null) {
					cacheResult(angularResourceBlock);
				}
				else {
					entityCache.putResult(AngularResourceBlockModelImpl.ENTITY_CACHE_ENABLED,
						AngularResourceBlockImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AngularResourceBlockModelImpl.ENTITY_CACHE_ENABLED,
					AngularResourceBlockImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return angularResourceBlock;
	}

	/**
	 * Returns the Resource block with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param resourceBlockId the primary key of the Resource block
	 * @return the Resource block, or <code>null</code> if a Resource block with the primary key could not be found
	 */
	@Override
	public AngularResourceBlock fetchByPrimaryKey(long resourceBlockId) {
		return fetchByPrimaryKey((Serializable)resourceBlockId);
	}

	@Override
	public Map<Serializable, AngularResourceBlock> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AngularResourceBlock> map = new HashMap<Serializable, AngularResourceBlock>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AngularResourceBlock angularResourceBlock = fetchByPrimaryKey(primaryKey);

			if (angularResourceBlock != null) {
				map.put(primaryKey, angularResourceBlock);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AngularResourceBlockModelImpl.ENTITY_CACHE_ENABLED,
					AngularResourceBlockImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AngularResourceBlock)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ANGULARRESOURCEBLOCK_WHERE_PKS_IN);

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

			for (AngularResourceBlock angularResourceBlock : (List<AngularResourceBlock>)q.list()) {
				map.put(angularResourceBlock.getPrimaryKeyObj(),
					angularResourceBlock);

				cacheResult(angularResourceBlock);

				uncachedPrimaryKeys.remove(angularResourceBlock.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AngularResourceBlockModelImpl.ENTITY_CACHE_ENABLED,
					AngularResourceBlockImpl.class, primaryKey, nullModel);
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
	 * Returns all the Resource blocks.
	 *
	 * @return the Resource blocks
	 */
	@Override
	public List<AngularResourceBlock> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the Resource blocks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularResourceBlockModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Resource blocks
	 * @param end the upper bound of the range of Resource blocks (not inclusive)
	 * @return the range of Resource blocks
	 */
	@Override
	public List<AngularResourceBlock> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the Resource blocks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularResourceBlockModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Resource blocks
	 * @param end the upper bound of the range of Resource blocks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of Resource blocks
	 */
	@Override
	public List<AngularResourceBlock> findAll(int start, int end,
		OrderByComparator<AngularResourceBlock> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the Resource blocks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AngularResourceBlockModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of Resource blocks
	 * @param end the upper bound of the range of Resource blocks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of Resource blocks
	 */
	@Override
	public List<AngularResourceBlock> findAll(int start, int end,
		OrderByComparator<AngularResourceBlock> orderByComparator,
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

		List<AngularResourceBlock> list = null;

		if (retrieveFromCache) {
			list = (List<AngularResourceBlock>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ANGULARRESOURCEBLOCK);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ANGULARRESOURCEBLOCK;

				if (pagination) {
					sql = sql.concat(AngularResourceBlockModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AngularResourceBlock>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AngularResourceBlock>)QueryUtil.list(q,
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
	 * Removes all the Resource blocks from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AngularResourceBlock angularResourceBlock : findAll()) {
			remove(angularResourceBlock);
		}
	}

	/**
	 * Returns the number of Resource blocks.
	 *
	 * @return the number of Resource blocks
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ANGULARRESOURCEBLOCK);

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
		return AngularResourceBlockModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the Resource block persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AngularResourceBlockImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ANGULARRESOURCEBLOCK = "SELECT angularResourceBlock FROM AngularResourceBlock angularResourceBlock";
	private static final String _SQL_SELECT_ANGULARRESOURCEBLOCK_WHERE_PKS_IN = "SELECT angularResourceBlock FROM AngularResourceBlock angularResourceBlock WHERE resourceBlockId IN (";
	private static final String _SQL_SELECT_ANGULARRESOURCEBLOCK_WHERE = "SELECT angularResourceBlock FROM AngularResourceBlock angularResourceBlock WHERE ";
	private static final String _SQL_COUNT_ANGULARRESOURCEBLOCK = "SELECT COUNT(angularResourceBlock) FROM AngularResourceBlock angularResourceBlock";
	private static final String _SQL_COUNT_ANGULARRESOURCEBLOCK_WHERE = "SELECT COUNT(angularResourceBlock) FROM AngularResourceBlock angularResourceBlock WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "angularResourceBlock.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AngularResourceBlock exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AngularResourceBlock exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(AngularResourceBlockPersistenceImpl.class);
}