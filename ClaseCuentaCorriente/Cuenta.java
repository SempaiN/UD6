package ClaseCuentaCorriente;

public class Cuenta {
    private int nCuenta;
    private double saldo;

    public void setNCuenta (int numcuent){
        this.nCuenta = numcuent;
    }
    public int getNCuenta(){
        return this.nCuenta;
    }

    public void setSaldo(double dinero){
        this.saldo = dinero;
    }
    public double getSaldo(){
        return this.saldo;
    }

    public Cuenta(int numcuent,double dinero){
        this.nCuenta = numcuent;
        this.saldo = dinero;
    }

    public void ingresarDinero(int dinero){
        this.saldo += dinero;
    }

    public boolean retirarDinero(int dinero){
        boolean verda = false;
        if (this.saldo > 0 ) {
            this.saldo -= dinero;
            verda = true;
        }
        return verda;
    }
}
