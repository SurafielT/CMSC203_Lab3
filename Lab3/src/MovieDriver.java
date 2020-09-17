import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		String movieTitle;
		String movieRating;
		Scanner movieInfo = new Scanner(System.in);
		int tickets;
		String choice;
			
			do{
			//OPEN MOVIE OBJECT
			Movie movieTransfer = new Movie();
			
			//ASK USER FOR MOVIE TITLE
			System.out.println("Enter the name of a movie");
			movieTitle = movieInfo.nextLine();
			movieTransfer.setTitle(movieTitle);
			
			//ASK USER FOR MOVIE RATING
			System.out.println("Enter the rating of the movie");
			movieRating = movieInfo.nextLine();
			movieTransfer.setRating(movieRating);
			
			//ASK USER FOR NUMBER OF TICKETS SOLD
			System.out.println("Number of tickets sold for this movie");
			tickets = movieInfo.nextInt();
			movieTransfer.setSoldTickets(tickets);
			
			//DISPLAY THE INFORMATION IN ORDER
			System.out.println(movieTransfer.toString());
			
			System.out.println("Do you want to enter another? (y or n)");
			choice = movieInfo.next();
			movieInfo.nextLine();
			} while(choice.equals("Y") || choice.equals("y"));
			//CLOSING THE SCANNER
			movieInfo.close();
			System.out.print("Goodybye");
			
			

	}

}