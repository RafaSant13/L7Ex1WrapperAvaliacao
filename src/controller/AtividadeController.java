package controller;

import java.util.ArrayList;
import java.util.List;

import model.Atividade;

public class AtividadeController implements IAvaliacao<Atividade>{
	
	private List<Atividade> listaAtividade;

	public AtividadeController() {
		listaAtividade = new ArrayList<Atividade>();
	}

	@Override
	public void addAvaliacao(Atividade atividade) {
		listaAtividade.add(atividade);
	}

	@Override
	public void removeAvaliacao(Atividade atividade) {
		listaAtividade.remove(atividade);
	}

	@Override
	public Atividade localizaAvaliacao(int index) {
		return listaAtividade.get(index);
	}

	@Override
	public void limpaLista() {
		listaAtividade.clear();
	}

	@Override
	public void mostraLista() {
		for (Atividade atividade : listaAtividade ) {
            System.out.println(atividade.toString());
        }
	}

}
