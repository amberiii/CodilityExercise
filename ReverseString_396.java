package String2;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class ReverseString_396 {
    /*
    Reverse a given string
    ip: abc
    op: cba
     */
    ///////////////////////////////////
    // Method 1: iteratively reverse //
    ///////////////////////////////////
    // Time: O(n)
    // Space: O(1)
    public static String reverseString_iter(String input){
        System.out.println("string:" + input);
        if(input == null || input.length() <= 1){
            return input;
        }
        char[] array = input.toCharArray();
        for (int left = 0, right = array.length - 1; left < right;){
            swap(array, left, right);
            left++;
            right--;
        }
        return new String(array);
    }
    private static void swap(char[] array, int a, int b){
        char tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
    ///////////////////////////////////
    // Method 2: recursively reverse //
    ///////////////////////////////////
    public static String reverseString_recur(String input){
        if (input == null || input.length() <= 1){
            return input;
        }
        char[] array = input.toCharArray();
        reverseHelper(array, 0, array.length - 1);
        return new String(array);
    }
    private static void reverseHelper(char[] array, int left, int right){
        if (left >= right){
            return;
        }
        swap(array,left, right);
        reverseHelper(array, left + 1, right - 1);
    }

    ///////////////////////////////////
    ////////// Main Function///////////
    ///////////////////////////////////
    public static void main(String[] args){
        String input = "apple";
        // Method 1
        String result_1 = reverseString_iter(input);
        // Method 2
        //String result_2 = reverseString_recur(input);
        System.out.println("iter: " + result_1);
        //System.out.println("recursive: " + result_2);
    }
}
