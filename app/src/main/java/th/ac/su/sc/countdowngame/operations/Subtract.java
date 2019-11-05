package th.ac.su.sc.countdowngame.operations;

public class Subtract implements Operation {
    @Override
    public int eval(int x, int y) {
        if (x < y) {
            return y - x;
        } else {
            return x - y;
        }
    }
    @Override
    public String symbol() {
        return "-";
    }
}
