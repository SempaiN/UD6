package ClaseCoche;

import ClaseCoche.Coche.modalidadSeguro;
import ClaseCoche.Coche.tipoCoche;

public class Principal {
    public static void main(String[] args) {
        Coche c1 = new Coche("Audi R8", "negro", "no metalizado", tipoCoche.familiar, 2018,modalidadSeguro.terceros );
        System.out.println(c1.getModelo() + " " + c1.getColor() + " " + c1.getTipoPintura() + " " + c1.getTipoCoche() + " " + c1.getAñoFabric() + " " + c1.getModalidadSeguro());
    }
}
