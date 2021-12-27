package com.jonas.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonas.bookstore.domain.Categoria;
import com.jonas.bookstore.domain.Livro;
import com.jonas.bookstore.repositories.CategoriaRepository;
import com.jonas.bookstore.repositories.LivroRepository;

@Service
public class DBService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;
	
	public void instaciaBaseDeDados() {
		
		Categoria cat1 = new Categoria(null, "Informática", "Livros de TI");
		Categoria cat2 = new Categoria(null, "Ficção Científica", "Livros de Ficção Científica");
		Categoria cat3 = new Categoria(null, "Biografias", "Livros de Biografia");
		
		Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "Loren ipsum loren pisom", cat1);
		Livro l2 = new Livro(null, "Engenharia de Software", "Louis", "Loren ipsum loren pisom", cat1);
		Livro l3 = new Livro(null, "Viagem ao Centro da Terra", "Julio Verne", "Loren ipsum loren pisom", cat2);
		Livro l4 = new Livro(null, "Steve Jobs", "Ana Silva", "Loren ipsum loren pisom", cat3);
		Livro l5 = new Livro(null, "Jorge Ben", "Maria Batista", "Loren ipsum loren pisom", cat3);
		
		cat1.getLivros().addAll(Arrays.asList(l1));
		cat2.getLivros().addAll(Arrays.asList(l3));
		cat3.getLivros().addAll(Arrays.asList(l4, l5));
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		this.livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
		
	}

}
