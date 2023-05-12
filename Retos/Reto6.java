package Retos;

import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args) {
        int n;
        int totalcompra=0;
        Scanner capturar=new Scanner(System.in);
  System.out.println("cuantos productos vas a elegir");
        n=capturar.nextInt();
        int precio;
        
        for (int i = 0; i < n; i++){
        System.out.println("cuanto es el precio del producto"+ (i+1));
        precio=capturar.nextInt();
        totalcompra= totalcompra +precio;
        System.out.println("El total de su compra es"+ totalcompra);
        }
    }
}
