import model.JThread;
import model.MyThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Thread t = Thread.currentThread();
//        Thread.sleep(1000);
//        System.out.println(t.getName());

//        System.out.println("Main thread started...");
//        new JThread("JThread").start();
//        System.out.println("Main thread finished...");

//        System.out.println("Main thread started...");
//        for(int i=1; i < 6; i++)
//            new JThread("JThread " + i).start();
//        System.out.println("Main thread finished...");

//        System.out.println("Main thread started...");
//        JThread t = new JThread("JThread ");
//        t.start();
//        try{
//            t.join();
//        }
//        catch(InterruptedException e){
//
//            System.out.printf("%s has been interrupted", t.getName());
//        }
//        System.out.println("Main thread finished...");

        // Создаем поток MyThread и запускаем его в отдельном потоке Thread
        System.out.println("Main thread started...");
        MyThread myThread = new MyThread();
        new Thread(myThread, "MyThread").start();

        try {
            Thread.sleep(1100);

            myThread.disable();

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        System.out.println("Main thread finished...");

        System.out.println("Main thread started...");
        JThread t = new JThread("JThread");
        t.start();
        try{
            Thread.sleep(150);
            t.interrupt();

            Thread.sleep(150);
        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
        System.out.println("Main thread finished...");
    }
}