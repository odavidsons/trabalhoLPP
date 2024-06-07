public class Bebida extends Alimento {
    private boolean alcoolica;

    public Bebida() {
        super();
        this.alcoolica = false;
    }

    public Bebida(String nome, double calorias, boolean alcoolica) {
        super(nome, calorias);
        this.alcoolica = alcoolica;
    }

    public Bebida(Bebida other) {
        super(other);
        this.alcoolica = other.alcoolica;
    }

    public boolean isAlcoolica() {
        return alcoolica;
    }

    public void setAlcoolica(boolean alcoolica) {
        this.alcoolica = alcoolica;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Alcoólica: " + alcoolica);
    }
    
    @Override
    public String toString() {
        return super.toString() + " | Alcoólica: " + (alcoolica ? "Sim" : "Não");
    }
}
