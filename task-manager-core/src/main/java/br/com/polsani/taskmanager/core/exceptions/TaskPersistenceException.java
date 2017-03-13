package br.com.polsani.taskmanager.core.exceptions;

public class TaskPersistenceException  extends Exception {

	private static final long serialVersionUID = 1L;
	private String errorMessage;
	private Exception base;

	public TaskPersistenceException(Exception base, String errorMessage) {		
		super(errorMessage);
		this.base = base;
		this.errorMessage = errorMessage;
	}
	
	public TaskPersistenceException(Exception base) {
		super();
		this.base = base;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
}
