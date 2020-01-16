import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

//        Variables
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        String str = "abc";

        String[] arr1 = { "a", "b", "c" };
        String[] arr2 = { "d", "e", "f" };

        ArrayList<String> strArr = new ArrayList<String>();
        strArr.add("quick");
        strArr.add("brown");
        strArr.add("fox");

        String[][] nestedArr = { { "2014", "Horse" }, { "2015", "Sheep" } };

//        doubleNumbers
//        System.out.println(doubleNumbers(nums));

//        multiplyNumbers
//        System.out.println(multiplyNumbers(nums,0));
//        System.out.println(multiplyNumbers(nums, 5));

//        doubleLetters
//        System.out.println(doubleLetters(str));

//        interleave
//        System.out.println(interleave(arr1, arr2));

//        createRange
//        System.out.println(createRange(4, "Hello"));

//        flipArray
//        System.out.println(flipArray(strArr));

//        arraysToObject
//        System.out.println(arraysToObject(nestedArr));

//        reverseString
//        System.out.println(reverseString(str));

//        repeats
//        System.out.println(repeats("haha"));
//        System.out.println(repeats("yay"));
//        System.out.println(repeats("heehaw"));

//        everyOther
        System.out.println(everyOther("abcdef"));

    }

    public static ArrayList<Integer> doubleNumbers (ArrayList<Integer> arr) {

        ArrayList<Integer> acc = new ArrayList<Integer>();

        for (int i = 0; i < arr.size(); i++) {
            acc.add(arr.get(i) * 2);
        }
        return acc;
    }

    public static ArrayList<Integer> multiplyNumbers (ArrayList<Integer> arr, int multiplier) {

        ArrayList<Integer> acc = new ArrayList<Integer>();

        for (int i = 0; i < arr.size(); i++) {
            acc.add(arr.get(i) * multiplier);
        }
        return acc;
    }

    public static String doubleLetters (String str) {

        String acc = "";

        for (int i = 0; i < str.length(); i++) {
            acc += str.charAt(i);
            acc += str.charAt(i);
        }
        return acc;
    }

    public static ArrayList<String> interleave (String[] arr1, String[] arr2) {

        ArrayList<String> acc = new ArrayList<String>();

        for (int i = 0; i < arr1.length; i++) {
            acc.add(arr1[i]);
            acc.add(arr2[i]);
        }
        return acc;
    }

    public static ArrayList<String> createRange (Integer num, String value) {

        ArrayList<String> acc = new ArrayList<String>();

        for (int i = 0; i < num; i++) {
            acc.add(value);
        }
        return acc;
    }

    public static HashMap<String, Integer> flipArray (ArrayList<String> arr) {

        HashMap<String, Integer> acc = new HashMap<>();

        for (int i = 0; i < arr.size(); i++) {
            acc.put(arr.get(i), i);
        }
        return acc;
    }

    public static HashMap<Integer, String> arraysToObject (String[][] arr) {

        HashMap<Integer, String> acc = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            acc.put(Integer.parseInt(arr[i][0]), arr[i][1]);
        }
        return acc;
    }

    public static String reverseString (String str) {

        String acc = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            acc += str.charAt(i);
        }
        return acc;
    }

    public static Boolean repeats (String str) {

        String str1 = "";
        String str2 = "";
        Boolean res;

        for (int i = 0; i < str.length() / 2; i++) {
            str1 += str.charAt(i);
        }
        for (int i = str.length() / 2; i < str.length(); i++) {
            str2 += str.charAt(i);
        }

        if (str.length() % 2 != 0)
            res = false;
        else if (!str1.equals(str2))
            res = false;
        else
            res = true;

        return res;
    }

    public static String everyOther (String str) {

        String acc = "";

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0)
                acc += str.charAt(i);
        }
        return acc;
    }
}
