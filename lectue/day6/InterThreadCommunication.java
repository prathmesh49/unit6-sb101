package day6;

public class InterThreadCommunication extends Thread {
    
    @Override
    public void run() {
        System.out.println(this);
        synchronized(this){
            try {
                System.out.println(1);
                notify();
                wait();
                System.out.println(3);
                notify();

            } catch (InterruptedException e) {
            }
        }
    }
    public static void main(String[] args) {
        InterThreadCommunication itdc = new InterThreadCommunication();
        itdc.start();
        System.out.println(itdc);
        synchronized(itdc){
            try {
                itdc.wait();
                System.out.println(2);
                itdc.notify();
                itdc.wait();
                System.out.println(4);

            } catch (InterruptedException e) {
            }
        }
          
        System.out.println("bye bye");
    }
}
