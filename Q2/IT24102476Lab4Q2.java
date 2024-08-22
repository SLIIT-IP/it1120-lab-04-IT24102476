import java.util.Scanner;
public class IT24102912Lab4Q2{

	public static void main(String args[]){

		double examMarks,labMarks,examPercent,labPercent,finalMarks;
		Scanner input=new Scanner(System.in);

		System.out.print("Please enter exam marks(out of 100):");
		examMarks=input.nextInt();

		if (examMarks<0 || examMarks>100){
		System.out.print("Invalid input for exam marks. Terminating program.");
		return;
		}

		else {
		System.out.print("Please enter lab submission marks(out of 100):");
		labMarks=input.nextInt();
		}

		if (labMarks<0 || labMarks>100){
		System.out.print("Invalid input for lab marks. Terminating program.");
		return;
		}
		
		else {
		System.out.print("Please enter the percentage given for the exam:");
		examPercent=input.nextInt();

		System.out.print("Please enter the percentage given for the lab submission:");
		labPercent=input.nextInt();
		}

		if (examPercent+labPercent<100 || examPercent+labPercent>100){
		System.out.print("The percentage must add upto 100. Terminating program.");
		return;
		}

		else {
		finalMarks=(examMarks/100)*examPercent + (labMarks/100)*labPercent;
		System.out.print("Final exam mark is: "+finalMarks);
		}
	}
}