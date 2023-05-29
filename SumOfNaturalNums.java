package Snacks3;

public class SumOfNaturalNums {
    public static void main(String[] args) {
        int sum = 0;
        for(int count = 1; count < 11; count++){
            if (count > 0)sum += count;
        }
        System.out.println(sum);
    }
}
