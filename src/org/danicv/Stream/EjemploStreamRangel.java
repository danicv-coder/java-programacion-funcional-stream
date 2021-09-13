package org.danicv.Stream;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.danicv.Stream.models.Usuario;

public class EjemploStreamRangel {

	public static void main(String[] args) {
		IntStream numero = IntStream.range(5, 20).peek(System.out::println);

		IntSummaryStatistics stats = numero.summaryStatistics();
		System.out.println("max: " + stats.getMax());
		System.out.println("min: " + stats.getMin());
		System.out.println("suma: " + stats.getSum());
		System.out.println("promedio: " + stats.getAverage());
		System.out.println("total: " + stats.getCount());
	}

}
