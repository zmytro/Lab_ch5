package lab_ch5_darvis;

import java.util.Scanner;

public class Ex5_11_SmallestValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int smallest = 0;
        int counter=1;
        System.out.println("Введите кол-во чисел");
        int a = sc.nextInt();
        while (counter <= a) {
            System.out.print("Введите " + counter + " число: ");
            int num = sc.nextInt();
            if (counter == 1)
                smallest = num;
            else if (num < smallest)
                smallest = num;

            counter++;
        }
        System.out.print("Наименьшее число - " + smallest);
    }
}
