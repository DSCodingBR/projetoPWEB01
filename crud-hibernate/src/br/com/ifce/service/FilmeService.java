package br.com.ifce.service;

import java.util.List;

import br.com.ifce.model.Filme;
import br.com.ifce.repository.FilmeRepository;

//@Service
public class FilmeService {
	//@Autowired
	private FilmeRepository filmeRepository = new FilmeRepository();
	
	public void adicionarService(Filme filme) {
		
		//if(filme.getDuracao()<=120) {
		filmeRepository.adicionarRepository(filme);
		//}else {
			//System.out.println("Erro ao Inserir um Filme com Duracao Superior a 120 Minutos!");
		//}
		
	}
	public void removerService(Long id) {
		filmeRepository.removerRepository(id);
	}
	public void alterarService (Filme filme) {
		filmeRepository.alterarRepository(filme);
	}
	public List<Filme> listarService (){
		return filmeRepository.listarRepository();
	}
	
	
}
