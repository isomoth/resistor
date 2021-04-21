package resistor;
import java.util.Scanner;
import java.lang.Math; 

public class Resistor_portfolio {
	public static void main(String[] args) {
//		This program calculates a resistor's resistance value, 
// 		based on a menu where the user input consists of which colors the resistor has. 
// 		Input: 4 colors (see color codes below). 
		Scanner scan = new Scanner(System.in);
		int color1, color2, color3, color4;
		System.out.println("Color codes: 0=black, 1=brown, 2=red, 3=orange, 4=yellow, "
				+ "5=green, 6=blue, 7=purple, 8=grey, "
				+ "\n9=white, 10=yellow, 11=silver, 12=none");
		System.out.println("Fill in the color of the first ring with a digit: ");
		color1 = scan.nextInt();
		System.out.println("Fill in the color of the second ring with a digit: ");
		color2 = scan.nextInt();
		System.out.println("Fill in the color of the third ring with a digit: ");
		color3 = scan.nextInt();
		System.out.println("Fill in the color of the fourth ring with a digit: ");
		color4 = scan.nextInt();
		// Formula för att räkna ut resistansen 
		double resistance = ((color1 * 10 + color2) * Math.pow(10, color3));
		System.out.println("Resistance: " + resistance + " Ohm");
//		The program takes the tolerance into consideration, 
//		i.e. the fourth color in the calculation.
//		When calculating the resistance, it considers plus and 
//		minus tolerances. 
		switch(color4) {
		case 0,3,4,9: 
			System.out.println("No tolerance");
		break; 
		case 1: 
			System.out.println("The tolerance is between " + 
					// Calculates the tolerance: Subtracts the respective percentage
					// from the resistance
					(resistance - ((resistance*1)/100)) + 
					// Adds the respective procent to the resistance
					" and " + (resistance + (resistance*1)/100));		
			break; 
		case 2: 
			System.out.println("The tolerance is between " + 
					(resistance - ((resistance*2)/100)) + 
					" and " + (resistance + (resistance*2)/100));	
			break;
		case 5: 
			System.out.println("The tolerance is between " + 
					(resistance - ((resistance*0.5)/100)) + 
					" and " + (resistance + (resistance*0.5)/100));	
			break; 
		case 6: 
			System.out.println("The tolerance is between " + 
					(resistance - ((resistance*0.25)/100)) + 
					" and " + ((resistance*0.25)/100));	
			break;
		case 7: 
			System.out.println("The tolerance is between " + 
					(resistance - ((resistance*0.1)/100)) + 
					" and " + (resistance + (resistance*0.1)/100));	
			break; 
		case 8: 
			System.out.println("The tolerance is between " + 
					(resistance - ((resistance*0.5)/100)) + 
					" and " + (resistance + (resistance*0.5)/100));	
			break; 
		case 10: 
			System.out.println("The tolerance is between " + 
					(resistance - ((resistance*5)/100)) + 
					" and " + (resistance + (resistance*5)/100));	
			break; 
		case 11: 
			System.out.println("The tolerance is between " + 
					(resistance - ((resistance*10)/100)) + 
					" and " + (resistance + (resistance*10)/100));	
			break; 
		case 12: 
			System.out.println("The tolerance is between " + 
					(resistance - ((resistance*20)/100)) + 
					" and " + (resistance + (resistance*20)/100));	
		break; 
		}
		scan.close();
	}
}
