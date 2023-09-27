package E22_1;

import java.util.LinkedList;
import java.util.List;

public class ListThreadRunner {
    public static void main(String[] args) {
        List<Integer> lst = new LinkedList<>();
        final int VAL = 10;
        final int REPETITIONS = 5;
        final int THREADS = 10;

        for ( int i = 1; i <= THREADS; i++){

            AddRunnable<Integer> a = new AddRunnable<>(lst, VAL, REPETITIONS);
            RemoveRunnable<Integer> r = new RemoveRunnable<>(lst, VAL, REPETITIONS);

            Thread at = new Thread(a);
            Thread rt = new Thread(r);

            at.start();
            rt.start();
        }
    }
}
