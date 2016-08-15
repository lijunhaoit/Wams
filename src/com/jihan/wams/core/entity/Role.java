package com.jihan.wams.core.entity;

import java.io.Serializable;

/**
 * 角色类
 * 2016-5-30 22:47:41
 * @author jihan
 *
 */
public class Role implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8696942630451430183L;

	private Integer roleId;
	private String rolename;
	private String roledescription;
	
	public Role(Integer roleId, String rolename, String roledescription) {
		super();
		this.roleId = roleId;
		this.rolename = rolename;
		this.roledescription = roledescription;
	}

	public Role() {
		super();
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", rolename=" + rolename + ", roledescription=" + roledescription + "]";
	}
	
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public String getRoledescription() {
		return roledescription;
	}
	public void setRoledescription(String roledescription) {
		this.roledescription = roledescription;
	}
	
	
}
