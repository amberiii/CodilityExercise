/*Brackets
Task description
A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:

S is empty;
S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
S has the form "VW" where V and W are properly nested strings.
For example, the string "{[()()]}" is properly nested but "([)()]" is not.

Write a function:

class Solution { public int solution(String S); }

that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.

For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..200,000];
string S consists only of the following characters: "(", "{", "[", "]", "}" and/or ")".
Copyright 2009–2021 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.



*/
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.Stack;
class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        Stack<Character> stack = new Stack<Character>();
        // corner case
        if (S == null){
            return 0;
        }else if(S.isEmpty()){
            return 1;
        }

        for(char C : S.toCharArray()){
            switch(C){
            case ')':
                pops(stack, '(');
                break;
            case '}':
                pops(stack, '{');
                break;
            case ']':
                pops(stack, '[');
                break;
               
            default:
                stack.push(C);
                break;

            }
        }
        return stack.isEmpty() ? 1 : 0;

    }
    private void pops(Stack<Character> s, Character C){
        while(!s.isEmpty() && s.peek() != C){
            s.pop();    
        }
        if(!s.isEmpty()){
            s.pop();
        }else{
            s.push(C);
        }
    }

}