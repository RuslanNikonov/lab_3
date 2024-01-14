
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        // Добавляем элементы в первый стек
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);

        // Добавляем элементы во второй стек
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);

        System.out.println("Первый стек до обмена: " + stack1);
        System.out.println("Второй стек до обмена: " + stack2);

        // Обмениваем информацию между стеками
        Stack<Integer> tempStack = new Stack<>();
        while (!stack1.isEmpty()) {
            tempStack.push(stack1.pop());
        }
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        while (!tempStack.isEmpty()) {
            stack2.push(tempStack.pop());
        }

        System.out.println("Первый стек после обмена: " + stack1);
        System.out.println("Второй стек после обмена: " + stack2);
    }
}