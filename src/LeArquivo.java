import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeArquivo {
	int linha;
	int coluna;
	
	public int getLinha() {
		return linha;
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
	void leituraDeArquivo(String nome) { // nome é o caminho do arquivo para leitura
		try 
		{
			FileReader arq = new FileReader(nome);
			BufferedReader lerArq = new BufferedReader(arq);
			
			int aux = 0;
			int[] teste = new int[2]; // Vetor que irá passar os parametros do tamanho da matriz
			String linha = lerArq.readLine(); // le a linha
			
			 while (linha != null) {
			     
				 teste[aux] = Integer.parseInt(linha); // Converte String para inteiro
				 aux++;
				 linha  = lerArq.readLine();
			     
			 }
			 
			this.setLinha(teste[0]); // set atributo linha com o valor de quantas linhas terá a matriz 
			this.setColuna(teste[1]);  // set atributo coluna com o valor de quantas colunas terá a matriz
			
			}catch(IOException e){
				System.out.println(e.getMessage());
		}
	}
}
