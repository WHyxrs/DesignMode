package singleton;

/**
 * @Title: LazySingleton
 * @Author bubuwang
 * @Date 2023/5/8 10:44
 * @description: 懒汉式
 * 可以避免资源浪费，但是会有一个资源抢占问题
 */
public class LazySingleton {
    private static LazySingleton INSTANCE = null;
    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }

}
