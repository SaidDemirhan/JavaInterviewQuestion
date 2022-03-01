package JavaInterviewQuestions;

import java.util.Scanner;

public class Java_07_CheckNumberEvenOrOdd {

	public static void main(String[] args) {
		
		//Question even or odd number
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		
		int num = reader.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num+ " is even");
		}
		else {
			System.out.println(num+ " is odd");
		}

		//=========================================//

		System.out.println("Lütfen bir sayi girimiz:");

		int sayi=reader.nextInt();

		if (sayi%2==0){
			System.out.println("Sayi ikiye tam bölünmektedir");
		}else
		System.out.println("Girilen deger 2'ye bölünemedi");
	}

}
