package String2;

public class ReverseWordsInSentence_84 {
    /*
    ip: i love yahoo
    op: yahoo love i
    【try to solve it in place】
     */
    /*
    Assumptions:
     */
    public static String reverseWords(String input){
        char[] array = input.toCharArray();
        // 1. reverse the whole char array
        reverse(array, 0, array.length - 1);
        int start = 0;
        System.out.println(new String(array));
        // 2. reverse each of the words
        for (int i = 0; i < array.length; i++){
            // the start index of a word
            if (array[i] != ' ' && ( i == 0 || array[i - 1] == ' ')){
                start = i;
            }
            // the end index of a word
            if (array[i] != ' ' && (i == array.length - 1 || array[i + 1] == ' ')){
                reverse(array, start, i);
            }
        }
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
    public static void main(String[] args){
        String input = "I love Yahoo";
        String result = reverseWords(input);
        System.out.println("final result is: " + result);


    }
}
