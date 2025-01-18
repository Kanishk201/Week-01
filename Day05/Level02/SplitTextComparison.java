import java.util.Scanner;

public class SplitTextComparison {
   // Method to find the length of a string without using length method
   public static int getLength(String str){
      int length=0;
	  for(int i=0;i<str.toCharArray().length;i++){
	  length++;
	  }
	  return length;
   }
   
   // Method to split text into words without using split method
   public static String[] customSplit(String text){
       int length=getLength(text);
	   int wordCount=0;
	   
	   //Count words by counting space
	   for(int i=0;i<length;i++) {
	   if(text.charAt(i) == ' '){
	         wordCount++;
	      }
	   }
	   wordCount++; //Last word(no space after it)
	   
	   // Array to store words
	   String[] words = new String[wordCount];
	   int start=0;
	   int index=0;
	   
	   for(int i=0;i<length;i++){
	   if(text.charAt(i) == ' '){
	      words[index] = text.substring(start, i);
		  start = i+1;
		  index++;
	   }
	 }
	 words[index] = text.substring(start); //Last Word
	 
	 return words;
   }
   
    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
	  // Take user input
        System.out.println("Enter a text:");
        String input = scanner.nextLine();

        // Use custom split method
        String[] customSplitWords = customSplit(input);

        // Use built-in split method
        String[] builtInSplitWords = input.split(" ");

        // Compare the results
        boolean areEqual = compareArrays(customSplitWords, builtInSplitWords);

        // Display results
        System.out.println("Words using custom split method:");
        for (int i = 0; i < customSplitWords.length; i++) {
            System.out.println(customSplitWords[i]);
        }

        System.out.println("\nWords using built-in split method:");
        for (int i = 0; i < builtInSplitWords.length; i++) {
            System.out.println(builtInSplitWords[i]);
        }

        System.out.println("\nAre the results equal? " + areEqual);
    }

}