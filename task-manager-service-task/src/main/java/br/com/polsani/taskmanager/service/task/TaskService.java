package br.com.polsani.taskmanager.service.task;

import java.util.List;

import br.com.polsani.taskmanager.core.domain.Task;

public interface TaskService {
	/**
	 * Add the task into database
	 * 
	 * @param task Object to be saved
	 */
	void addTask(Task task);
	
	/**
	 * Change task status and persists into database
	 * 
	 * @param task Object to be updated
	 */
	void setTaskDone(Task task);
	
	/**
	 * Get all tasks from database
	 */
	List<Task> getTasks();
	
	/**
	 * Get all tasks from database where done flag is false
	 */
	List<Task> getNotDoneTasks();
	
	/**
	 * Delete task from database with parameter id
	 * 
	 * @param id Id to delete task
	 */
	void deteleTask(String id);
	
	/**
	 * Get task from database with parameter id
	 * 
	 * @param id Id to get task
	 */
	Task getTask(String id);
}
