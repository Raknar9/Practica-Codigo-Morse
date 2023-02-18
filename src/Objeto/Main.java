package Objeto;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int casos= sc.nextInt();sc.nextLine(); // se ingresa el numero de casos deseados
        String[] arrayCasos=new String[casos];//se crea el array donde se guardara cada cadena
        for (int i = 0; i < casos; i++) // se rellena el array por teclado
        {arrayCasos[i] = sc.nextLine();}
        Clave objeto=new Clave(casos,arrayCasos); //se crea el objeto tipo clava para poder usar el metodo  de calcular casos
        for (int i = 0; i <casos ; i++) {//se recorre el la veces igual al numero de casos y por cada vuelta llama al metodo
            // calcula el total de puntos y los muestra por pantalla
            int t=objeto.calcularCasos(arrayCasos[i],arrayCasos);
            System.out.printf(""+t+"\n");
        }
    }
}
