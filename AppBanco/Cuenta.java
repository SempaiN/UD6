package AppBanco;

public class Cuenta {
    private String Nombre;
    private double saldo;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresarDinero(double dinero){
        if (dinero > 0) {
            this.saldo += dinero;
        }
        else if (dinero < 0) {
            System.out.println("Cantidad introducida erronea");
        }
    }
    
    public  void retirarDinero(double dinero){
        double calculo =getSaldo();
        if ((calculo - dinero) > -100) {
            System.out.println("Dinero retirado");
            this.saldo -= dinero;
        }
        else{
            System.out.println("No se puede quedar la cuenta con menos de -100€");
        }

    }


}
