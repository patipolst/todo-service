package com.rest.todo;

import java.util.concurrent.atomic.AtomicInteger;

public class Task {

	private static final AtomicInteger count = new AtomicInteger(0);
	private int id;
	private String subject;
	private String detail;
	private boolean done;

	public void setId() {
		this.id = count.incrementAndGet();
	}
	
	public int getId() {
		return id;
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public String toString() {
		return "ID: " + this.id + " Subject: " + this.subject + " Detail: " + this.detail + " Done: " + this.done;
	}
}
