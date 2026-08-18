package br.edu.ifce.retromarket.controllers;

import br.edu.ifce.retromarket.services.AnuncioService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifce.retromarket.entities.Anuncio;
import br.edu.ifce.retromarket.entities.Completude;

@RestController
@RequestMapping(value = "/anuncios")
public class AnuncioController {

  @Autowired
  private AnuncioService service;

  @GetMapping("/completudes")
  public List<Completude> buscarCompletudes() {
    return service.buscarCompletudes();
  }

  @PostMapping("/completudes")
  public Completude criarCompletude(@RequestBody Completude completude) {
    return service.criarCompletude(completude);
  }

  @GetMapping
  public List<Anuncio> listarAnuncios() {
    return service.listarAnuncios();
  }
}
