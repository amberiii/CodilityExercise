package String2;

public class RightShiftByNChar_397 {
    /*
     input:  abc 4, abc|defg 4
     output: cba,   defg|abc
     */
    // Assumption: input is not null, and n>=0
    public static String rightShift(String input, int n){
        if (input.length() <= 1){
            return input;
        }
        char[] array = input.toCharArray();
        System.out.println("n is:" + n);
        System.out.println("array.length is: "  + array.length);
        n %= array.length;

        System.out.println("n%array.length is: " + n);
        reverse(array, array.length - n, array.length - 1); // reverse(abcdefg, 3, 6)
        reverse(array, 0, array.length - n - 1);// reverse(abcgfed, 0, 2)
        reverse(array, 0, array.length - 1); // reverse(cbagfed, 0, 6)
        return new String(array);
    }
    private static void reverse(char[] array, int left, int right){
        while (left < right){
            char tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
    }
    public static void main (String[] args){
        String input = "abcdefg";
        int n = 4;
        String result = rightShift(input, n);
        System.out.println("input: " + input);
        System.out.println("output: " + result);

    }
}
