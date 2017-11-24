import java.lang.reflect.Array;

public class ex14 {

    public static void main(String[] args) {
        final int SEATS_SIZE = 10;
        final int PEOPLE_SIZE = 10;

        boolean[] seats = new boolean[SEATS_SIZE];


    }

    public static int getEmptySeat(int designatedSeat, boolean[] seats) {
        if (!seats[designatedSeat]) {
            return designatedSeat;
        }

        for (int delta = 1;
             delta < seats.length &&
                     (designatedSeat - delta) > 0 &&
                     (designatedSeat + delta) < seats.length - 1;
             delta++) {

            if (seats[designatedSeat + delta] == true) {
                return (designatedSeat + delta);
            }

            if (seats[designatedSeat - delta] == true) {
                return (designatedSeat - delta);
            }
        }

        return 0;
    }


}
