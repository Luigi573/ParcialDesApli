package primerparcial;

import java.util.Scanner;

public class PrimerParcialMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "";
        int table; 
        
        do{
        System.out.println("\nTablas de multiplicar");
        System.out.println("Seleccione una opción.");
        System.out.println("1. Mostrar tabla en específico");
        System.out.println("2. Mostrar tablas del 2 al 5");
        System.out.println("3. Salir");
        System.out.print("Opción: ");
        
        choice = scanner.nextLine();
        
        switch(choice){
            case "1":
                System.out.println("///////////////////////////////////////////////////");
                System.out.print("Ingrese el numero de la tabla a mostrar: ");
                table = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Tabla del " + table);
                
                for(int i = 1; i <= 10; i++){
                    System.out.println(table + " X " + i + " = " + (table * i));
                }
                break;
            case "2":
                
                break;
            case "3":
                
                break;
            default:
                System.out.println("Opción no válida, inténtelo de nuevo...");
        }
        }while(!choice.equals("3"));
    }
}
