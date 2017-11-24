import java.util.Scanner;

public class ex15 {

    static Scanner in = new Scanner(System.in);

    public static int check(int seat, boolean[] seats) {
        if (seats[seat] == false) {
            return seat;
        } else {
            int counterPlus = 0;
            int counterMinus = 0;
            int deltaPlus = seat;
            int deltaMinus = seat;

            while (deltaPlus < seats.length && seats[deltaPlus] == true) {
                deltaPlus++;
                counterPlus++;
            }
            while (deltaMinus > 0 && seats[deltaMinus] == true) {
                deltaMinus--;
                counterMinus++;
            }

            if (counterPlus > counterMinus) {
                return deltaPlus;
            }
            return deltaMinus;
        }
    }

    public static void main(String[] args) {
        int check;
        int sit;
        boolean sits[] = new boolean[10];
        for (int i = 0; i < sits.length; i++) {
            System.out.println("Please enter the requested sit");
            sit = in.nextInt();
            check = check(sit, sits);
            sits[sit] = true;
            System.out.println(check);
        }
    }
}