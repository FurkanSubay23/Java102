package MultiThreads;

public class Runnable1 implements Runnable {
    private String name;
    private boolean isRun = true;

    public Runnable1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int i = 0;
        this.isRun = true;
        while (isRun) {
            System.out.println(this.getName() + " nesnemiz basladi");

            try {
                System.out.println(this.getName() + " : " + i);
                Thread.sleep(500);
                i++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);

            }
        }
    }

    public void stop() {
        this.isRun = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
