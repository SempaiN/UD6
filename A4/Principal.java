package A4;

import java.util.Scanner;

public class Principal {
    public static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        
    }
    public static String pideNombre(){
        System.out.println("Dame el nombre del producto");
        String nombre = lector.next();
        return nombre;
    }
    public static int pidePrecio(){
        System.out.println("Dame el precio del producto");
        int precio = lector.nextInt();
        return precio;
    }

}
