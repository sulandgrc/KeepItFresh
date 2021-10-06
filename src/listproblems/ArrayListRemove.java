package listproblems;

import java.util.*;


/**
 * This class tests removing a specified string from an ArrayList and times
 * various approaches
 */
public class ArrayListRemove {

    public static void main(String[] args) {

        ArrayList<String> bases =
                new ArrayList(Arrays.asList(new String[] {"binary", "hex", "decimal", "binary", "binary","hex","binary"}));

        removeAllString(bases,"binary");
        System.out.println("Expected: [hex, decimal, hex] --->   " + bases);
    }

    /**
     * Removes all occurrences of the given string from the given list.
     *
     * @param list list of strings
     * @param remove string to remove
     */
    public static void removeAllString(ArrayList<String> list, String remove){
        long start = System.nanoTime();

        // Option 1 use removeAll method


        // Option 2 use the remove method from iterator


        // Option 3 use a for index loop


        // Which option seems fastest?
        System.out.println("Elapsed Time: " + (System.nanoTime() - start) + " nanoseconds");
    }

}
