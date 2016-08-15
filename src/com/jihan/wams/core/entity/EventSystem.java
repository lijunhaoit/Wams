package com.jihan.wams.core.entity;

import java.io.Serializable;

/**
 * 系统事件类
 * 2016-5-30 23:13:30
 * @author jihan
 *
 */
public class EventSystem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9166853366385129565L;
	
	private Event event;

	public EventSystem() {
		super();
	}

	public EventSystem(Event event) {
		super();
		this.event = event;
	}

	
	@Override
	public String toString() {
		return "EventSystem [event=" + event + "]";
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}
	
	
	
	
}
