package com.inti.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.inti.model.Utilisateur;
import com.inti.repository.IUtilisateurRepository;
@Service

public class UtilisateurServiceImpl implements IUtilisateurService{
@Autowired
IUtilisateurRepository iur;

}
