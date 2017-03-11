package br.com.polsani.taskmanager.edge.task.endpoint.test;

import org.junit.Before;
import org.junit.Test;

import br.com.polsani.taskmanager.core.domain.Task;
import br.com.polsani.taskmanager.edge.task.endpoint.TaskController;
import br.com.polsani.taskmanager.service.task.contract.TaskService;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import java.util.List;

public class TaskControllerTests {
	
	private TaskService taskService;
	private TaskController subject;
	private List<Task> tasks;
	private Task task;
	
	@Before
	public void setup(){
		task = new Task();
		
		taskService = mock(TaskService.class);
		when(taskService.getTasks()).thenReturn(tasks);
		
		subject = new TaskController(taskService);
	}
	
	@Test
	public void requestAddTaskPerformsServiceAddTask() {
		subject.addTask(task);
		
		verify(taskService).addTask(task);
	}
}
