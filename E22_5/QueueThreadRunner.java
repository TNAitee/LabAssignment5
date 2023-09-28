package E22_5;


import java.util.Scanner;

public class QueueThreadRunner
{
    private static final int REPETITIONS = 100;

    public static void main(String[] args) {
        Queue<String> queue = new Queue<>(3);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number Producer/Consumer threads: ");
        int threadCount = in.nextInt();

        for ( int i = 0 ; i < threadCount ; i++)
        {
            ProducerThread producer = new ProducerThread(queue, REPETITIONS);
            ConsumerThread consumer = new ConsumerThread(queue, REPETITIONS);

            producer.start();
            consumer.start();
        }

        System.out.println("Empty: " + queue.isEmpty());

    }
}
