package lab_ch5_darvis;
import java.util.Scanner;

public class Ex5_17_CalculatingSales {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        double product1=0.0,product2=0.0,product3=0.0,product4=0.0,product5=0.0;
        int prodNum, quantity, counter = 1;

        double total = 0;

        while(counter <=5){
            System.out.println("1 - капуста(2.98$)");
            System.out.println("2 - морковка(4.5$)");
            System.out.println("3 - картошка(9.98$)");
            System.out.println("4 - лук(4.49$)");
            System.out.println("5 - зелень(6.87$)");
            System.out.print("Введите номер продукта:");
            System.out.println();

            prodNum = sc.nextInt();

            System.out.print("Кол-во купленных штук:");

            quantity = sc.nextInt();
            counter++;

            switch(prodNum){

                case 1: product1 += 2.98*quantity; break;

                case 2: product2 += 4.5*quantity; break;

                case 3: product3 += 9.98*quantity; break;

                case 4: product4 += 4.49*quantity; break;

                case 5: product5 += 6.87*quantity; break;

                default:

                    System.err.println("Вы вввели неверный номер продукта"); break;

            }

        }




        System.out.println("Чек:");
        System.out.println("капуста - "+product1+ "$");
        System.out.println("морковка - "+product2+ "$");
        System.out.println("картошка - "+product3+ "$");
        System.out.println("лук - "+product4+ "$");
        System.out.println("зелень - "+product5+ "$");


    }
}
