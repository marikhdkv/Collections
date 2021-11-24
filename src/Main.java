import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        // Задание №1
        System.out.println("-------------------------------");
        System.out.println("Задание №1");

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.print("Stack: ");
        for (int elem : stack)
            System.out.print(elem + " ");

        System.out.println("\nPosition of element 3 in stack: " + stack.search(3));
        System.out.println("Capacity of stack: " + stack.capacity());
        stack.pop();
        System.out.print("Stack: ");
        for (int elem : stack)
            System.out.print(elem + " ");

        if (stack.empty())
            System.out.println("\nStack is empty");
        else
            System.out.println("\nStack is not empty");

        System.out.println("Top element of stack: " + stack.peek());

        // Задание №2
        System.out.println("-------------------------------");
        System.out.println("Задание №2");

        Queue<String> queue = new PriorityQueue<>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        System.out.print("Queue: ");
        for (String elem : queue)
            System.out.print(elem + " ");

        System.out.println("\nSize of queue: " + queue.size());

        queue.poll();
        System.out.print("Queue: ");
        for (String elem : queue)
            System.out.print(elem + " ");

        System.out.println("\nTop element of queue: " + queue.peek());


        // Задание №3
        System.out.println("-------------------------------");
        System.out.println("Задание №3");

        Deque<Double> deque = new ArrayDeque<>();
        deque.offer(1.1);
        deque.offer(1.2);
        deque.offer(1.3);
        System.out.print("Deque: ");
        for (double elem : deque)
            System.out.print(elem + " ");

        deque.addFirst(2.1);
        deque.addFirst(2.2);
        deque.addLast(3.1);
        deque.addLast(3.2);

        System.out.print("\nDeque: ");
        for (double elem : deque)
            System.out.print(elem + " ");

        System.out.println("\nSize of deque: " + deque.size());
        System.out.println("First element of deque: " + deque.peek());
        System.out.println("Last element of deque: " + deque.getLast());

        // Задание №4
        System.out.println("-------------------------------");
        System.out.println("Задание №4");

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(5.5);
        doubleList.add(3.4);
        doubleList.add(-7.7);
        System.out.print("DoubleList: ");
        for (double elem : doubleList)
            System.out.print(elem + " ");

        doubleList.remove(0);

        System.out.print("\nDoubleList: ");
        for (double elem : doubleList)
            System.out.print(elem + " ");

        System.out.println("\nSize of deque: " + doubleList.size());
        doubleList.add(0, 4.5);
        doubleList.add(0, 5.1);

        System.out.print("\nDoubleList: ");
        for (double elem : doubleList)
            System.out.print(elem + " ");

        // Задание №5
        System.out.println("-------------------------------");
        System.out.println("Задание №5");

        Stack<Integer> integerStack = new Stack<>();
        System.out.println("List of commands:" +
                "\npush (-pu) : pushing element" +
                "\npop (-po) : popping element" +
                "\nsize (-s) : getting size of stack" +
                "\npeek (-pe) : peeking of top element" +
                "\nprint (-pr) : printing elements" +
                "\nexit (-ex) : exit from program");
        while (true)
        {
            System.out.print("Enter the command: ");
            String input = new Scanner(System.in).nextLine();

            if (input.equals("exit") || input.equals("-ex"))
                break;

            switch (input)
            {
                case "push":
                case "-pu":
                    System.out.print("Enter element: ");
                    input = new Scanner(System.in).nextLine();
                    integerStack.push(Integer.parseInt(input));
                    break;
                case "pop":
                case "-po":
                    integerStack.pop();
                    break;
                case "size":
                case "-s":
                    System.out.println("Size: " + integerStack.size());
                    break;
                case "peek":
                case "-pe":
                    System.out.println("Top element: " + integerStack.peek());
                    break;
                case "print":
                case "-pr":
                    for (int elem : integerStack)
                        System.out.print(elem + " ");
                    System.out.println();
                    break;
                default:
                    System.out.println("Error input");
            }
        }
    }
}