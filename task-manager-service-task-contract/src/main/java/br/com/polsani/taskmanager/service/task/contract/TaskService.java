package br.com.polsani.taskmanager.service.task.contract;

import java.util.List;
import br.com.polsani.taskmanager.core.domain.Task;

public interface TaskService {
	void addTask(Task task);
	void setTaskDone(Task task);
	List<Task> getTasks();
	List<Task> getNotDoneTasks();
	List<Task> getMyTasks(String email);
	List<Task> getMyNotDoneTasks(String email);
}