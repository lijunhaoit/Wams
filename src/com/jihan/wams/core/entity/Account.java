package com.jihan.wams.core.entity;
import java.io.Serializable;

/**
 * 账号类
 * 2016-5-30 22:44:56
 * @author jihan
 *
 */
public class Account implements Serializable {
	private static final long serialVersionUID = -7970848646314840509L;  
	private Integer accountId;  
	private Integer status;  
	private String username;    
	private String password;  
	private String salt;   
	private String email;        
	//getter��setter    
	@Override  
	public String toString() 
	{       
		return this.accountId + "#" + this.status + "#" + this.username +  "#" +  
		this.password +  "#" + this.email +  "#" + this.salt;   
	}
	
	public Account(String username,String password,Integer status)
	{
	    this.username=username;
	    this.password=password;
	    this.status=status;
	}
	
	public Account()
	{}
	
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
