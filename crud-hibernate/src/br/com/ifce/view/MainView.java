package br.com.ifce.view;

import br.com.ifce.controller.FilmeController;
import br.com.ifce.model.Filme;

public class MainView {

	public static void main(String[] args) {
		
		FilmeController filmeController = new FilmeController();
		
		Filme filme1 = new Filme();
		
		filme1.setTitulo("Avangers");
		filme1.setData("11/05/2022");
		filme1.setPreco(49);
		filme1.setDuracao(120);
		
		filmeController.adicionarController(filme1);
		
	}
	
}
