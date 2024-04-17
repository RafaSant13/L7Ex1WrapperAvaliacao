package view;

import controller.AtividadeController;
import controller.ProvaController;
import model.Atividade;
import model.Prova;

public class Principal {

	public static void main(String[] args) {
		AtividadeController ac = new AtividadeController();
		ProvaController pc = new ProvaController();
		
		System.out.println("Atividades:");
		for (int i = 0; i < 5; i++) {
			String atividade = "Atividade " + (i+1);
			Atividade atv = new Atividade(atividade.toCharArray(),(int)(Math.random() * 9 + 1));
			ac.addAvaliacao(atv);
		}
		ac.mostraLista();
		System.out.println("\n*****************************************************");
		ac.removeAvaliacao(ac.localizaAvaliacao(2));
		ac.mostraLista();
		System.out.println("\n*****************************************************");
		ac.limpaLista();
		ac.mostraLista();
		System.out.println("\n*****************************************************");
		
		System.out.println("Provas:");
		for(int i = 0; i < 5; i++) {
			Prova prv = new Prova((int)(Math.random()*5)+2);
			pc.addAvaliacao(prv);
		}
		pc.mostraLista();
		System.out.println("\n*****************************************************");
		pc.removeAvaliacao(pc.localizaAvaliacao(2));
		pc.mostraLista();
		System.out.println("\n*****************************************************");
		pc.limpaLista();
		pc.mostraLista();
		System.out.println("\n*****************************************************");
	}

}
