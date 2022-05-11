package com.springtutor.demobasic.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.*;

/**
 * ProdutoController
 */
@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

    @GetMapping(value = "/status", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public String status() {
        return "Resource activate produto :-) ";
    }
}
