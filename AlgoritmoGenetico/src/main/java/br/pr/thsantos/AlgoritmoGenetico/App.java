package br.pr.thsantos.AlgoritmoGenetico;

import br.pr.thsantos.servicos.LeArquivoService;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
		String nome;
        System.out.println( "Hello World!" );
        
     // Classe que le e inicializa matriz
     LeArquivoService le = new LeArquivoService(new int [26][26]);
     		
     nome ="c:\\teste\\26.txt";
     le.leituraDeArquivo(nome); // le  arquivo e inicializa matriz
    }
}
