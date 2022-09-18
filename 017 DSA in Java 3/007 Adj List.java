import java.util.*;

class Edge {
    int src;
    int dest;
    int wt;
    
    Edge(int src, int dest, int wt) {
        this.src = src;
        this.dest = dest;
        this.wt = wt;
    }
}

public class Main {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        //as there are 6 vertices
        ArrayList<Edge>[] adjList = new ArrayList[6];
        
        for(int i=0;i<adjList.length;i++) {
            adjList[i] = new ArrayList<>();
        }
        
        //as there are 8 undirected edges (16 if counted twice)
        for(int i=0;i<8;i++) {
            int src = scn.nextInt();
            int dest = scn.nextInt();
            int wt = scn.nextInt();
            
            //since it is an undirected graph
            adjList[src-1].add(new Edge(src,dest,wt));
            adjList[dest-1].add(new Edge(dest,src,wt));
        }
        
        for(int i=0;i<adjList.length;i++) {
            for(Edge e : adjList[i]) {
                System.out.println("Source = " + e.src + " Destination" + e.dest + " Weight = " + e.wt);
            }
        }
    }
}
