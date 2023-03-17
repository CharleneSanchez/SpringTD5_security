package com.inti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailService  implements UserDetailService {
@Autowired
UtilisateurDetailService usi;

@override
public UserDetail loadUserByUsername(String username) throws UsernameNotFoundException {
	Utilisateur u = usi.findByUsernameOrEmail(username);
	if(u== null) {
		throw new UsernameNotFoundException("Utilisateur : " +username+" inconnu");
	}
	return User
			.withUsername(u.getUsername())
			.
}
}
