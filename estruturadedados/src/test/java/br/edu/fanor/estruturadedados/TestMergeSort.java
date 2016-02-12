package br.edu.fanor.estruturadedados;

import org.junit.BeforeClass;
import org.junit.Test;

import br.edu.fanor.estruturadedados.utils.ArquivoUtils;

public class TestMergeSort {


	private static int[] vetor;

	@BeforeClass
	public static void init() {
		try {
			vetor = ArquivoUtils.retornaVetor("resources/large");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test
	public void testMergeSort(){
		vetor = MergeSort.mergeSort(vetor, 0, vetor.length - 1);
		for (int i : vetor) {
			System.out.println(i);
		}
	}

}
