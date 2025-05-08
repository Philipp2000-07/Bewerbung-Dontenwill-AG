
import java.util.Scanner;


public class application {

	public static void main(String[] args) {
		
		//Ausgabe
		System.out.println("Hallo Frau Alexandra Maier " + "ich möchte mich gerne bewerben!");
		
		
		String name = "Ich heiße Philipp Nikitorowitsch";
		String age =" und bin 24 Jahre alt.";

		System.out.println(name + age);
		
		
				int number1 = 39;
				long number2 = 12000;
				float number3 = 3;
				byte number4 = -10;
				double sum = number1 + number2 * number3 - number4;
				
				System.out.println("Die Summe von " + number1 + '+' + number2 + '*' + number3 + '-' + number4 + " ist: " + sum);
				
				
			        if (sum > 100) {
			            System.out.println("Die Summe ist größer als 100.");
			        } else {
			            System.out.println("Die Summe ist kleiner oder gleich 100.");
			        }

			        System.out.println("Zahlen von 1 bis 5:");
			        for (int a = 1; a <= 5; a++) 
			            System.out.println(a);
			        
			       
			        System.out.println("Mein kleines simples Programm zur Altersabfrage:");
			        
			        
			        Scanner scanner = new Scanner(System.in);

			        // Eingabe des Namens
			        System.out.print("Wie heißen Sie? ");
			        String name2 = scanner.nextLine();

			        // Eingabe des Alters
			        System.out.print("Wie alt sind Sie? ");
			        int alter = scanner.nextInt();

			        // Ausgabe mit Bedingung
			        System.out.println("Hallo " + name2 + "!");
			        if (alter >= 18) {
			            System.out.println("Du bist volljährig.");
			        } else {
			            System.out.println("Du bist noch nicht volljährig.");
			        }

			        // Scanner schließen
			        scanner.close();
			    }
			

			        
			}
	