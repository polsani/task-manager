package br.com.polsani.taskmanager.core.exceptions;

public class NoTaskFoundException extends Exception {

	private static final long serialVersionUID = 1L;
	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}
	public NoTaskFoundException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}
	public NoTaskFoundException() {
		super();
	}
	
}
