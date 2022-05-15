package br.com.ifce.repository;

public class RepositoryFactory {
	
	public static FilmeRepository getFilmeRepository() {
		return new FilmeRepository();
	}
	
}
