package AppBanco;

import java.util.Scanner;

public class Principal {
    public static Cuenta cuentas[] = new Cuenta[100];
    public static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        do {
           menu(opc());
            
        } while (!(!true));
    }

    public static int opc(){
        System.out.println("1.- Ver cuentas");
        System.out.println("2.- Ingresar Dinero");
        System.out.println("3.- Retirar Dinero");
        System.out.println("4.- Transferencia");
        System.out.println("5.- Agregar Cuenta");
        System.out.println("6.- Eliminar cuenta");
        System.out.println("7.- Buscar cuenta");
        System.out.println("8.- Mostrar morosos");
        System.out.println("9.- Salir");
        System.out.println("Dame la opción");
        int opc = lector.nextInt();
        return opc;
    }

    public static void menu(int opc){
        switch (opc) {
            case 1:
                verCuentas();
                break;
            
            case 2:
                ingresarDinero();
                break;
            
            case 3:
                //retirarDinero();
                break;
            
            case 4:
                //trasferirDinero();
                break;
            
            case 5:
                //agregarCuenta();
                break;
            
            case 6:
                //eliminarCuenta();
                break;
            
            case 7:
                //buscarCuenta();
                break;
            
            case 8:
                //mostrarMorosos();
                break;
            
            case 9:
                System.exit(0);
                break;
            
            default:
                System.out.println("Esa opción no se encuentra disponible");
                break;
        }
    }

    public static void verCuentas(){
        for (int i = 0; i < cuentas.length; i++) {
            System.out.println(i+cuentas[i].getNombre() + " Saldo:" + cuentas[i].getSaldo()+"€");
        }
    }

    public static void ingresarDinero(){
        verCuentas();
        System.out.println("Dame la cuenta a la que quieres ingresar");
        int cuenta = lector.nextInt();
        System.out.println("Dame la cantidad a ingresar");
        cuentas[cuenta].ingresarDinero(lector.nextDouble());
    }
    
    public static void retirarDinero(){
        verCuentas();
        System.out.println("Dame la cuenta a la que quieres retirar");
        int cuenta = lector.nextInt();
        System.out.println("Dame la cantidad a retirar");
        cuentas[cuenta].retirarDinero(lector.nextDouble());
    }


}
