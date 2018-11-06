package pack.myactor;

import co.paralleluniverse.actors.BasicActor;
import co.paralleluniverse.fibers.SuspendExecution;

public class MyActorReadFile extends BasicActor<Object, Void> {


    private boolean active = true;

    @Override
    protected Void doRun() throws InterruptedException, SuspendExecution {

        while (active) {

            Object m = receive();

            System.out.println("m is " + m);

            if (m.equals("-1")) {
                active = false;
            }


            //this.c


            // if (!active) break;
        }

        return null;
    }
}
