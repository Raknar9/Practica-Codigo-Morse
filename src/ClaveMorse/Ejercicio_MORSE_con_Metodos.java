package ClaveMorse;

import java.util.Scanner;

public class Ejercicio_MORSE_con_Metodos {
    public static void main(String[] args) {
        int casos = 0;
        casos = pedirCasos();//pide los casos
        String array[] = new String[casos];//se crea el array con los casos ingresados
        rellenarArray(casos, array);// un metodo para rellenar el array con los Strings correspondientes
        for (int i = 0; i <array.length; i++) {
            int total;
            total=calcularCasos(array[i],array);
            System.out.printf(total+"\n");
        }
    }

    public static int pedirCasos() {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        return casos;
    }
    public static void rellenarArray(int casos, String array[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < casos; i++) {
            array[i] = sc.nextLine();
        }
    }
    public static int calcularCasos(String cadena, String array[]) {
        int total = 0;
            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.length() < 1) {
                    if (cadena.charAt(i) == 'A') {total = total + 5;}
                    else if (cadena.charAt(i) == 'S') {total = total + 5;}
                    else if (cadena.charAt(i) == 'I') {total = total + 3;}
                    else if (cadena.charAt(i) == '?') {total = total + 15;}
                    else if (cadena.charAt(i) == '!') {total = total + 19;}
                    else if (cadena.charAt(i) == 'B') {total = total + 9;}
                    else if (cadena.charAt(i) == 'C') {total = total + 11;}
                    else if (cadena.charAt(i) == 'D') {total = total + 7;}
                    else if (cadena.charAt(i) == 'E') {total = total + 1;}
                    else if (cadena.charAt(i) == 'F') {total = total + 9;}
                    else if (cadena.charAt(i) == 'G') {total = total + 9;}
                    else if (cadena.charAt(i) == 'H') {total = total + 7;}
                    else if (cadena.charAt(i) == 'J') {total = total + 13;}
                    else if (cadena.charAt(i) == 'K') {total = total + 9;}
                    else if (cadena.charAt(i) == 'L') {total = total + 9;}
                    else if (cadena.charAt(i) == 'M') {total = total + 7;}
                    else if (cadena.charAt(i) == 'N') {total = total + 5;}
                    else if (cadena.charAt(i) == 'O') {total = total + 11;}
                    else if (cadena.charAt(i) == 'P') {total = total + 11;}
                    else if (cadena.charAt(i) == 'Q') {total = total + 13;}
                    else if (cadena.charAt(i) == 'R') {total = total + 7;}
                    else if (cadena.charAt(i) == 'T') {total = total + 3;}
                    else if (cadena.charAt(i) == 'U') {total = total + 7;}
                    else if (cadena.charAt(i) == 'V') {total = total + 9;}
                    else if (cadena.charAt(i) == 'W') {total = total + 9;}
                    else if (cadena.charAt(i) == 'X') {total = total + 11;}
                    else if (cadena.charAt(i) == 'Y') {total = total + 13;}
                    else if (cadena.charAt(i) == 'Z') {total = total + 11;}
                } else
                {
                    total = total + 3;//se suma 3 puntos cada vez que pasa de un caracter a otro
                    if (i == cadena.length() - 1) {total = total - 3;}//si estamos en el ultimo caracter del string, no sumamos 3
                    if (cadena.charAt(i) == 'A') {total = total + 5;}
                    else if (cadena.charAt(i) == 'S') {total = total + 5;}
                    else if (cadena.charAt(i) == 'I') {total = total + 3;}
                    else if (cadena.charAt(i) == '?') {total = total + 15;}
                    else if (cadena.charAt(i) == '!') {total = total + 19;}
                    else if (cadena.charAt(i) == 'B') {total = total + 9;}
                    else if (cadena.charAt(i) == 'C') {total = total + 11;}
                    else if (cadena.charAt(i) == 'D') {total = total + 7;}
                    else if (cadena.charAt(i) == 'E') {total = total + 1;}
                    else if (cadena.charAt(i) == 'F') {total = total + 9;}
                    else if (cadena.charAt(i) == 'G') {total = total + 9;}
                    else if (cadena.charAt(i) == 'H') {total = total + 7;}
                    else if (cadena.charAt(i)== 'J') {total = total + 13;}
                    else if (cadena.charAt(i) == 'K') {total = total + 9;}
                    else if (cadena.charAt(i) == 'L') {total = total + 9;}
                    else if (cadena.charAt(i)== 'M') {total = total + 7;}
                    else if (cadena.charAt(i) == 'N') {total = total + 5;}
                    else if (cadena.charAt(i) == 'O') {total = total + 11;}
                    else if (cadena.charAt(i) == 'P') {total = total + 11;}
                    else if (cadena.charAt(i) == 'Q') {total = total + 13;}
                    else if (cadena.charAt(i) == 'R') {total = total + 7;}
                    else if (cadena.charAt(i) == 'T') {total = total + 3;}
                    else if (cadena.charAt(i) == 'U') {total = total + 7;}
                    else if (cadena.charAt(i) == 'V') {total = total + 9;}
                    else if (cadena.charAt(i) == 'W') {total = total + 9;}
                    else if (cadena.charAt(i) == 'X') {total = total + 11;}
                    else if (cadena.charAt(i) == 'Y') {total = total + 13;}
                    else if (cadena.charAt(i) == 'Z') {total = total + 11;}
                    else if (cadena.charAt(i) == ' ') {
                        total = total + 5;//si hay un espacio se suma 5 puntos
                        total = total - 6; //ya que sumamos los 5 , aqui restamos 6 puntos por el cambio de caracter
                    }
                }
        }
        return total;
    }
}