////////////////////////////////////////////////////////////////////
// Malik Giafar Mohamed 2075543
// Alessandro Di Pasquale 2075544
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

/**
 * Main class for testing the Roman numeral converter and printer
 */
public class Main {
    
    /**
     * Main method to test the Roman numeral converter and printer
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Roman Numeral Converter and Printer");
        System.out.println("==================================\n");
        
        // Print first few numbers as example
        printRomanNumeral(1);
        printRomanNumeral(4);
        printRomanNumeral(5);
        printRomanNumeral(9);
        printRomanNumeral(10);
        printRomanNumeral(50);
        printRomanNumeral(100);
        printRomanNumeral(500);
        printRomanNumeral(1000);
        printRomanNumeral(961);
    }
    
    /**
     * Helper method to print a number, its Roman numeral representation,
     * and its ASCII art representation
     * 
     * @param number The number to convert and print
     */
    private static void printRomanNumeral(int number) {
        try {
            String roman = IntegerToRoman.convert(number);
            System.out.println("Number: " + number);
            System.out.println("Roman: " + roman);
            System.out.println("ASCII Art:");
            System.out.println(RomanPrinter.print(number));
            System.out.println();
        } catch (Exception e) {
            System.err.println("Error processing number " + number + ": " + e.getMessage());
        }
    }
}
