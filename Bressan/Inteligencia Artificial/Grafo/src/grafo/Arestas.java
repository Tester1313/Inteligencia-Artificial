package grafo;

public class Arestas {

	// Atributos
	private Vertice vertice;
	private double peso;

	// Construtor
	public Arestas(Vertice vertice) {
		super();
		this.vertice = vertice;
	}

	// Métodos
	public Vertice getVertice() {
		return vertice;
	}

	public void setVertice(Vertice vertice) {
		this.vertice = vertice;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
