import java.util.Scanner;

public class Principal {
    public static Scanner Lector = new Scanner(System.in);
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        String nombre,dni,apellido;
        int edad;
        
    }

    public static String nombre(){
        String Nombre;
        System.out.println("Dame el nombre");
        Nombre = Lector.next();
        return Nombre;
    }

    public static String apellido(){
        String Apellido;
        System.out.println("Dame el apellido");
        Apellido = Lector.next();
        return Apellido;
    }
    
    public static String dni(){
        String DNI;
        System.out.println("Dame el DNI");
        DNI = Lector.next();
        return DNI;
    }
    public static int edad(){
        int Edad;
        System.out.println("Dame la edad");
        Edad = Lector.nextInt();
        return Edad;
    }

}
