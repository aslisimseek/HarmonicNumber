import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a Number..:");
        double number=scanner.nextDouble();
        double totalResult=1;
        for(int i=2;i<=number;i++){
            totalResult += (1.0/i);
        }
        System.out.println(totalResult);
    }
}
