package Company1;
import java.util.Scanner;
public class QC {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter your word/statement ");
	    String str = myObj.nextLine();  // Read user input
			      boolean[] alphaList = new boolean[26];
			      int index = 0;
			      int flag = 1;
			     // checking whether the character is an uppercase letter ('A' to 'Z') or a lowercase letter ('a' to 'z').
			      for (int i = 0; i < str.length(); i++) {
			         if ( str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
			            index = str.charAt(i) - 'A';
			         }else if( str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
			            index = str.charAt(i) - 'a';
			      }
			      alphaList[index] = true;
			   }//checking the alphabet list with the characters 
			   for (int i = 0; i <= 25; i++) {
			      if (alphaList[i] == false)
			      flag = 0;
			   }
			   
			   System.out.print("String: " + str + "\n");
			   if (flag == 1)
			      System.out.print("The above string is a pangram.");
			   else
			      System.out.print("The above string is not a pangram.");
			   }
	}

