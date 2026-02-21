import java.util.*;

public class Graph {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int vert = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<vert;i++){
            adj.add(new ArrayList<>());
        }

         for(int i=0;i<e;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);

         }

           for (int i = 0; i < vert; i++) {
            System.out.print(i + " -> ");
            for (int neighbor : adj.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }

        sc.close();

    }
}
