package com.example.systemagro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.systemagro.models.Product;
import com.example.systemagro.repositories.InterfaceProducto;

@RestController
@RequestMapping("/Product")
public class ProductControlller {

	@Autowired
	private InterfaceProducto interfaceProduct;

	@GetMapping
	public List<Product> products() {return (List<Product>) interfaceProduct.findAll();}
	@PostMapping
	public void insertar(@RequestBody Product pr) {interfaceProduct.save(pr);}
	@PutMapping 
	public void modificar(@RequestBody Product pr) {interfaceProduct.save(pr);}
	@DeleteMapping(value="/{id}")
	public void eliminar(@PathVariable("id") Integer id) {interfaceProduct.deleteById(id);}
	
}
