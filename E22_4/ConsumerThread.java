package E22_4;


public class ConsumerThread extends Thread
{
    private static final int DELAY = 1;
    private final Queue<String> q;
    private final int count ;

    public ConsumerThread(Queue<String> q, int count)
    {
        this.q = q;
        this.count = count;
    }

    public void run()
    {
        try
        {
            for(int i = 0; i < count; i++)
            {
                q.remove();
                sleep(DELAY);
            }
        }
        catch(InterruptedException e)
        {

        }
    }
}
