package paradigma;


public class ParqueAvSiempreVivaApp {

	public static void main(String[] args) {
		ParqueAvSiempreViva parque = new ParqueAvSiempreViva();

		parque.agregarTodosLosUsuarios(LeerYguardarArchivos.getUsuariosDesdeArchivos());
		parque.agregarTodasLasAtracciones(LeerYguardarArchivos.getAtraccionesDesdeArchivos());
		parque.agregarTodasLasPromociones(LeerYguardarArchivos.getPromocionesDesdeArchivo(parque));


		// Listo todas las "atracciones" y las promos con su contenido
		System.out.println(parque.toString());

	}
}
