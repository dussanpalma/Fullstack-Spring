package com.dussanpalma.demo.controllers;

import com.dussanpalma.demo.models.entity.Client;
import com.dussanpalma.demo.models.service.IClientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ClientRestController {

    @Autowired
    private IClientService clientService;

    @GetMapping("/clientes")
    public List<Client> index() {
        return clientService.findAll();

    }

    @GetMapping("/clientes/{id}")
    public Client show(@PathVariable Long id) {
        return clientService.findById(id);

    }

    @PostMapping("/clientes")
    @ResponseStatus(HttpStatus.CREATED)
    public Client create(@RequestBody Client cliente) {
    return clientService.save(cliente);

    }
    
   @PutMapping("/clientes/{id}")
   @ResponseStatus(HttpStatus.CREATED)
    public Client update(@RequestBody Client cliente, @PathVariable Long id) {
    
    Client clienteActual = clientService.findById(id);
    
    clienteActual.setLastName(cliente.getLastName());
    clienteActual.setSecondLastName(cliente.getSecondLastName());
    
    clienteActual.setName(cliente.getName());
     clienteActual.setSecondName(cliente.getSecondName());
    
    clienteActual.setEmail(cliente.getEmail());
    clienteActual.setAddress(cliente.getAddress());
    
    clienteActual.setDocument(cliente.getDocument());
    clienteActual.setPhone(cliente.getPhone());
    
    clienteActual.setTypeDocument(cliente.getTypeDocument());
    
    
    return clientService.save(clienteActual);

    }
    
    @DeleteMapping("/clientes/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete( @PathVariable Long id) {
     clientService.delete(id);
    }
    
    
    
    
    
}
