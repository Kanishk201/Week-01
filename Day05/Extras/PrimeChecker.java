import java.util.Scanner;

public class PrimeChecker{

    public static boolean checkPrime(int number){
      
       if(number < 2){
        return false;
       }

       for(int i=2;i<=Math.sqrt(number);i++){
        if(number%i == 0){
            return false;
        }
       }
       return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();

        if((checkPrime(number))){
            System.out.println("The given number is prime number");
        }
        else{
            System.out.println("The given number is not a prime number");
        }
    }
}