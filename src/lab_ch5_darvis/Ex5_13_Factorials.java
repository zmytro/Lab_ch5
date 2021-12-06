package lab_ch5_darvis;

public class Ex5_13_Factorials {
    public static void main(String[] args) {
        long factorial;
        for (int i = 1; i <= 20; i++) {
             factorial = 1;
            for (int j = i; j > 1; j--)
                factorial = factorial * j;
            System.out.println(i+"! = "+factorial);
        }
    }
}
