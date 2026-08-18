package br.edu.ifce.retromarket.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifce.retromarket.entities.Anuncio;
import br.edu.ifce.retromarket.repositories.AnuncioRepository;

@Service
public class AnuncioService {
    
    @Autowired
    private AnuncioRepository anuncioRepository;

    public List<Anuncio> listarAnuncios() {
        return anuncioRepository.findAll();
    }
}
