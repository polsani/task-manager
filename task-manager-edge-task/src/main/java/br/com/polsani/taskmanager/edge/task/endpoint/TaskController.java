package br.com.polsani.taskmanager.edge.task.endpoint;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.polsani.taskmanager.core.domain.Task;
import br.com.polsani.taskmanager.service.task.contract.TaskService;

@RestController
@ComponentScan("br.com.polsani.taskmanager.service.task")
@RequestMapping(value="/task")
public class TaskController {
	private TaskService service;
	
	public TaskController(@Autowired TaskService service) {
		this.service = service;
	}
	
	@RequestMapping(value="")
	public List<Task> getAll() {
		//this.service.getTasks();
		return new ArrayList<>(); 
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/addTask")
	public void addTask(@RequestBody Task task) {
		this.service.addTask(task);
	}
}
