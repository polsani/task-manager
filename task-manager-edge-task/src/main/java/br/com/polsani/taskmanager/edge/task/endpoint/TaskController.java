package br.com.polsani.taskmanager.edge.task.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.polsani.taskmanager.core.domain.Task;
import br.com.polsani.taskmanager.core.exceptions.NoTaskFoundException;
import br.com.polsani.taskmanager.core.exceptions.TaskPersistenceException;
import br.com.polsani.taskmanager.service.task.TaskService;

@RestController
@RequestMapping(value="/task")
public class TaskController {
	private TaskService service;
	
	@Autowired
	public TaskController(TaskService service) {
		this.service = service;
	}
	
	@RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Task>> getAll() throws NoTaskFoundException {
		List<Task> tasks = this.service.getTasks();
		return new ResponseEntity<>(tasks, HttpStatus.OK);
    }
		
	@RequestMapping(method=RequestMethod.POST, value="/addTask")
	public ResponseEntity<Task> addTask(@RequestBody Task task) throws TaskPersistenceException {
		this.service.addTask(task);
		return new ResponseEntity<>(task, HttpStatus.OK);
	}
}
