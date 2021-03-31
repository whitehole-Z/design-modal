package single;

public class InitSingle {
    private static InitSingle initSingle = new InitSingle();

    private InitSingle(){}

    public static InitSingle getInstance(){
        return initSingle;
    }
}

/**
 * 缺点：不管用不用该类，都会实例化。
 * 适用范围：基本上肯定会实例化的类。
 */
