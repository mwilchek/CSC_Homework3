import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;

public class OpenFavorites {

	public static void main(String[] args) throws IOException {
		String choice;
		System.out.println("This program will open up your favorite websites.");
		ArrayList<String> websites = new ArrayList<String>();
		java.io.File favoriteSites = new java.io.File("ListOfFavoriteSites.txt");

		if (favoriteSites.exists()) {
			Scanner user = new Scanner(System.in);
			System.out.print("Do you want to edit your existing favorites located at " + favoriteSites.getAbsolutePath()
					+ " ? (Yes or No): ");
			String answer = user.nextLine();
			if (answer.equalsIgnoreCase("yes")) {
				System.out.println("File already exists at: " + favoriteSites.getAbsolutePath());
				System.out.println("Edit it manually or delete it.");
				System.exit(0);
			} else {
				Scanner input = new Scanner(favoriteSites);
				
				while (input.hasNextLine()) 
				{
					String urlString = input.nextLine();
					websites.add(urlString);
				
				}
				
				input.close();
			}

			user.close();
		}

		else {

			do {
				Scanner kb = new Scanner(System.in);
				System.out.print("Enter the URL of a website: ");
				String urlString = kb.nextLine();
				websites.add(urlString);

				System.out.println();
				System.out.println("Add another? (Yes or No)");
				choice = kb.next();
			   } while (choice.equalsIgnoreCase("yes"));
			
			try (
					// Create a file
					java.io.PrintWriter output = new java.io.PrintWriter(favoriteSites);
				) 
			{
				for (int i = 0; i < websites.size(); i++) 
				{
					output.println(websites.get(i));
				}
			}
			System.out.println("Your list of favorite websites is located at: " + favoriteSites.getAbsolutePath());
		}

		for (int i = 0; i < websites.size(); i++) {
			if (Desktop.isDesktopSupported()) {
				try {
					Desktop.getDesktop().browse(new URI(websites.get(i)));
				} catch (IOException | URISyntaxException e) {
					e.printStackTrace();
				}
			} else {
				Runtime runtime = Runtime.getRuntime();
				try {
					runtime.exec("xdg-open " + websites.get(i));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}