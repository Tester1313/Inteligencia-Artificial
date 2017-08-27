public class Matriz {
	
	
		private int[][] matriz;
		private int[][] aux_matriz;
		
		public int[][] getaux_matriz() {
			return aux_matriz;
		}

		public void setAux_matriz(int[][] aux_matriz) {
			this.aux_matriz = aux_matriz;
		}

		public int[][] getMatriz() {
			return matriz;
		}
		public void setMatriz(int[][] matriz) {
			this.matriz = matriz;
		}
		
		// Coloca valores na matriz criada
		public void preencherMatriz(int linha, int coluna){
			for(int i = 0; i < matriz.length; i++) {
				for(int j = 0; j < matriz[i].length; j++) {
					if(i == 0 || j ==0 || j == (coluna-1) || i == (linha-1) || (i & j) == 3) {
						matriz[i][j] = 0;
					}else {
						matriz[i][j] = 1;
					} 
				}
			}
		}
		
		// Imprime a matriz
		public void ImprimirMatriz() {
			System.out.println("Matriz");
			
			for(int i = 0; i < matriz.length; i++) {
				for(int j = 0; j < matriz[i].length; j++) {
					System.out.print(matriz[i][j]+" "); 
				}
				System.out.println();
			}
		}
		
		// Metodo Gerãção é responsável por todo o controle de morte e nascimento de celulas
		public void Geracao() {
			//int aux = 0;
			int vivas = 0;
			
			//aux_matriz = matriz;
			
			for(int i = 1; i < (matriz.length - 1); i++) {
				for(int j = 1; j < (matriz[i].length - 1); j++) {
					//int a = i-1;
					/*if(matriz[i-1][j-1] == 1) {
							vivas++;;
						}*/
					
						if(matriz[i-1][j] == 1) {
							vivas++;;
						}
						
						/*if(matriz[i-1][j+1] == 1) {
							vivas++;;
						}*/
						
						if(matriz[i][j+1] == 1) {
							vivas++;;
						}
						
						if(matriz[i][j-1] == 1 ) {
							vivas++;
						}
						
						if(matriz[i+1][j] == 1) {
							vivas++;
						}
						
						/*if(matriz[i+1][j-1] == 1) {
							vivas++;
						}
						
						if(matriz[i+1][j+1] == 1) {
							vivas++;
						}*/
						
						if(vivas >= 3 && matriz[i][j] == 0) { // Nascimento
							aux_matriz[i][j] = 1;
							
						} else if(vivas >=2 && vivas <=3 && matriz[i][j] == 1) { //Sobrevivencia
							aux_matriz[i][j] = 1;
									
						} else if( vivas < 2 && matriz[i][j] == 1) { // Morte por solidão
							aux_matriz[i][j] = 0;
							
						} else if( vivas > 3 && matriz[i][j] == 1) { // Morte por superpopulação
							aux_matriz[i][j] = 0;
						}
					vivas = 0;
				}
			}
			this.PassaValores(); 
		}
		
		// Metodo que Passa Valores da matriz Auxiliar para Matriz Principal
		public void PassaValores() {
			for(int i = 0; i < matriz.length; i++) {
				for(int j = 0; j < matriz[i].length; j++) {
					this.matriz[i][j] = aux_matriz[i][j]; 
				}
			}
		}
}

