import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import  java.util.List;
public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        Grafo grafo;
        quantiaTestes = Integer.parseInt(sc.nextLine());
        int resultados[] = new int[quantiaTestes];
        for(int teste = 0; teste < quantiaTestes; teste++) {
            casaInicial = Integer.parseInt(sc.nextLine());
            linhaEntrada = sc.nextLine();
            valoresLinha = Arrays.asList(linhaEntrada.split("\\s"));
            numeroVertices = Integer.parseInt(valoresLinha.get(0));
            numeroArestas = Integer.parseInt(valoresLinha.get(1));
            grafo = new Grafo(numeroVertices, casaInicial);
            for(int aresta = 0; aresta < numeroArestas; aresta++) {
                linhaEntrada = sc.nextLine();
                valoresLinha = Arrays.asList(linhaEntrada.split("\\s"));
                primeiroVertice = Integer.parseInt(valoresLinha.get(0));
                segundoVertice = Integer.parseInt(valoresLinha.get(1));
                grafo.adicionaAresta(primeiroVertice, segundoVertice);
            }
            grafo.percorreGrafo(casaInicial);
            resultados[teste] = grafo.comprimento;
        }
        for(int teste = 0; teste < quantiaTestes; teste++) {
            System.out.println(resultados[teste]);
        }
    }
}
