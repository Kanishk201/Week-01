import java.util.Scanner;

public class SubstringOccurrences {
     // Method to count occurrences of a substring in a string
     public static int findSubstringCount(String str, String substr){
     int count=0;
     String[] arr=str.split(" ");
     for(int i=0;i<arr.length;i++){
        String word = arr[i];
        if(word.equals(substr)){
            count++;
        }
     }
     return count;
     }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String text = sc.nextLine();

        System.out.println("Enter the substring: ");
        String subStr = sc.nextLine();

        System.out.println("The number of substring occur is:" + findSubstringCount(text, subStr));
     } 
}
