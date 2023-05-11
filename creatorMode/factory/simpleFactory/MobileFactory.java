package factory.simpleFactory;

/**
 * @Title: Factory
 * @Author bubuwang
 * @Date 2023/5/11 16:00
 * @description: 工厂类
 */
public class MobileFactory {
    /**
     * 生产机型的类型
     */
    private String type;

    public MobileFactory(String type) {
        this.type = type;
    }

    public PhoneProduceLine createPhone() {
        PhoneProduceLine phone = null;
        switch (type) {
            case "XiaoMi":
                phone = new XiaoMiProduceLine();
                break;
            case "HuaWei":
                phone = new HuaWeiProduceLine();
                break;
        }
        return phone;
    }
}
