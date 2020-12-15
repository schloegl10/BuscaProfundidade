import java.util.ArrayList;

public class Grafo {
    ArrayList<Vertice> vertices = new ArrayList<Vertice>();;

    public void adicionaVertice(int valor) {
        boolean inserir = true;
        for(Vertice vertice: vertices) {
            if(vertice.valor == valor) {
                inserir = false;
                System.out.println("Vertice já existe");
            }
        }
        if(inserir) {
            vertices.add(new Vertice(valor));
        }
    }
    public int retornaVertice(int valor) {
        for(int cont = 0; cont < vertices.size(); cont++) {
            if(vertices.get(cont).valor == valor) {
                return cont;
            }
        }
        return -1;
    }

    public Vertice percorreGrafo(int valorBuscado, Vertice vertice) {
        vertice.cor = Cor.CINZA;
        System.out.println(vertice);
        if(vertice.valor == valorBuscado) {
            return vertice;
        }
        for(int cont = 0; cont < vertice.arestas.size(); cont++) {
            if (vertice.arestas.get(cont).segundo.cor == Cor.BRANCO) {
                return percorreGrafo(valorBuscado, vertice.arestas.get(cont).segundo);
            }
        }
        vertice.cor = Cor.PRETO;
        return null;
    }
}
