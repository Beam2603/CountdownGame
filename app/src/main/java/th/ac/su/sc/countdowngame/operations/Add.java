package th.ac.su.sc.countdowngame.operations;

public class Add implements Operation {

    @Override
    public int eval(int x, int y) {
        int r = x + y;
        if (r <= x || r <= y) {
            return 0;
        } else {
            return r;
        }
    }
        @Override
        public String symbol () {
            return "+";
        }

}