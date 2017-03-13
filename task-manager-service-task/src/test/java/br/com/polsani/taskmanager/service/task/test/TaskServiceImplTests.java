package br.com.polsani.taskmanager.service.task.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.polsani.taskmanager.core.domain.Task;
import br.com.polsani.taskmanager.service.task.TaskServiceImpl;
import br.com.polsani.taskmanager.store.task.TaskStore;

public class TaskServiceImplTests {
	
	private final String TASK_TITLE_1 = "Task 1"; 
	private final String TASK_TITLE_2 = "Task 2"; 
	private final String TASK_TITLE_3 = "Task 3"; 
	private final String TASK_TITLE_4 = "Task 4"; 
	
	private final boolean IS_DONE = true;
	private final boolean ISNT_DONE = false;
	
	private final Date TODAY = Date.from(Instant.now());
	
	private TaskServiceImpl subject;
	private TaskStore taskStore;
	private List<Task> tasks;
	private Task task;
	
	@Before
	public void setup(){
		
		task = new Task(TASK_TITLE_1, IS_DONE, TODAY);
		
		tasks = Arrays.asList(task, 
							  new Task(TASK_TITLE_2, IS_DONE, TODAY), 
							  new Task(TASK_TITLE_3, ISNT_DONE, TODAY), 
							  new Task(TASK_TITLE_4, IS_DONE, TODAY));
		
		taskStore = mock(TaskStore.class);
		when(taskStore.getAll()).thenReturn(tasks);
		
		subject = new TaskServiceImpl(taskStore);
	}
	
	@Test
	public void requestGetTasksPerformsStoreGetAll() {		
		subject.getTasks();
		
		verify(taskStore).getAll();
	}
	
	@Test
	public void requestGetTaskPerformsStoreGetAll() {
		String id = "Id";
		subject.getTask(id);
		
		verify(taskStore).get(id);
	}
	
	@Test
	public void requestSetTaskDonePerformsStoreSave() {
		subject.setTaskDone(task);
		
		verify(taskStore).save(task);
	}
	
	@Test
	public void requestGetNotDoneTasksPerformsStoreGetAllAndRemoveDoneTasks() {
		List<Task> retrivedTasks = subject.getNotDoneTasks();
		
		verify(taskStore).getAll();
		assertThat(retrivedTasks.size(), equalTo(1));
	}
	
	@Test
	public void requestAddTaskPerformsStoreSave() {
		subject.addTask(task);
		
		verify(taskStore).save(task);
	}
	
	@Test
	public void requestDeleteTaskPerformsStoreDelete() {
		String id = "Id";
		subject.deteleTask(id);
		
		verify(taskStore).delete(id);
	}	
}
