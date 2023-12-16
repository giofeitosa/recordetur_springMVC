package com.MVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.MVC.model.Cliente;
import com.MVC.repository.ClienteRepository;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	

	@GetMapping
	public ModelAndView cliente() {
		ModelAndView modelAndView = new ModelAndView("views/clientes/index.html");
		modelAndView.addObject("clientes", clienteRepository.findAll());

		modelAndView.addObject("cliente", new Cliente());

		return modelAndView;
	}

	@PostMapping("/cadastrar")
	public String cadastrar(Cliente cliente) {
		clienteRepository.save(cliente);

		return "redirect:/clientes";
	}

	@GetMapping("/{id_cliente}/excluir")
	public String excluir(@PathVariable Long id_cliente) {
		clienteRepository.deleteById(id_cliente);

		return "redirect:/clientes";
	}
	

}
