
import java.util.Scanner;
class Movieticket {
    String moviename;
    int ticketprice;
    int numberoftickets;
    int totalprice = 0;
    int discount = 0;
    int Finalprice = 0;
    void setMovieticket(String moviename, int ticketprice, int numberoftickets) {
        this.moviename = moviename;
        this.ticketprice = ticketprice;
        this.numberoftickets = numberoftickets;
    }
    void Calculatetotalprice() {
        totalprice = ticketprice * numberoftickets;
    }
    void Calculatediscount() {
        if (numberoftickets >= 5) {
            discount = (totalprice * 10) / 100;
        } else {
            discount = 0;
        }
    }
    void CalculateFinalprice() {
        Finalprice = totalprice - discount;
    }

   
    void displayBill() {
        Calculatetotalprice();
        Calculatediscount();
        CalculateFinalprice();
        System.out.println("Cinema Ticket Booking Bill ");
        System.out.println("Movie name: " + moviename);
        System.out.println("Ticket price: " + ticketprice);
        System.out.println("Number of tickets: " + numberoftickets);
        System.out.println("Total price of the tickets: " + totalprice);
        System.out.println("Discount: " + discount);
        System.out.println("Final price: " + Finalprice);
    }
}

public class HACKATHON2{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the movie name:");
        String moviename = sc.nextLine();
        System.out.println("Enter the ticket price:");
        int ticketprice = sc.nextInt();
        System.out.println("Enter the number of tickets:");
        int numberoftickets = sc.nextInt();
        Movieticket mt = new Movieticket();
        mt.setMovieticket(moviename, ticketprice, numberoftickets);
        mt.displayBill();
        sc.close();
    }
}