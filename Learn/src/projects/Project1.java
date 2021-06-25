package projects;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Project1 {
	static Map<String, String> player = new LinkedHashMap<>();
	static Map<String, String> data = new LinkedHashMap<>();
	static Map<String, String> data1 = new LinkedHashMap<>();
	static Map<String, String> data2 = new LinkedHashMap<>();
	static Map<String, String> data3 = new LinkedHashMap<>();

	static String age = "\n  Age", matches = "\n  Matches", runs = "\n  Runs", average = "\n  Average",
			best = "\n  Best", wickets = "\n  Wickets";
	static String batsman = "  Batsman", bowler = "  Bowler", allrounder = "  All-Rounder", c = "CAPTAIN",
			vc = "VICE CAPTAIN";
	static String name, name1, name2, name3;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number \n1-->India \n2-->Australia");
		int n = scan.nextInt();
		System.out.print(squad(n));
		Sorting.sort(data, data1, data2, data3, matches, runs, best, age, name, name1, name2, name3, player);
	}

	public static Map<String, Map<String, Map>> squad(int number) {
		Scanner scan = new Scanner(System.in);

		if (number == 1) {
			name = "\nVirat Kohli";
			name1 = "\nRohit Sharma";
			name2 = "\nHardik Pandya";
			name3 = "\nJasprit Bumrah";
			player.put("        INDIA   ", "");
			player.put(name, batsman);
			player.put(name1, batsman);
			player.put(name2, allrounder);
			player.put(name3, bowler);

			data.put("VIRAT KOHLI", c);
			data.put(age, "32");
			data.put("\n  Right Handed BatsMan", "");
			data.put(matches, "254");
			data.put(runs, "12169");
			data.put(average, "59.09");
			data.put(best, "183");

			data1.put("ROHIT SHARMA", vc);
			data1.put(age, "34");
			data1.put("\n  Right Handed BatsMan", "");
			data1.put(matches, "227");
			data1.put(runs, "90205");
			data1.put(average, "48.96");
			data1.put(best, "264");

			data2.put("HARDIK PANDYA", " PLAYER");
			data2.put(age, "27");
			data2.put("\n  Right Handed BatsMan", "");
			data2.put(matches, "60");
			data2.put(runs, "1267");
			data2.put(average, " 34.24");
			data2.put(best, "92");

			data3.put("JASPRIT BUMRAH", " PLAYER");
			data3.put(age, "27");
			data3.put("\n  Right Arm Fast", "");
			data3.put(matches, "67");
			data3.put(runs, "108");
			data3.put(average, "25.33");
			data3.put(best, "27");

			Printing.print(player);
			System.out.println("\n\nEnter The Player Name In The List:");
			String str = scan.nextLine();

			if (str.equals("Virat Kohli")) {
				return Printing.print(data);
			}
			if (str.equals("Rohit Sharma")) {
				return Printing.print(data1);
			}
			if (str.equals("Hardik Pandya")) {
				return Printing.print(data2);
			}
			if (str.equals("Jasprit Bumrah")) {
				return Printing.print(data3);
			}
		}
		if (number == 2) {
			name = "\nAaroan Finch";
			name1 = "\nPat Cummins";
			name2 = "\nGlenn Maxwell";
			name3 = "\nJason Behrendorff";
			player.put("    AUSTRALIA   ", "");
			player.put(name, batsman);
			player.put(name1, bowler);
			player.put(name2, allrounder);
			player.put(name3, bowler);

			data.put("AAROAN FINCH", c);
			data.put(age, "34");
			data.put("\n  Right Handed BatsMan", "");
			data.put(matches, "132");
			data.put(runs, "5232");
			data.put(average, "41.85");
			data.put(best, "153");

			data1.put("PAT CUMMINS", vc);
			data1.put(age, "28");
			data1.put("\n  Right Arm Fast", "");
			data1.put(matches, "69");
			data1.put(runs, "111");
			data1.put(average, "28.78");
			data1.put(best, "70");

			data2.put("GLENN MAXWELL", " PLAYER");
			data2.put(age, "32");
			data2.put("\n  Right Handed BatsMan", "");
			data2.put(matches, "116");
			data2.put(runs, "3230");
			data2.put(average, "34.36");
			data2.put(best, "108");

			data3.put("JASON BEHRENDORFF", " PLAYER");
			data3.put(age, "31");
			data3.put("\n  Left Arm Fast Medium", "");
			data3.put(matches, "11");
			data3.put(runs, "16");
			data3.put(average, "32.31");
			data3.put(best, "44");

			Printing.print(player);
			System.out.println("\n\nEnter The Player Name:");
			String str = scan.nextLine();
			if (str.equals("Aaroan Finch")) {
				return Printing.print(data);
			}
			if (str.equals("Pat Cummins")) {
				return Printing.print(data1);
			}
			if (str.equals("Glenn Maxwell")) {
				return Printing.print(data2);
			}
			if (str.equals("Jason Behrendorff")) {
				return Printing.print(data3);
			}
		}
		Map<String, Map<String, Map>> empty = Collections.emptyMap();
		return empty;
	}

}
