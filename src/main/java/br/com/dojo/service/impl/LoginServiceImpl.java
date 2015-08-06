package br.com.dojo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dojo.model.entity.Person;
import br.com.dojo.model.repository.PersonRepository;
import br.com.dojo.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private PersonRepository personRepository;

	@Override
	public Person login(final String email, final String password) {

		return personRepository.findByEmailAndPassword(email,password);
	}

}
