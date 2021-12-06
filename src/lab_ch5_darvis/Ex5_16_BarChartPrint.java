package lab_ch5_darvis;
import java.util.Scanner;

public class Ex5_16_BarChartPrint {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] numbers = new int[5];
            String[] star_count = new String[5];

            for (int i = 0; i < 5; i++)
                star_count[i] = "";

            for (int i = 0; i < 5;) {
                System.out.print("Введите число от 1 до 30: ");
                numbers[i] = sc.nextInt();

                if (numbers[i] < 1 || numbers[i] > 30)
                    System.err.println("ОШИБКА! Введите число от 1 до 30");
                else {
                    for (int j = 0; j < numbers[i]; j++)
                        star_count[i] += "*";

                    i++;
                }
            }
            for (int i = 0; i < 5; i++)
                System.out.println(numbers[i] + " = " + star_count[i]);
        }
}
