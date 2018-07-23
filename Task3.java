import java.io.BufferedInputStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task3{

    public static void main(String[] args) {

        Boolean isBalanced = true;

        Deque<Character> stack = new ArrayDeque<>();

        String inputData = "";

        Scanner in = new Scanner(new BufferedInputStream(System.in));

        if (in.hasNextLine())
            inputData = in.nextLine();
        else
            System.out.println("Invalid input data");

        for (int i = 0; i < inputData.length(); i++) {
            if(stack.isEmpty())
                stack.addLast(inputData.charAt(i));
            else{
                Character peek = stack.getLast();
                Character next = inputData.charAt(i);
                Boolean isDeleted = false;
                switch (peek){
                    case '{':
                        if(next.equals(new Character('}'))) {
                            stack.removeLast();
                            isDeleted = true;
                        }
                        break;
                    case '[':
                        if(next.equals(new Character(']'))) {
                            stack.removeLast();
                            isDeleted = true;
                        }
                        break;
                    case '(':
                        if(next.equals(new Character(')'))) {
                            stack.removeLast();
                            isDeleted = true;
                        }
                        break;
                }
                if(isDeleted)
                    continue;
                else{
                    switch (next){
                        case '{':
                        case '[':
                        case '(':
                            stack.addLast(next);
                            break;
                        default:
                            isBalanced = false;
                            break;
                    }
                }
            }
        }

        if(isBalanced)
            System.out.println("Balanced");
        else
            System.out.println("Not balanced");
    }
}
