package lesson1902;

public class Task5 {
    public static void main(String[] args) {
        //creation
        int[][] twoDimIntArray;
        byte[][] twoDimByteArray;
        String[][] twoDimStrArray;

        //initialization
        twoDimIntArray = new int[2][3];
        int[][] directInit = {{1, 2, 3}, {1, 2, 17}};

        //printing
        for (int i = 0; i < directInit.length; i++) {
            for (int j = 0; j < directInit[i].length; j++) {
                System.out.print(directInit[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

