package factory.abstractFactory.cpu;

/**
 * @Title: AmdCpu
 * @Author bubuwang
 * @Date 2023/5/11 20:05
 * @description: AMD牌CPU
 */
public class AmdCpu implements Cpu{

    @Override
    public void cpuLowFrequency() {
        System.out.println("AmdCPU 低频");
    }

    @Override
    public void cpuOverload() {
        System.out.println("AmdCPU 超载");
    }
}
