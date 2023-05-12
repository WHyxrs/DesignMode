package factory.abstractFactory.mainBoard;

/**
 * @Title: MainBoard
 * @Author bubuwang
 * @Date 2023/5/11 20:07
 * @description: 主板 父级接口
 */
public interface MainBoard {
    /**
     * 主板冷却
     */
    void mainBoardBurial();
    /**
     * 主板过热
     */
    void mainBoardSuperheat();
}
