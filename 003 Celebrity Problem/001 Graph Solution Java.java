import java.util.*;

public class Main {
    
    public static int celebritySolution(int[][] mat) {
        
        int V = mat.length;
        
        int[] in = new int[V];
        int[] out = new int[V];
        
        for(int i=0;i<V;i++) {
            for(int j=0;j<V;j++) {
                if(mat[i][j] == 1) {
                    out[i]++;
                    in[j]++;
                }
            }
        }
        
        for(int i=0;i<V;i++) {
            if(in[i] == V-1 && out[i] == 0) return i;
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int[][] matrix = {{0,1,1,0},
                         {0,0,0,0},
                         {0,1,0,0},
                         {1,1,0,0}};
                         
        int res = celebritySolution(matrix);
        if(res == -1) {
            System.out.println("There is no celebrity in the party");
        } else {
            System.out.println(res + " is the celebrity in the party");
        }
    }
}
