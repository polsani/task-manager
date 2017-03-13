package br.com.polsani.taskmanager.store.task;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import br.com.polsani.taskmanager.core.domain.Task;

@Service
public interface TaskRepository extends MongoRepository<Task, String> {

}
