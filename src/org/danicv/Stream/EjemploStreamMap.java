package org.danicv.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.danicv.Stream.models.Usuario;


public class EjemploStreamMap {

	public static void main(String[] args) {
		Stream<Usuario> nombres = Stream.of("Daniel Calderon", "Alexander Finol", "Juan Rangel",  "Andres Finol", "Sofia Berubi")
		.map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
		.peek(e -> System.out.println(e.getNombre() + " " + e.getApellido()))
		.map(usuario -> {
			String nombre = usuario.getNombre();
			String apellido = usuario.getApellido();
			usuario.setNombre(nombre);
			return usuario;
		});
		// nombres.forEach(System.out::println);

		List<Usuario> lista = nombres.collect(Collectors.toList());
		for (Usuario usuario2 : lista) {
			System.out.println(usuario2.getNombre());
		}

	}

}
