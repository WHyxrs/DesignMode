package factory.abstractFactory.factory;

import factory.abstractFactory.cpu.Cpu;
import factory.abstractFactory.mainBoard.MainBoard;

/**
 * @Title: ComputerFactory
 * @Author bubuwang
 * @Date 2023/5/11 20:10
 * @description: 抽象工厂接口
 */
public interface ComputerFactory {
      Cpu cpu();

      MainBoard mainBoard();
}
