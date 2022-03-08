package JavaInterviewQuestions;

import java.util.Scanner;

public class Java_09_LargestAmongThreeNumbers {

	public static void main(String[] args) {
		
		//Question largest and smallest numbers finding
		
		int x = 600;
		int y = 200;
		int z = 500;
		
		//First way
		
		if(x>y && x>z) {
			System.out.println("x is greatest");
		}else if(y>z) {
			System.out.println("y is greatest");
		}else {
			System.out.println("z is greatest");
		}
		
		//Second way (nested if)
		if(x>=y) {
			if(x>=z) {
				System.out.println("x is greatest");
			}
			else {
				System.out.println("z is greatest");
			}
		}else {
			if(y>=z) {
				System.out.println("y is greatest");
			}else {
				System.out.println("z is greatest");
			}
		}
		
		
		//Smallest number 
		if(x<y && x<z) {
			System.out.println("x is smallest");
		}else if(y<z) {
			System.out.println("y is smallest");
		}else {
			System.out.println("z is smallest");
		}
		//======================================================//

		Scanner scanner=new Scanner(System.in);

		System.out.println("Lütfen 3 sayi girerek enter tusuna basiniz:");

		int sayi1= scanner.nextInt();
		int sayi2= scanner.nextInt();
		int sayi3= scanner.nextInt();

		if (sayi1>sayi2&&sayi1>sayi3){
			System.out.println("En büyük girilen deger "+sayi1);
		} else if (sayi2>sayi1&&sayi2>sayi3){
			System.out.println("En büyük girilen deger "+sayi2);
		}else if (sayi3>sayi1&&sayi3>sayi2){
			System.out.println("En büyük girilen deger "+sayi3);
		}else {
			System.out.println("uygun olmayan degerler var!");
		}

	}

}
