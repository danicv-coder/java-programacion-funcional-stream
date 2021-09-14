package org.danicv.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.danicv.Stream.models.Factura;
import org.danicv.Stream.models.Usuario;

public class EjemploFlaMapFactura {

	public static void main(String[] args) {
		Usuario u1 = new Usuario("Daniel", "Calderon");
		u1.addFacturas(new Factura("Compras libros de matematica"));

		Usuario u2 = new Usuario("Alexander", "Finol");
		u2.addFacturas(new Factura("Compras videojuegos"));

		Usuario u3 = new Usuario("Andres", "Finol");
		u3.addFacturas(new Factura("Compras smartv"));

		List<Usuario> listaUsuarios = Arrays.asList(u1, u2, u3);
		listaUsuarios.stream().flatMap(e -> e.getFacturas().stream())
				.forEach(f -> System.out.println(f.getDescripcion().concat(" ").concat(f.getUsuario().toString())));

//		for (Usuario u : listaUsuarios) {
//			for (Factura f : u.getFacturas()) {
//				System.out.println(f.getDescripcion());
//			}
//		}
	}

}
