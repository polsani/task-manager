package br.com.polsani.taskmanager.edge.user.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.polsani.taskmanager.service.user.contract.UserService;

@RestController
@RequestMapping(value="/user")
public class UserController {
	private UserService service;
	
	@Autowired
	public UserController(UserService service){
		this.service = service;
	}
}
