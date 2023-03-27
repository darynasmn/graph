import edu.princeton.cs.algs4.StdRandom;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileReader("D:\\OneDrive - National University of Kyiv Mohyla Аcademy\\Рабочий стол\\Наукма\\ALLinALL\\input1.txt"));
        int vertexes = sc.nextInt();
        int edges = sc.nextInt();

        graph graph = new graph(vertexes);
        for (int i = 0; i < edges; i++) {
            graph.addEdge(sc.nextInt(), sc.nextInt());
        }
        int lamp = StdRandom.uniform(1, vertexes);
        System.out.println("лампа " + lamp);


        System.out.println("dfs");
        dfs dfs = new dfs(graph, 0);
        for (int k : dfs.pathTo(lamp)) {
            if (k == lamp) {
                System.out.println("лампа");
                break;
            }
            System.out.print(k + " -> ");
        }
        System.out.println("довжина шляху = " + dfs.getDistTo(lamp));
        System.out.println("вершини, які вже були відвідані  = " + dfs.getCounter(lamp));

        System.out.println("----------------------------------------------------------------");
        System.out.println("bfs");
        bfs bfs = new bfs(graph, 0);
        for (int k : bfs.pathTo(lamp)) {
            if (k == lamp) {
                System.out.println("лампа");
                break;
            }
            System.out.print(k + " -> ");
        }
        System.out.println("довжина шляху = " + bfs.getDistTo(lamp));
        System.out.println("вершини, які вже були відвідані = " + bfs.getCounter(lamp));
    }
}