package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Clientes;
import com.example.demo.repository.ClienteRepository;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping
	public List<Clientes> listar() {
	
		return clienteRepository.findAll();
	}
	@PostMapping
	public Clientes adicionar(@RequestBody Clientes  cliente) {
		return clienteRepository.save(cliente);
	}
}