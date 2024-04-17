package controller;

import java.util.ArrayList;
import java.util.List;

import model.Prova;

public class ProvaController implements IAvaliacao<Prova>{
	
	private List<Prova> listaProva;

	public ProvaController() {
		listaProva = new ArrayList<Prova>();
	}

	@Override
	public void addAvaliacao(Prova prova) {
		prova.setMediaAlunos((float)(Math.random()*10f));
		listaProva.add(prova);
	}

	@Override
	public void removeAvaliacao(Prova prova) {
		listaProva.remove(prova);
	}

	@Override
	public Prova localizaAvaliacao(int index) {
		return listaProva.get(index);
	}

	@Override
	public void limpaLista() {
		listaProva.clear();
	}

	@Override
	public void mostraLista() {
		for (Prova prova : listaProva) {
			System.out.println(prova.toString());
		}
		
	}

}
