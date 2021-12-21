package probandoMM;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OCATest {
	Casilla tablero[];

	@BeforeEach
	void before() {
		tablero = new Casilla[63];
		for (int i = 0; i < tablero.length; i++) {
			tablero[i] = Casilla.blanco;
		}
	}

	@Test
	void testOca() {
		OCA.colocarOcas(tablero);
		int ocas[]= {};
		Casilla oca=Casilla.oca;
		comprobarPosicionesLateral(ocas, oca);
	}
	
	@Test
	void testAvanzarOca() {
		
	}
	
	@Test
	void testComprobarOca() {
		int[] fichas= {1,9};
		OCA.establecerCondiciones(tablero);
		boolean expected[]= {false,true};
		for (int i = 0; i < expected.length; i++) {
			assertEquals(expected[i], OCA.comprobarOca(tablero, fichas, i));
		}
	}
	
	@Test
	void testPuente() {
		OCA.colocarPuente(tablero);
		// requisito ordenado ascendentemente
		int puentes[] = { 12, 23 };
		Casilla puente = Casilla.puente;
		comprobarPosiciionesFrontal(puentes,puente);
		comprobarPosicionesLateral(puentes, puente);

	}
	private void comprobarPosicionesLateral(int[] buscados,Casilla tipo) {
		for (int i = 0; i < buscados.length; i++) {
			assertEquals(tipo, tablero[buscados[i]]);
		}
		int contadorNoBuscados=0;
		for (int i = 0; i < tablero.length; i++) {
			if(tablero[i]!=tipo) {
				contadorNoBuscados++;
			}
		}
		assertEquals(tablero.length-contadorNoBuscados, buscados.length);
	}
	private void comprobarPosiciionesFrontal(int[] buscados,Casilla tipo) {
		int posicionPuentes = 0;
		for (int i = 0; i < tablero.length; i++) {
			if (buscados[posicionPuentes] != i) {
				assertNotEquals(tipo, tablero[i]);
			} else {
				assertEquals(tipo, tablero[i]);
				posicionPuentes++;
				if (posicionPuentes >= buscados.length) {
					// como he llegado al final voy a poner a cero
					// la posicionPuentes
					posicionPuentes = 0;
				}
			}
		}
	}

	@Ignore
	void testPosada() {
		OCA.colocarPosada(tablero);
		int posada = 19;
		comprobarPosicion(Casilla.posada, posada);
	}

	@Ignore
	void testColocarPozo() {
		OCA.colocarPozo(tablero);
		int pozo = 31;
		comprobarPosicion(Casilla.pozo, pozo);
	}

	public void comprobarPosicion(Casilla tipo, int posicion) {
		for (int i = 0; i < tablero.length; i++) {
			if (i != posicion - 1) {
				assertNotEquals(tipo, tablero[i]);
			} else {
				assertEquals(tipo, tablero[posicion - 1]);
			}
		}
	}

}
