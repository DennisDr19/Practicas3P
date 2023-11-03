package ArrayDeObjetos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda("Tienda Cuántica","Pepito Pérez",123456, 5);
        Computadoras computador1 = new Computadoras("Asus", 38, "Intel iCore 7", "Windows", 18500000);
        Computadoras computador2 = new Computadoras("Dragon", 48, "Intel iCore 1", "Windows", 15500000);
        Computadoras computador3 = new Computadoras("Mcbarato", 64, "Intel iCore 4", "Mac", 2500000);
        tienda.añadir(computador1);
        tienda.añadir(computador2);
        tienda.añadir(computador3);
        Scanner sc = new Scanner(System.in);
        System.out.println("Que marca de computadora busca?");
        String marca = sc.next();
        System.out.println("El computador de la marca: " + marca +  " se encuentra en la posición " + tienda.buscar(marca));
        tienda.imprimir();
    }
}
