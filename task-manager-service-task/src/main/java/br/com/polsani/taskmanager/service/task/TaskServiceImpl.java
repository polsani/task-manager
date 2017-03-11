package br.com.polsani.taskmanager.service.task;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.polsani.taskmanager.core.domain.Task;
import br.com.polsani.taskmanager.service.task.contract.TaskService;
import br.com.polsani.taskmanager.store.task.contract.TaskStore;

@Service
public class TaskServiceImpl implements TaskService {

	private TaskStore store;
	
	@Autowired
	public TaskServiceImpl(TaskStore store) {
		this.store = store;
	}
	
	@Override
	public void addTask(Task task) {
		this.store.save(task);
	}

	@Override
	public void setTaskDone(Task task) {
		task.setDone(true);
		this.store.save(task);
	}

	@Override
	public List<Task> getTasks() {
		return this.store.getAll();
	}

	@Override
	public List<Task> getMyTasks(String email) {
		return getTasks().stream()
						 .filter(t -> t.getUser().getEmail() == email)
						 .collect(Collectors.toList());
	}
	
	@Override
	public List<Task> getMyNotDoneTasks(String email) {
		return getTasks().stream()
						 .filter(t -> t.getUser().getEmail() == email)
						 .filter(t -> !t.isDone())
						 .collect(Collectors.toList());
	}
	
	@Override
	public List<Task> getNotDoneTasks() {
		return getTasks().stream()
				 .filter(t -> !t.isDone())
				 .collect(Collectors.toList());
	}
}
