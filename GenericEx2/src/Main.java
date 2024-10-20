public class Main {
    public static <T> void printArray(T[] inputArray) {
        for (T element : inputArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5,};
        String[] strArray = {"A", "B", "C", "D", "E"};
        printArray(intArray);
        printArray(strArray);
    }
}

