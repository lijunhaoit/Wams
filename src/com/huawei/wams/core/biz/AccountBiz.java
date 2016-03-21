package com.huawei.wams.core.biz;

import java.util.List;

import org.springframework.dao.DataAccessException;
public interface AccountBiz<T> {
   public boolean addAccount(T entity) throws DataAccessException;
   public T getAccount(Integer id) throws DataAccessException;
   public List<T> getList() throws DataAccessException;
}

