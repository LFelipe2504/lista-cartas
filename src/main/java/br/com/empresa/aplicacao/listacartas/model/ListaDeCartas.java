package br.com.empresa.aplicacao.listacartas.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class ListaDeCartas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty @NotNull
	private String nome;
//	@ManyToOne
	@NotEmpty @NotNull
	private String jogador;
	@OneToMany(mappedBy = "listaDeCartas")
	private List<Carta> cartas = new ArrayList<>();	
	

//	public ListaDeCartas(String nomeDaLista, String jogadorQueCriou) {		
//		this.nome = nomeDaLista;
//		this.jogador = jogadorQueCriou;
//	}	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getJogador() {
		return jogador;
	}

	public void setJogador(String jogador) {
		this.jogador = jogador;
	}

	public List<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(List<Carta> cartas) {
		this.cartas = cartas;
	}
	
	
	
}
