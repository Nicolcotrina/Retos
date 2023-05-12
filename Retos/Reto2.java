package Retos;

import java.util.Scanner;

public class Reto2 {
    public static void main(String[] rgs) {
        String nompadre, nomenfermera, nombebe;
        double dosis=0;
        try (Scanner capturar= new Scanner(System.in)) {
            
         System.out.println("Bienvenidos a nuestro programa que va a dar la dosis de vacunas que es necesaria para el bebé:");
            System.out.println("Por favor ingrese el nombre del Padre o Madre:");
            nompadre = capturar.nextLine();
            System.out.println("Por favor ingrese el nombre de la enfermera:");
            nomenfermera = capturar.nextLine();
            System.out.println("Por favor ingrese el nombre del bebe:");
            nombebe = capturar.nextLine();
            System.out.println("Ingrese por favor el peso del bebe en kilogramos:");
            double peso = capturar.nextDouble();
            System.out.println("Ingrese por favor los meses de nacido del bebe: ");
            double meses = capturar.nextDouble();
            dosis= ((peso+10)/(meses*10)*8);
            System.out.println("La dosis que se le debe aplicar al bebe es: " + dosis);
            System.out.println("el nombre de la mamá o papá es:"+ nompadre);
            System.out.println("el nombre de la enfermera es:"+ nomenfermera);
            System.out.println("el nombre del bebé es:"+ nombebe);
        }
    }
}

