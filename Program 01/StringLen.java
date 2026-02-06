// write the java program to calculate the length of a string and print
// individual character of this string
// and count vowels in this string
// and count every vowel in this string 
import java.util.Scanner;

public class StringLen {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		int length = input.length();
		System.out.println("Length: " + length);

		System.out.println("Characters:");
		for (int i = 0; i < length; i++) {
			System.out.println(input.charAt(i));
		}

		int vowelCount = 0;
		for (int i = 0; i < length; i++) {
			char ch = Character.toLowerCase(input.charAt(i));
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
			}
		}

		System.out.println("Vowel count: " + vowelCount);

		scanner.close();
	}
}
