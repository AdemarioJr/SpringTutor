package com.springtutor.demobasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;

import java.util.ArrayList;
import java.util.List;

import com.springtutor.demobasic.entity.Documento;
import com.springtutor.demobasic.service.DocumentoService;

@RestController
@RequestMapping("/api/documento")
public class DocumentoController {

    @Autowired
    private DocumentoService documentoService;

    public DocumentoController() {
        this.documentoService = new DocumentoService();
    }

    @GetMapping(value = "/status", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public String status() {
        return "Resource activate documento :-) ";
    }

    @GetMapping(value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Documento>> getAll() {
        try {
            List<Documento> items = new ArrayList<Documento>();
            documentoService.listarDocumentos().forEach(items::add);

            if (items.isEmpty())
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);

            return new ResponseEntity<>(items, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/create")
    public ResponseEntity<Documento> create(@RequestBody Documento doc) {
        try {
            List<Documento> items = new ArrayList<Documento>();

            if (doc.getName_provider().isEmpty() && doc.getRg().getRgNumber().isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                documentoService.salvar(doc);

                documentoService.listarDocumentos().forEach(items::add);
                return new ResponseEntity<>(items.get(items.size() - 1), HttpStatus.OK);
            }

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
