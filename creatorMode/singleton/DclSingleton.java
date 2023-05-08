package singleton;

/**
 * @Title: DclSingleton
 * @Author bubuwang
 * @Date 2023/5/8 10:49
 * @description: 双重检测锁
 * DCL模式相对比较完善，但还有指令重排的问题
 *   指令重排：1.编译器优化重排   2.指令并行重拍   3.内存系统重排
 */
public class DclSingleton {
    private static DclSingleton INSTANCE = new DclSingleton();
    public static DclSingleton getInstance() {
        //外层检测防止初始化以后，后来的线程进入同步块，提高效率
        if (INSTANCE == null) {
            synchronized (DclSingleton.class) {
                //内层检测防止多线程抢占，生成多个对象
                if (INSTANCE == null) {
                    INSTANCE = new DclSingleton();
                }
            }
        }
        return INSTANCE;
    }

}
