package com.api.clientesrest.controller;

import java.util.List;
import java.util.Optional;

import com.api.clientesrest.model.Cliente;
import com.api.clientesrest.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// mapeia as requisições vem com a uri /clientes
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Cliente> clienteUnico(@PathVariable(value = "id") long id) {
        return clienteRepository.findById(id);
    }

    @PostMapping
    public Cliente adicionar(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @PutMapping
    public Cliente atualizar(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @DeleteMapping
    public Cliente deletar(@RequestBody Cliente cliente) {
        clienteRepository.delete(cliente);
        return cliente;
    }

    @GetMapping("/clientes/{id}")
    public Optional<Cliente> bucarCliente(@PathVariable Long id) {
      return clienteRepository.findById(id);
    }


}
