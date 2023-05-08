package singleton;

/**
 * @Title: DcL2Singleton
 * @Author bubuwang
 * @Date 2023/5/8 10:58
 * @description: DCL优化
 */
public class DcL2Singleton {
    private static volatile DcL2Singleton INSTANCE = null;

    public static DcL2Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DcL2Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DcL2Singleton();
                }
            }
        }
        return INSTANCE;
    }

}
