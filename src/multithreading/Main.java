package multithreading;

public class Main {
    public static void main(String[] args) {

        ThreadExample thread1 = new ThreadExample();
        thread1.start();

        ThreadExample thread2 = new ThreadExample();
        thread2.start();

//        System.out.println(Thread.activeCount());

    }
}
