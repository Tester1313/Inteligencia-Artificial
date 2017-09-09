package executa;

import grafo.Arestas;
import grafo.Vertice;
import manipula.Manipula;

public class ExecutaGrafo {

	public static void main(String[] args) {
		

		/*    Exemplo simples de um grafo
		 *      
		 *   (1) ---- (2) ---- (3)
		 *    |        |        |
		 *   (4) ---- (5) ---- (6)
		 * 
		 */
		
		
		// Instancia as vertíces do grafo
		Vertice v1 = new Vertice("V1");
		Vertice v2 = new Vertice("V2");
		Vertice v3 = new Vertice("V3");
		Vertice v4 = new Vertice("V4");
		Vertice v5 = new Vertice("V5");
		Vertice v6 = new Vertice("V6");
		
		// Instancia as arestas de cada vertices
		v1.setArestaAdijacente(new Arestas(v2));
		v1.setArestaAdijacente(new Arestas(v4));
		v2.setArestaAdijacente(new Arestas(v1));
		v2.setArestaAdijacente(new Arestas(v3));
		v2.setArestaAdijacente(new Arestas(v5));
		v3.setArestaAdijacente(new Arestas(v2));
		v3.setArestaAdijacente(new Arestas(v6));
		v4.setArestaAdijacente(new Arestas(v1));
		v4.setArestaAdijacente(new Arestas(v5));
		v5.setArestaAdijacente(new Arestas(v2));
		v5.setArestaAdijacente(new Arestas(v4));
		v5.setArestaAdijacente(new Arestas(v6));
		v6.setArestaAdijacente(new Arestas(v3));
		v6.setArestaAdijacente(new Arestas(v5));
		
		
		// Manipulações básicas
		Manipula mp = new Manipula();
		
		// Exibe conexões de cada No
		mp.exibeConexao(v2);
		
		// Exibe todos os Vertices (Método Recursivo)
		mp.exibeTodosVertices(v1);
		
		
		
		
		
		
		
		
	
	
		
		

	}

}
