package paradigma;

public class ParqueAvSiempreViva {
	public Atraccion [] atracciones;
	public Promocion [] promociones;
	public Usuario [] usuarios;

	/*
	 CREAR ARCHIVO
	 LEERLO Y GUARDARLO EN ARRAYS 
	 Sugerir visitas por pref de usuario
	 generar itinerarios 
	 METODO Vender 
	 ordenar atraccioes y promociones, segun pref de usuario
	 */
	public static void main(String[] args) {
		System.out.println(LeerYguardarArchivos.getUsuarios("usuarios.txt"));
		System.out.println(LeerYguardarArchivos.getAtracciones("Atracciones.txt"));

	}
}
