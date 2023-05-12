package factory.abstractFactory.mainBoard;

/**
 * @Title: AmdMainBoard
 * @Author bubuwang
 * @Date 2023/5/11 20:07
 * @description: Amd牌主板
 */
public class AmdMainBoard implements MainBoard{
    @Override
    public void mainBoardBurial() {
        System.out.println("AmdMainBoard 冷却");
    }

    @Override
    public void mainBoardSuperheat() {
        System.out.println("AmdMainBoard 过热");
    }
}
