package factory.abstractFactory.factory;

import factory.abstractFactory.cpu.Cpu;
import factory.abstractFactory.cpu.IntelCpu;
import factory.abstractFactory.mainBoard.IntelMainBoard;
import factory.abstractFactory.mainBoard.MainBoard;

/**
 * @Title: InterComputerFactory
 * @Author bubuwang
 * @Date 2023/5/11 20:11
 * @description: 实现工厂类
 */
public class IntelComputerFactory implements ComputerFactory {

    @Override
    public Cpu cpu() {
        return new IntelCpu();
    }

    @Override
    public MainBoard mainBoard() {
        return new IntelMainBoard();
    }
}
