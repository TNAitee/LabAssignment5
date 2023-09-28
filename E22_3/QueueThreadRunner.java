package E22_3;

public class QueueThreadRunner
{
    private static final int REPETITIONS = 100;

    public static void main(String[] args) {
        Queue<String>queue = new Queue<>();

        ProducerThread producer = new ProducerThread(queue, REPETITIONS);
        ConsumerThread consumer = new ConsumerThread(queue, REPETITIONS);

        producer.start();
        consumer.start();
    }
}
