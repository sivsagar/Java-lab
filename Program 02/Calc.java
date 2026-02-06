// Write a java program to calculate number of words
// in a sentence

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Count words by splitting on whitespace
        String[] words = sentence.trim().split("\\s+");
        int wordCount = 0;

        // Only count if sentence is not empty
        if (sentence.trim().length() > 0) {
            wordCount = words.length;
        }

        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }
}
