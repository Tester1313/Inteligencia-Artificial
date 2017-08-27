import java.util.Scanner;

// Caminho do Arquivo do meu computador c:\teste\a.txt
public class JogoDaVida {
	public static void main(String[] args) {
		LeArquivo le = new LeArquivo();
		Matriz matriz = new Matriz();
		
		Scanner scan = new Scanner(System.in);
		
		String nome;
		
		System.out.println("Digite o caminho do arquivo: ");
		nome = scan.nextLine();
		
		scan.close();
		le.leituraDeArquivo(nome); // le  arquivo
		
		matriz.setMatriz(new int[le.getLinha()][le.getColuna()]); // seta a matriz
		matriz.setAux_matriz(new int[le.getLinha()][le.getColuna()]);
		
		matriz.preencherMatriz(le.getLinha(),le.getColuna());
		
		matriz.ImprimirMatriz();
		
		matriz.Geracao();
		
		matriz.ImprimirMatriz();
		
		matriz.Geracao();
		
		matriz.ImprimirMatriz();
		
		/*matriz.Geracao();
		
		matriz.ImprimirMatriz(); */
		
	}
	
}
