package factory.abstractFactory.cpu;

/**
 * @Title: Cpu
 * @Author bubuwang
 * @Date 2023/5/11 20:04
 * @description: cpu父级接口
 */
public interface Cpu {

    /**
     * cpu 低频
     */
    void cpuLowFrequency();

    /**
     * cpu 过载
     */
    void cpuOverload();
}
