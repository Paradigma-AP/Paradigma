package paradigma;

public class ParqueAvSiempreVivaApp {

	public static void main(String[] args) {
		ParqueAvSiempreViva parque = new ParqueAvSiempreViva();

		parque.agregarTodosLosUsuarios();
		parque.agregarTodasLasAtracciones();
		parque.agregarTodasLasPromociones();

		System.out.println(parque.toString());

	}
}