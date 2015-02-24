/**
 * Author Fuadul Islam
 * Date : 2/3/15
 * Page : 131, Project : 4
 */
import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
		Scanner keyboard1 = new Scanner (System.in);
		Scanner keyboard2 = new Scanner (System.in);
		Scanner keyboard3 = new Scanner (System.in);
		Scanner keyboard4 = new Scanner (System.in);
		
		String s1, s2, s3, s4;
		
		System.out.println("Enter your favorite color");
		s1 =keyboard1.next();
		System.out.println("Enter your favorite food");
		s2 =keyboard2.next();
		System.out.println("Enter your favorite animal");
		s3 =keyboard3.next();
		System.out.println("Enter the first name of a friend or relative of yours");
		s4 =keyboard4.next();
		
		System.out.println("I had a dream that "+ s4 + " ate a " + s1
				+" " + s3 + "\nand said it tasted like " + s2 + "!");

	}

}

