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
				String[] datosUsuarios = linea.split(",");
				String nombre = datosUsuarios[0];
				int tiempoDisponibleEnHoras = Integer.parseInt(datosUsuarios[1]);
				int presupuesto = Integer.parseInt(datosUsuarios[2]);
				TipoDeAtraccion tipoDeAtraccionPreferida = paradigma.TipoDeAtraccion
						.valueOf(datosUsuarios[3].toUpperCase());

				usuario[contador++] = new Usuario(nombre, tiempoDisponibleEnHoras, presupuesto,
						tipoDeAtraccionPreferida);
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
				TipoDeAtraccion tipoDeAtraccion = paradigma.TipoDeAtraccion.valueOf(datosAtracciones[4].toUpperCase());

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

	public static Promocion[] getPromocionesDesdeArchivo() {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		Promocion[] promociones = null;

		try {
			archivo = new File("Promociones.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			int cantidad = Integer.parseInt(br.readLine());
			promociones = new Promocion[cantidad];
			int contador = 0;

			String linea = br.readLine();
			while (linea != null) {
				String[] datosPromos = linea.split(" ");
				String nombre = datosPromos[0];
				TipoDeAtraccion tipoDePromocion = paradigma.TipoDeAtraccion.valueOf(datosPromos[1].toUpperCase());
				String[] atraccionesString = datosPromos[2].split(",");
				Atraccion[] atracciones = new Atraccion[atraccionesString.length];
				for (int i = 0; i < atraccionesString.length; i++) {
					for (Atraccion atraccion : getAtraccionesDesdeArchivos()) {
						if (atraccion.getNombre().equals(atraccionesString[i])) {
							System.out.println(atraccion);
							atracciones[i] = atraccion;
						}
					}
				}
				if (datosPromos[0].equals("PromoAventura")) {
					promociones[contador++] = new PromocionAbsoluta(nombre, tipoDePromocion, atracciones);
				} else if (datosPromos[0].equals("PromoDePaseo")) {
					promociones[contador++] = new PromocionTresPorDos(nombre, tipoDePromocion, atracciones);
				} else if (datosPromos[0].equals("PromoGastronomica")) {
					promociones[contador++] = new PromocionPorcentual(nombre, tipoDePromocion, atracciones);
				}

				linea = br.readLine();
			}
			return promociones;

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
		return promociones;
	}

}