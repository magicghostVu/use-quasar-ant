package pack;

import co.paralleluniverse.fibers.SuspendExecution;
import co.paralleluniverse.fibers.Suspendable;

public class TestSuspendable {


    //@Suspendable
    private void innerCount(int i)throws SuspendExecution{
        //do stuff here
    }

    public void countTo1M() throws SuspendExecution {
        for (int i = 0; i < 1000000; i++) {
            innerCount(i);
        }

        String msg= String.format("thread %s count 1M done", Thread.currentThread().getName());
        System.out.println(msg);
    }


    public void countTo1M2() throws SuspendExecution{
        for (int i = 0; i < 1_000_000; i++) {
            innerCount(i);
        }

        String msg= String.format("thread %s count 1M done", Thread.currentThread().getName());
        System.out.println(msg);
    }

}
