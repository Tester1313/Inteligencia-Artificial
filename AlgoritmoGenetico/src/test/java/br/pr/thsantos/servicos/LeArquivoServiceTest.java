package br.pr.thsantos.servicos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Before;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeArquivoServiceTest {

	private LeArquivoService leArquivo;
	private int matriz[][];;
	private String teste;

	@Before
	public void setup() {
		this.matriz = new int[10][10];
		leArquivo = new LeArquivoService(this.matriz);
	}

	@Test
	public void deveLerArquivoTxt() {
		//Acao
		leArquivo.leituraDeArquivo("c:\\teste\\c.txt");

		//Verificacao		
		assertArrayEquals(umaMatriz(), leArquivo.getMatriz());
	}

	public int[][] umaMatriz(){
		 int matrizLeitura [][] = {
				{0,	1,	1,	1,	1,	1,	1,	1,	1,	1},
				{2,	0,	3,	4,	5,	6,	7,	8,	9,	10},
				{11,12,	0,	13,	14,	15,	16,	17,	18,	19},
				{20,1,	21,	0,	22,	23,	24,	25,	26,	27},
				{1,	28,	29,	30,	0,  31,	32,	33,	34,	42},
				{35,36,	1,	37,	38,	0,	39,	40,	41,	1},
				{42,	43,	44,	1,	1,	45,	0,	46,	47,	48},
				{49,	50,	52,	53,	54, 1,	55,	0,	56,	57},
				{58,	61,	62,	64,	66,	68,	1,	71,	0,	72},
				{59,	60,	63,	65,	67,	69,	70,	1,	1,	0}};
		 return matrizLeitura;
	}

}
