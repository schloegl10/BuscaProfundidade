import java.util.ArrayList;

public class Grafo {
    ArrayList<Vertice> vertices = new ArrayList<Vertice>();;

    public void adicionaVertice(int valor) {
        vertices.add(new Vertice(valor));
    }

    public void percorreGrafo(Vertice vertice) {
        vertice.cor = Cor.CINZA;
        for(int cont = 0; cont < vertice.arestas.size(); cont++) {
            if()
            if (vertice.arestas.segundo.cor == Cor.BRANCO) {
                percorreGrafo(vertice.arestas.segundo);
            }
        }
        vertice.cor = Cor.PRETO;
    }
}
