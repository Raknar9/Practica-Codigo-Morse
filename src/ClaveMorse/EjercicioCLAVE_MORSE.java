package ClaveMorse;

import java.util.Scanner;

public class EjercicioCLAVE_MORSE {
    public static void main(String[] args) {
        int total=0;
        Scanner sc=new Scanner(System.in);
        //System.out.printf("Cuantos casos de prueba habra? ");
        int n=sc.nextInt();//se ingresa los casos de prueba que quieres
        sc.nextLine();
        String casos[]=new String[n];//se crea el array con el tamaño de casos de pruebas
        for (int i=0;i<n;i++)// se rellena el array n veces
        {casos[i]=sc.nextLine();}
        for (int i = 0; i <n ; i++) {//for para recorrer cada casilla donde esta un string
            total=0;//al terminar cada vuelta del primer for se iguala a 0 el total para empezar a contar
            for (int j = 0; j <casos[i].length() ; j++) {//for para recorrer el string
            if(casos[i].length()<1)//este if es solo para los casos donde el string este compuesto solo por un caracter
            {
                if (casos[i].charAt(j)=='A') {total=total+5;}
                else if(casos[i].charAt(j)=='S') {total=total+5;}
                else if(casos[i].charAt(j)=='I') {total=total+3;}
                else if(casos[i].charAt(j)=='?') {total=total+15;}
                else if(casos[i].charAt(j)=='!') {total=total+19;}
                else if(casos[i].charAt(j)=='B') {total=total+9;}
                else if(casos[i].charAt(j)=='C') {total=total+11;}
                else if(casos[i].charAt(j)=='D') {total=total+7;}
                else if(casos[i].charAt(j)=='E') {total=total+1;}
                else if(casos[i].charAt(j)=='F') {total=total+9;}
                else if(casos[i].charAt(j)=='G') {total=total+9;}
                else if(casos[i].charAt(j)=='H') {total=total+7;}
                else if(casos[i].charAt(j)=='J') {total=total+13;}
                else if(casos[i].charAt(j)=='K') {total=total+9;}
                else if(casos[i].charAt(j)=='L') {total=total+9;}
                else if(casos[i].charAt(j)=='M') {total=total+7;}
                else if(casos[i].charAt(j)=='N') {total=total+5;}
                else if(casos[i].charAt(j)=='O') {total=total+11;}
                else if(casos[i].charAt(j)=='P') {total=total+11;}
                else if(casos[i].charAt(j)=='Q') {total=total+13;}
                else if(casos[i].charAt(j)=='R') {total=total+7;}
                else if(casos[i].charAt(j)=='T') {total=total+3;}
                else if(casos[i].charAt(j)=='U') {total=total+7;}
                else if(casos[i].charAt(j)=='V') {total=total+9;}
                else if(casos[i].charAt(j)=='W') {total=total+9;}
                else if(casos[i].charAt(j)=='X') {total=total+11;}
                else if(casos[i].charAt(j)=='Y') {total=total+13;}
                else if(casos[i].charAt(j)=='Z') {total=total+11;}
            }
            else {//este else es para cuando el caso cuenta con mas de un caracter
                total=total+3;//se suma 3 por cada cambio de caracter
                if(j==casos[i].length()-1)
                {total=total-3;}//si se esta en el ultimo caracter no se suma 3
                if (casos[i].charAt(j)=='A') {total=total+5;}
                else if(casos[i].charAt(j)=='S')
                {total=total+5;}
                else if(casos[i].charAt(j)=='I')
                {total=total+3;}
                else if(casos[i].charAt(j)=='?')
                {total=total+15;}
                else if(casos[i].charAt(j)=='!')
                {total=total+19;}
                else if(casos[i].charAt(j)=='B')
                {total=total+9;}
                else if(casos[i].charAt(j)=='C')
                {total=total+11;}
                else if(casos[i].charAt(j)=='D')
                {total=total+7;}
                else if(casos[i].charAt(j)=='E')
                {total=total+1;}
                else if(casos[i].charAt(j)=='F')
                {total=total+9;}
                else if(casos[i].charAt(j)=='G')
                {total=total+9;}
                else if(casos[i].charAt(j)=='H')
                {total=total+7;}
                else if(casos[i].charAt(j)=='J')
                {total=total+13;}
                else if(casos[i].charAt(j)=='K')
                {total=total+9;}
                else if(casos[i].charAt(j)=='L')
                {total=total+9;}
                else if(casos[i].charAt(j)=='M')
                {total=total+7;}
                else if(casos[i].charAt(j)=='N')
                {total=total+5;}
                else if(casos[i].charAt(j)=='O')
                {total=total+11;}
                else if(casos[i].charAt(j)=='P')
                {total=total+11;}
                else if(casos[i].charAt(j)=='Q')
                {total=total+13;}
                else if(casos[i].charAt(j)=='R')
                {total=total+7;}
                else if(casos[i].charAt(j)=='T')
                {total=total+3;}
                else if(casos[i].charAt(j)=='U')
                {total=total+7;}
                else if(casos[i].charAt(j)=='V')
                {total=total+9;}
                else if(casos[i].charAt(j)=='W')
                {total=total+9;}
                else if(casos[i].charAt(j)=='X')
                {total=total+11;}
                else if(casos[i].charAt(j)=='Y')
                {total=total+13;}
                else if(casos[i].charAt(j)=='Z')
                {total=total+11;}
                else if(casos[i].charAt(j)==' ')
                {
                    total=total+5;//cuando hay un espacio se suma 5
                    total=total-6;// entonces se resta los 6 que sumaria al cambiar de caracter
                }
            }
            }
            System.out.printf(total+"\n");//sacamos por pantalla la suma total
        }
    }
}
