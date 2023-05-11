package factory.methodFactory.food;

/**
 * @Title: ChineseFoodB
 * @Author bubuwang
 * @Date 2023/5/11 16:41
 * @description: 中国食物B
 */
public class ChineseFoodB implements ChineseFood{
    @Override
    public void food() {
        System.out.println("中国食物B");
    }
}
