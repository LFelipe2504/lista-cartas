package br.com.empresa.aplicacao.listacartas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.empresa.aplicacao.listacartas.model.Carta;
import br.com.empresa.aplicacao.listacartas.model.ListaDeCartas;
import br.com.empresa.aplicacao.listacartas.repository.ListaDeCartasRepository;

@RestController
@RequestMapping("/lista-cartas")
public class ListaDeCartasController {
	
	@Autowired
	ListaDeCartasRepository listaCarReposi;
	
	@GetMapping
	public List<ListaDeCartas> todasAsListas() {    	
    	return listaCarReposi.findAll();	
	}
    
//    @RequestMapping("/listaCartasOrdemAlfa")
    @GetMapping("/listaCartasOrdemAlfa")
   	public ListaDeCartas listaCartasOrdemAlfa (String nomeDaLista) {
    	if(nomeDaLista == null) {
    		return null;    				
    	}else {
    		 ListaDeCartas lista = listaCarReposi.findByNome(nomeDaLista);
			 List<Carta> listaCartas = lista.getCartas();
    		 listaCartas.sort((s1,s2) -> s1.getNome().compareTo(s2.getNome()));
    		 return lista; 
    	}    	
   	}
    
//    @RequestMapping("/listaCartasOrdemValor")
    @GetMapping("/listaCartasOrdemValor")
   	public ListaDeCartas listaCartasOrdemValor (String nomeDaLista) {
    	if(nomeDaLista == null) {
    		return null;    				
    	}else {
    		 ListaDeCartas lista = listaCarReposi.findByNome(nomeDaLista);
			 List<Carta> listaCartas = lista.getCartas();
    		 listaCartas.sort((s1,s2) -> Double.compare(s1.getPrecoEmReais(), s2.getPrecoEmReais()));
    		 return lista; 
    	}
   	}
    
    @PostMapping
    public ResponseEntity<Object> cadastrarLista(@RequestBody @Valid ListaDeCartas novaLista) { 
    	if(listaCarReposi.existsByNome(novaLista.getNome())) {
    		return ResponseEntity.status(HttpStatus.CONFLICT).body("Essa lista já existe!");
    	}else {
    		return ResponseEntity.status(HttpStatus.CREATED).body(listaCarReposi.save(novaLista));    		
    	}
    	
    }
    
    
    

}
