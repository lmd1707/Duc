public class ReverseStringTask implements AsyncTask<String> {
    private String input;
    public ReverseStringTask(String input) {
        this.input = input;
    }
    @Override
    public String execute() throws Exception {
        System.err.println("Reverse String Task is running");
        Thread.sleep(5000);
        System.err.println("Reverse String Task is completed");
        return new StringBuilder(input).reverse().toString();
    }
}
