/*

Ciclo white

while (Condicion) {

      Instrucciones

}

 */


 import java.util.Scanner;

 public class App {
     public static void main(String[] args) throws Exception {
 
         Scanner entrada = new Scanner(System.in);
 
         int i=1, contador; // Se puede colocar el aumento como uno quiera pero en este momento va a contar en 1 en 1
 
         System.out.println("Digite la cantidad de numeros que quiere en pantalla:");
         contador = entrada.nextInt(); // Entrada de datos de usuarios
 
         while (i<=contador) { //Aqui se usa la variable del usuario para saber cuantos numeros se van a escribir
 
             System.out.println(i);
             i++; // Se va a ir sumando hasta que la cantidad que ingreso el usuario
         }
     }
 }
 