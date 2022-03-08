package JavaInterviewQuestions;

import java.util.Scanner;

public class Java_12_Positive_and_NegativeNumber {

	public static void main(String[] args) {
		
		double number = 0;
		
		if(number < 0.0) {
			System.out.println(number + " is negative number");
		}
		else if(number > 0.0) {
			System.out.println(number + " is positive number");
		}
		else {
			System.out.println(number + " is zero");
		}

		//=======================================================//

		Scanner scanner=new Scanner(System.in);

		System.out.println("Lütfen bir sayi giriniz: ");

		int sayi=scanner.nextInt();

		if (sayi>0){
			System.out.println("Girdiginiz sayi pozitif bir sayidir: "+sayi);
		}else if (sayi<0){
			System.out.println("Girdiginiz sayi negatif bir sayidir: "+sayi);
		}else if (sayi==0){
			System.out.println("Girdiginiz sayi natural bir sayidir: "+sayi);
		}

	}

}
