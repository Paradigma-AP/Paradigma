package paradigma;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class LeerYguardarArchivos {
	
	public static LinkedList<Usuario> getUsuarios(String archivo) {
		LinkedList<Usuario> usuarios = new LinkedList<Usuario>();
		Scanner sc = null;
		try {
			sc = new Scanner(new File(archivo));

			while (sc.hasNext()) {
				String linea = sc.nextLine();
				String datos[] = linea.split(",");
				Usuario u = new Usuario();
				u.setNombre(datos[0]);
				u.setTiempoDisponibleEnHoras(Integer.parseInt(datos[1]));
				u.setPresupuesto(Integer.parseInt(datos[2]));
				u.setAtraccionPreferida(TipoDeAtraccion.valueOf(datos[3]));
				//System.out.println(u);
				if (!usuarios.contains(u))
					usuarios.add(u);

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		sc.close();
		return usuarios;
	}
	
	public static ArrayList<Atraccion> getAtracciones(String archivo) {
		ArrayList<Atraccion> atracciones = new ArrayList<Atraccion>();
		Scanner sc = null;
		try {
			sc = new Scanner(new File(archivo));

			while (sc.hasNext()) {
				String linea = sc.nextLine();
				String datos[] = linea.split(" ");
				Atraccion a = new Atraccion();
				a.setNombre(datos[0]);
				a.setDuracionEnHoras(Integer.parseInt(datos[1]));
				a.setPrecio(Integer.parseInt(datos[2]));
				a.setCupoDisponible(Integer.parseInt(datos[3]));
				a.setTipoDeAtraccion(TipoDeAtraccion.valueOf(datos[4]));
				if (!atracciones.contains(a))
					atracciones.add(a);

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//c.close();
		return atracciones;
	}
	
	public static ArrayList<Promocion> getPromociones(String archivo) {
		ArrayList<Promocion> promociones = new ArrayList<Promocion>();
		Scanner sc = null;
		try {
			sc = new Scanner(new File(archivo));

			while (sc.hasNext()) {
				String linea = sc.nextLine();
				String datos[] = linea.split(" ");
				PromocionAbsoluta p = new PromocionAbsoluta();
				p.setNombre(datos[0]);
				p.setTipoDePromocion(TipoDeAtraccion.valueOf(datos[1]));
				p.setAtraccion1((datos[2]));
				p.setAtraccion2((datos[3]));
				PromocionAbsoluta p = new PromocionAbsoluta();
				p.setNombre(datos[0]);
				p.setTipoDePromocion(TipoDeAtraccion.valueOf(datos[1]));
				p.setAtraccion1(Atraccion.get(1));
				p.setAtraccion2((datos[3]));
				PromocionAbsoluta p = new PromocionAbsoluta();
				p.setNombre(datos[0]);
				p.setTipoDePromocion(TipoDeAtraccion.valueOf(datos[1]));
				p.setAtraccion1((datos[2]));
				p.setAtraccion2((datos[3]));
				
				if (!promociones.contains(p))
					promociones.add(p);

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		sc.close();
		return promociones;
	}
}