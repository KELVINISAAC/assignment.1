package project.one;
import java.util.Stack;
public class Main {

    public static void main(String[] args) {

                Stack<String> group7 = new Stack<>();

                // This pushes new items to the Stack
                group7.push("andrew");
                group7.push("kelvin");
                group7.push("vero");
                group7.push("Said");
                group7.push("glady");

                System.out.println("Stack => " + group7);
                System.out.println();

                // This Pops items from the Stack
                String nameAtTop = group7.pop();  // Throws EmptyStackException if the stack is empty
                System.out.println("Stack.pop() => " + nameAtTop);
                System.out.println("Current Stack => " + group7);
                System.out.println();

                // This gets the item at the top of the stack without removing it
                nameAtTop = group7.peek();
                System.out.println("Stack.peek() => " + nameAtTop);
                System.out.println("Current Stack => " + group7);

            }


        }




