package application;

import entities.ControleRemoto;

public class Main {

	public static void main(String[] args) {

		ControleRemoto c = new ControleRemoto();
		c.ligar();
		c.maisVolume();
		c.ligarMudo();
		c.desligarMudo();
		c.abrirMenu();
		c.fecharMenu();
		
		
	}
}