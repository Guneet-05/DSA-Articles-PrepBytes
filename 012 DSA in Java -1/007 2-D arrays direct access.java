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
        
        System.out.println(arr[2][1]);
    }
}
