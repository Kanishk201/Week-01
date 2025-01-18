import java.util.Scanner;

public class GCDAndLCMCalculator{
    public static int findGCD(int num1, int num2){
        int gcd=1;
        for(int i=1;i<=num1 && i<=num2;i++){
            if(num1%i == 0 && num2%i==0){
                gcd=i;
            }
        }
        return gcd;
    }

    public static int findLCM(int num1, int num2){
        return (num1 * num2)/findGCD(num1, num2);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1=sc.nextInt();

        System.out.print("Enter second number: ");
        int num2=sc.nextInt();

        System.out.println("GCD: " + findGCD(num1, num2));
        System.out.println("LCM: " + findLCM(num1, num2));
    }
}