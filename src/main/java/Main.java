public class Main {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("main group");
        final MyThread th1 = new MyThread(group, "Первый");
        final MyThread th2 = new MyThread(group, "Второй");
        final MyThread th3 = new MyThread(group, "Третий");
        final MyThread th4 = new MyThread(group, "Четвертый");
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {

        }
        group.interrupt();
    }
}
