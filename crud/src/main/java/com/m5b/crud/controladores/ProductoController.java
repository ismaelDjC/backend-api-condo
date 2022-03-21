package com.m5b.crud.controladores;

import java.util.List;

import com.m5b.crud.modelo.ProductoDTO;
import com.m5b.crud.repositorio.IProdructoDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*",methods = {RequestMethod.POST,RequestMethod.GET,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/api/products")
public class ProductoController {

    @Autowired
    private IProdructoDAO  repository;

    @PostMapping("/product")
    public ProductoDTO create(@Validated @RequestBody ProductoDTO p){
        return repository.insert(p);
    }

    @GetMapping("/")
    public List<ProductoDTO> readAll(){
        return repository.findAll();
    }
    

    @PutMapping("/product/{id}")
    public ProductoDTO update(@PathVariable String id,@Validated @RequestBody ProductoDTO p){
        return repository.save(p);
    }

    @DeleteMapping("/product/{id}")
    public void delete(@PathVariable String id){
        repository.deleteById(id);

    }

}
