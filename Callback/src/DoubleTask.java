public class DoubleTask implements AsyncTask<Double> {
    private Double number;
    public DoubleTask(Double number) {
        this.number = number;
    }
    @Override
    public Double execute() throws Exception {
        System.err.println("Task is running : ");
        Thread.sleep(25);
        System.err.println("Task is finished : ");
        return Math.sqrt(number);
    }
}
