package hotelKotel;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.Objects;

public class Bookingmanager {
    private String jmeno;
    private static int nextId = 1;
    private int id = nextId++;
    private LocalDate datumnar;
    private LocalDate prijezd;
    private LocalDate odjezd;
    private int pocetdni;
    private List<Object> Booking = new ArrayList<>();
    private int cenananoc;
    private int cena;
    private String typeofvacation;
    private int j;
    private List<Object> Type = new ArrayList<>();
    private int guests = 1;
    private int guest = 0;
    private List<Object> guestss = new ArrayList<>();
    private Object pokoj;
    private Object pokojtajny;


    public Bookingmanager(String jmeno, LocalDate datumnar, LocalDate prijezd, LocalDate odjezd, int cenananoc, String typeofvacation, int Totalguests) {
        this.jmeno = jmeno;
        this.prijezd = prijezd;
        this.odjezd = odjezd;
        this.datumnar = datumnar;
        this.pocetdni = odjezd.getDayOfYear() - prijezd.getDayOfYear();
        this.cena = cenananoc*pocetdni;
        this.guests = Totalguests;
        this.Type.add(typeofvacation);
        this.guest += guests + 1;
        this.guestss.add(guests);
        this.Booking.add(prijezd+" az "+odjezd+" "+jmeno+"("+datumnar+") ["+guests+", ano] za "+cena+ " Kc");

    }



    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public LocalDate getPrijezd() {
        return prijezd;
    }

    public void setPrijezd(LocalDate prijezd) {
        this.prijezd = prijezd;
    }

    public LocalDate getOdjezd() {
        return odjezd;
    }

    public void setOdjezd(LocalDate odjezd) {
        this.odjezd = odjezd;
    }

    public LocalDate getDatumnar() {
        return datumnar;
    }

    public void setDatumnar(LocalDate datumnar) {
        this.datumnar = datumnar;
    }


    public void clearbookings() {
        Booking = new ArrayList<>();
        Type = new ArrayList<>();
    }

    public void getbooking(int index) {
        System.out.println(Booking.get(index));
    }
    public void getbookings() {
        for (Object i : Booking)
            System.out.println(i);
    }
    public void addbooking(String jmeno, LocalDate datumnar, LocalDate prijezd, LocalDate odjezd, int cenananoc, String typeofvacation, int Totalguests) {
        this.jmeno = jmeno;
        this.prijezd = prijezd;
        this.odjezd = odjezd;
        this.datumnar = datumnar;
        this.pocetdni = odjezd.getDayOfYear() - prijezd.getDayOfYear();
        this.cena = cenananoc*pocetdni;
        this.id++;
        this.guests = Totalguests;
        this.Type.add(typeofvacation);
        this.guest += guests + 1;
        this.guestss.add(guests);
        this.Booking.add(prijezd+" az "+odjezd+" "+jmeno+"("+datumnar+") ["+guests+", ano] za "+cena+ " Kc");
    }
    public void getNumberOfWorkingBookings(){
        int nub = 0;
        for (int j = 0; j < Type.size(); j++) {
            if (Type.get(j) == "working") {
                nub++;
            }
        }
        System.out.println(nub);
    }
    public void getTotalGuests(){
        System.out.println("Celkem hostu: "+guests);
    }
    public void getAverageGuests() {
        int AverageGuests = guest / Booking.size();
        System.out.println("Prumer hostu na objednavku: " + AverageGuests);
    }
    public void getGuests(int lindex){
        int jindex = lindex +1;
        System.out.println("Pocet hostu v rezervaci "+jindex+" je "+guestss.get(lindex));
    }
    public void getPrice() {
        System.out.println("Cena: "+cena);
    }

}
