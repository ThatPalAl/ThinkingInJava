package collections.examples.e11;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for(String s : "Mój pies ma pchły".split(" ")){
            stack.push(s);
        }
        while(!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
