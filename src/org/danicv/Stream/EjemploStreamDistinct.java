package org.danicv.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.danicv.Stream.models.Usuario;

public class EjemploStreamDistinct {

	public static void main(String[] args) {
		Stream<String> nombres = Stream
				.of("Daniel Calderon", "Alexander Finol", "Juan Rangel", "Andres Finol", "Sofia Berubi",
						"Daniel torres", "Andres Finol", "José Rangel")
				.distinct();

		String resultado = nombres.reduce("Resultado concatenacion", (a,b) -> a + ", " + b);
		System.out.println(resultado);
		

	}

}
