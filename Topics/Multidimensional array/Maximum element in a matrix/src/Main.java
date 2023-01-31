import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int max = Integer.MIN_VALUE ;
        int temy = 0, temx = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                int num = scanner.nextInt();
                if(num > max){
                    temx = i;
                    temy = j;
                    max = num;
                }
            }
        }
        System.out.println(temx + " " + temy);
        scanner.close();
        
        
    }
}
