package MultiThreads;

public class Synchronized implements Runnable {
    private int OrderNo;

    public Synchronized() {
        this.OrderNo = 0;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        increaseOrderNo();
        //System.out.println(this.getOrderNo());
    }

    public synchronized void increaseOrderNo() {        //Methodu senkronize ederek diğer oluşan threadler ile beraber senkronize olmasını sağlıyoruz.
        this.OrderNo++;
        System.out.println(Thread.currentThread().getName() + " : " + this.OrderNo);
    }

    public int getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(int orderNo) {
        OrderNo = orderNo;
    }
}
