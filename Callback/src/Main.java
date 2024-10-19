public class Main {
    public static void main(String[] args) {
        AsyncDispatcher dispatcher = new AsyncDispatcher();

        Callback<Integer> squareCallback = new Callback<Integer>() {
            @Override
            public void onComplete(Integer result) {
                System.out.println("Square result : " + result);
            }
            @Override
            public void onError(Exception e) {
                System.out.println("Error during square calculation " + e.getMessage());
            }
        };
        Callback<String> reverseStringCallback = new Callback<String>() {
            @Override
            public void onComplete(String result) {
                System.out.println("Reverse String: " + result);
            }
            @Override
            public void onError(Exception e) {
                System.out.println("Error during string reversal: " + e.getMessage());
            }
        };

        Callback<Double> DoubleCallback = new Callback<Double>() {
            @Override
            public void onComplete(Double result) {
                System.out.println("Double result : " + result);
            }
            @Override
            public void onError(Exception e) {
                System.out.println("Error during double calculation " + e.getMessage());
            }
        };

        dispatcher.dispatchTask(new SquareTask(5), squareCallback);

        dispatcher.dispatchTask(new ReverseStringTask("Hello, World!"), reverseStringCallback);

        dispatcher.dispatchTask(new SquareTask(100), squareCallback);

        dispatcher.dispatchTask(new DoubleTask(100.0), DoubleCallback );

        dispatcher.shutdown();
     }
}
