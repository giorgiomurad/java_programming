import java.util.Collections;
import java.util.Random;

public class Collections {

    // Private constructor so that no references would be created, and all the methods would be called by the object's name
    private Collections() {}


    // Sorts the specified list
    public static void sort(List list) {}

    // Sorts the specified list with the given comparator
    public static void sort(List list, Comparator c) {}

    // Searches the key in the sorted list using binary search
    public static int binarySearch(List list, Object key) {}

    // Searches the key in the sorted list using binary search with a given comparator
    public static int binarySearch(List list, Object key, Comparator c) {}

    // Reverses the specified list
    public static void reverse(List list) {}

    // Returns a comparator with the reverse ordering
    public static Comparator reverseOrder() {}

    // Shuffles the specified list randomly
    public static void shuffle(List list) {}

    // Shuffles the specified list with a random object
    public static void shuffle(List list, Random rmd) {}

    // Copies from the source list onto the destination list
    public static void copy(List des, List src) {}

    // Resturns a list consisting of 'n' copies of a given object
    public static List nCopies(int n, Object obj) {}

    // Fills the list list with the given object
    public static fill(List list, Object obj) {}

    // Returns the maximum object in the collection
    public static Object max(Collection c) {}

    // Returns the maximum object using the comparator
    public static Object max(Collection c, Comparator comp) {}

    // Returns the minimum object in the collection
    public static Object min(Collection c) {}

    // Returns the minimum object using the comparator
    public static Object min(Collection c, Comparator comp) {}

    // Returns true if c1 and c2 have no element in common
    public static boolean disjoint(Collection c1, Collection c2) {}

    // Returns the number of occurances of the specified element in the collection
    public static void frequency(Collection c, Object o) {}
}