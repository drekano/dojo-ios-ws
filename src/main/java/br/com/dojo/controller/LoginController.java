package br.com.dojo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.dojo.model.entity.Person;
import br.com.dojo.service.LoginService;

@RestController
@RequestMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
public class LoginController {

	@Autowired
	private LoginService service;

	@RequestMapping(method = RequestMethod.POST)
	public Person login(@RequestParam("email") String email,
			@RequestParam(value = "password") String password) {

		return service.login(email, password);
	}

}
