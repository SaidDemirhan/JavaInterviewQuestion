package JavaInterviewQuestions;

import java.util.Scanner;

public class Java_39_Desimal_Binary {
    public static void main(String[] args) {
        String result="";
        Scanner scanner =new Scanner(System.in);
        System.out.println("Schreib mir einen Zahl:");
        int dezi= scanner.nextInt();
        int count=1;

        while (dezi!=0) {
            System.out.println(count + " wir teilen " + dezi + " durch 2");
            ++count;
            if (dezi % 2 == 0) {
                result=result+"0";
                System.out.println(dezi + " /2= " + (dezi / 2) + "|kein Rest, wir schreiben eine 0.");

            } else {
                result = result + "1";
                System.out.println(dezi + " /2= " + (dezi / 2) + " & Rest|wir schreiben eine 1.");
            }

            dezi /= 2;
            System.out.println();
        }
        System.out.println("Nun schreiben wir die Zahlen von unten nach oben auf: ");
        System.out.println("Und schon haben wir unser Ergebnis: ");

        for (int i=result.length()-1; i>=0; i--){
            System.out.print(result.charAt(i));
        }
    }
}
