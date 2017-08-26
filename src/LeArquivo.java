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
	void leituraDeArquivo(String nome) {
		try 
		{
			FileReader arq = new FileReader(nome);
			BufferedReader lerArq = new BufferedReader(arq);
			
			int aux = 0;
			int[] teste = new int[2];
			String linha = lerArq.readLine();
			
			 while (linha != null) {
			     
				 teste[aux] = Integer.parseInt(linha);
				 aux++;
				 linha  = lerArq.readLine();
			     
			 }
			 
			this.setLinha(teste[0]);
			this.setColuna(teste[1]);
			
			}catch(IOException e){
				System.out.println(e.getMessage());
		}
	}
}
