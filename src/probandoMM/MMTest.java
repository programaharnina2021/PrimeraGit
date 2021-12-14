package probandoMM;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MMTest {

	@Test
	void testComprobarCombinacion() {
		int[] enigma= {1,2,3,4};
		int[][] combinacion= {
				{5,5,5,5},
				{5,5,1,5}
				};
		int[][] esperado= {
				{0,0,0,0},
				{6,0,0,0}
				};
		for (int i = 0; i < esperado.length; i++) {
			System.out.println("probando caso "+i);
			assertArrayEquals(esperado[i], MM.comprobarCombinacion(enigma, combinacion[i]));
		}
	}

}
