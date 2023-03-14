package ArrayCoches;

import java.util.Scanner;

public class Principal {
    public static Scanner lec = new Scanner(System.in);
    public static void main(String[] args) {
    Coche coches [] = new Coche[3];
    String modelo,color,matricula;
    int añoFabricacion;
    boolean esMetalizado;
    Coche.tipoCoche tipoC;
    Coche.tipoSeguro tipoS;
    for (int i = 0; i < coches.length; i++) {
        System.out.println("Dame el modelo del coche");
        modelo = lec.next();
        coches[i].setModelo(modelo);
        System.out.println("Dame el color del coche");
        coches[i].setColor(lec.next());
        
    }


    }
}
