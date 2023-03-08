package A3;

public class Principal {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo();
        r1.setX1(0);
        r1.setX2(5);
        r1.setY1(0);
        r1.setY2(5);
        System.out.println("El area de R1 es " + r1.calcArea());
        System.out.println("El perimetro de R1 es " + r1.calcPerimetro());
    }
}
