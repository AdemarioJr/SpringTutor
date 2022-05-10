package com.springtutor.demobasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;

import java.util.ArrayList;
import java.util.List;

import com.springtutor.demobasic.entity.Cliente;
import com.springtutor.demobasic.service.ClienteService;

/**
 * ClienteController
 */
@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    public ClienteController() {
        this.clienteService = new ClienteService();
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String status() {
        return "Resource activate :-) ";
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> getAll() {
        try {
            List<Cliente> items = new ArrayList<Cliente>();
            clienteService.listarClientes().forEach(items::add);

            if (items.isEmpty())
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);

            return new ResponseEntity<>(items, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
