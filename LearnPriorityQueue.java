import java.util.*;
public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> priority = new PriorityQueue<>();
        priority.offer(56);
        priority.offer(11);
        priority.offer(34);
        priority.offer(98);
        priority.offer(89);
        System.out.println(priority);
        System.out.println(priority.peek());
    }
}
