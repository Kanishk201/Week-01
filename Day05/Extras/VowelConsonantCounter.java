import java.util.Scanner;

public class VowelConsonantCounter {
     public static String checkVowelAndConsonant(char ch){
        // Convert to lowercase
        if(ch>='A' && ch<='Z'){
            ch = (char)(ch+32);
        }

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return "Vowel";
        }

        if(ch>='a' && ch<='z'){
            return "Consonant";
        }
        return "Not a Letter";
     }
 
    // Method to count Vowels and Consonants
     public static int[] countVowelsAndConsonants(String text){
        int vowelCount=0;
        int consonantCount=0;
        for(int i=0;i<text.length();i++){
        char ch=text.charAt(i);
        String result = checkVowelAndConsonant(ch);

        if(result.equals("Vowel")){
            vowelCount++;
        }
        else if(result.equals("Consonant")){
            consonantCount++;
        }
        }
      return new int[]{vowelCount, consonantCount};
     }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String text = sc.nextLine();

        int[] arr = countVowelsAndConsonants(text);

        System.out.println("Number of Vowels: " + arr[0]);
        System.out.println("Number of consonants: " + arr[1]);
     }
}
