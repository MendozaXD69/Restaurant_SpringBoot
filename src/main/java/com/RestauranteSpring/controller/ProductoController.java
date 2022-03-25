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

import com.RestauranteSpring.model.Producto;
import com.RestauranteSpring.repository.ProductoRepository;

@Controller
@RequestMapping("/producto") // http:localhost:8080/producto
public class ProductoController {
	
	private final Logger logg= LoggerFactory.getLogger(Producto.class);
	
	@Autowired
	private ProductoRepository productoRepository;
	
	@GetMapping("")
	public String home(Model model){
		
		model.addAttribute("producto", productoRepository.findAll());
		return "home";
		
	}
	
	@GetMapping("/create") // http:localhost:8080/producto/create
	public String create() {
		
		return "create";
		
	}
	
	@PostMapping("/save")
	public String save(Producto producto) {
		
		logg.info("Informacion del objeto producto, {}",producto);
		productoRepository.save(producto);
		return "redirect:/producto";
		
	}
	
	@GetMapping("/edit/{id}")
	public String edit( @PathVariable Integer id, Model model) {
		
		Producto p= productoRepository.getOne(id);
		logg.info("Objeto Recuperado {}",p);
		model.addAttribute("producto",p);
		
		return "edit";
		
	}
	
	@GetMapping("/delete/{id}")
	public String delete( @PathVariable Integer id) {
		
		Producto p= productoRepository.getOne(id);
		logg.info("Objeto Eliminado {}",p);
		productoRepository.delete(p);
		
		return "redirect:/producto";
		
	}
	
}
