public class JaggedArray {
    public static void main(String args[]) {
        int arr[][] = new int[3][]; // Jagged Array

        arr[0] = new int[4];
        arr[1] = new int[2];
        arr[2] = new int[6];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 1000);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
