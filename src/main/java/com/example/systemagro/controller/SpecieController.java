package com.example.systemagro.controller;

import java.util.List;

import com.example.systemagro.repositories.InterfaceEspecie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.systemagro.models.Specie;

@RestController
@RequestMapping("/Specie")
public class SpecieController {

	@Autowired
	private InterfaceEspecie interfaceSpecie;

	@GetMapping
	public List<Specie> species() {return (List<Specie>) interfaceSpecie.findAll();}
	@PostMapping
	public void insertar(@RequestBody Specie pr) {interfaceSpecie.save(pr);}
	@PutMapping 
	public void modificar(@RequestBody Specie pr) {interfaceSpecie.save(pr);}
	@DeleteMapping(value="/{id}")
	public void eliminar(@PathVariable("id") Integer id) {interfaceSpecie.deleteById(id);}
	
}
