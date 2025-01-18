import java.util.Scanner;

public class StringReverser {

    public static String reverseString(String text){
    String str = " ";
    for(int i=text.length()-1;i>=0;i--){
        str+=text.charAt(i);
    }
    return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = sc.nextLine();
        
        String reversedString = reverseString(input);
        System.out.println("Original string is " + input);
        System.out.println("Reversed string is" + reversedString);
    }
}
