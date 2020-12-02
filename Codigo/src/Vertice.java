import java.util.ArrayList;

public class Vertice {
    ArrayList<Arestas> arestas = new ArrayList<Arestas>();
    Cor cor;
    int valor;

    public Vertice(int Valor) {
        this.valor = valor;
    }

    public void adicionaAresta(int peso, Vertice segundo) {
        arestas.add(new Arestas(peso, this, segundo));
    }
}
