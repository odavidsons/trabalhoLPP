public class Fruta extends Alimento {
    private String tipo;

    public Fruta() {
        super();
        this.tipo = "Desconhecido";
    }

    public Fruta(String nome, double calorias, String tipo) {
        super(nome, calorias);
        this.tipo = tipo;
    }

    public Fruta(Fruta other) {
        super(other);
        this.tipo = other.tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Tipo: " + tipo);
    }
}
