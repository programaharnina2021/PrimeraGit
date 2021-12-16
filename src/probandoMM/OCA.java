package probandoMM;

public class OCA {
public static void main(String[] args) {
	Casilla tablero[];
	tablero=new Casilla[63];
	for (int i = 0; i < tablero.length; i++) {
		tablero[i]=Casilla.blanco;
		System.out.println(tablero[i]);
	}
}
/**
 * Cambia la naturaleza de la casilla 31 (solo la 31)
 *  que pasa de blanco a pozo
 * @param tablero
 */
public static void colocarPozo(Casilla[] tablero) {}
}
