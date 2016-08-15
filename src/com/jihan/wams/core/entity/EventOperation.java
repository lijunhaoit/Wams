package com.jihan.wams.core.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 操作事件类
 * @author jihan
 *
 */
public class EventOperation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1675769588550303784L;

	private Account account;
	private Event event;
	
	public EventOperation() {
		super();
	}
	public EventOperation(Account account, Event event) {
		super();
		this.account = account;
		this.event = event;
	}
	@Override
	public String toString() {
		return "EventOperation [account=" + account + ", event=" + event + ", toString()=" + super.toString() + "]";
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	
	
}
