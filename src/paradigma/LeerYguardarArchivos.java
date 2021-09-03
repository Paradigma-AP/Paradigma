package paradigma;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerYguardarArchivos {

	public static Usuario[] getUsuariosDesdeArchivos() {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		Usuario[] usuario = null;

		try {
			archivo = new File("Usuarios.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			int cantidad = Integer.parseInt(br.readLine());
			usuario = new Usuario[cantidad];

			int contador = 0;
			String linea = br.readLine();
			while (linea != null) {
				String[] datosUsuarios = linea.split(" ");
				String nombre = datosUsuarios[0];
				int tiempoDisponibleEnHoras = Integer.parseInt(datosUsuarios[1]);
				int presupuesto = Integer.parseInt(datosUsuarios[2]);
				TipoDeAtraccion tipoDeAtraccionPreferida = paradigma.TipoDeAtraccion.valueOf(datosUsuarios[3]);

				usuario[contador++] = new Usuario(nombre, tiempoDisponibleEnHoras, presupuesto, tipoDeAtraccionPreferida);
				linea = br.readLine();
			}

			return usuario;

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();

			}
		}
		return usuario;
	}
	
	public static Atraccion[] getAtraccionesDesdeArchivos() {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		Atraccion[] atraccion = null;

		try {
			archivo = new File("Atracciones.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			int cantidad = Integer.parseInt(br.readLine());
			atraccion = new Atraccion[cantidad];

			int contador = 0;
			String linea = br.readLine();
			while (linea != null) {
				String[] datosAtracciones = linea.split(" ");
				String nombre = datosAtracciones[0];
				int duracionEnHoras = Integer.parseInt(datosAtracciones[1]);
				int precio = Integer.parseInt(datosAtracciones[2]);
				int cupoDisponible = Integer.parseInt(datosAtracciones[3]);
				TipoDeAtraccion tipoDeAtraccion = paradigma.TipoDeAtraccion.valueOf(datosAtracciones[4]);

				atraccion[contador++] = new Atraccion(nombre, duracionEnHoras, precio, cupoDisponible, tipoDeAtraccion);
				linea = br.readLine();
			}

			return atraccion;

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();

			}
		}
		return atraccion;
	}

	public static Promocion[] obtenerPromocionesDesdeArchivo(ParqueAvSiempreViva parque) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		Promocion[] promos = null;

		try {
			archivo = new File("Promociones.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			int cantidad = Integer.parseInt(br.readLine());
			promos = new Promocion[cantidad];
			int contador = 0;

			String linea = br.readLine();
			while (linea != null) {
				String[] datosPromos = linea.split(" ");
				if(datosPromos[0] == "PromoAventura") {
				String nombre = datosPromos[0];
				TipoDeAtraccion tipoDePromocion = paradigma.TipoDeAtraccion.valueOf(datosPromos[4]);
				String[] atraccionesString = datosPromos[1].split(",");
				Atraccion[] atracciones = new Atraccion[atraccionesString.length];
				for (int i = 0; i < atraccionesString.length; i++) {
					atracciones[i] = parque.obtenerAtraccionPorNombre(atraccionesString[i]);
				}

				promos[contador++] = new PromocionAbsoluta(nombre, tipoDePromocion, atracciones);
				}
				if(datosPromos[0] == "PromoDePaseo") {
					String nombre = datosPromos[0];
					TipoDeAtraccion tipoDePromocion = paradigma.TipoDeAtraccion.valueOf(datosPromos[4]);
					String[] atraccionesString = datosPromos[1].split(",");
					Atraccion[] atracciones = new Atraccion[atraccionesString.length];
					for (int i = 0; i < atraccionesString.length; i++) {
						atracciones[i] = parque.obtenerAtraccionPorNombre(atraccionesString[i]);
					}

					promos[contador++] = new PromocionTresPorDos(nombre, tipoDePromocion, atracciones);
				}
				if(datosPromos[0] == "PromoGastronomica") {
					String nombre = datosPromos[0];
					TipoDeAtraccion tipoDePromocion = paradigma.TipoDeAtraccion.valueOf(datosPromos[4]);
					String[] atraccionesString = datosPromos[1].split(",");
					Atraccion[] atracciones = new Atraccion[atraccionesString.length];
					for (int i = 0; i < atraccionesString.length; i++) {
						atracciones[i] = parque.obtenerAtraccionPorNombre(atraccionesString[i]);
					}
					promos[contador++] = new PromocionPorcentual(nombre, tipoDePromocion, atracciones);
				}
				linea = br.readLine();
			}
			return promos;

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return promos;
	}

}