package br.com.empresa.aplicacao.listacartas.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Carta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private ListaDeCartas listaDeCartas;
	@NotEmpty @NotNull
	private String nome;
	@NotEmpty @NotNull
	private String edicao;
	@Enumerated(EnumType.STRING)
	private Idioma idioma;
	@Enumerated(EnumType.STRING)
	private Foil foil;	
	private double precoEmReais;
	private int cartasMesmaCaracteristicas;
	
//	public Carta(String nome, String edicao, Idioma idioma, Foil foil, double precoEmReais,
//			int cartasMesmaCaracteristicas) {
//		this.nome = nome;
//		this.edicao = edicao;
//		this.idioma = idioma;
//		this.foil = foil;
//		this.precoEmReais = precoEmReais;
//		this.cartasMesmaCaracteristicas = cartasMesmaCaracteristicas;
//	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public ListaDeCartas getListaDeCartas() {
		return listaDeCartas;
	}

	public void setListaDeCartas(ListaDeCartas listaDeCartas) {
		this.listaDeCartas = listaDeCartas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public Idioma getIdioma() {
		return idioma;
	}

	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}

	public Foil getFoil() {
		return foil;
	}

	public void setFoil(Foil foil) {
		this.foil = foil;
	}

	public double getPrecoEmReais() {
		return precoEmReais;
	}

	public void setPrecoEmReais(double precoEmReais) {
		this.precoEmReais = precoEmReais;
	}

	public int getCartasMesmaCaracteristicas() {
		return cartasMesmaCaracteristicas;
	}

	public void setCartasMesmaCaracteristicas(int cartasMesmaCaracteristicas) {
		this.cartasMesmaCaracteristicas = cartasMesmaCaracteristicas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cartasMesmaCaracteristicas, edicao, foil, id, idioma, listaDeCartas, nome, precoEmReais);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return cartasMesmaCaracteristicas == other.cartasMesmaCaracteristicas && Objects.equals(edicao, other.edicao)
				&& foil == other.foil && Objects.equals(id, other.id) && idioma == other.idioma
				&& Objects.equals(listaDeCartas, other.listaDeCartas) && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(precoEmReais) == Double.doubleToLongBits(other.precoEmReais);
	}
	
	
	
}

