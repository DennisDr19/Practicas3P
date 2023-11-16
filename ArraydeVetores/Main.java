package ArraydeVetores;

    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

            Tienda2 tienda = new Tienda2("nueva tienda","george",62841);
            Computadoras computador1 = new Computadoras("Hola","Intel af","Mac",50,18500000);
            Computadoras computador2 = new Computadoras("chinchong","Intel adf 2","Mac", 80,15500000);
            Computadoras computador3 = new Computadoras("chuchu", "Intel afa 4","Mac",100,2500000);
            tienda.anadir(computador1);
            tienda.anadir(computador2);
            tienda.anadir(computador3);
            System.out.println("Ingrese la marca del computador que desea buscar");
            Scanner sc = new Scanner(System.in);
            String marca= sc.next();
            System.out.println("El computador: "+ marca+" se encuentra en la posicion: "+ Tienda2.buscar(marca));
            tienda.imprimir();
        }
}
