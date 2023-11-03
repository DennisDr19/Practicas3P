package ManejoDeString;

public class Texto {
    String text ="  Programación Orientada a Objetos"  ;
    int tam = text.length();
    String SinEspacio = text.trim();
    String mayusculas = SinEspacio.toUpperCase();
    String Concatenar = mayusculas.concat("12345");
    String Extraer = Concatenar.substring(0,12);
    String Remplazo= Extraer.replace('Ó','X');
    boolean Comparacion = Remplazo.equals("Programación");



    //Propuestos

    int cuantasMayusculas(String texto){
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (Character.isUpperCase(caracter)) {
                contador++;
            }
        }
        return contador;
    }
    public void letraRepetida(String cadena, String caracter){
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char ch = cadena.charAt(i);
            char ch2 = caracter.charAt(0);
            if (Character.toLowerCase(ch)==Character.toLowerCase(ch2)) {
                contador++;
            }
        }
        System.out.println(contador);
    }
    public void textoSinEspacio(String text){
        String newText=text.replaceAll(" ","");
        System.out.println(newText);
    }
    public void alRevez(String text){
        char[] celdascad = text.toCharArray();
        int tam = celdascad.length;
        for(int i=tam-1;i>=0;i--) {
            System.out.print(celdascad[i]);
        }
    }
}
