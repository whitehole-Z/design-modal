package single;

public class LockSingle {
    private static LockSingle instance;

    //单例一个重要的，是将构造函数私有化，进而禁止自行实例化
    private LockSingle(){}

    //方法加锁，避免多线程问题
    public static synchronized LockSingle getInstance(){
        if(instance==null){
            instance = new LockSingle();
        }
        return instance;
    }
}

/**
 * 优点：加锁，避免了多线程破坏单例的问题
 * 缺点：方法设为同步，会影响性能。
 *      解决：双重加锁。
 */
