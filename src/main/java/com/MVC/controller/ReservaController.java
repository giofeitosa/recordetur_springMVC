package com.MVC.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.MVC.model.Cliente;
import com.MVC.model.Reserva;
import com.MVC.model.Viagem;
import com.MVC.repository.ClienteRepository;
import com.MVC.repository.ReservaRepository;
import com.MVC.repository.ViagemRepository;

@Controller
@RequestMapping ("/reservas")
public class ReservaController {
	@Autowired
	private ReservaRepository reservaRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ViagemRepository viagemRepository;

	@GetMapping
	public ModelAndView reservas() {
		ModelAndView modelAndView = new ModelAndView("views/reservas/index.html");

		modelAndView.addObject("clientes", clienteRepository.findAll());
		modelAndView.addObject("viagens", viagemRepository.findAll());
		modelAndView.addObject("reservas",reservaRepository.findAll());
		modelAndView.addObject("reserva", new Reserva());
		

		return modelAndView;
	}

	@PostMapping("/cadastrar")
	
	public String cadastrar(@ModelAttribute("reserva") Reserva reserva) {
		
        reservaRepository.save(reserva);
 
        
		return "redirect:/reservas";
	}
	

	@GetMapping("/{id_reserva}/excluir")
	public String excluir(@PathVariable Long id_reserva) {
		reservaRepository.deleteById(id_reserva);

		return "redirect:/reservas";
	}

	
	

}
