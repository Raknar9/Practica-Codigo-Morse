package Cine;

import java.util.Scanner;

public class Cines_con_Metodos {
    public static void main(String[] args) {
        int array[][];
        char arraychar[][];
        int f,a;
        array=crearOcupacionINT();//metodo que crea un una matriz con numeros aleratorios entre 1 y 2
        arraychar=crearOcupacionCHAR(array);//un metodo que pasa de ocupado o libre de acuerdo a valores 1 o 2
        mostrarSala(arraychar);//muestra la matriz
        f=pedirFila();//pide la fila
        a=pedirAsiento();//pide  la columna o en este caso el asiento
        if(comprobarAsiento(f,a,arraychar))//comprueba si el asiento elegido esta libre o no
        {
            asignarAsiento(f,a,arraychar);//si da true , asigna el asiento
        }
        else {
            System.out.printf("Ese asiento esta ocupado, no es posible elegirlo.\n ");//si no, da mensaje de error y finaliza el programa
        }
        mostrarSala(arraychar);//vuelve a enseñar la matriz para visualizar si se realizo o no cambios .
    }

    public static char[][] crearOcupacionCHAR(int array[][])
    {
        char arraychar[][]=new char[4][4];
        for (int i = 0; i <4 ; i++) {//un for para asignar ocupado o libre de acuerdo al valor de cada posicion
            for (int j = 0; j <4 ; j++) {
                if (array[i][j]==1) {arraychar[i][j]='X';}
                else {arraychar[i][j]='L';}
            }
        }

        return arraychar;
    }
    public static int[][] crearOcupacionINT()
    {
        int array[][]=new int[4][4];
        for (int i = 0; i <4 ; i++) {//un for para rellenarlos con numeros entre 1 y 2
            for (int j = 0; j <4 ; j++) {array[i][j]= (int)(Math. random()*2+1);}
        }

        return array;
    }
    public static void asignarAsiento(int fila,int asiento,char array[][])
    {
       array[fila][asiento]='X';
    }
    public static boolean comprobarAsiento(int fila,int asiento,char array[][])
    {
        boolean posible=false;
        if(array[fila][asiento]=='L')
        {
            posible=true;
        }
        return posible;
    }
    public static void mostrarSala(char arraychar[][] )
    {
        System.out.printf("Asientos disponibles para este dia. \n");
        System.out.printf("===========================================\n");
        System.out.printf("Libre: L   Ocupado:  X  \n");
        for (int i = 0; i <4 ; i++) {
            System.out.printf("Fila "+i+" :");
            for (int j = 0; j < 4; j++) {
                System.out.printf("  "+arraychar[i][j]);

            }
            System.out.printf("\n");
        }
    }
    public static int pedirAsiento()
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Elige Asiento: ");
        int n=sc.nextInt();
        return n;
    }
    public static int pedirFila()
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Elige Fila: ");
        int n=sc.nextInt();
        return n;
    }
}
