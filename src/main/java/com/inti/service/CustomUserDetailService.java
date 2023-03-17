package com.inti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailService  implements IUserDetailService {
@Autowired
IUserDetailService usi;

@override
public IUserDetailService loadUserByUsername(String username) throws UsernameNotFoundException {
	Utilisateur u = usi.findByUsernameOrEmail(username);
	if(u== null) {
		throw new UsernameNotFoundException("Utilisateur : " +username+" inconnu");
	}
	return User
			.withUsername(u.getUsername())
			.
}
}
