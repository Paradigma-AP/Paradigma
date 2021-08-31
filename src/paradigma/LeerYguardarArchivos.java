package paradigma;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class LeerYguardarArchivos {
	
	public static LinkedList<Usuario> getUsuarios(String usuarios) {
		LinkedList<Usuario> usuario = new LinkedList<Usuario>();
		Scanner sc = null;
		try {
			sc = new Scanner(new File(usuarios));

			while (sc.hasNext()) {
				String linea = sc.nextLine();
				String datos[] = linea.split(" ");
				String nombre = datos[0];
				int tiempoDisponibleEnHoras = Integer.parseInt(datos[1]);
				int presupuesto = Integer.parseInt(datos[2]);
				TipoDeAtraccion atraccionPreferida = TipoDeAtraccion.valueOf(datos[3]);
				Usuario u = new Usuario(nombre, tiempoDisponibleEnHoras, presupuesto, atraccionPreferida);

				if (!usuario.contains(u))
					usuario.add(u);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		sc.close();
		return usuario;
	}
	
	
/*
	public static void ordenarPersonasPorDNI(List<Persona> lista) {
		Collections.sort(lista, new DniComparator());
	}

	public static void ordenarPersonasPorApellido(List<Persona> lista) {
		Collections.sort(lista, new ApellidoComparator());
	}

	public static void ordenarPersonasPorEdad(List<Persona> lista) {
		Collections.sort(lista, new EdadComparator());
	}

	public static List<Persona> getPersonasMayoresDeEdad(List<Persona> personas, Integer edad) {
		// LinkedList<Persona> personasMayores = new LinkedList<Persona>();
		List<Persona> personasMayores = new ArrayList<Persona>();

		for (Persona cu : personas)
			if (cu.getEdad() > edad)
				personasMayores.add(cu);

		return personasMayores;

	}

	public static void escribirPersonas(List<Usuario> usuarios, String file) throws IOException {
		
		PrintWriter salida = new PrintWriter(new FileWriter(file));
		
		for (Usuario usuario : usuarios) {
			salida.println(usuario);
		}
		salida.close();
	}
	
	
	public static void escribirMayoresDeEdadOrdenadasPorDNI(List<Persona> personas, int edad) 
			throws IOException{
		
		List<Persona> personasMayores = getPersonasMayoresDeEdad(personas, edad);
		ordenarPersonasPorDNI(personasMayores);
		escribirPersonas(personasMayores, "MayoresDe"+edad+"OrdenadosPorDNI"+".csv");
		

	}
	
	public static void escribirMayoresDeEdadOrdenadasPorEdad(List<Persona> personas, int edad) 
			throws IOException{
		
		List<Persona> personasMayores = getPersonasMayoresDeEdad(personas, edad);
		ordenarPersonasPorEdad(personasMayores);
		escribirPersonas(personasMayores, "MayoresDe"+edad+"OrdenadosPorEdad"+".csv");		

	}*/


}
