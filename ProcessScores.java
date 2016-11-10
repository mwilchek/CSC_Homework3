import java.util.*;

public class ProcessScores {

	public static void main(String[] args) throws Exception {
		java.net.URL scoresSite = new java.net.URL("http://cs.armstrong.edu/liang/data/Scores.txt");
		Scanner kb = new Scanner(scoresSite.openStream());

		double sum = 0;
		int count = 0;

		while (kb.hasNext()) {
			sum += kb.nextDouble();
			count++;
		}
		double average = sum / count;
		System.out.println("The total of the scores is: " + sum);
		System.out.printf("The average of the scores is: %.2f", average);
		kb.close();
	}

}
