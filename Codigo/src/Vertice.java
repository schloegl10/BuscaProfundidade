import java.util.ArrayList;

public class Vertice {
    ArrayList<Arestas> arestas = new ArrayList<Arestas>();
    Cor cor;
    int valor;

    public Vertice(int valor) {
        this.valor = valor;
        this.cor = Cor.BRANCO;
    }

    public void adicionaAresta(int peso, Vertice segundo) {
        arestas.add(new Arestas(peso, this, segundo));
    }

    @Override
    public String toString() {
        return "Vertice{" +
                "cor=" + cor +
                ", valor=" + valor +
                '}';
    }
}
