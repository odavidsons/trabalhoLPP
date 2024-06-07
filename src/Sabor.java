public class Sabor extends Bebida {
    private String sabor;

    public Sabor() {
        super();
        this.sabor = "Desconhecido";
    }

    public Sabor(String nome, double calorias, boolean alcoolica, String sabor) {
        super(nome, calorias, alcoolica);
        this.sabor = sabor;
    }

    public Sabor(Sabor other) {
        super(other);
        this.sabor = other.sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Sabor: " + sabor);
    }
}
