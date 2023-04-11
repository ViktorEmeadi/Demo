package Snacks3;

public class BarChatPrinting {
    public static void main(String[] args) {
        for (int count = 1; count <= 30; count++) {
            System.out.print(count);
            for (int counter = 0; counter < count; counter++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
