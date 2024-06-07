public class Alimento {
    protected String nome;
    protected double calorias;
    protected static int totalAlimentos;

    public Alimento() {
        this("Desconhecido", 0);
    }

    public Alimento(String nome, double calorias) {
        this.nome = nome;
        this.calorias = calorias;
        totalAlimentos++;
    }

    public Alimento(Alimento other) {
        this(other.nome, other.calorias);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return nome +
                " | " + calorias + " calorias";
    }

    @Override
    public Alimento clone() {
        return new Alimento(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Alimento alimento = (Alimento) obj;
        return Double.compare(alimento.calorias, calorias) == 0 && nome.equals(alimento.nome);
    }

    public void print() {
        System.out.println(this.toString());
    }
}
