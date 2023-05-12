package factory.abstractFactory.mainBoard;

/**
 * @Title: IntelMainBoard
 * @Author bubuwang
 * @Date 2023/5/11 20:08
 * @description: Intel型mainBoard
 */
public class IntelMainBoard implements MainBoard{
    @Override
    public void mainBoardBurial() {
        System.out.println("AmdMainBoard 冷却");
    }

    @Override
    public void mainBoardSuperheat() {
        System.out.println("IntelMainBoard 过热");
    }
}
