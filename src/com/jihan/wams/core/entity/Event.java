package com.jihan.wams.core.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 事件类
 * 2016-5-30 23:00:57
 * @author jihan
 *
 */
public class Event implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4798940975053478128L;

	private Integer eventId;
	private Date	eventtime;
	private String eventInfo;
	private EventType eventType;
	
	
	public Event() {
		super();
	}
	public Event(Integer eventId, Date eventtime, String eventInfo, EventType eventType) {
		super();
		this.eventId = eventId;
		this.eventtime = eventtime;
		this.eventInfo = eventInfo;
		this.eventType = eventType;
	}
	
	
	
	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", eventtime=" + eventtime + ", eventInfo=" + eventInfo + ", eventType="
				+ eventType + "]";
	}
	public Integer getEventId() {
		return eventId;
	}
	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}
	public Date getEventtime() {
		return eventtime;
	}
	public void setEventtime(Date eventtime) {
		this.eventtime = eventtime;
	}
	public String getEventInfo() {
		return eventInfo;
	}
	public void setEventInfo(String eventInfo) {
		this.eventInfo = eventInfo;
	}
	public EventType getEventType() {
		return eventType;
	}
	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}
	
	
}
