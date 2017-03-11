package br.com.polsani.taskmanager.core.domain;

import java.util.Date;

public class Task {
	
	private String title;
	private boolean done;
	private Date dueDate;
	private User user;
	
	public Task() {
		
	}
	
	public Task(String title, boolean done, Date dueDate) {
		this(title, done, dueDate, null);
	}
	
	public Task(String title, boolean done, Date dueDate, User user) {
		this.title = title;
		this.done = done;
		this.dueDate = dueDate;
		this.user = user;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public boolean isDone() {
		return done;
	}
	
	public void setDone(boolean done) {
		this.done = done;
	}
	
	public Date getDueDate() {
		return dueDate;
	}
	
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
}
