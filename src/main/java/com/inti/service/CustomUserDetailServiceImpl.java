package com.inti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.inti.model.Utilisateur;

@Service
public class CustomUserDetailServiceImpl implements IUserDetailService{
@Autowired
IUtilisateurService ius;

@Override
public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
	
	Utilisateur u = ius.findByUsernameOrEmail(username);
	if(u==null) {
		throw new UsernameNotFoundException(username + "n'est pas un login connu");
	}
	return User
				.withUsername(u.getUsername())
				.password(u.getMdp())
				.roles(u.getRole().getNom())
				.build();
}
}
