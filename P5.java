public class P5 {
    static void print(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 7;
        int[][] mat = new int[n][n];
        int row = 0, col = n - 1;
        int p = 1;
        while (!(row == n - 1 && col == n - 1)) {
            mat[row++][col] = p++;
            mat[row][col] = p++;
            while (row > 0) {
                mat[--row][--col] = p++;
            }
            if (col > 0)
                --col;
            while (col < n - 1) {

                mat[row][col] = p++;
                row++;
                col++;
            }
            System.out.println(row + " " + col);
        }
        mat[row][col] = p++;
        while (!(row == n - 1 && col == 0)) {
            mat[row][--col] = p++;
            while (col > 0) {
                mat[--row][--col] = p++;
            }
            if (row < n - 1)
                mat[++row][col] = p++;
            while (row < n - 1) {
                mat[++row][++col] = p++;
            }

        }

        print(mat);

    }
}