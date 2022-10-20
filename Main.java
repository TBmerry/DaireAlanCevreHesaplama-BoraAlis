import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Java ile yarı çapını kullanıcıdan aldığınız dairenin alan ve çevresini hesaplamak amaçlanmıştır.
        /*
        Dairenin alan formül : pi * r * r
        Dairenin çevre formül : 2 * pi * r
        r = yarı çap
         */
        int r;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz : ");
        r = input.nextInt();
        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin ALANI : " + alan);
        System.out.print("Dairenin Çevresi : " + cevre);

    }
}