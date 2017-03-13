package br.com.polsani.taskmanager.store.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.polsani.taskmanager.core.domain.Task;
import br.com.polsani.taskmanager.store.task.TaskStore;

@Service
public class TaskStoreImpl implements TaskStore {

	private final TaskRepository repository;

    @Autowired
    public TaskStoreImpl(final TaskRepository repository) {
        this.repository = repository;
    }

	@Override
	public List<Task> getAll() {
		return repository.findAll();
	}

	@Override
	public Task get(String id) {
		return repository.findOne(id);
	}

	@Override
	public void save(Task task) {
		repository.save(task);
	}

	@Override
	public void delete(String id) {
		repository.delete(id);
	}
}
