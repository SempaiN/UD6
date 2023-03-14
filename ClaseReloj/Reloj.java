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

    public String dimeHora() {
        return (this.hora+":"+this.minuto+":"+this.segundo);
    }

    public String dimeHora12() {
        if (this.hora < 12) {
            return (this.hora+":"+this.minuto+":"+this.segundo);
        }
        else{
            return (this.hora-12+"pm:"+this.minuto+":"+this.segundo);
        }
    }

    public void imprimeHora(){
        System.out.println(dimeHora()); 
    }
    
    public void imprimeHora12(){
        System.out.println(dimeHora12());
    }
    
    public void tick(){
        
    }

}
