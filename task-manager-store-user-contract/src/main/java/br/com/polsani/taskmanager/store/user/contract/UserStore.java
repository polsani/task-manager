package br.com.polsani.taskmanager.store.user.contract;

import java.util.List;

import br.com.polsani.taskmanager.core.domain.User;

public interface UserStore {
	User getFromEmail(String email);
	void save(User user);
	List<User> getAll();
}
