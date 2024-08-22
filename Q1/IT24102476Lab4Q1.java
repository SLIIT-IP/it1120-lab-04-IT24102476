import java.util.Scanner;
public class IT24102912Lab4Q1{

	public static void main(String args[]){

		int number; 
		Scanner input=new Scanner(System.in);

		System.out.print("Enter a Number:");
		number=input.nextInt();

		if(number >0){
		System.out.print("The number is: Positive");
		}

		else if(number<0){
		System.out.print("The number is: Negative");
		}

		else{
		System.out.print("The number is Zero");
		}
	}
}