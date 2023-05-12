package Retos;
import java.util.Random;
import java.util.Scanner;

public class Reto8 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int resultado=0;
            int eleccionmaqui;
            String res="si";
            
            
             eleccionmaqui = random.nextInt(3);

            do{
                System.out.println("Bienvenidos a nuestro programa donde vas a poder jugar con la maquina el juego de piedra papel o tijera:");
            System.out.print("Elige piedra (0), papel(1), tijera (2) : ");
             resultado = scanner.nextInt();
            if (eleccionmaqui == 0 && resultado==0) {
                System.out.println("empate la maquina eligio piedra");     }
            else if  (eleccionmaqui ==1 && resultado== 1 ) {
                System.out.println("empate la maquina eligio papel");
            }else if  (eleccionmaqui ==2 && resultado== 2 ) {
                    System.out.println("empate la maquina escogio tijera");
            }else if  (eleccionmaqui ==1 && resultado== 0 ) {
                    System.out.println("perdiste la maquina eligio papel");
            }else if (eleccionmaqui ==0 && resultado==1){
            System.out.println("ganaste la maquina eligio piedar");}
            else if (eleccionmaqui ==2 && resultado==0){
            System.out.println("ganaste la maquina eligio tijera");}
            else if (eleccionmaqui ==0 && resultado==2){
            System.out.println("perdiste la maquina eligio piedra");}
            System.out.println("¿Quieres jugar otra vez?");
           res=scanner.next();
        }while(res.equalsIgnoreCase("si"));
    }
}