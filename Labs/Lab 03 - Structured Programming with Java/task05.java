/*
    Write a Java program to replace each sub string of a given string that matches the given regular expression with the given replacement.
    Sample string : "this is the sample exercise of OOP basics." Replace OOP within ICT.
 */
package Tasks;

public class task05 {
    public static void main(String[] args) {
        String actual = new String("This is the the sample exercise of OOP basics.");
        String replaced = actual.replaceAll("OOP", "ICT");

        System.out.println("Original: " + actual);
        System.out.println("Replaced: " + replaced);
    }
}
