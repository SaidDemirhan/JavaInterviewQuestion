package JavaInterviewQuestions;

import java.util.Scanner;

public class Java_02_AddTwoIntegers {

	public static void main(String[] args) {
		
		//Question: Add two integer
		
		int a = 10;
		int b = 20;
		
		int sum = a+b;
		
		System.out.println("Sum of a and b is: "+ sum);
		
		
		//=============================================//

		Scanner scanner=new Scanner(System.in);

		System.out.println("Lütfen 2 sayi giriniz:");

		int sayi1= scanner.nextInt();
		int sayi2= scanner.nextInt();

		System.out.println("Toplam: "+ (sayi1+sayi2) );

	}

}
