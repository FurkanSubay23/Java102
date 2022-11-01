package MultiThreads;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class mainn {
    public static void main(String[] args) throws InterruptedException {

        // Runnable1 runnable2 = new Runnable1("Run2");
        //Runnable1 runnable3 = new Runnable1("Run3");
        //Thread t2 = new Thread(runnable2);
        //Thread t3 = new Thread(runnable3);
        //t2.start();
        //t3.start();
        /*Runnable1 runnable1 = new Runnable1("Run1");
        Thread t1 = new Thread(runnable1);
        t1.start();
            Thread.sleep(2000); start yaptıktan 2 saniye sonra stop yap anlamına gelir.
        runnable1.stop();
        Thread.sleep(2000);
        t1.start();
        ################################################################
        Synchronized s1 = new Synchronized();
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Thread t =new Thread(s1);
            threads.add(t);
            t.start();
           // t.join();   // Join diyerek aynı değerleri almasını engellıyoruz. Ama altında aynı blok ıcerısınde oldugu ıcın engellendı.
        }
        System.out.println(s1.getOrderNo());
        System.out.println("Sanane");

 */
        Synchronized runnable1 = new Synchronized();
        ExecutorService pool = Executors.newFixedThreadPool(40);        // ExecuteService çağırarak thread havuzu oluşturuyoruz ve bu havuzdan çekiyoruz threadleri
        for (int i = 0; i < 100; i++) {                                         // Böyle daha hızlı oluyor.
            pool.execute(runnable1);
        }
        System.out.println(runnable1.getClass().getName());


    }
}
