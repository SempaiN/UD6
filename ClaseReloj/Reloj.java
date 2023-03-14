package ClaseReloj;

public class Reloj {
    private int hora, minuto, segundo;

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public Reloj() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getHora() {
        return this.hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getSegundo() {
        return this.segundo;
    }

    public void setReloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void dimeHora() {
        String hora = String.valueOf(this.hora);
        String minuto = String.valueOf(this.minuto);
        String segundo = String.valueOf(this.segundo);
        System.out.println(hora + ":" + minuto + ":" + segundo);
    }

    public void dimeHora12() {
        for (int i = 0; i <= 12; i++) {

        }
    }

}
