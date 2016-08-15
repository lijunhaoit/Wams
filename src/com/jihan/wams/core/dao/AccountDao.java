package com.jihan.wams.core.dao;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.jihan.wams.core.entity.Account;

public interface AccountDao<T> {
	public boolean addAccount(T entity) throws DataAccessException;
	public T getAccount(Integer id) throws DataAccessException; 
	public List<Account> getList() throws DataAccessException;

}
