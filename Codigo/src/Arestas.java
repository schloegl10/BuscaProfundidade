public class Arestas {
    Vertice primeiro;
    Vertice segundo;
    int peso;
    public Arestas(int peso, Vertice primeiro, Vertice segundo) {
        this.peso = peso;
        this.primeiro = primeiro;
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return "Arestas{" +
                "primeiro=" + primeiro +
                ", segundo=" + segundo +
                ", peso=" + peso +
                '}';
    }
}
