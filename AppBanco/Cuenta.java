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

}
