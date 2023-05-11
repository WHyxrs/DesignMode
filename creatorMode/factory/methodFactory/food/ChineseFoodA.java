package factory.methodFactory.food;

/**
 * @Title: ChineseFoodA
 * @Author bubuwang
 * @Date 2023/5/11 16:37
 * @description: 中国食物A
 */
public class ChineseFoodA implements ChineseFood{
    @Override
    public void food() {
        System.out.println("中国食物A");
    }
}
