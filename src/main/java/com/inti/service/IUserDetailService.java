package com.inti.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.inti.model.Utilisateur;

@Service
public interface IUserDetailService {

	public UserDetails loadUserByUsername(String username);
}
