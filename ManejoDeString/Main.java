package ManejoDeString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Texto texto = new Texto();
        System.out.print("El texto es : ");
        System.out.println(texto.text);
        System.out.println("El tamaño del texto es: "+texto.tam);
        System.out.println("El texto sin espacio es: "+texto.SinEspacio);
        System.out.println("El texto anterior en mayúscula es: "+texto.mayusculas);
        System.out.println("El texto anterior cancatenado a '12345' es: "+texto.Concatenar);
        System.out.println("El texto anterior extrayendo terminos del 10 al 15 es: "+texto.Extraer);
        System.out.println("El texto anterior remplazando la 'O' por 'X' es: "+texto.Remplazo);
        System.out.println("El texto anterior es igual al texto 'Programación': "+texto.Comparacion);


        System.out.println("----------Propuesto----------");
        String cad = "Hola A Todo El Mundo";
        System.out.println("\nEl texto es 'Hola A Todo El Mundo'");

        System.out.println("Numero de mayusculas en el texto: "+texto.cuantasMayusculas(cad));

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el caracter que quieres buscar: ");
        String caracter = sc.nextLine();
        System.out.print("El caracter "+caracter+" se repite: ");
        texto.letraRepetida(cad,caracter);
        System.out.print("EL texto sin espacios es: ");
        texto.textoSinEspacio(cad);
        System.out.print("EL texto al reves es: ");
        texto.alRevez(cad);
    }
}
