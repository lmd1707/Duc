public class SquareTask implements AsyncTask<Integer> {
    private int number;

    public SquareTask(int number) {
        this.number = number;
    }
    @Override
    public Integer execute() throws Exception {
        System.err.println("SquareTask is running");
        Thread.sleep(20000);
        System.err.println("SquareTask is completed");
        return number * number;
    }
}
