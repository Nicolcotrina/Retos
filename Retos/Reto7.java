package Retos;
import java.util.Random;
import java.util.Scanner;
public class Reto7 {
    public static void main(String[] args) {
 int res;
        Scanner scanner = new Scanner(System.in);
            Random random = new Random();

System.out.println("Quieres jugar 1.si o 2.no");
res=scanner.nextInt();
    if(res==1){

        do{
            System.out.print("Elige cara (0) o sello (1): ");
                    int resultado = random.nextInt(2);
                    int eleccionmaqui = scanner.nextInt();

                    if (eleccionmaqui == resultado) {
                        System.out.println("Ganaste");
                    } else {
                        System.out.println("Perdiste");
                    }

            System.out.println("¿Quieres jugar otra vez?");
            res=scanner.nextInt();
        }while(res==1);

        
    }
}
    }



