package LRU;

public class Pattern {
	public static void main(String[] args) {  int rows = 5; // Adjust this value based on the desired number of rows

    for (int i = 0; i < rows; i++) {
        // Print spaces before asterisks
        for (int j = 0; j < rows-i-1; j++) {
            System.out.print(" ");
        }

        // Print asterisks
        for (int k = 0; k < rows - i; k++) {
            System.out.print("* ");
        }

        // Move to the next line
        System.out.println();}
}}
