package br.com.ifce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Filme {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String titulo;
	private String categoria;
	private int preco;
	private int duracao;
	private String data;
	
	public void status(){
		System.out.println("Nome: " + this.getTitulo());
		System.out.println("Categoria: " + this.getCategoria());
		System.out.println("Preco: " + this.getPreco());
		System.out.println("Duração: " + this.getDuracao());

	}
	
	

	@Override
	public String toString() {
		return "Filme [id=" + id + ", titulo=" + titulo + ", categoria=" + categoria + ", preco=" + preco + ", duracao="
				+ duracao + ", data=" + data + "]";
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	

	
	
}
