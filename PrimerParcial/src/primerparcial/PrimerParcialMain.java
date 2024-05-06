package primerparcial;

import java.util.Scanner;

public class PrimerParcialMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "", username;
        int table; 
        
        System.out.print("Ingrese su nombre de usuario: ");
        username = scanner.nextLine();
        
        do{
        System.out.println("\nTablas de multiplicar");
        System.out.println("Seleccione una opcion.");
        System.out.println("1. Mostrar tabla en especifico");
        System.out.println("2. Mostrar tablas del 2 al 5");
        System.out.println("3. Salir");
        System.out.print("Opción: ");
        
        choice = scanner.nextLine();
        System.out.println("///////////////////////////////////////////////////");
        
        switch(choice){
            case "1":
                //System.out.println("Saludos, ["+ username + "]");
                System.out.print("Ingrese el numero de la tabla a mostrar: ");
                table = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Tabla del " + table);
                
                for(int i = 1; i <= 10; i++){
                    System.out.println(table + " X " + i + " = " + (table * i));
                }
                break;
            case "2":
                //System.out.println("Saludos, ["+ username + "]");
                System.out.println("A continuacion mostrare las tablas de multiplicar del 2 al 5");
                
                for(int i = 2; i <= 5; i++){
                    System.out.println("Tabla del " + i);
                    for(int j = 1; j <= 10; j++){
                        System.out.println(i + " X " + j + " = " + (i * j));
                    }
                }
                break;
            case "3":
                System.out.println("Gracias por usar el generador de tablas de multiplicar...");
                System.out.println("Que tenga un buen dia! " );
                break;
            default:
                System.out.println("Opción no válida, inténtelo de nuevo...");
        }
        }while(!choice.equals("3"));
    }
}
