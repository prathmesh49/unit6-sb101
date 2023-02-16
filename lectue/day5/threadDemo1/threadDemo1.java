package day5.threadDemo1;

public class threadDemo1 extends Thread {
    int counter =0;
    volatile static boolean runMe=true;
    threadDemo1(String s ){
        super(s);
    }
    @Override
    public void run() {
        while(runMe)
            counter++;
    }
    
    public static void main(String[] args) {
        threadDemo1 t1 = new threadDemo1("prathmesh");
        threadDemo1 t2 = new threadDemo1("ramesh");

        t1.setPriority(NORM_PRIORITY+3);
        t2.setPriority(NORM_PRIORITY-2);

        t1.start();
        t2.start();

        try {
            Thread.sleep(1000);
            runMe=false;

        } catch (InterruptedException e) {
            
        }
        System.out.println(t1.counter);
        System.out.println(t2.counter);
        System.out.println("bye bye ");
    }
}
