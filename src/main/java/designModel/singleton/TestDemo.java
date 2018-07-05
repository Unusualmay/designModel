package designModel.singleton;

class Thread1 extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
        Singleton.getInstance1();
    }
}

class Thread2 extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
        Singleton.getInstance1();
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Thread thread1 = new Thread1();
        Thread thread2 = new Thread2();
        thread1.start();
        thread2.start();
    }

}
