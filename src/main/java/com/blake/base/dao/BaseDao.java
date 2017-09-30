package com.blake.base.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao {
	// ����
	public <T> void save(T entity);

	// ����
	public <T> void update(T entity);

	public <T> void delete(Class<T> entityClass, Serializable[] ids);

	// ����idɾ��
	public <T> void delete(Class<T> entityClass, Serializable id);

	// ����id����
	public <T> T findObjectById(Class<T> entityClass, Serializable id);

	// �����б�
	public <T> List<T> findObjects(Class<T> entityClass);

	@Deprecated
	/** ��ѯ ���� */
	public <T> List<T> findObjecTs_(String hql, List<Object> params);
	
	public <T> PageResult getPages(Integer pageNo,Integer pageSize,Class<T> entityClass);

}
