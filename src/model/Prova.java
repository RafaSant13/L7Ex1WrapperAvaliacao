package model;

public class Prova {
	
	private int numeroQuestoes;
	private float mediaAlunos;

	public Prova(int numeroQuestoes) {
		this.numeroQuestoes = numeroQuestoes;
	}

	public int getNumeroQuestoes() {
		return numeroQuestoes;
	}

	public void setNumeroQuestoes(int numeroQuestoes) {
		this.numeroQuestoes = numeroQuestoes;
	}

	public float getMediaAlunos() {
		return mediaAlunos;
	}

	public void setMediaAlunos(float mediaAlunos) {
		this.mediaAlunos = mediaAlunos;
	}

	@Override
	public String toString() {
		return "[numeroQuestoes=" + numeroQuestoes + ", mediaAlunos=" + mediaAlunos + "]";
	}
	

}
