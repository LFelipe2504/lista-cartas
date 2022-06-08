package br.com.empresa.aplicacao.listacartas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.empresa.aplicacao.listacartas.model.ListaDeCartas;

@Repository
public interface ListaDeCartasRepository extends JpaRepository<ListaDeCartas, Long>{

	ListaDeCartas findByNome(String nomeDaLista);
	
	public boolean existsByNome(String nome);

}
