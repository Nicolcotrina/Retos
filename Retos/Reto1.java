package Retos;

public class Reto1 {
    public static void main(String[] args) {
        // Declarar variables//
        double temp = 350, centi = 0;
        /*mesaje de bienvenida */
        System.out.println("Bienvenidos al programa donde nos va a ayuda a convertir los 350° de temperatura de centigrados a fahrenheit");
        // calcular Temperatura en c°//
        centi = (temp - 32) / 1.8;
        // Mostrar resultados//
        System.out.println("la temperatura para precalentar el horno es: " + centi);
    }
}
