package gauss;

import java.io.IOException;
import java.util.Scanner;

public class Gauss {

    static Scanner scaner = new Scanner(System.in);
    
    static int[][] matriz = new int[4][3];
    
    public static void main(String[] args){
        
        //show logo
        System.out.println("||---------------/**/-|Gauss by B0vE|-/**/---------------||\n\n");
        System.out.print("Introduce la matriz:");
        
        //input numbers
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 4; y++) {
                System.out.print("Siguiente: ");
                matriz[y][x] = scaner.nextInt();
                dibujarMatriz();
            }
        }
        
        //despejar la x en la tercera ecuacuón
        int valor1 = matriz[0][0];
        int valor2 = matriz[0][2];
        int signo = -1;
        matriz[0][2] = (valor2*matriz[0][0]) + (valor1*matriz[0][2]*signo);
        matriz[1][2] = (valor2*matriz[1][0]) + (valor1*matriz[1][2]*signo);
        matriz[2][2] = (valor2*matriz[2][0]) + (valor1*matriz[2][2]*signo);
        dibujarMatriz();
        
        //despejar la x en la segunda ecuacuón
        valor1 = matriz[0][0];
        valor2 = matriz[0][1];
        signo = -1;
        matriz[0][1] = (valor2*matriz[0][0]) + (valor1*matriz[0][1]*signo);
        matriz[1][1] = (valor2*matriz[1][0]) + (valor1*matriz[1][1]*signo);
        matriz[2][1] = (valor2*matriz[2][0]) + (valor1*matriz[2][1]*signo);
        dibujarMatriz();
        
        //despejar la y en la tercera ecuacuón
        valor1 = matriz[1][1];
        valor2 = matriz[1][2];
        signo = -1;
        matriz[0][2] = (valor2*matriz[0][1]) + (valor1*matriz[0][2]*signo);
        matriz[1][2] = (valor2*matriz[1][1]) + (valor1*matriz[1][2]*signo);
        matriz[2][2] = (valor2*matriz[2][1]) + (valor1*matriz[2][2]*signo);
        dibujarMatriz();
        
        //despejar las variables
        
        int X,Y,Z;
        
        //calculo Z
        Z = matriz[3][2]/matriz[2][2];
        
        //calculo Y
        Y = (matriz[3][1]-(matriz[2][1]*Z))/matriz[1][1];
        
        //calculo X
        X = (matriz[3][0]-(matriz[1][0]*Y)-(matriz[2][0]*Z))/matriz[0][0];
        
        System.out.println();
        System.out.println("X = "+Integer.toString(X)+"  Y = "+Integer.toString(Y)+"  Z = "+Integer.toString(Z));
        
        
    }
    
    private static void dibujarMatriz(){
        System.out.println();
        System.out.println(Integer.toString(matriz[0][0])+"  "+Integer.toString(matriz[1][0])+"  "+Integer.toString(matriz[2][0])+" | "+Integer.toString(matriz[3][0])+"\n"+
                Integer.toString(matriz[0][1])+"  "+Integer.toString(matriz[1][1])+"  "+Integer.toString(matriz[2][1])+" | "+Integer.toString(matriz[3][1])+"\n"+
                Integer.toString(matriz[0][2])+"  "+Integer.toString(matriz[1][2])+"  "+Integer.toString(matriz[2][2])+" | "+Integer.toString(matriz[3][2]));
    }
    
    
    
}
