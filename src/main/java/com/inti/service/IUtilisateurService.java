package com.inti.service;

import org.springframework.stereotype.Service;

import com.inti.model.Utilisateur;
@Service
public interface IUtilisateurService {
	public Utilisateur findByUsernameOrEmail(String usernameOrEmail); 
}
