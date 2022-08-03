package com.bip;

import java.util.Scanner;

/**
 * This class is responsible to print the word version of the number.
 * 
 * @author Shilpashree
 *
 */
public class ConvertToWord {
	public static void main(String[] args) {
		System.out.println("Enter A no."); // sysout
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		String numberValue = "";
		while (no != 0) {
			if (no >= 1 && no <= 19) {
				numberValue = numberValue + " " + oneTo19(no);
				break;
			} else if (no >= 20 && no <= 99) {
				int prefix = no / 10;
				numberValue = numberValue + " " + twentyTo99(prefix);
				int rem = no % 10;
				no = rem;

			} else if (no >= 100 && no <= 999) {
				int prefixValue = no / 100;
				numberValue = numberValue + " " + oneTo19(prefixValue) + " hundred";
				int rem = no % 100;
				no = rem;

			} else if (no >= 1000 && no <= 99999) {
				int prefixValue = no / 1000;
				numberValue = numberValue + " " + oneTo19(prefixValue) + " thousand";
				int rem = no % 1000;
				no = rem;
				
			}else if (no >= 10000 && no <= 999999) {
				int prefixValue = no / 10000;
				numberValue = numberValue + " " + oneTo19(prefixValue) + " lakh ";
				int rem = no % 10000;
				no = rem;
				
			}else if (no >= 100000 && no <= 9999999) {
				int prefixValue = no / 100000;
				numberValue = numberValue + " " + oneTo19(prefixValue) + " crore ";
				int rem = no % 100000;
				no = rem;
			}
				
		}
		System.out.println(numberValue);
	}
	public static String oneTo19(int no) {

		switch (no) {
		case 1: {
			return "ONE";
		}
		case 2: {
			return "TWO";
		}
		case 3: {
			return "Three";
		}
		case 4: {
			return "Four";
		}
		case 5: {
			return "Five";
		}
		case 6: {
			return "Six";
		}
		case 7: {
			return "Seven";
		}
		case 8: {
			return "Eight";
		}
		case 9: {
			return "Nine";
		}
		case 10: {
			return "Ten";
		}
		case 11: {
			return "Eleven";
		}
		case 12: {
			return "Twelev";
		}
		case 13: {
			return "Thirteen";
		}
		case 14: {
			return "Fourteen";
		}
		case 15: {
			return "Fifteen";
		}
		case 16: {
			return "Sixteen";
		}
		case 17: {
			return "Seventeen";
		}
		case 18: {
			return "Eighteen";
		}
		case 19: {
			return "Nineteen";
		}
		}
		return "";
	}

	public static String twentyTo99(int no) {
		switch (no) {
		case 2: {
			return "Twenty";
		}
		case 3: {
			return "Thirty";
		}
		case 4: {
			return "Fourty";
		}
		case 5: {
			return "Fifty";
		}
		case 6: {
			return "Sixty";
		}
		case 7: {
			return "seventy";
		}
		case 8: {
			return "Eighty";
		}
		case 9: {
			return "Ninety";
		}
		}
		return "";
	}
}
