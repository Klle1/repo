import java.util.Scanner;

public class MovieDriver {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
			

			    System.out.println("Enter the name of a movie");
			    String movieName = sc.nextLine();

			    System.out.println("Enter the rating of the movie");
			    String rating = sc.nextLine();

			    System.out.println("Enter the number of tickets sold for this movie");
			    int ticketsSold = sc.nextInt(); sc.nextLine();

			 
			    Movie aMovie = new Movie(movieName,rating,ticketsSold);
			    System.out.println(aMovie);
		}

        System.out.println("Goodbye");
    }
}
