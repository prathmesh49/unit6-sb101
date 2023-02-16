package day6.producer_consumer;

public class GoDown {
    static boolean isGoDownFull; // initial state is fallse

    synchronized void getItem() {
        if (!isGoDownFull) {
            try {
                System.out.println("consumer is waiting");
                wait();
            } catch (InterruptedException e) {
            }
            System.out.println("Item consumed by the consumer");
            isGoDownFull = false;
            notify();
        }
    }

    synchronized void putItem() {
        if (isGoDownFull) {
            try {
                System.out.println("producer is waiting");
                wait();
            } catch (InterruptedException e) {

            }
            System.out.println("Item produced by the producer");
            isGoDownFull = true;
            notify();
        }
    }
}

