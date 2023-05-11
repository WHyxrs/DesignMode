package factory.simpleFactory;

/**
 * @Title: HuaWeiProduceLine
 * @Author bubuwang
 * @Date 2023/5/11 15:58
 * @description: 华为生产线
 */
public class HuaWeiProduceLine implements PhoneProduceLine {
    @Override
    public void create() {
        System.out.println("生产华为手机");
    }
}
