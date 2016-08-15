package com.jihan.wams.core.entity;

import java.io.Serializable;

/**
 * 任务类
 * 2016-5-30 22:45:03
 * @author jihan
 *
 */
public class Task implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5873965978650225591L;

	private Integer taskId;
	private String taskname;
	private String taskdetails;
	
	
	public Task(Integer taskId, String taskname, String taskdetails) {
		super();
		this.taskId = taskId;
		this.taskname = taskname;
		this.taskdetails = taskdetails;
	}
	
	public Task() {
		super();
	}



	@Override
	public String toString() {
		return "task [taskId=" + taskId + ", taskname=" + taskname + ", taskdetails=" + taskdetails + "]";
	}
	
	
	//getandset
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public String getTaskname() {
		return taskname;
	}
	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}
	public String getTaskdetails() {
		return taskdetails;
	}
	public void setTaskdetails(String taskdetails) {
		this.taskdetails = taskdetails;
	}
	
	
	
}
