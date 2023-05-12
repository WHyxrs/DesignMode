package factory.abstractFactory;

import factory.abstractFactory.cpu.Cpu;
import factory.abstractFactory.factory.AmdComputerFactory;
import factory.abstractFactory.factory.ComputerFactory;
import factory.abstractFactory.factory.IntelComputerFactory;
import factory.abstractFactory.mainBoard.IntelMainBoard;
import factory.abstractFactory.mainBoard.MainBoard;

/**
 * @Title: Test
 * @Author bubuwang
 * @Date 2023/5/11 20:28
 * @description: 测试类
 */
public class Test {
    public static void main(String[] args) {
        //获得Intel机型
        ComputerFactory intelComputerFactory = new IntelComputerFactory();
        //Intel CPU
        Cpu intelCpu = intelComputerFactory.cpu();
        intelCpu.cpuLowFrequency();
        intelCpu.cpuOverload();
        //Intel mainboard
        MainBoard intelMainBoard = intelComputerFactory.mainBoard();
        intelMainBoard.mainBoardBurial();
        intelMainBoard.mainBoardSuperheat();

        //获得AMD机型
        ComputerFactory amdComputerFactory = new AmdComputerFactory();
        //Intel CPU
        Cpu amdCpu = amdComputerFactory.cpu();
        amdCpu.cpuLowFrequency();
        amdCpu.cpuOverload();
        //Intel mainboard
        MainBoard amdMainBoard = amdComputerFactory.mainBoard();
        amdMainBoard.mainBoardBurial();
        amdMainBoard.mainBoardSuperheat();
    }
}
