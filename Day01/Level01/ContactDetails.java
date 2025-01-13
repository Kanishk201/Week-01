import java.util.Scanner;
public class ContactDetails{
   public static void main(String[] args){
       String name,email,phone;
	   int age;
	   double height;
	   
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.print("Enter your Name: ");
	   name = sc.nextLine();
	   
	   System.out.print("Enter your Email: ");
	   email = sc.nextLine();
	   
	   System.out.print("Enter your phone number: ");
	   phone = sc.nextLine();
	   
	   System.out.print("Enter your Age: ");
	   age = sc.nextInt();
	   
	   System.out.print("Enter your Height: ");
	   height = sc.nextDouble();
	   
	   System.out.println("User Contact Details:");
	   System.out.println("Name: " + name + ", Email: " + email + ", Phone: " + phone + ",\nAge: " + age + ", Height: " + height);
	  
   }
}