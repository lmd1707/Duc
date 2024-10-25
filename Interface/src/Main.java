interface Pair <K,V> {
    K getKey();
    V getValue();
}

class OrderedPair <K,V> implements Pair <K,V> {
    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    @Override
    public K getKey() {
        return key;
    }
    @Override
    public V getValue() {
        return value;
    }

    }


    public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new OrderedPair<>("One" , 1);
        System.out.println(pair.getKey() + " = " + pair.getValue());
    }
}
