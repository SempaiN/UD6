package ArrayCuentas;

import java.util.Scanner;

public class Principal {
    public static Cuenta cuentas [] = new Cuenta[5];
    public static Scanner lec = new Scanner(System.in);
    public static void main(String[] args) {
        
    }
    public static int opc(){
        System.out.println("Dame la opción");
        int opc = lec.nextInt();
        return opc;

    }

    public static void menu(int opc){
        switch (opc) {
            case 1:
                verCuentas();
                break;
        
            default:
                break;
        }
    }
    public static void verCuentas(){
        for (int i = 0; i < cuentas.length; i++) {
            System.out.println(cuentas[i].getNumCuenta() + " Saldo:" + cuentas[i].getSaldo());
        }
    }
    public static void ingresarDin(){
        System.out.println("Dime el número de cuenta al que vas a ingresar");
        int ncuenta = lec.nextInt();
        System.out.println("Ahora dame la cantidad a ingresar");
        double dinero = lec.nextDouble();
        cuentas[ncuenta].ingresarDinero(dinero);

    }
}
