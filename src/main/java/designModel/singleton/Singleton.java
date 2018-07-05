package designModel.singleton;

public class Singleton {
    private static Singleton instance;
    private static Object syncRoot = new Object();//用于控制同步的锁
    private Singleton() {
        System.out.println("单例模式");
    }

    /**方法１：
     * 这段代码使得对象实例由最先进入的那个线程创建，以后的线程再进入时，不会再去创建对象实例了．
     * 由于有了synchronized，就保证了多线程环境下的同时访问也不会造成多个实例的产生
     * 弊端：
     * 这种方法每次在调用时候都需要进行加锁的操作，这样很影响性能
     * @return
     */
    public static Singleton getInstance() {
        /**
         * synchronized是确保一个线程位于代码的临界区时，另一个线程不进入临界区．
         * 如果其他线程试图进入锁定的代码，则它将一直等待（即将被阻止），直到该对象被释放
         * 这里synchronized被用来指定某个对象
         */
        synchronized (syncRoot) {//加锁的操作，但是为什么一定要有这个syncRoot？？？这个是如何定义的，还是随便一个变量就可以
            if (instance == null) {
                instance = new Singleton();
            }
        }
        return instance;
    }


    public static Singleton getInstance1() {
        if (instance == null) {
            synchronized (syncRoot) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
