package factory.methodFactory;

import factory.methodFactory.food.Food;

/**
 * @Title: FoodFactory
 * @Author bubuwang
 * @Date 2023/5/11 16:31
 * @description: 食物工厂接口--顶层接口
 */
public interface FoodFactory {
    Food produce(String name);
}
