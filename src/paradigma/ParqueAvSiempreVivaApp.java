package paradigma;

public class ParqueAvSiempreVivaApp {

	public static void main(String[] args) {
		ParqueAvSiempreViva parque = new ParqueAvSiempreViva();
		Consola consola = new Consola();
		
		parque.getUsuarios();
		parque.getAtracciones();
		parque.getPromociones();
		parque.getSugerencias();
		
		consola.imprimirPorConsola(parque.getUsuarios(), parque.getSugerencias());
		//System.out.println(parque.obtenerItinerarioPorConsola());

		//System.out.println(parque.toString());

	}
}