package br.com.polsani.taskmanager.store.task.contract;

import java.util.List;

import br.com.polsani.taskmanager.core.domain.Task;

public interface TaskStore {
	void save(Task task);
	List<Task> getAll();
}
