import java.util.Random;

public class MyThread extends Thread {
    final int DELAY_MIN = 2000;
    final int DELAY_MAX_STEP = 2000;

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            while (!isInterrupted()){
                Thread.sleep(DELAY_MIN + random.nextInt(DELAY_MAX_STEP));
                System.out.printf("Сообщает поток %s - работаю.\n", getName());
            }
        } catch (InterruptedException e) {

        } finally {
            System.out.printf("Сообщает поток %s - завершился.\n", getName());
        }
    }
}
