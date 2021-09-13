package org.danicv.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.danicv.Stream.models.Usuario;

public class EjemploStreamFilter {

	public static void main(String[] args) {
		Usuario usuarios = Stream
				.of("Daniel Calderon", "Alexander Finol", "Juan Rangel", "Andres Finol", "Sofia Berubi",
						"Daniel torres", "Andres Finol", "José Rangel")
				.map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
				.filter(e -> e.getId().equals(4))
				.findFirst().get();
		System.out.println(usuarios);
				
		
		

	}

}
