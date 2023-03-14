package ArrayCoches;

public class Coche {
    public enum tipoCoche{mini,utilitario,familiar,deportivo};
    public enum tipoSeguro{tercero,todoRiesgo};
    private String modelo,color,matricula;

    private int añoFabricacion;
    private boolean esMetalizado;
    private tipoCoche tipoC;
    private tipoSeguro tipoS;

    public Coche(String modelo,String color,boolean metal,String matricula, tipoCoche tipo, int año, tipoSeguro seguro ){
        this.modelo=modelo;
        this.color = color;
        this.esMetalizado = metal;
        this.matricula = matricula;
        this.tipoC = tipo;
        this.añoFabricacion = año;
        this.tipoS = seguro;
    }

    public Coche(){
        
    }
    public void setEsMetalizado(boolean esMetalizado) {
        this.esMetalizado = esMetalizado;
    }
    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setTipoC(tipoCoche tipoC) {
        this.tipoC = tipoC;
    }
    public void setTipoS(tipoSeguro tipoS) {
        this.tipoS = tipoS;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }
    public String getColor() {
        return color;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getModelo() {
        return modelo;
    }
    public tipoCoche getTipoC() {
        return tipoC;
    }
    public tipoSeguro getTipoS() {
        return tipoS;
    }
    public boolean getMetal(){
        return this.esMetalizado;
    }

    public void imprimeCoche(){
        System.out.println(getModelo() + " " + getColor() + " " +getMetal() + " " + getTipoC() + " " + getAñoFabricacion() + " " + getTipoS());
    }
}
