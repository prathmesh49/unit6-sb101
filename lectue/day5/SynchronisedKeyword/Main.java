package day5.SynchronisedKeyword;

public class Main {
    public static void main(String[] args) {
        A a = new A();

        B b1 = new B(a, "Welcome");
        B b2 = new B(a, "Hello");
        B b3 = new B(a, "Java");

        Thread t1 = new Thread(b1);
        Thread t2 = new Thread(b2);
        Thread t3 = new Thread(b3);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();

            t3.join();

        } catch (Exception e) {
          
        }
        System.out.println("bye bye");
    }
}

class A {
    synchronized void printSMS (String s){
        System.out.println("[");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            
        }
        System.out.println(s);
        System.out.println("]");
    }
}
class B implements Runnable {
    A a;
    String sms ;
     
    B(A a, String sms){
        this.a=a;
        this.sms=sms;
    }
    @Override
    public void run() {
        a.printSMS(sms);
    }

}
