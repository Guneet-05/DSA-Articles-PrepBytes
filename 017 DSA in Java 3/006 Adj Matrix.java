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
        int[][] matrix = new int[6][6];
        
        // Our Graph input Matrix
        
        // 0 10 20 0 0 0
        // 10 0 30 50 40 0
        // 20 30 0 0 80 0
        // 0 50 0 0 0 70
        // 0 40 80 0 0 60
        // 0 0 0 70 60 0
        
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                matrix[i][j] = scn.nextInt();
            }
        }
        
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                if(matrix[i][j] != 0) {
                    System.out.println("Source = " + i + " Destination = " + j + " Weight = " + matrix[i][j]);
                }
            }
        }
        
    }
}
