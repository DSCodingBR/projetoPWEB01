package br.com.ifce.view;

import br.com.ifce.controller.FilmeController;
import br.com.ifce.model.Filme;
//PEGARA O CONTROLLER QUE CHAMARA MEU SERVICE QUE PEGARA MEU REPOSITORY
//AQUI E O QUE O BONITO DO USER VÊ
public class MainView {

	public static void main(String[] args) {
		
		
		
		Filme filme1 = new Filme();
		
		filme1.setTitulo("SPIDER MAN 3");
		filme1.setCategoria("Acao/Heroi");
		filme1.setPreco(49);
		filme1.setDuracao(120);
		filme1.setData("16/12/2021");
		
		FilmeController filmeController = new FilmeController();
		filmeController.adicionarController(filme1);
		
	}
	
}
