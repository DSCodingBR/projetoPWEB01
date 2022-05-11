package br.com.ifce.repository;

import java.util.List;

import br.com.ifce.model.Filme;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

//CRIAR , ATUALIZAR, LISTAR E REMOVER
public class FilmeRepository {
	
	public void adicionarRepository(Filme filme) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mapeamento-jpa-hibernate");
		EntityManager manager = fabrica.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(filme);
		manager.getTransaction().commit();
		
		fabrica.close();
		manager.close();
	}
	
	public void removerRepository(Long id) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mapeamento-jpa-hibernate");
		EntityManager manager = fabrica.createEntityManager();
		
		Filme filme = manager.find(Filme.class, id);
		manager.getTransaction().begin();
		manager.remove(filme);
		manager.getTransaction().commit();
		
		fabrica.close();
		manager.close();
		
	}
	
	public void alterarRepository(Filme filme) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mapeamento-jpa-hibernate");
		EntityManager manager = fabrica.createEntityManager();
		
		manager.getTransaction().begin();
		manager.merge(filme);
		manager.getTransaction().commit();
		
		fabrica.close();
		manager.close();
	}
	
	public List<Filme> listarRepository(){
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mapeamento-jpa-hibernate");
		EntityManager manager = fabrica.createEntityManager();
		
		List<Filme> filme = manager.createQuery("select f from Filme as f").getResultList();
		
		fabrica.close();
		manager.close();
		
		return filme;
	}
}
