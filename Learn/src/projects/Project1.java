package projects;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Project1 {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number \n1--> For India \n2--> For Australia");
		int n = scan.nextInt();
		System.out.print(squad(n));
	}

	public static Map<String, String> squad(int number) {
		Scanner scan = new Scanner(System.in);

		String age = "\n  Age", matches = "\n  Matches", runs = "\n  Runs", average = "\n  Average", best = "\n  Best",
				wickets = "\n  Wickets";
		String batsman = "  Batsman", bowler = "  Bowler", allrounder = "  All-Rounder", c = "CAPTAIN",
				vc = "VICE CAPTAIN";
		Map<String, String> player = new LinkedHashMap();
		Map<String, String> data = new LinkedHashMap<>();

		if (number == 1) {
			player.put("      INDIA   ", ">");
			player.put("\nVirat Kohli  (C)  ", batsman);
			player.put("\nRohit Sharma (VC) ", batsman);
			player.put("\nHardik Pandya  ", allrounder);
			player.put("\nJasprit Bumrah ", bowler);

			System.out.println(player);
			System.out.println("\nEnter The Player Name:");
			String str = scan.nextLine();
			if (str.equals("Virat Kohli")) {
				data.put("VIRAT KOHLI", c);
				data.put(age, " 32");
				data.put("\n  Right Handed BatsMan", "");
				data.put(matches, " 254");
				data.put(runs, " 12,169");
				data.put(average, " 59.09");
				data.put(best, " 183");
				return data;
			}
			if (str.equals("Rohit Sharma")) {
				data.put("ROHIT SHARMA", vc);
				data.put(age, " 34");
				data.put("\n  Right Handed BatsMan", "");
				data.put(matches, " 227");
				data.put(runs, " 90,205");
				data.put(average, " 48.96");
				data.put(best, " 264");
				return data;
			}
			if (str.equals("Hardik Pandya")) {
				data.put("HARDIK PANDYA", " PLAYER");
				data.put(age, " 27");
				data.put("\n  Right Handed BatsMan", "");
				data.put(matches, " 60");
				data.put(runs, " 1,267");
				data.put(average, " 34.24");
				data.put(best, " 92*");
				return data;
			}
			if (str.equals("Jasprit Bumrah")) {
				data.put("JASPRIT BUMRAH", " PLAYER");
				data.put(age, " 27");
				data.put("\n  Right Arm Fast", "");
				data.put(matches, " 67");
				data.put(wickets, " 108");
				data.put(average, " 25.33");
				data.put(best, " 5/27");
				return data;
			}
			// else
			// System.out.println("No Data Found");
		}

		if (number == 2) {
			player.put("     AUSTRALIA   ", ">");
			player.put("\nAaroan Finch  (C)  ", batsman);
			player.put("\nPat Cummins   (VC)  ", bowler);
			player.put("\nGlenn Maxwell  ", allrounder);
			player.put("\nJason Behrendorff  ", bowler);
			System.out.println(player);

			System.out.println("\nEnter The Player Name:");
			String str = scan.nextLine();
			if (str.equals("Aaroan Finch")) {
				data.put("AAROAN FINCH", c);
				data.put(age, " 34");
				data.put("\n  Right Handed BatsMan", "");
				data.put(matches, " 132");
				data.put(runs, " 5,232");
				data.put(average, " 41.85");
				data.put(best, " 153*");
				return data;
			}
			if (str.equals("Pat Cummins")) {
				data.put("PAT CUMMINS", vc);
				data.put(age, " 28");
				data.put("\n  Right Arm Fast", "");
				data.put(matches, " 69");
				data.put(wickets, " 111");
				data.put(average, " 28.78");
				data.put(best, " 5/70");
				return data;
			}
			if (str.equals("Glenn Maxwell")) {
				data.put("GLENN MAXWELL", " PLAYER");
				data.put(age, " 32");
				data.put("\n  Right Handed BatsMan", "");
				data.put(matches, " 116");
				data.put(runs, " 3,230");
				data.put(average, " 34.36");
				data.put(best, " 108");
				return data;
			}
			if (str.equals("Jason Behrendorff")) {
				data.put("JASON BEHRENDORFF", " PLAYER");
				data.put(age, " 31");
				data.put("\n  Left Arm Fast Medium", "");
				data.put(matches, " 11");
				data.put(wickets, " 16");
				data.put(average, " 32.31");
				data.put(best, " 5/44");
				return data;
			}
			// else
			// System.out.println("No Data Found");
		}
		return null;

	}
}
