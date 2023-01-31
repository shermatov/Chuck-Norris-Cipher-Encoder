import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
	
    	int num = scanner.nextInt();
    
    	for (int i = 0; i < num; i++) {
    		for (int j = 0; j < num; j++)
        		System.out.print(Math.abs(i - j) + " ");		
    		System.out.println();
    	}
        
    }
}
