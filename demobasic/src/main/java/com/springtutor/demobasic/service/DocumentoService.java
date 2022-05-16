package com.springtutor.demobasic.service;

import com.springtutor.demobasic.entity.Documento;
import com.springtutor.demobasic.repository.DocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DocumentoService {
    @Autowired
    private DocumentoRepository documentoRepository;

    public Documento salvar(Documento documento) {
        return documentoRepository.save(documento);
    }

    public List<Documento> listarDocumentos() {
        return documentoRepository.findAll();
    }

    public Optional<Documento> buscarPorId(Long id) {
        return documentoRepository.findById(id);
    }

    public void deletarPorId(Long id) {
        documentoRepository.deleteById(id);
    }
}
