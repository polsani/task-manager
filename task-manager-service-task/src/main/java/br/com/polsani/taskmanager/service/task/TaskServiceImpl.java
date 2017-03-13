package br.com.polsani.taskmanager.service.task;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.polsani.taskmanager.core.domain.Task;
import br.com.polsani.taskmanager.store.task.TaskStore;

@Service
public class TaskServiceImpl implements TaskService {

	private TaskStore store;
	
	@Autowired
	public TaskServiceImpl(TaskStore store) {
		this.store = store;
	}
	
	@Override
	public void addTask(Task task) {
		store.save(task);
	}
	
	
	@Override
	public void setTaskDone(Task task) {
		task.setDone(true);
		store.save(task);
	}

	@Override
	public List<Task> getTasks() {
		return store.getAll();
	}

	@Override
	public List<Task> getNotDoneTasks() {
		return getTasks().stream()
				 .filter(t -> !t.isDone())
				 .collect(Collectors.toList());
	}

	@Override
	public void deteleTask(String id) {
		store.delete(id);		
	}

	@Override
	public Task getTask(String id) {
		return store.get(id);
	}
}
