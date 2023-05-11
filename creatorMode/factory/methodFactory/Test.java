package factory.methodFactory;

import factory.methodFactory.food.Food;

/**
 * @Title: Test
 * @Author bubuwang
 * @Date 2023/5/11 16:59
 * @description: 测试类  工厂方法模式是简单共产模式的进一步扩展,在一个工厂不足以满足业务语义的时候，需要用到多个工厂
 */
public class Test {
    public static void main(String[] args) {
        //中国食物工厂
        ChineseFoodFactory chineseFoodFactory = new ChineseFoodFactory();
        //美国食物工厂
        AmericanFoodFactory AmericanFoodFactory = new AmericanFoodFactory();
        //生产中国A类食物
        Food chineseFoodA = chineseFoodFactory.produce("A");
        chineseFoodA.food();
        //生产中国B类食物
        Food chineseFoodB = chineseFoodFactory.produce("B");
        chineseFoodB.food();
        //生产美国A类食物
        Food americanFoodA = AmericanFoodFactory.produce("A");
        americanFoodA.food();
        //生产美国B类食物
        Food americanFoodB = AmericanFoodFactory.produce("A");
        americanFoodB.food();
    }
}
