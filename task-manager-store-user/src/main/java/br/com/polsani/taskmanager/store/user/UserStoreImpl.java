package br.com.polsani.taskmanager.store.user;

import java.util.List;

import br.com.polsani.taskmanager.core.domain.User;
import br.com.polsani.taskmanager.store.user.contract.UserStore;

public class UserStoreImpl implements UserStore {
	
	@Override
	public User getFromEmail(String email) {
		return null;
	}
	
	@Override
	public void save(User user) {
		
	}
	
	@Override
	public List<User> getAll() {
		return null;
	}
}
