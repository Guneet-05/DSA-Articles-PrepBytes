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
        List<Edge> edgeList = new ArrayList<>();
        edgeList.add(new Edge(1,2,10)); edgeList.add(new Edge(2,1,10));
        edgeList.add(new Edge(1,3,20)); edgeList.add(new Edge(3,1,20));
        edgeList.add(new Edge(2,3,30)); edgeList.add(new Edge(3,2,30));
        edgeList.add(new Edge(2,4,50)); edgeList.add(new Edge(4,2,50));
        edgeList.add(new Edge(2,5,40)); edgeList.add(new Edge(5,2,40));
        edgeList.add(new Edge(3,5,80)); edgeList.add(new Edge(5,3,80));
        edgeList.add(new Edge(4,6,70)); edgeList.add(new Edge(6,4,70));
        edgeList.add(new Edge(5,6,60)); edgeList.add(new Edge(6,5,60));
        
        for(Edge e : edgeList) {
            System.out.println("Source = " + e.src + " Destination = " + e.dest + " Weight = " + e.wt);
        }
    }
}
