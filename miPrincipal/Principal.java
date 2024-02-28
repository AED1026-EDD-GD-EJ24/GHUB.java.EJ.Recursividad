package miPrincipal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) throws Exception {
        Scanner consola = new Scanner(System.in);
        int opc =0;
        do{
            System.out.println("*************************");
            System.out.println("RECURSIVIDAD");
            System.out.println("*************************");
            System.out.println("1) LADRILLOS");
            System.out.println("2) FACTORIAL");
            System.out.println("3) NUMEROS NATURALES");
            System.out.println("4) SUMA DE DIGITOS");
            System.out.println("5) RECURSIVIDAD INDIRECTA");
            System.out.println("6) MAXIMO COMUN DIVISOR");
            System.out.println("7) BUSQUEDA BINARIA");
            System.out.println("8) ORDENAMIENTO POR SELECCION");
            System.out.println("9) TORRES DE HANOI");
            System.out.println("10) SERIE DE FIBONACCI");
            System.out.println("11) PERFOMANCE DERIES DE FIBONACCI");
            System.out.println("12) ORDENAMIENTO POR MEZCLA");
            System.out.println("            ");
            System.out.println("0) SALIR");
            System.out.print("Selecciona opción:");
            opc=consola.nextInt();

            switch (opc){
            case 1:
               AppLadrillos.menu();
               break;
            case 2:
            AppFactorial.menu();
               break;
              
            case 3:
               AppNumerosNaturales.menu();
               break;
               
            case 4:
               
            case 5:
               
            case 6:
            AppMaximoDivisor.menu();
             
            case 7:
               
            case 8:
               
            case 9:
               
            case 10:
               
            case 0:
               System.out.println("ADIOS!");
               consola.close();
               break;
               

            default:
               System.out.println("Valor incorrecto, intente de nuevo!");

        }
       
    }while (opc != 0);
		
    }
}