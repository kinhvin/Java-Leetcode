/* Author: Kevin Truong
 * Date: June 4, 2024
 * Description: Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * Leetcode: #242
 */

import java.util.HashMap;


public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        // Step 1: Check that the 2 Strings have the same length
        if (s.length() != t.length()) {
            return false;
        } // end of if


        else {
            // Step 2: Count the occurrences of each character in each word
            HashMap<Character, Integer> countS = new HashMap<Character, Integer>();
            HashMap<Character, Integer> countT = new HashMap<Character, Integer>();

            // Able to use a single for loop
            // The length of s & t should be equal since we are past Step 1
            for (int i = 0; i < s.length(); i++) {

                // If the current char is not in the dictionary yet
                if (!countS.containsKey(s.charAt(i)) && !countT.containsKey(t.charAt(i))) {
                    // Add the current char with a value of 1
                    countS.put(s.charAt(i), 1);
                    countT.put(t.charAt(i), 1);
                } // end of if

                // The current char is in countS and not in countT
                else if (countS.containsKey(s.charAt(i)) && !countT.containsKey(t.charAt(i))) {
                    countS.put(s.charAt(i), 1 + countS.get(s.charAt(i)));
                    countT.put(t.charAt(i), 1);
                }

                // The current char is not in countS and is in countT
                else if (!countS.containsKey(s.charAt(i)) && countT.containsKey(t.charAt(i))) {
                    countS.put(s.charAt(i), 1);
                    countT.put(t.charAt(i), 1 + countT.get(t.charAt(i)));
                }

                // The current char is already in the dictionary of both
                else {
                    // Iterate the count
                    countS.put(s.charAt(i), 1 + countS.get(s.charAt(i)));
                    countT.put(t.charAt(i), 1 + countT.get(t.charAt(i)));
                } // end of else if
            } // end of for
            return countS.equals(countT);
        } // end of else
    } // end of method

    public static void main(String[] args) {

        ValidAnagram test = new ValidAnagram();
        System.out.println(test.isAnagram("aaaabb", "aabbbb"));

    } // end of main
} // end of class

//if (countS.containsKey(s.charAt(i)) && countT.containsKey(t.charAt(i)))

//            System.out.println(countS.keySet());
//            System.out.println(countT.keySet());
//            System.out.println(countS.values());
//            System.out.println(countT.values());
//            Set<Character> sChars = countS.keySet();
//            Set<Character> tChars = countT.keySet();
//            Collection<Integer> sVals = countS.values();
//            Collection<Integer> tVals = countT.values();
//            System.out.println(sChars.equals(tChars));
//            System.out.println(sVals.containsAll(tVals));

//return countS.keySet().equals(countT.keySet()) && countS.values().containsAll(countT.values());
//            System.out.println(countS);
//            System.out.println(countT);