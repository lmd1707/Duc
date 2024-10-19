import java.util.ArrayList;
public class HoTro {
    public static <T> void inMang(T[] arr) {
        for ( T element : arr ) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] arrInt = {1,7,0,5};
        String [] arrStr = {"Hello" , "Bye"};

        inMang(arrInt);
        inMang(arrStr);
    }

    }

