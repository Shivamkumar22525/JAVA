import java.util.*;
public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(11);
        queue.offer(12);
        queue.offer(13);
        queue.offer(14);
        queue.offer(15);
        System.out.println(queue);

        queue.poll();
        System.out.println(queue);

    }
}
