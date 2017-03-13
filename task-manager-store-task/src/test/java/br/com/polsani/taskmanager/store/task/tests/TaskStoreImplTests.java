package br.com.polsani.taskmanager.store.task.tests;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import br.com.polsani.taskmanager.core.domain.Task;
import br.com.polsani.taskmanager.store.task.TaskRepository;
import br.com.polsani.taskmanager.store.task.TaskStoreImpl;

public class TaskStoreImplTests {

	private final String TASK_TITLE_1 = "Task 1"; 
		
	private final boolean IS_DONE = true;
		
	private final Date TODAY = Date.from(Instant.now());
	
	private TaskStoreImpl subject;
	private TaskRepository repository;
	private Task task;
	
	@Before
	public void setup(){
		
		task = new Task(TASK_TITLE_1, IS_DONE, TODAY);		
		
		repository = mock(TaskRepository.class);
		when(repository.findAll()).thenReturn(new ArrayList<Task>());
		
		subject = new TaskStoreImpl(repository);
	}
	
	@Test
	public void getAllPerformsRepositoryGetAll(){
		subject.getAll();
		
		verify(repository).findAll();
	}
	
	@Test
	public void getPerformsRepositoryGet(){
		String id = "Id";
		subject.get(id);
		
		verify(repository).findOne(id);
	}
	
	@Test
	public void savePerformsRepositorySave(){
		subject.save(task);
		
		verify(repository).save(task);
	}
	
	@Test
	public void deletePerformsRepositoryDelete(){
		String id = "Id";
		subject.delete(id);
		
		verify(repository).delete(id);
	}
}