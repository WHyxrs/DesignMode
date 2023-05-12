package factory.abstractFactory.cpu;

/**
 * @Title: Intel
 * @Author bubuwang
 * @Date 2023/5/11 20:04
 * @description: Intel牌cpu
 */
public class IntelCpu implements Cpu{
    @Override
    public void cpuLowFrequency() {
        System.out.println("IntelCPU 低频");
    }

    @Override
    public void cpuOverload() {
        System.out.println("IntelCPU 超载");
    }
}
