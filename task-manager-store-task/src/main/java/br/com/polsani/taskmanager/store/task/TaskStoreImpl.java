package br.com.polsani.taskmanager.store.task;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.polsani.taskmanager.core.domain.Task;
import br.com.polsani.taskmanager.store.task.contract.TaskStore;

@Service
public class TaskStoreImpl implements TaskStore {

	@Override
	public void save(Task task) {
		
	}

	@Override
	public List<Task> getAll() {
		
		return null;
	}

}
