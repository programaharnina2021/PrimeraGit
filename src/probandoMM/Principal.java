package probandoMM;

public class Principal {

	public static void main(String[] args) {
		Color miColor;
		miColor=Color.azul;
		Color otro=Color.Verde;
		System.out.println(miColor.equals(otro));
		miColor=Color.Verde;
		System.out.println(miColor.equals(otro));
		if(miColor==Color.Verde) {
			System.out.println("no");
		}else {
			System.out.println("si");
		}
	}

}
