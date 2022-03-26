package com.RestauranteSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.RestauranteSpring.dto.UsuarioRegistroDTO;
import com.RestauranteSpring.service.UsuarioService;

@Controller
@RequestMapping("/registro")
public class RegistroUsuarioController {

	private UsuarioService usuarioService;

	public RegistroUsuarioController(UsuarioService usuarioService) {
		super();
		this.usuarioService = usuarioService;
	}

	@ModelAttribute("usuario")
	public UsuarioRegistroDTO retornarNuevoUsuarioRegistroDTO() {

		return new UsuarioRegistroDTO();

	}

	@GetMapping
	public String mostrarFormularioDeRegistro() {

		return "registro";

	}

	@PostMapping
	public String registarCuentaDeUsuario(@ModelAttribute("usuario") UsuarioRegistroDTO registroDTO) {

		usuarioService.save(registroDTO);
		return "redirect:/registro?exito";

	}

}
