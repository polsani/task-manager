package br.com.polsani.taskmanager.service.user.contract;

import java.util.List;

import br.com.polsani.taskmanager.core.domain.User;

public interface UserService {
	void addUser(User user);
	User getUserFromEmail(String email);
	List<User> getUsers();
}
