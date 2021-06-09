package projects;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Project1 {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = scan.nextInt();
		System.out.print(Squad(n));
	}

	public static Map<String, Map<String, Map>> Squad(int number) {
		Scanner scan = new Scanner(System.in);
		Map<String, String> str = new LinkedHashMap<>();

		Map<String, Map> Virat = new LinkedHashMap<>();
		Map<String, Map> Rohit = new LinkedHashMap<>();
		Map<String, Map> Hardik = new LinkedHashMap<>();
		Map<String, Map> Jasprit = new LinkedHashMap<>();
		Map<String, String> data = new LinkedHashMap<>();

		if (number == 1) {
			str.put("      INDIA   ", ">");
			str.put("\nVirat Kohli    ", " (C)  Batsmen ");
			str.put("\nRohit Sharma   ", " (VC) Batsmen ");
			str.put("\nHardik Pandya  ", "      All-rounder ");
			str.put("\nJasprit Bumrah ", "      Bowler ");

			System.out.println(str);
			System.out.println("\nEnter The Player Name:");
			String Str = scan.nextLine();
			if (Str.equals("Virat Kohli")) {
				data.put("VIRAT KOHLI", " CAPTAIN");
				data.put("\n  Age", " 32");
				data.put("\n  Right Handed BatsMan", "");
				data.put("\n  Matches", " 254");
				data.put("\n  Runs", " 12,169");
				data.put("\n  Average", " 59.09");
				data.put("\n  Best", " 183");
				Virat.put("data", data);
				return Virat.get("data");
			}
			if (Str.equals("Rohit Sharma")) {
				data.put("ROHIT SHARMA", " VICE CAPTAIN");
				data.put("\n  Age", " 34");
				data.put("\n  Right Handed BatsMan", "");
				data.put("\n  Matches", " 227");
				data.put("\n  Runs", " 90,205");
				data.put("\n  Average", " 48.96");
				data.put("\n  Best", " 264");
				Rohit.put("data", data);
				return Rohit.get("data");
			}
			if (Str.equals("Hardik Pandya")) {
				data.put("HARDIK PANDYA", " PLAYER");
				data.put("\n  Age", " 27");
				data.put("\n  Right Handed BatsMan", "");
				data.put("\n  Matches", " 60");
				data.put("\n  Runs", " 1,267");
				data.put("\n  Average", " 34.24");
				data.put("\n  Best", " 92*");
				Hardik.put("data", data);
				return Hardik.get("data");
			}
			if (Str.equals("Jasprit Bumrah")) {
				data.put("JASPRIT BUMRAH", " PLAYER");
				data.put("\n  Age", " 27");
				data.put("\n  Right Arm Fast Bowler", "");
				data.put("\n  Matches", " 67");
				data.put("\n  Wickets", " 108");
				data.put("\n  Average", " 25.33");
				data.put("\n  Best", " 5/27");
				Jasprit.put("data", data);
				return Jasprit.get("data");
			} else
				System.out.println("No Data Found");
		}

		Map<String, Map> Finch = new LinkedHashMap<>();
		Map<String, Map> Cummins = new LinkedHashMap<>();
		Map<String, Map> Maxwell = new LinkedHashMap<>();
		Map<String, Map> Behrendorff = new LinkedHashMap<>();

		if (number == 2) {
			str.put("     AUSTRALIA   ", ">");
			str.put("\nAaroan Finch      ", " (C)  Batsmen ");
			str.put("\nPat Cummins       ", " (VC) Bowler ");
			str.put("\nGlenn Maxwell     ", "      All-rounder ");
			str.put("\nJason Behrendorff ", "      Bowler ");
			System.out.println(str);

			System.out.println("\nEnter The Player Name:");
			String Str = scan.nextLine();
			if (Str.equals("Aaroan Finch")) {
				data.put("AAROAN FINCH", "CAPTAIN");
				data.put("\n  Age", " 34");
				data.put("\n  Right Handed BatsMan", "");
				data.put("\n  Matches", " 132");
				data.put("\n  Runs", " 5,232");
				data.put("\n  Average", " 41.85");
				data.put("\n  Best", " 153*");
				Finch.put("data", data);
				return Finch.get("data");
			}
			if (Str.equals("Pat Cummins")) {
				data.put("PAT CUMMINS", " VICE CAPTAIN");
				data.put("\n  Age", " 28");
				data.put("\n  Right Right Arm Fast Bowler", "");
				data.put("\n  Matches", " 69");
				data.put("\n  Wickets", " 111");
				data.put("\n  Average", " 28.78");
				data.put("\n  Best", " 5/70");
				Cummins.put("data", data);
				return Cummins.get("data");
			}
			if (Str.equals("Glenn Maxwell")) {
				data.put("GLENN MAXWELL", " PLAYER");
				data.put("\n  Age", " 32");
				data.put("\n  Right Handed BatsMan", "");
				data.put("\n  Matches", " 116");
				data.put("\n  Runs", " 3,230");
				data.put("\n  Average", " 34.36");
				data.put("\n  Best", " 108");
				Maxwell.put("data", data);
				return Maxwell.get("data");
			}
			if (Str.equals("Jason Behrendorff")) {
				data.put("JASON BEHRENDORFF", " PLAYER");
				data.put("\n  Age", " 31");
				data.put("\n  Right Left Arm Fast Medium", "");
				data.put("\n  Matches", " 11");
				data.put("\n  Wickets", " 16");
				data.put("\n  Average", " 32.31");
				data.put("\n  Best", " 5/44");
				Behrendorff.put("data", data);
				return Behrendorff.get("data");
			} else
				System.out.println("No Data Found");
		}
		return null;

	}
}
