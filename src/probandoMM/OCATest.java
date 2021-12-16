package probandoMM;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
	void testPosada() {
		OCA.colocarPosada(tablero);
		int posada = 19;
		comprobarPosicion(Casilla.posada, posada);
	}

	@Test
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
