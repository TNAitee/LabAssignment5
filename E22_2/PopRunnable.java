package E22_2;



public class PopRunnable<E> implements Runnable
{
        private static  final int DELAY = 1;
        private final LinkedListStack<E> stack;
        private final int count;

        public PopRunnable(LinkedListStack<E> stack , int count )
        {
            this.stack = stack;
            this.count = count;
        }

        public void run ()
        {
            try
            {
                for ( int i = 1; i <= count; i++)
                {
                    stack.pop();
                    Thread.sleep(DELAY);
                }
            }
            catch (InterruptedException e)
            {

            }
        }
    }


