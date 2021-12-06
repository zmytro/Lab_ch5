package lab_ch5_darvis;

public class Ex5_12_ProductOfOddInt {
    public static void main(String[] args) {
        int product = 1;

        for (int i = 1; i <= 15; i += 2)
            product = product * i;

        System.out.println("Произведение нечетных чисел от 1 до 15 -> "+product);
    }
}
