import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int i = scanner.nextInt();
        int j = scanner.nextInt();


        for (int k = 0; k < n; k++) {
            int temp = matrix[k][i];
            matrix[k][i] = matrix[k][j];
            matrix[k][j] = temp;
        }

        for (int k = 0; k < n; k++) {
            for (int l = 0; l < m; l++) {
                System.out.print(matrix[k][l] + " ");
            }
            System.out.println();
        }

    }
}