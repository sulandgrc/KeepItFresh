package listproblems;

import java.util.*;

/**
 * This class tests removing a specified string from an ArrayList and times
 * various approaches
 */
public class ArrayListRemove {

    public static void main(String[] args) {

        ArrayList<String> bases =
                new ArrayList<>(Arrays.asList("binary", "hex", "decimal", "binary", "binary", "hex", "binary"));

        removeAllString(bases, "binary");
        System.out.println("Expected: [hex, decimal, hex] --->   " + bases);
    }

    /**
     * Removes all occurrences of the given string from the given list.
     *
     * @param list   list of strings
     * @param remove string to remove
     */
    public static void removeAllString(ArrayList<String> list, String remove) {
        long start = System.nanoTime();

        //Option 1 use removeAll method
        ArrayList<String> toRemove = new ArrayList<>();
         toRemove.add(remove);
         list.removeAll(toRemove);
        list.removeAll(Collections.singleton(remove));


        // Option 2 use the remove method from iterator
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            // if the next element equals the string to remove
            if (it.next().equals(remove)) {
                it.remove();
            }
        }

        // Option 3 use a for index loop
        for (int index = list.size() - 1; index >= 0; index--) {
            if (list.get(index).equals(remove)) {
                list.remove(index);
            }
        }

        // No can do - ConcurrentModification Exception
//        for(String s : list){
//            if(s.equals(remove)){
//                list.remove(s);
//            }
//        }

        // Which option seems fastest?
        System.out.println("Elapsed Time: " + (System.nanoTime() - start) + " nanoseconds");
    }

}
