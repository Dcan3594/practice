public class CentralLeague {
    public static void main(String[] args) {
        BaseBallTeam bbtG = new BaseBallTeam("読売ジャイアンツ", 77, 64, 2);
        BaseBallTeam bbtDb = new BaseBallTeam("横浜DeNAベイスターズ", 71, 69, 3);
        BaseBallTeam bbtT = new BaseBallTeam("阪神タイガース", 69, 68, 6);
        BaseBallTeam bbtC = new BaseBallTeam("広島東洋カープ", 70, 70, 3);
        BaseBallTeam bbtD = new BaseBallTeam("中日ドラゴンズ", 68, 73, 2);
        BaseBallTeam bbtS = new BaseBallTeam("東京ヤクルトスワローズ", 59, 82, 2);

        //勝率を計算して成績と合わせて出力
        bbtG.report(bbtG);
        bbtDb.report(bbtDb);
        bbtT.report(bbtT);
        bbtC.report(bbtC);
        bbtD.report(bbtD);
        bbtS.report(bbtS);
    }
}
