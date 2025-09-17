import java.util.Scanner;

public class Siev {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Up to what number do you want to find all the prime numbers?");
        int n = scan.nextInt();
        int[] numberSet = new int[n];
        boolean[] primeNumbers = new boolean[n];
        for (int point = 0; point <= n; point++) {
            primeNumbers[point] = true;
        }
        for (int test = numberSet[0]; test <= n; test++){
            if(numberSet[0] + test == ){
                numberSet[0] = 2;                
            }


        }
    }

}
