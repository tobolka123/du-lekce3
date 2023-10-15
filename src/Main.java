import hotelKotel.pokoje;
import hotelKotel.Bookingmanager;

import java.time.LocalDate;

public class Main {
    public static void fillBookings() {
        pokoje pokoj1 = new pokoje(1,
                1000, true,
                true);
        pokoje pokoj2 = new pokoje(1,
                1000, true,
                true);
        pokoje pokoj3 = new pokoje(3,
                2400, false,
                true);
        Bookingmanager Bookings = new Bookingmanager("Karel Dvorak",
                LocalDate.of(1990, 5, 15),
                LocalDate.of(2023, 6, 1),
                LocalDate.of(2023, 6, 7),
                pokoj3.getCenaNaNoc(), "working", 1);

        Bookings.addbooking("Karel Dvorak",
                LocalDate.of(1979, 1, 3),
                LocalDate.of(2023, 7, 18),
                LocalDate.of(2023, 7, 21),
                pokoj2.getCenaNaNoc(), "vacation", 3);

        for (int i = 0; i < 10;i++) {
            Bookings.addbooking("Karolína Tmavá",
                    LocalDate.of(1993, 3, 13),
                    LocalDate.of(2023, 8, 1+i),
                    LocalDate.of(2023, 8, 2+i),
                    pokoj2.getCenaNaNoc(), "working", 1);
        }
        Bookings.addbooking("Karolína Tmavá",
                LocalDate.of(1993, 3, 13),
                LocalDate.of(2023, 8, 1),
                LocalDate.of(2023, 8, 31),
                pokoj2.getCenaNaNoc(), "working", 1);

        Bookings.getbookings();

    }
    public static void main(String[] args) {
        fillBookings();
    }

}

