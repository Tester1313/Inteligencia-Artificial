package br.pr.thsantos.servicos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class LeArquivoService {

	private int linha;
	private int coluna;
	private int [][] matriz;
	
	//Matriz matriz = new Matriz();

	public LeArquivoService(int[][] matriz) {
		super();
		this.matriz = matriz;
	}
	
	public int getLinha() {
		return linha;
	}

	public int[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	
	// Realiza a leitura do arquivo e seta os atributo linha e coluna
		public void leituraDeArquivo(String nome) { // nome é o caminho do arquivo para leitura
			try 
			{
				FileReader arq = new FileReader(nome);
				BufferedReader lerArq = new BufferedReader(arq);
				String linha;
				
				for(int i = 0; i < matriz.length; i++){
					linha = lerArq.readLine();	// le uma linha do arquivo (toda a linha)
					if( linha == null ){	// se nada for retornado, é porque acabou o arquivo: 
						//fimArquivo = true;
						break; // sai do laco "for(i = 0; i < matriz; i++)"
					}	
					
					StringTokenizer leLinhaArquivo = new StringTokenizer(linha);	// habilita o tokenizer para ler os componetes de linha
					// le os M elementos de Linha
					for(int j = 0; j < matriz.length; j++){
						matriz[i][j] = Integer.parseInt( leLinhaArquivo.nextToken());
					}
					
					
				}
				lerArq.close();
				}catch(IOException e){ // Caso de erro é apresentado o Erro
					System.out.println(e.getMessage());
			}
			//return matriz;
		}
}
