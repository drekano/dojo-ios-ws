package br.com.dojo.service;

import br.com.dojo.model.entity.Person;

public interface LoginService {

	Person login(final String email, final String password);

}
