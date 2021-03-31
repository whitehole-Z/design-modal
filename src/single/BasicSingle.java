package single;

public class BasicSingle {
    private static BasicSingle dog;

    //单例一个重要的，是将构造函数私有化，进而禁止自行实例化
    private BasicSingle(){}

    public static BasicSingle getDogName(){
        if(dog==null){
            dog = new BasicSingle();
        }
        return dog;
    }
}

/**
 * 优点：延迟实例化
 * 缺点：多线程会有问题，
 *      假设当线程A执行过 dog==null 后，切换到线程B执行，线程B也会通过dog == null 的判断，进而造成2个或多个实例
 *      ，解决办法：双重加锁
 */
