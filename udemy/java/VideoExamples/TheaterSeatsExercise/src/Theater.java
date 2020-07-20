import java.util.*;


public class Theater {
    private final String theaterName;
    private List<Seat> seats = new ArrayList<>();
    static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
        @Override
        public int compare(Seat seat1, Seat seat2) {
            if(seat1.getPrice() < seat2.getPrice()){
                return -1;
            } else if (seat1.getPrice() > seat2.getPrice()){
                return 1;
            } else {
                return 0;
            }
        }
    };

    public Theater(String theaterName, int numRows, int seatsPerRow) {
        this.theaterName = theaterName;
        int lastRow = 'A' + (numRows -1);
        for (char row = 'A'; row <= lastRow; row++){
            for(int seatNum = 1; seatNum<= seatsPerRow; seatNum++){
                double price = 20.00;
                if(row < 'D' && (seatNum >= 5 && seatNum <= 10)){
                    price = 25.00;
                } else if (row >= 'D' && (seatNum <= 4 || seatNum >= 11)){
                    price = 18.00;
                }
                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }
    }

    public String getTheaterName() {
        return theaterName;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat = new Seat(seatNumber, 0);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if(foundSeat >= 0){
            return seats.get(foundSeat).reserve();
        }else {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
    }

    public Collection<Seat> getSeats() {
        return seats;
    }

    class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved = false;
        private double price;

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        public boolean reserve(){
            if(!this.reserved){
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
            }
            return false;
        }

        public boolean cancel(){
            if(this.reserved){
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + "Cancelled");
                return true;
            }else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }

         public double getPrice() {
             return price;
         }
     }
}
