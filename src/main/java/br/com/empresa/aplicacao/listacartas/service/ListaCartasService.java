//package br.com.empresa.aplicacao.listacartas.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import br.com.empresa.aplicacao.listacartas.model.Carta;
//import br.com.empresa.aplicacao.listacartas.model.ListaDeCartas;
//import br.com.empresa.aplicacao.listacartas.repository.CartaRepository;
//import br.com.empresa.aplicacao.listacartas.repository.ListaDeCartasRepository;
//
//
//public class ListaCartasService {
//
//	
//	private ListaDeCartasRepository listaDeCartasRepository;
//	
//	private CartaRepository cartaRepository;
//
//	// Retorna todas as listas de cartas
//	public Iterable<ListaDeCartas> buscarTodasAsListas() {
//		return listaDeCartasRepository.findAll();
//	}
//
//	// Ler todas as cartas de uma lista
//	public ListaDeCartas buscarLista(List<Carta> nomeDaLista) {
//		Optional<ListaDeCartas> listaDeCartas = listaDeCartasRepository.findById(nomeDaLista);
//		return listaDeCartas.get();
//	}
//	
//    // Criar uma nova lista de cartas
//	public void criarLista(ListaDeCartas novaLista) {
//		List<Carta> nome= novaLista.getNomedaLista();
//		Optional<ListaDeCartas> lista = listaDeCartasRepository.findById(nome);
//		if(lista.isPresent()) {
//			System.out.println("Essa lista já existe.");
//		}else {
//			listaDeCartasRepository.save(novaLista);
//		}
//
//	}
//	
//	 // Deletar uma lista de cartas
//		public void deletarLista(ListaDeCartas listaParaDeletar) {
//			List<Carta> nome= listaParaDeletar.getNomedaLista();
//			Optional<ListaDeCartas> lista = listaDeCartasRepository.findById(nome);
//			if(lista.isPresent()) {
//				System.out.println("Essa lista não existe.");
//			}else {
//				listaDeCartasRepository.delete(listaParaDeletar);
//			}
//
//		}
//
//	public void inserirCartaNaLista(Carta carta, ListaDeCartas nomeDaLista) {
//		List<Carta> nome= nomeDaLista.getNomedaLista();
//		Optional<ListaDeCartas> lista = listaDeCartasRepository.findById(nome);
//		if(lista.isPresent()) {
//			;
//		}else {
//			listaDeCartasRepository.save(nomeDaLista);
//		}
//
//
//	}
//
//}
