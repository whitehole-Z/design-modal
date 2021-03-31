package single;

public class DoubleLockSingle {
    private volatile static DoubleLockSingle dog;

    //单例一个重要的，是将构造函数私有化，进而禁止自行实例化
    private DoubleLockSingle(){}

    public static DoubleLockSingle getDogName(){
        if(dog==null){      //当dog为null时，要实例化
            synchronized (DoubleLockSingle.class){      //此时加锁
                if(dog==null){
                    dog = new DoubleLockSingle();
                }
            }
        }
        return dog;
    }
}

/**
 * ps: volatile 关键字？
 * 优点：兼顾多线程和性能
 */
