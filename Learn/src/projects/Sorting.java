package projects;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Sorting {

	static HashMap<String, Integer> data = new HashMap<>();

	public static void sort(Map<String, String> player1, Map<String, String> player2, Map<String, String> player3,
			Map<String, String> player4, String matches, String runs, String best, String age, String name,
			String name1, String name2, String name3, Map<String, String> player) {
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"\n\nWant To Arrange The Players in order? \nPress: \n1-->No Of Matches played \n2-->Total runs scored \n3-->High score \n4-->Age");
		int i = scan.nextInt();
		if (i == 1) {
			data.put(name, Integer.parseInt((String) player1.get(matches)));
			data.put(name1, Integer.parseInt((String) player2.get(matches)));
			data.put(name2, Integer.parseInt((String) player3.get(matches)));
			data.put(name3, Integer.parseInt((String) player4.get(matches)));
			sortUsingValues(data);
		} else if (i == 2) {
			data.put(name, Integer.parseInt((String) player1.get(runs)));
			data.put(name1, Integer.parseInt((String) player2.get(runs)));
			data.put(name2, Integer.parseInt((String) player3.get(runs)));
			data.put(name3, Integer.parseInt((String) player4.get(runs)));
			sortUsingValues(data);
		} else if (i == 3) {
			data.put(name, Integer.parseInt((String) player1.get(best)));
			data.put(name1, Integer.parseInt((String) player2.get(best)));
			data.put(name2, Integer.parseInt((String) player3.get(best)));
			data.put(name3, Integer.parseInt((String) player4.get(best)));
			sortUsingValues(data);
		} else if (i == 4) {
			data.put(name, Integer.parseInt((String) player1.get(age)));
			data.put(name1, Integer.parseInt((String) player2.get(age)));
			data.put(name2, Integer.parseInt((String) player3.get(age)));
			data.put(name3, Integer.parseInt((String) player4.get(age)));
			sortUsingValues(data);
		}
	}

	public static void sortUsingValues(HashMap<String, Integer> data) {
		Map<String, Integer> map = sortValues(data);
		Set set2 = map.entrySet();
		Iterator iterate2 = set2.iterator();
		while (iterate2.hasNext()) {
			Map.Entry me2 = (Map.Entry) iterate2.next();
			System.out.print(me2.getKey() + " " + me2.getValue());
		}
	}

	private static HashMap sortValues(HashMap map) {
		LinkedList list = new LinkedList(map.entrySet());
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
			}
		});
		HashMap sortedHashMap = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}
		return sortedHashMap;
	}

	public static void sortUsingKey(HashMap<String, Integer> data2) {

		Iterator<String> it = data2.keySet().iterator();
		TreeMap<String, Integer> tm = new TreeMap<>(data2);

		Iterator itr = tm.keySet().iterator();
		System.out.println("\nAfter Sorting\n");
		while (itr.hasNext()) {
			String key = (String) itr.next();
			System.out.println(key + " " + tm.get(key));
		}
	}
}