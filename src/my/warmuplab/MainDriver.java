package my.warmuplab;

import java.util.*;

public class MainDriver {

    public static void main(String[] args) {
        MainDriver driver = new MainDriver();

        //test code goes here...
    }

    /**
     * Checks if strings {@code s1} and {@code s2} are equal in terms of their
     * content; throws an {@link InputMismatchException} if they aren't.
     *
     * @param s1 The first string to test
     * @param s2 The second string to test
     * @throws InputMismatchException if the strings differ in any way
     */
    public static void testEquals(String s1, String s2) {
        if (!s1.equals(s2)) {
            throw new InputMismatchException("failed " + s1 + " != " + s2);
        }
    }

    /**
     * Problem 1 (warm up):
     * Write a method that returns {@code true} <strong>iff</strong> the
     * provided string {@code s} is a palindrome. Feel free to do it either
     * iteratively or recursively. You can be as clever as you like in your
     * solution.
     * <p>
     * Recall that a palindrome is a string the reads the same left to right
     * and right to left, for example:
     * <pre>
     *     isPalindrome("madam") = true
     *     isPalindrome("racecar") = true
     *     isPalindrome("aa") = true
     *     forall String s, if s.length() = 1 then isPalindrome(s);
     * </pre>
     *
     * @param s The string we're testing is a palindrome or not.
     * @return {@code true} <strong>iff</strong> {@code s} is a palindrome
     */
    public boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n/2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;

            }
        }

        return true;
    }

    /**
     * Question 2:
     * Write a method that takes a list of strings and returns a new list where
     * the first letter of each string been lower-cased. Empty strings ("") are
     * not allowed in the input -- so you may assume they are not present.
     * <p>
     * Hint: for a library method that handles lower casing a primitive char,
     * see {@link Character#toLowerCase(char)}.
     *
     * @return a list containing strings all beginning with lower case
     *          characters.
     */
    public static Set<String> replace(List<String> strings) {
        Set<String> set = new HashSet<>();
        for (String s: strings)
            set.add(s.toLowerCase());
        return set;
    }

    /**
     * Question 3:
     * Write a method {@code add5} adds the number 5 to every integer contained
     * in the input list {@code ints} and returns a new list containing the
     * updated integer values.
     *
     * @param ints   the input integer list
     * @return a new list with 5 added to every integer in {@code ints}.
     */
    public List<Integer> add5(List<Integer> ints) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : ints) {
            result.add(i + 5);

        }
        return result;

    }

    /**
     * Question 4:
     * Write a method {@code convertToBools} that takes a list of integers and
     * returns a new list of booleans indicating {@code true} if the number at
     * list index i is positive (or zero); {@code false} otherwise.
     * <p>
     * For example:
     * <pre>
     *     convertToBools([1, -5, 6, 0, -42, 1, 3]) ==
     *                  [true, false, true, true, false, true, true]
     * </pre>
     *
     * @param ints   the input list of integers
     * @return a list of booleans converted based on the contents of the
     *         {@code ints} list
     */


    /**
     * Question 5:
     * Now write a method {@code app} that generalizes the logic for your
     * implementation of questions 2, 3, and 4.
     * <p>
     * Your general method should:
     * 1. be parameterized by generics {@code T} and {@code R}
     * 2. take a list of {@code T}
     * 3. take a function that accepts an element of type {@code T} and
     *    produces an element of type {@code R} (note that it may be the case
     *    that typeOf(T) = typeOf(R) though this is not guaranteed).
     * @return A list of {@code R}
     */
    public <T, R> List<R> app(List<T> l, Funtion<T, R> f){
        List<R> result = new ArrayList<>();
        for (T t : l) {

        }
        return result;
    }

    /**
     * Question 5:
     * Now in {@link #main(String[])}, call your versions of questions 2,
     * 3, and 4 on sample inputs and record the output as a string.
     * <p>
     * Now, try to achieve the same result using just the {@code app}
     * method from question 5. Use {@link MainDriver#testEquals(String, String)}
     * to ensure the results of your sample runs match. Here's a sample:
     * <pre>
     *   List<String> strs = List.of("Tom", "Jerry", "joe", "Mr T", "T");
     *   String question2Result = driver.lowerCase(strs).toString();
     *   String app2Result = driver.app( ??? ).toString();
     *   MainDriver.testEquals(question2Result, app2Result);
     *
     *   String question3Result = ...
     *   String app3Result = ...
     *   MainDriver.testEquals(question3Result, app3Result);
     *
     *   String question4Result = ...
     *   String app4Result = ...
     *   MainDriver.testEquals(question4Result, app4Result);
     * </pre>
     */

    /**
     * Question 6:
     * Write a method that returns {@code true} <strong>iff</strong> the input
     * list {@code l} is ordered w.r.t. a given comparator<T>; {@code false}
     * otherwise. Don't use any library methods for this one. The method should
     * run in linear time (i.e.: O(n)).
     * <p>
     * The method should be parameterized by a generic {@code T} and should
     * accept a list of {@code T} and a {@link java.util.Comparator} of
     * {@code T} objects. Take a moment to review the documentation of
     *                          {@link Comparator#compare(Object, Object)}.
     * <p>
     * Write three tests for this method on lists of various sizes. Take care to
     * cover the boundary cases. You can use plain old integers for testing
     * this; though you could, the way this is written, sort arbitrary
     * objects based on their fields via the comparator passed.
     *
     * Hint: using an {@link Iterator <T>} might be a good way of going about
     *       this. You can retrieve {@code l}s iterator via
     *       {@link List#iterator()}.
     */
    // method goes here

    /**
     * <strong>OPTIONAL CHALLENGE PROBLEM</strong> (Totally optional -- though
     * you'll receive 2pts of extra credit on your lowest quiz grade if you can
     * solve it -- where "solving" means passing 14 of my test cases).
     * <p>
     * This is an example of a harder question that could conceivably crop up
     * in job interviews, etc.
     * <p>
     * Given an unordered array of ints (both positive and negative), write
     * an algorithm that finds a consecutive series of integers within
     * {@code a} that, when summed, is higher than any other consecutive
     * sequence in {@code a}. Here are some sample runs:
     * <pre>
     *   mss(new int[]{2, 3,-1, 10, -20, 7}) should return 14
     *   mss(new int[]{-4, 3, -3, 4, 3, -5}) should return 7
     *   mss(new int[]{})                    should return 0
     *   mss(new int[]{3, -4})               should return 3
     * </pre>
     */
    public int mss(int[] a) {
        throw new UnsupportedOperationException("not yet implemented");
    }

}