import java.util.Scanner;


public class Main_hw {
    public static void nhapXau() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the character string (input '#' to end)");

        while (true) {
            String input = scanner.nextLine();
            if(input.equals("#")) {
                System.out.println("End");
                break;
            }
            System.out.println("Character string: " + input);
        }
        scanner.close();
    }
    public  static void main(String[] args) {
        Thread inputThread = new Thread(new Runnable() {
            @Override
            public void run() {
                nhapXau();
            }
        });
        inputThread.start();
         try {
             inputThread.join();
         } catch (InterruptedException e ) {
             e.printStackTrace();
         }
         System.out.println("Program ending");
        }
    }

