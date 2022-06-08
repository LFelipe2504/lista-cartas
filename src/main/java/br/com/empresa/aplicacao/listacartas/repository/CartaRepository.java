package br.com.empresa.aplicacao.listacartas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.empresa.aplicacao.listacartas.model.Carta;

@Repository 
public interface CartaRepository extends CrudRepository<Carta, Long>{

}
