import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code hereScanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for(int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if(i == j || i + j == number-1 || j  == (number - 1 ) /2 || i == (number-1) /2) {
                    System.out.print("* ");
                }
                else {
                    System.out.print(". ");
                }

            }
            System.out.println();
        }
    }
}
