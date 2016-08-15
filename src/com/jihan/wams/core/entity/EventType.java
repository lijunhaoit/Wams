package com.jihan.wams.core.entity;

import java.io.Serializable;

/**
 * 事件类型类
 * 2016-5-30 22:51:41
 * @author jihan
 *
 */
public class EventType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1568652736649612432L;
	
	private Integer eventtypeId;
	private String eventtypename;
	
	public EventType(Integer eventtypeId, String eventtypename) {
		super();
		this.eventtypeId = eventtypeId;
		this.eventtypename = eventtypename;
	}
	public EventType() {
		super();
	}
	@Override
	public String toString() {
		return "EventType [eventtypeId=" + eventtypeId + ", eventtypename=" + eventtypename + "]";
	}
	public Integer getEventtypeId() {
		return eventtypeId;
	}
	public void setEventtypeId(Integer eventtypeId) {
		this.eventtypeId = eventtypeId;
	}
	public String getEventtypename() {
		return eventtypename;
	}
	public void setEventtypename(String eventtypename) {
		this.eventtypename = eventtypename;
	}
	
	
	
	

}
