package br.com.polsani.taskmanager.core.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "task")
public class Task {
	
	@Id
	private String id;
	private String title;
	private boolean done;
	private Date dueDate;
	
	public Task() {
		
	}
		
	public Task(String title, boolean done, Date dueDate) {
		this.title = title;
		this.done = done;
		this.dueDate = dueDate;
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
}
