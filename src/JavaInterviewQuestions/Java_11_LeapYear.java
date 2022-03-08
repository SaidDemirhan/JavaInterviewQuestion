package JavaInterviewQuestions;

import java.util.Scanner;

public class Java_11_LeapYear {

	public static void main(String[] args) {
		
		//Find Leap Year
		
		
		int year = 1900;
		boolean leap = false;
		
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					leap = true;
				}else {
					leap = false;
				}
			}else {
				leap = true;
			}
		} else {
			leap = false;
		}
		
		if(leap) {
			System.out.println(year + " is a leap year");
		}
		else {
			System.out.println(year + " is not a leap year");
		}

		//===================================================//

		Scanner scanner=new Scanner(System.in);
		System.out.println("Lütfen bir yil giriniz: ");

		int yil=scanner.nextInt();
		boolean artikYil=false;

		if (yil%4==0) {
			if (yil%100==0){
				if (yil % 400 == 0) {
					artikYil = true;
				} else
					artikYil = false;
			}else
				artikYil=true;
		}else
			artikYil=false;

		if (artikYil==true) {
			System.out.println("Girilen " + yil + " yili artik yildir.");
		}else {
			System.out.println("Girilen "+ yil+" yili artik yil DEGILDIR.");
		}

	}

}
