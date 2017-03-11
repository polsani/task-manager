package br.com.polsani.taskmanager.edge.test.endpoint;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/test")
public class TestController {
	
	@RequestMapping(value="")
	public List<String> getAll() {
		List<String> retorno = new ArrayList<String>();
		
		retorno.add("Teste 1");
		retorno.add("Teste 2");
		retorno.add("Teste 3");
		retorno.add("Teste 4");
		
		return retorno;
	}
}
