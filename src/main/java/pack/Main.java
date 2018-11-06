package pack;

import co.paralleluniverse.actors.ActorRef;
import co.paralleluniverse.fibers.Fiber;
import co.paralleluniverse.fibers.SuspendExecution;
import co.paralleluniverse.strands.SuspendableRunnable;
import pack.myactor.MyActorReadFile;

public class Main {
    //SuspendExecution


    public static void main(String[] args) throws SuspendExecution {

        TestSuspendable t1= new TestSuspendable();


        Fiber<Void> f1= new Fiber<>(t1::countTo1M2);

        Fiber<Void> f2= new Fiber<>(t1::countTo1M);

        f1.start();
        f2.start();

        /*ActorRef<Object> t = new MyActorReadFile().spawn();
        t.send("okokok");

        t.send("this is next mess");
        t.send("-1");*/

    }
}
