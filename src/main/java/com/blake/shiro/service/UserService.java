package com.blake.shiro.service;

import java.util.List;
import java.util.Set;

import com.blake.base.service.BaseService;
import com.blake.entiyi.User;

public interface UserService extends BaseService<User>{
	public User login(String username);
	public List<User> findUsersByAcccountAndPass(String username, String password);
	/**��ȡ��ɫ*/
	public Set<String> findRoles(String username);
	/**��ȡȨ��*/
	public Set<String> findPermissions(String username);
}
