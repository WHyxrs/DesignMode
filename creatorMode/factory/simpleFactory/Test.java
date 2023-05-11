package factory.simpleFactory;

/**
 * @Title: Test
 * @Author bubuwang
 * @Date 2023/5/11 16:07
 * @description: 测试类
 * ----Interface(生产线)
 *     ----XiaoMi(生产线)
 *     ----HuaWei(生产线)
 * ----factory引入生产线接口。通过type选择不同的生产线，从而选择不同的功能
 */
public class Test {
    public static void main(String[] args) {
        //通过工厂选择相应的生产线
        PhoneProduceLine xiaoMiProduceLine = new MobileFactory("XiaoMi").createPhone();
        xiaoMiProduceLine.create();
        PhoneProduceLine huaWeiproduceLine = new MobileFactory("HuaWei").createPhone();
        huaWeiproduceLine.create();
    }
}
