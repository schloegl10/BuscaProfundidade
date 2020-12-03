import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import  java.util.List;
public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        Grafo grafo = new Grafo();
        boolean continuar = true;
        int valorVertice;
        String valorAresta;
        List<String> verticesAresta;
        int primeiroVertice;
        int segundoVertice;
        int peso;
        Vertice vertice;
        System.out.println("Insira os valores dos vertices(quando quiser parar insirar algum valor não numerico):");
        while(continuar) {
            try {
                valorVertice = Integer.parseInt(sc.nextLine());
                grafo.adicionaVertice(valorVertice);
            } catch (Exception e) {
                continuar = false;
            }
        }
        System.out.println("Insira os valores dos vertices para as arestas ('valor primeiro vertice' 'valor segundo' 'peso'):");
        continuar = true;
        while(continuar) {
            try {
                valorAresta = sc.nextLine();
                verticesAresta = Arrays.asList(valorAresta.split("\\s"));
                primeiroVertice = Integer.parseInt(verticesAresta.get(0));
                segundoVertice = Integer.parseInt(verticesAresta.get(1));
                peso = Integer.parseInt(verticesAresta.get(2));
                grafo.vertices.get(grafo.retornaVertice(primeiroVertice)).adicionaAresta(peso, grafo.vertices.get(grafo.retornaVertice(segundoVertice)));
                grafo.vertices.get(grafo.retornaVertice(segundoVertice)).adicionaAresta(peso, grafo.vertices.get(grafo.retornaVertice(primeiroVertice)));
            } catch (Exception e) {
                continuar = false;
            }
        }
        System.out.println("Insira um vertice para se buscar a partir de um vertice('vertice buscado' vertice inicial')");
        valorAresta = sc.nextLine();
        verticesAresta = Arrays.asList(valorAresta.split("\\s"));
        primeiroVertice = Integer.parseInt(verticesAresta.get(0));
        segundoVertice = Integer.parseInt(verticesAresta.get(1));
        System.out.println(grafo.percorreGrafo(primeiroVertice, grafo.vertices.get(grafo.retornaVertice(segundoVertice))));

    }
}
