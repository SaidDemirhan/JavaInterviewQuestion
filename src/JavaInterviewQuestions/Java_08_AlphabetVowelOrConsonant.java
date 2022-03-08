package JavaInterviewQuestions;

import java.util.Scanner;

public class Java_08_AlphabetVowelOrConsonant {

	public static void main(String[] args) {

		//Question: Check whether an alphabet is Vowel or Consonant
		// a e i o u

		char ch = 'c';

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " is vowel");
		} else {
			System.out.println(ch + " is consonant");
		}

		//Second way
		switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(ch + " is vowel");
				break;

			default:
				System.out.println(ch + " is consonant");
				break;
		}

		//===================================================//

		Scanner scanner = new Scanner(System.in);

		System.out.println("Lütfen bir harf giriniz:");

		char harf = scanner.next().charAt(0);

		if (harf=='a'||harf=='e'||harf=='i'||harf=='u'||harf=='ü'||harf=='o'||harf=='ö') {
			System.out.println("Girilen rakam ünlü harftir.");
		} else {
			System.out.println("Girilen harf ünsüz harftir.");

					}
	}
}