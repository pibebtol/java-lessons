public class Table {
    public static void main(String[] args) {
        int[][] table = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int[] i : table) {
            for (int j: i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}