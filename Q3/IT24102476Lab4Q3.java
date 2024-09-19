import java.util.Scanner;
public class IT24102476Lab4Q3{

	public static void main(String args[]){

		int number; 
		String msg;
		Scanner input=new Scanner(System.in);

		System.out.print("Enter a Number:");
		number=input.nextInt();

		msg=(number>0) ? "The number is Positive":
			(number<0) ? "The number is Negative":
			"The number is Zero";

		System.out.print(msg);
	}
}
