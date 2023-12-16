package com.MVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.MVC.model.Viagem;
import com.MVC.repository.ViagemRepository;

@Controller
@RequestMapping("/viagens")
public class ViagemController {


		@Autowired
		private ViagemRepository viagemRepository;

		@GetMapping
		public ModelAndView viagem() {
			ModelAndView modelAndView = new ModelAndView("views/viagens/index.html");
			modelAndView.addObject("viagens", viagemRepository.findAll());

			modelAndView.addObject("viagem", new Viagem());

			return modelAndView;
		}

		@PostMapping("/cadastrar")
		public String cadastrar(Viagem viagem) {
			viagemRepository.save(viagem);

			return "redirect:/viagens";
		}

		@GetMapping("/{id_cliente}/excluir")
		public String excluir(@PathVariable Long id_viagem) {
			viagemRepository.deleteById(id_viagem);

			return "redirect:/viagens";
		}

	
}
