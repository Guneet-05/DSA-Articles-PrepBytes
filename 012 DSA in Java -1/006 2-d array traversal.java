public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[][] arr;
        arr = new int[3][4];
        
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
