package com.nelioalves.cursomc.cursomc.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
/**
 * CategoriaResources
 */
public class CategoriaResources {

    @RequestMapping(method=RequestMethod.GET)
    public String listar() {
        return "REST está funcionando";
    }
    
}