package com.RestauranteSpring.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.RestauranteSpring.dto.UsuarioRegistroDTO;
import com.RestauranteSpring.model.Usuario;

public interface UsuarioService extends UserDetailsService{
	
	public Usuario save(UsuarioRegistroDTO registroDTO);
	
}
