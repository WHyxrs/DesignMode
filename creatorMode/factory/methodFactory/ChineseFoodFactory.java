package factory.methodFactory;

import factory.methodFactory.food.ChineseFood;
import factory.methodFactory.food.ChineseFoodA;
import factory.methodFactory.food.ChineseFoodB;
import factory.methodFactory.food.Food;

/**
 * @Title: ChineseFoodFactory
 * @Author bubuwang
 * @Date 2023/5/11 16:47
 * @description: 中国食物工厂
 */
public class ChineseFoodFactory implements FoodFactory{
    @Override
    public Food produce(String name) {
        ChineseFood food = null;
        switch (name){
            case "A":
                food = new ChineseFoodA();
                break;
            case "B":
                food = new ChineseFoodB();
                break;
        }
        return food;
    }
}
