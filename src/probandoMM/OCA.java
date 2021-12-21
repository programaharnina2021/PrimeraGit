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
 * cambia la naturaleza de la casilla 19( y solo esa)
 * que pasa a ser posada
 * @param tablero
 */
public static void colocarPosada(Casilla[] tablero) {}
/**
 * Cambia la naturaleza de la casilla 31 (solo la 31)
 *  que pasa de blanco a pozo
 * @param tablero
 */
public static void colocarPozo(Casilla[] tablero) {}
/**
 * Cambia la naturaleza de la casilla 12,23
 *  que pasa de blanco a pozo
 * @param tablero
 */
public static void colocarPuente(Casilla[] tablero) {
	tablero[12]=Casilla.puente;
	tablero[23]=Casilla.puente;
	
}
public static void colocarOcas(Casilla[] tablero) {
	// TODO Auto-generated method stub
	
}

/**
 * comprobar si la ficha en la posicion turno ocupa una casilla de tipo Oca
 * @param tablero
 * @param fichas
 * @param turno
 * @return true si la ficha en el turno esta en una posicion de oca o false en
 * caso contrario
 */
public static boolean comprobarOca(Casilla[] tablero,int[] fichas, int turno) {
	return tablero[fichas[turno]]==Casilla.oca;
}
public static void establecerCondiciones(Casilla[] tablero) {
	// TODO Auto-generated method stub
	
}
/**
 * la ficha del jugador del turno actual cambia su valor a la siguiente casilla oca
 * @param fichas
 * @param turno
 */
public static void avanzarOca(int[] fichas, int turno) {
	//TODO avanzarOca
}
}
