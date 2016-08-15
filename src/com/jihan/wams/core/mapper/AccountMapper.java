package com.jihan.wams.core.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.Mapper;

import com.jihan.wams.core.entity.Account;
@Mapper("mapper") 
public interface AccountMapper extends SqlMapper {
	public List<Account> getAllAccount(); 
	public Account getAccount();   
	public Account getAccountById(String id); 
	public Account getAccountByNames(String spring);  
	@Select("select * from t_account where username = #{name}")  
	public Account getAccountByName(String name);  
	public void addAccount(Account account);   
	public void editAccount(Account account); 
	public void removeAccount(int id);
}
