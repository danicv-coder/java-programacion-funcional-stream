package org.danicv.Stream;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.danicv.Stream.models.Usuario;

public class EjemploStreamDistinctSum {

	public static void main(String[] args) {
		IntStream largoNombres = Stream
				.of("Daniel Calderon", "Alexander Finol", "Juan Rangel", "Andres Finol", "Sofia Berubi",
						"Daniel torres", "Andres Finol", "José Rangel", "Daniel Calderon")
				.map(usuario -> new Usuario(usuario.split(" ")[0], usuario.split(" ")[1])).distinct()
				.mapToInt(e -> e.toString().length());

//		largoNombres.forEach(System.out::println);
		IntSummaryStatistics stats = largoNombres.summaryStatistics();
		System.out.println("Total: " + stats.getCount());
		System.out.println("Suma :" + stats.getSum());
		System.out.println("Promedio: " + stats.getAverage());
		System.out.println("minimo: " + stats.getMin());

	}

}
