package ClaseReloj;

public class Principal {
    public static void main(String[] args) {
        Reloj r1 = new Reloj(23, 59, 59);
        
        r1.imprimeHora();
        r1.imprimeHora12();
        r1.tick();
        r1.imprimeHora();
        r1.imprimeHora12();

    }   
}
