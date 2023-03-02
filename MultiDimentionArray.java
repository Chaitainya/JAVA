public class MultiDimentionArray {
    public static void main(String args[]) {
        int[][] new_array = new int[3][4];
        new_array[0][0] = 2;
        new_array[0][1] = 4;
        new_array[0][2] = 8;
        new_array[0][3] = 5;

        new_array[1][0] = 21;
        new_array[1][1] = 34;
        new_array[1][2] = 45;
        new_array[1][3] = 55;

        new_array[2][0] = 156;
        new_array[2][1] = 123;
        new_array[2][2] = 100;
        new_array[2][3] = 120;

        // System.out.println(new_array[0][2]);
        // System.out.println(new_array[1][3]);
        // System.out.println(new_array[2][0]);

        for (int i = 0; i < new_array.length; i++) {
            for (int j = 0; j < new_array[i].length; j++) {
                System.out.println(new_array[i][j]);
            }
        }
    }
}
