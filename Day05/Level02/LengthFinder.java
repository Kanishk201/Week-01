import java.util.Scanner;

public class LengthFinder{
	
   // Mthod to calculate length of string without using length method
   public static int findLength(String text){
   int count=0;
   
   for(int i=0; ;i++){
      
	try{
	 
     text.charAt(i);
     count++;	 
     }
	 
	 catch(Exception e){
	 break;
	 }
   }
   return count;
}  
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
	  
	  // Take a string as input
	  System.out.println("Enter a string: ");
	  String text = sc.nextLine();
	  
	  // Finding length using user defined method
	  int lengthUsingUserMethod = findLength(text);
	  
	  //Finding length using builtin method
	  int lengthUsingInBuiltMethod = text.length();
	  
	  // Display the result
	  System.out.println("Length using user defined method: " + lengthUsingUserMethod);
	  System.out.println("Length using Inbuilt method: " + lengthUsingInBuiltMethod);
	  
   }
}