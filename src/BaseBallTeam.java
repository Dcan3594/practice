public class BaseBallTeam {
    private String name; //球団名
    private int win; //勝利数
    private int lose; //敗北数
    private int draw; //引き分け数

    public BaseBallTeam(String name, int win, int lose, int draw){
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    //球団の勝敗をもとに勝率を計算
    public double getRate(BaseBallTeam team){
        return (double) team.win / (team.win + team.lose);
    }

    //球団の成績と勝率を出力
    public void report(BaseBallTeam team){
        System.out.println(this.name + " の2019年の成績は " + this.win + " 勝 " + this.lose + " 敗 " + this.draw + " 分、勝率は " + getRate(team) + " です。");
    }

}
