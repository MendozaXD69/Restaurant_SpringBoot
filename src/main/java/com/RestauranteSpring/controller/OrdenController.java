package com.RestauranteSpring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.RestauranteSpring.model.Orden;
import com.RestauranteSpring.repository.OrdenRepository;

@Controller
@RequestMapping("/orden") // http:localhost:8080/orden
public class OrdenController {
	/*
	private final Logger logg= LoggerFactory.getLogger(Orden.class);
	
	@Autowired
	private OrdenRepository ordenRepository;
	
	@GetMapping("")
	public String home_order(Model model){
		
		model.addAttribute("orden", ordenRepository.findAll());
		return "";
		
	}
	
	@GetMapping("/create_orden") // http:localhost:8080/orden/create
	public String create_orden() {
		
		return "create_orden";
		
	}
	
	@PostMapping("/save_orden")
	public String save_orden(Orden orden) {
		
		logg.info("Informacion del objeto orden, {}",orden);
		ordenRepository.save(orden);
		return "redirect:/orden";
		
	}
	
	@GetMapping("/edit_orden/{id}")
	public String edit_orden( @PathVariable Integer id, Model model) {
		
		Orden o= ordenRepository.getOne(id);
		logg.info("Objeto Recuperado {}",o);
		model.addAttribute("orden",o);
		
		return "edit_orden";
		
	}
	
	@GetMapping("/delete_orden/{id}")
	public String delete_orden( @PathVariable Integer id) {
		
		Orden o= ordenRepository.getOne(id);
		logg.info("Objeto Eliminado {}",o);
		ordenRepository.delete(o);
		
		return "redirect:/orden";
		
	}*/
	
}
