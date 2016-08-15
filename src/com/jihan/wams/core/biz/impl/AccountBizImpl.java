package com.jihan.wams.core.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.jihan.wams.core.biz.AccountBiz;
import com.jihan.wams.core.dao.AccountDao;
import com.jihan.wams.core.entity.Account;
import com.jihan.wams.core.excption.BizException;
@Service("accountBizImpl")
public class AccountBizImpl<T extends Account> implements AccountBiz<T> {

	@Autowired
	@Qualifier("accountDaoImpl")
	private AccountDao<T> dao;
	public boolean addAccount(T entity) throws DataAccessException {
		if(entity==null){
			throw new BizException(Account.class.getName()+"accountBizImpl!");
			
		}
		return dao.addAccount(entity);
	}

	public T getAccount(Integer id) throws DataAccessException {
		 return dao.getAccount(id);
	}

	public List getList() throws DataAccessException {
		return dao.getList();
	}

}
