package com.gabrielcode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gabrielcode.model.Persona;
import com.gabrielcode.repo.IPersonaRepository;

@Controller
public class DemoController {
	@Autowired
	private IPersonaRepository repo;

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
			Model model) {
		if (name == null || name.isEmpty())
			name = "GabrielCode";

		if (name.endsWith("World")) {
			repo.delete(new Persona(1, "Gabriel Casas"));
			name = "GabrielCode";
		}

		Persona per = new Persona(1, name);
		repo.save(per);

		model.addAttribute("name", name);

		return "greeting";
	}
}
