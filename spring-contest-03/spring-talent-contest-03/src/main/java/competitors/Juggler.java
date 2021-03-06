package competitors;

public class Juggler implements Competitor {

    private int balls = 5;

    public Juggler() {
    }

    public Juggler(int balls) {
        this.balls = balls;
    }

    @Override
    public void execute() throws ExecutionException {
        System.out.println("juggling " + this.balls + " balls");
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }
}
