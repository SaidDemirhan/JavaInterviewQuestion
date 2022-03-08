package JavaInterviewQuestions;

import java.util.Scanner;

public class Java_10_FindAllRootsQuadraticEquation {

	public static void main(String[] args) {
		
     //Find all roots of a quadratic equation

		//==================================================//

		//Delta=b²-4ac

		//The standard form of a quadratic equation is:
		//
		//ax2 + bx + c = 0
		//Here, a, b, and c are real numbers and a can't be equal to 0.
		//
		//We can calculate the root of a quadratic by using the formula:
		//
		//x = (-b ± √(b2-4ac)) / (2a)
		//The ± sign indicates that there will be two roots:
		//
		//root1 = (-b + √(b2-4ac)) / (2a)
		//root1 = (-b - √(b2-4ac)) / (2a)
		//The term b2-4ac is known as the determinant of a quadratic equation. It specifies the nature of roots. That is,
		//
		//if determinant > 0, roots are real and different
		//if determinant == 0, roots are real and equal
		//if determinant < 0, roots are complex complex and different

		Scanner scanner=new Scanner(System.in);
		System.out.println("Lütfen 3 sayi giriniz: ");
		double a=scanner.nextDouble();
		double b=scanner.nextDouble();
		double c=scanner.nextDouble();

		double delta= (b*b)-4*a*c;

		double x1,x2;

		if (delta>0){
			x1= (-b+Math.sqrt(delta))/2*a;
			x2= (-b-Math.sqrt(delta))/2*a;
			System.out.println("Denklem kökleri :"+ x1+" ve "+ x2+"'dir");
		} else if (delta==0){
			x1=x2=-b/(2*a);
			System.out.println("Denklemin 2 esit kökü vardir ve bunlar : "+ x1+" ve "+x2+"'dir");
		}else if ((delta<0)){
			x1=-b/(2*a);
			x2=-Math.sqrt(delta)/(2*a);
			System.out.println("Denklemin gercel kökü yoktur, ama "+x1+" ve "+x2+ " elde edilen degerlerdir.");
		}



		

	}

}
