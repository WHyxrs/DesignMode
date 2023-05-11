package factory.methodFactory;

import factory.methodFactory.food.AmericanFood;
import factory.methodFactory.food.AmericanFoodA;
import factory.methodFactory.food.AmericanFoodB;
import factory.methodFactory.food.Food;

/**
 * @Title: AmericanFoodFactory
 * @Author bubuwang
 * @Date 2023/5/11 16:48
 * @description: 美国食物工厂
 */
public class AmericanFoodFactory implements FoodFactory{
    @Override
    public Food produce(String name) {
        AmericanFood food = null;
        switch (name) {
            case "A":
                food = new AmericanFoodA();
                break;
            case "B":
                food = new AmericanFoodB();
                break;
        }
        return food;
    }
}
