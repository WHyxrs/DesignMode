package singleton;

/**
 * @Title: HungrySingleton
 * @Author bubuwang
 * @Date 2023/5/8 10:41
 * @description: 饿汉式   每次启动时都会初始化类，造成资源浪费
 */
public class HungrySingleton {
    private static final HungrySingleton INSTANCE = new HungrySingleton();

    /**
     * @return INSTANCE
     * 提供外部访问接口
     */
    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
