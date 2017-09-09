package executa;

import grafo.Arestas;
import grafo.Vertice;
import manipula.Manipula;

public class ExecutaArvore {
	public static void main(String[] args) {
		/*
		 * Exemplo simples de um grafo
		 * 
		 *          _______ (1) ________
		 *          
		 *         /         |          \ 
		 *         
		 *       (2)        (3)          (4) 
		 *       
		 *       / \        / \          / 
		 *       
		 *    (5)   (6)   (7)  (8)     (9)
		 *    
		 *    / 
		 *    
		 *  (10)
		 * 
		 */

		// Instancia as vertíces do grafo
		Vertice v1 = new Vertice("V1");
		Vertice v2 = new Vertice("V2");
		Vertice v3 = new Vertice("V3");
		Vertice v4 = new Vertice("V4");
		Vertice v5 = new Vertice("V5");
		Vertice v6 = new Vertice("V6");
		Vertice v7 = new Vertice("V7");
		Vertice v8 = new Vertice("V8");
		Vertice v9 = new Vertice("V9");
		Vertice v10 = new Vertice("V10");

		// Instancia as arestas de cada vertices
		v1.setArestaAdijacente(new Arestas(v2));
		v1.setArestaAdijacente(new Arestas(v3));
		v1.setArestaAdijacente(new Arestas(v4));
		v2.setArestaAdijacente(new Arestas(v1));
		v2.setArestaAdijacente(new Arestas(v5));
		v2.setArestaAdijacente(new Arestas(v6));
		v3.setArestaAdijacente(new Arestas(v1));
		v3.setArestaAdijacente(new Arestas(v7));
		v3.setArestaAdijacente(new Arestas(v8));
		v4.setArestaAdijacente(new Arestas(v1));
		v4.setArestaAdijacente(new Arestas(v9));
		v5.setArestaAdijacente(new Arestas(v2));
		v5.setArestaAdijacente(new Arestas(v10));
		v6.setArestaAdijacente(new Arestas(v2));
		v7.setArestaAdijacente(new Arestas(v3));
		v8.setArestaAdijacente(new Arestas(v3));
		v9.setArestaAdijacente(new Arestas(v4));
		v10.setArestaAdijacente(new Arestas(v5));

		// Manipulações básicas
		Manipula mp = new Manipula();

		// Exibe conexões de cada No
		mp.exibeConexao(v1);

		// Exibe todos os Vertices (Método Recursivo)
		// Busca em profundidade!!!
		mp.exibeTodosVertices(v1);

	}

}
