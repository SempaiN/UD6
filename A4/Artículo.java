package A4;

public class Artículo {
    public static int IVA = 21;
    private String nombre;
    private int precioSinIVA;
    public static int cuantosQuedan;
    public static void setCuantosQuedan(int cuantosQuedan) {
        Artículo.cuantosQuedan = cuantosQuedan;
    }
    public static int getCuantosQuedan() {
        return cuantosQuedan;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setPrecioSinIVA(int precioSinIVA) {
        this.precioSinIVA = precioSinIVA;
    }
    public int getPrecioSinIVA() {
        return precioSinIVA;
    }
}
