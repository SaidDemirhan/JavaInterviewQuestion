package JavaInterviewQuestions;

import java.util.Scanner;

public class Java_13_AlphabetCheck {

	public static void main(String[] args) {
		
		char c = '$';
		
		if((c >= 'a' && c <='z') ||(c >= 'A' && c <= 'Z')) {
			System.out.println(c + " is in alphabet");
		}else {
			System.out.println(c + " is in not alphabet");
		}

		//================================================//

		Scanner scanner=new Scanner(System.in);
		System.out.println("lütfen bir karakter giriniz:");
		char karakter=scanner.next().charAt(0);
		if ((karakter>='a'&&karakter<='z')||(karakter>='A'&&karakter<='Z')){
			System.out.println("Girilen karakter bir harftir.");
		}else System.out.println("Girilen karakter bir harf DEGILDIR!");

	}

}
