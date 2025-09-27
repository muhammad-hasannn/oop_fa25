/*
    Write a java program that have this string “Hello! I am string in java. I have several function and I am very “Important ”# string_is_important” and split it
 */
package Tasks;

public class task01 {
    public static void main(String[] args) {
        String line = "Hello! I am string in java. I have several function and I am very “Important”. # string_is_important";

        System.out.println("Original String: " + line);

        System.out.println("-----Splitting Strings-----");

        System.out.println("Splitting at: " + line.substring(0, 6));
        System.out.println("After ! till Java: " + line.substring(7, 26) );
        System.out.println("After. till #: " + line.substring(28, 80));
        System.out.println("After @ till end: " + line.substring(81) );
    }
}
