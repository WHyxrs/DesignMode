package factory.simpleFactory;

/**
 * @Title: XiaoMiCreateLine
 * @Author bubuwang
 * @Date 2023/5/11 15:57
 * @description: 小米生产线
 */
public class XiaoMiProduceLine implements PhoneProduceLine {
    @Override
    public void create() {
        System.out.println("生产小米手机");
    }
}
