package collections.c11;

import java.util.Stack;

public class Improved {
    public static void main(String[] args) {
        String expression = "+B+a+l---+a+g+a--+n-+n-+w-+l+i+i+t-+g-+g-+e-+r+k-+e+r-+a+c+h---";
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '+') {
                stack.push(expression.charAt(++ch));
            } else if (ch == '-') {
                System.out.print(stack.pop());
            }
        }
    }
}
