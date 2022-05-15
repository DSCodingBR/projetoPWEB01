package br.com.ifce.view;

import br.com.ifce.controller.FilmeController;
import br.com.ifce.model.Filme;

public class FilmeView {
	public static void main(String[] args) {
		
		FilmeController filmeController = new FilmeController();
		
		//BUSCAR POR ID
		Filme filme = filmeController.buscarFilmePorIdController((long)1);
		
		
		//Removi
		//filmeController.removerController((long) 1);
		
		//ADICIONEI
		//Filme filme1 = new Filme();
		
		//filme1.setTitulo("SPIDER MAN 3");
		//filme1.setCategoria("Acao/Heroi");
		//filme1.setPreco(49);
		//filme1.setDuracao(120);
		//filme1.setData("16/12/2021");

		//filmeController.adicionarController(filme1);
		
	}
}
