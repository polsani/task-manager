package br.com.polsani.taskmanager.store.task;

import java.util.List;

import br.com.polsani.taskmanager.core.domain.Task;

public interface TaskStore {
	/**
	 * Get all tasks from database
	 */
	List<Task> getAll();
	
	/**
	 * Get single task with id
	 * 
	 * @param id Id from task
	 */
    Task get(String id);
    
    /**
	 * Persists task into database
	 * 
	 * @param task Object to be persisted
	 */
    void save(Task task);
    
    /**
	 * Delete task from database
	 * 
	 * @param id Object to be updated
	 */
    void delete(String id);
}