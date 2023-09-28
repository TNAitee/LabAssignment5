package E22_3;

import java.time.LocalTime;


public class ProducerThread extends Thread
{
    private static final int DELAY = 1;
    private final Queue<String> q;
    private final int count ;

    public ProducerThread(Queue<String> q, int count)
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
                String time = LocalTime.now().toString();
                q.add(time);
                sleep(DELAY);
            }
        }
        catch(InterruptedException e)
        {

        }
    }

}
