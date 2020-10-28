package sistem_birocratic;

public class MyRunnable implements Runnable{

    private int count = 0;

    @Override
    public void run() {
        for(int i = 0; i < 1_000_000; i++){
            synchronized (this) {
                this.count++;
            }
        }
        System.out.println(" Thread name (" + Thread.currentThread().getName() + ") finished at " + count);
    }
}
