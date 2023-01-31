import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[][] array = new int[num][num];

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        boolean flag = true;
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                if(array[i][j] != array[j][i]) {
                    flag = false;
                    break;
                }
            }
        }
        if(flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
            
        
    }
}
