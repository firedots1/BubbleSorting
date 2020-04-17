import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class dictionaryWord {
    public static void main(String args[]) {
        String temp; // String for temp
        int n; // int for n 
        Scanner input = new Scanner(System.in); // import of scanner 
        System.out.println("How many Numbers of Words?: ");  // Prompts user for input of # of words.
        int numberOfWords = input.nextInt();
        String[] NameArray = new String[numberOfWords]; // declare the array
            for (int i = 0; i < numberOfWords; i++)
            {
                System.out.println("enter the " + (i + 1) + " Word Here:"); // Words then goes here for filling into the array.
                NameArray[i] = input.next();
            }
            System.out.println("Original Order: "); 
            System.out.println(Arrays.toString(NameArray)); // prints out the list of names when words was input. 
            {
                for (int i = 0; i < numberOfWords; i++) {
                    for (int j = i + 1; j < numberOfWords; j++) 
                        if (NameArray[i].compareTo(NameArray[j]) > 0) {
                            temp = NameArray[i]; // Sorting begins here
                            NameArray[i] = NameArray[j];
                            NameArray[j] = temp;
                            {
                                System.out.println("Alphabetical Order: ");
                                System.out.println(Arrays.toString(NameArray)); // Prints it in Order from A - Z  
                            }
                        } // It is currently missing the Reversed Order // 
                }
            }
        }
    }
