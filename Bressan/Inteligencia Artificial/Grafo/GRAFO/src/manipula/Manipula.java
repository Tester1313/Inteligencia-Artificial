package manipula;

import grafo.Vertice;

public class Manipula {
	
	// Exibe as conexões de um vertice
	public void exibeConexao(Vertice v1) {

		System.out.println("#### Exibe Conexão #### ");
		System.out.println("Vértice  : " + v1.getNome());
		System.out.println("Grau     : " + v1.getArestas().size());
		for (int i = 0; i < v1.getArestas().size(); i++) {
			System.out.println("Aresta " + i + " : " + v1.getArestas().get(i).getVertice().getNome());
		}
		System.out.println("####################### ");

	}

	
	// Exibe todos os vertices
	public void exibeTodosVertices(Vertice v1) {
		System.out.println("#### Exibe Vertices #### ");

		if (recursaoVertices(v1) == true) {
			System.out.println("######################## ");
		}

		

	}

	
	// Método recursivo para visitar todos os vertices (Profundidade!)
	public boolean recursaoVertices(Vertice v) {
		// Marca o vertice como visitado
		if (v.getVisitado() == true) {
			return true;
		} else {
			System.out.println("  " + v.getNome() + "  ");
			v.setVisitado(true);
			for (int i = 0; i < v.getArestas().size(); i++) {
				recursaoVertices(v.getArestas().get(i).getVertice());
			}
		}
		return true;
	}
}
