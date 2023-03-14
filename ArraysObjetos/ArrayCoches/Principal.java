package ArrayCoches;

import java.util.Scanner;

public class Principal {
    public static Scanner lec = new Scanner(System.in);
    public static void main(String[] args) {
    Coche coches [] = new Coche[3];
    for (int i = 0; i < coches.length; i++) {
        coches[i] = new Coche();
        System.out.println("Dame el modelo del coche");
        coches[i].setModelo(lec.nextLine());
        System.out.println("Dame el color del coche");
        coches[i].setColor(lec.next());
        System.out.println("Dime si la pintura es metalizada (true or false)");
        coches[i].setEsMetalizado(lec.nextBoolean());
        System.out.println("Dime la matrícula del coche");
        coches[i].setMatricula(lec.next());
        System.out.println("Dime el tipo del coche 0-mini 1-utilitario 2-familiar 3-deportivo ");
        coches[i].setTipoC(lec.nextInt());
        System.out.println("Dime el año de fabricación");
        coches[i].setAñoFabricacion(lec.nextInt());
        


    }
    
        
    }


    }
