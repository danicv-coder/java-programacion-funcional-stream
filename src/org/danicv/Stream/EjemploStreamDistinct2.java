package org.danicv.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.danicv.Stream.models.Usuario;

public class EjemploStreamDistinct2 {

	public static void main(String[] args) {
		Stream<Usuario> nombres = Stream
				.of("Daniel Calderon", "Alexander Finol", "Juan Rangel", "Andres Finol", "Sofia Berubi",
						"Daniel torres", "Andres Finol", "José Rangel","Daniel Calderon")
				.map(usuario -> new Usuario(usuario.split(" ")[0], usuario.split(" ")[1]))
				.distinct();

		nombres.forEach(System.out::println);

	}

}
