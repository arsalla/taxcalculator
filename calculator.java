import java.io.*;
import java.util.*;

public class calculator {
	
	public static void main (String[]args) {
		
		System.out.println("Welcome to Tax Calculator v1.0 (2020)!");
		
		System.out.println("Name: ");
		Scanner kbReader = new Scanner(System.in);
		String name = kbReader.nextLine();
		
		System.out.println("Date of Birth (insert integers)");
		System.out.println("Month:");
		int dobmonth = kbReader.nextInt();
		System.out.println("Day:");
		int dobday = kbReader.nextInt();
		System.out.println("Year:");
		int dobyear = kbReader.nextInt();
		if (2020 - dobyear<18) {
			System.out.println("Minors are not allowed to file taxes");
			System.exit(0);
		}
		if (2020 - dobyear == 18) {
			int monthdiff = 4 - dobmonth;
			if (monthdiff < 0) {
				System.out.println("Minors are not allowed to file taxes");
				System.exit(0);
			}
			if (monthdiff == 0) {
				int daydiff = 15 - dobday;
				if (daydiff < 0) {
					System.out.println("Minors are not allowed to file taxes");
					System.exit(0);
				}
				if(daydiff == 0) {
					System.out.println("Happy Birthday! As a warm gift from the U.S. Government, you can now pay taxes! Welcome to the real world.");				}
			}
		}

		System.out.println("Select which applies to you: ");
		System.out.println("1) Head of Household");
		System.out.println("2) Single Filer");
		System.out.println("3) Married filing jointly");
		System.out.println("4) Married filing seperately");
		System.out.println("Input an integer 1-4:");
		int status = kbReader.nextInt();
		
		System.out.println("Gross income this fiscal year:");
		int income = kbReader.nextInt();
		
		int oneborder1 = 9875;
		int oneborder2 = 40125;
		int oneborder3 = 85525;
		int oneborder4 = 163300;
		int oneborder5= 207350;
		int oneborder6 = 518400;
		
		int twoborder1 = oneborder1*2;
		int twoborder2 = oneborder2*2;
		int twoborder3 = oneborder3*2;
		int twoborder4 = oneborder4*2;
		int twoborder5 = oneborder5*2;
		int twoborder6 = oneborder6*2;
		
		int threeborder1 = 14100;
		int threeborder2 = 53700;
		int threeborder3 = 85500;
		int threeborder4 = 163300;
		int threeborder5 = 207350;
		int threeborder6 = 518400;
		
		double taxespaid = 0;
		double diff = 0.0;
		
		if (status == 1) {
			if (income<threeborder1) {
				 taxespaid = income * 0.10;
			}
			if (income>threeborder1&&income<threeborder2) {
				 taxespaid = (threeborder1 * 0.10) + ((income-threeborder1)*0.12);
				 
			}
			if (income>threeborder2&&income<threeborder3) {
				taxespaid = (threeborder1 * 0.10) + ((threeborder1-threeborder1)*0.12) + ((income-threeborder2)*0.22);
			}
			if (income>threeborder3&&income<threeborder4) {
				taxespaid = (threeborder1 * 0.10) + ((threeborder2-threeborder1)*0.12) + ((threeborder3-threeborder2)*0.22) + ((income-threeborder3)*0.24);
			}
			if (income>threeborder4&&income<threeborder5) {
				taxespaid = (threeborder1 * 0.10) + ((threeborder2-threeborder1)*0.12) + ((threeborder3-threeborder2)*0.22) + ((threeborder4-threeborder3)*0.24) + ((income-threeborder4)*0.32);
			}
			if (income>threeborder5&&income<threeborder6) {
				taxespaid = (threeborder1 * 0.10) + ((threeborder2-threeborder1)*0.12) + ((threeborder3-threeborder2)*0.22) + ((threeborder4-threeborder3)*0.24) + ((threeborder5-threeborder4)*0.32) + ((income-threeborder5)*0.35);
			}
			if (income>threeborder6) {
				taxespaid = (threeborder1 * 0.10) + ((threeborder2-threeborder1)*0.12) + ((threeborder3-threeborder2)*0.22) + ((threeborder4-threeborder3)*0.24) + ((threeborder5-threeborder4)*0.32) + ((threeborder6-threeborder5)*0.35) + ((income-threeborder6)*0.37);
			}
			
		}
		if (status == 2) {
			if (income<oneborder1) {
				 taxespaid = income * 0.10;
			}
			if (income>oneborder1&&income<oneborder2) {
				 taxespaid = (oneborder1 * 0.10) + ((income-oneborder1)*0.12);
				 
			}
			if (income>oneborder2&&income<oneborder3) {
				taxespaid = (oneborder1 * 0.10) + ((oneborder1-oneborder1)*0.12) + ((income-oneborder2)*0.22);
			}
			if (income>oneborder3&&income<oneborder4) {
				taxespaid = (oneborder1 * 0.10) + ((oneborder2-oneborder1)*0.12) + ((oneborder3-oneborder2)*0.22) + ((income-oneborder3)*0.24);
			}
			if (income>oneborder4&&income<oneborder5) {
				taxespaid = (oneborder1 * 0.10) + ((oneborder2-oneborder1)*0.12) + ((oneborder3-oneborder2)*0.22) + ((oneborder4-oneborder3)*0.24) + ((income-oneborder4)*0.32);
			}
			if (income>oneborder5&&income<oneborder6) {
				taxespaid = (oneborder1 * 0.10) + ((oneborder2-oneborder1)*0.12) + ((oneborder3-oneborder2)*0.22) + ((oneborder4-oneborder3)*0.24) + ((oneborder5-oneborder4)*0.32) + ((income-oneborder5)*0.35);
			}
			if (income>oneborder6) {
				taxespaid = (oneborder1 * 0.10) + ((oneborder2-oneborder1)*0.12) + ((oneborder3-oneborder2)*0.22) + ((oneborder4-oneborder3)*0.24) + ((oneborder5-oneborder4)*0.32) + ((oneborder6-oneborder5)*0.35) + ((income-oneborder6)*0.37);
			}
			
		}
		if (status == 4) {
			if (income<oneborder1) {
				 taxespaid = income * 0.10;
			}
			if (income>oneborder1&&income<oneborder2) {
				 taxespaid = (oneborder1 * 0.10) + ((income-oneborder1)*0.12);
				 
			}
			if (income>oneborder2&&income<oneborder3) {
				taxespaid = (oneborder1 * 0.10) + ((oneborder1-oneborder1)*0.12) + ((income-oneborder2)*0.22);
			}
			if (income>oneborder3&&income<oneborder4) {
				taxespaid = (oneborder1 * 0.10) + ((oneborder2-oneborder1)*0.12) + ((oneborder3-oneborder2)*0.22) + ((income-oneborder3)*0.24);
			}
			if (income>oneborder4&&income<oneborder5) {
				taxespaid = (oneborder1 * 0.10) + ((oneborder2-oneborder1)*0.12) + ((oneborder3-oneborder2)*0.22) + ((oneborder4-oneborder3)*0.24) + ((income-oneborder4)*0.32);
			}
			if (income>oneborder5&&income<oneborder6) {
				taxespaid = (oneborder1 * 0.10) + ((oneborder2-oneborder1)*0.12) + ((oneborder3-oneborder2)*0.22) + ((oneborder4-oneborder3)*0.24) + ((oneborder5-oneborder4)*0.32) + ((income-oneborder5)*0.35);
			}
			if (income>oneborder6) {
				taxespaid = (oneborder1 * 0.10) + ((oneborder2-oneborder1)*0.12) + ((oneborder3-oneborder2)*0.22) + ((oneborder4-oneborder3)*0.24) + ((oneborder5-oneborder4)*0.32) + ((oneborder6-oneborder5)*0.35) + ((income-oneborder6)*0.37);
			}
			
		}
		if (status == 3) {
			if (income<twoborder1) {
				 taxespaid = income * 0.10;
			}
			if (income>twoborder1&&income<twoborder2) {
				 taxespaid = (twoborder1 * 0.10) + ((income-twoborder1)*0.12);
				 
			}
			if (income>twoborder2&&income<twoborder3) {
				taxespaid = (twoborder1 * 0.10) + ((twoborder1-twoborder1)*0.12) + ((income-twoborder2)*0.22);
			}
			if (income>twoborder3&&income<twoborder4) {
				taxespaid = (twoborder1 * 0.10) + ((twoborder2-twoborder1)*0.12) + ((twoborder3-twoborder2)*0.22) + ((income-twoborder3)*0.24);
			}
			if (income>twoborder4&&income<twoborder5) {
				taxespaid = (twoborder1 * 0.10) + ((twoborder2-twoborder1)*0.12) + ((twoborder3-twoborder2)*0.22) + ((twoborder4-twoborder3)*0.24) + ((income-twoborder4)*0.32);
			}
			if (income>twoborder5&&income<twoborder6) {
				taxespaid = (twoborder1 * 0.10) + ((twoborder2-twoborder1)*0.12) + ((twoborder3-twoborder2)*0.22) + ((twoborder4-twoborder3)*0.24) + ((twoborder5-twoborder4)*0.32) + ((income-twoborder5)*0.35);
			}
			if (income>twoborder6) {
				taxespaid = (twoborder1 * 0.10) + ((twoborder2-twoborder1)*0.12) + ((twoborder3-twoborder2)*0.22) + ((twoborder4-twoborder3)*0.24) + ((twoborder5-twoborder4)*0.32) + ((twoborder6-twoborder5)*0.35) + ((income-twoborder6)*0.37);
			}
			
		}
		System.out.println("Taxes Paid: $" + taxespaid);
		System.out.println("Net Income: $" + (income-taxespaid));
		System.exit(0);
	}

}

