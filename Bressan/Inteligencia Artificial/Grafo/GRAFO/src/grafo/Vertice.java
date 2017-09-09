package grafo;

import java.util.ArrayList;

public class Vertice {

	// Atributos
	private String nome;
	private ArrayList<Arestas> arestas;
	private boolean visitado;

	// Construtor
	public Vertice(String nome) {
		super();
		this.nome = nome;
		arestas = new ArrayList<Arestas>();
	}

	// Métodos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Arestas> getArestas() {
		return arestas;
	}

	public void setArestas(ArrayList<Arestas> arestas) {
		this.arestas = arestas;
	}

	public void setArestaAdijacente(Arestas a) {
		this.arestas.add(a);
	}

	public boolean getVisitado() {
		return visitado;
	}

	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
	}

}
