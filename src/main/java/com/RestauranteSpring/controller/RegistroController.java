package com.RestauranteSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.RestauranteSpring.repository.ProductoRepository;

@Controller
public class RegistroController {
	
	@GetMapping("/login")
	public String iniciarSesion() {
		return "login";
	}
	
	@Autowired
	private ProductoRepository productoRepository;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("producto", productoRepository.findAll());
		return "home";
	}
	
}
