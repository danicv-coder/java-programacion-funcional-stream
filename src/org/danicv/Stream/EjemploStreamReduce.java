package org.danicv.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.danicv.Stream.models.Usuario;

public class EjemploStreamReduce {

	public static void main(String[] args) {
		Stream<Integer> numeros = Stream.of(5, 10, 20, 30);

		int resultado = numeros.reduce(0, (a,b) -> a+b);
		System.out.println(resultado);
	}

}
