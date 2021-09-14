package org.danicv.Stream;

import java.util.ArrayList;
import java.util.List;

import org.danicv.Stream.models.Usuario;

public class EjemploStreamListToStream {

	public static void main(String[] args) {
		List<Usuario> lista = new ArrayList<>();
		lista.add(new Usuario("Daniel", "Calderon"));
		lista.add(new Usuario("Alexander", "Finol"));
		lista.add(new Usuario("Juan", "Rangel"));
		lista.add(new Usuario("Andres", "Finol"));
		lista.add(new Usuario("Jose", "Rangel"));

		lista.stream().map(e -> e.toString().toUpperCase())
				.forEach(System.out::println);

	}

}
