import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class dictionaryWord {
    public static void main(String args[]) {
        String temp;
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("How many Numbers of Words?: ");
        int numberOfWords = input.nextInt();
        String[] NameArray = new String[numberOfWords];
            for (int i = 0; i < numberOfWords; i++)
            {
                System.out.println("enter the " + (i + 1) + " Word Here:");
                NameArray[i] = input.next();
            }
            System.out.println("Original Order: ");
            System.out.println(Arrays.toString(NameArray));
            {
                for (int i = 0; i < numberOfWords; i++) {
                    for (int j = i + 1; j < numberOfWords; j++)
                        if (NameArray[i].compareTo(NameArray[j]) > 0) {
                            temp = NameArray[i];
                            NameArray[i] = NameArray[j];
                            NameArray[j] = temp;
                            {
                                System.out.println("Alphabetical Order: ");
                                System.out.println(Arrays.toString(NameArray));
                            }
                        }
                }
            }
        }
    }
