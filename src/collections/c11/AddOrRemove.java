package collections.c11;


import java.util.*;

public class AddOrRemove {
    public static void main(String[] args) {
        Stack<Character> letters = new Stack<>();
        String sentence = "+B+a+l---+a+g+a--+n-+n-+w-+l+i+i+t-+g-+g-+e-+r+k-+e+r-+a+c+h---";
        char[] tmp_arr = sentence.toCharArray();
        ArrayList<Character> chars = new ArrayList<>();
        for(Character c : tmp_arr){
            chars.add(c);
        }
        System.out.println(chars);
        for(int i = 0; i < tmp_arr.length; i++){
            if(tmp_arr[i] == '+'){
                letters.push(tmp_arr[i + 1]);
            }
            else if(tmp_arr[i] == '-') {
                if(tmp_arr[i + 1] == '-') {
                    while (i < tmp_arr.length - 1 && tmp_arr[i + 1] == '-') {
                        letters.pop();
                        i++;
                    }
                }
                else {
                    letters.pop();
                }
            }

        }
        System.out.println(letters);
    }
}
