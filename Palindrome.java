

import java.util.LinkedList;
import java.util.Stack;

public class Palindrome {

    public static void main(String[] args) {
        String ourString = "Madam, in ,Eden, I’m Adam";

        Stack<Character> myStack = new Stack<>();
        LinkedList<Character> myQueue = new LinkedList<>();

        String ourStringNew = ourString.toLowerCase();
        ourStringNew = ourStringNew.replaceAll("\\W", "");
        System.out.println(ourStringNew);

        for (int i = 0; i < ourStringNew.length(); i++) {
            myQueue.add(ourStringNew.charAt(i));
            myStack.push(ourStringNew.charAt(i));
        }
        System.out.println(myQueue);
        System.out.println(myStack);

        for (int i = 0; i < myStack.size(); i++) {
            if (myQueue.peek() == myStack.peek()) {
                myQueue.pop();
                myStack.pop();
            } else {
                System.out.println("It's not a palindrome :(");
                break;
            }
            if (i == myStack.size()) {
                System.out.println("It is a palindrome");
            }
        }
    }
}
