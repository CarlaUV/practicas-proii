package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class UsandoLambdas {
    public static void imprimir(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("uno");      
        lista.add("dos");
        lista.add("tres");
        lista.add("cuatro");

        lista.forEach(elem -> System.out.println(elem));
        lista.forEach(System.out::println);

        List<String> losDeTamañoMayorA3 = new ArrayList<>();
        AtomicInteger longitudTotal = new AtomicInteger(0);
        int[] longitudTotalArray = {0};

        lista.forEach(elem -> {longitudTotal.set(longitudTotal.get() + elem.length()); longitudTotalArray[0] += elem.length(); if(elem.length() > 3) {losDeTamañoMayorA3.add(elem);}});

        System.out.println("Contenido de los elementos de mayor tamaño a 3:");
        losDeTamañoMayorA3.forEach(elem -> System.out.println(elem));
        System.out.println(longitudTotal.get());
        System.out.println(longitudTotalArray[0]);

        Consumer <String> imprimirTamanho = elem -> System.out.println(elem.length());
        lista.forEach(imprimirTamanho);

        lista.forEach(UsandoLambdas::imprimir);
        lista.forEach(cadena -> imprimir(cadena));

        
    }
}
