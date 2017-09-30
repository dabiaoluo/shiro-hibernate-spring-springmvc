package com.blake.base.service;

import java.io.Serializable;
import java.util.List;

import com.blake.base.dao.PageResult;


public interface BaseService<T> {
	/**
	 * ����
	 * @param entity
	 */
	public  void save(T entity);
	/**
	 * ����
	 * @param entity
	 */
	public  void update(T entity);
	/**
	 * ����idɾ��
	 * @param entityClass
	 * @param id
	 */
	public  void delete(Serializable id);
	/**
	 * ����id����
	 * @param entityClass
	 * @param id
	 * @return
	 */
	public  T findObjectById(Serializable id);
	/**
	 * �����б�
	 */
	public  List<T> findObjects();
	
	/**������ѯʵ���б�--��ѯ����queryHelper*/
	/**����ɾ��*/
	public  void delete(Serializable[] ids);
	/**��ȡ��ҳʵ��*/
	public  PageResult getPages(Integer pageNo,Integer pageSize);
}
