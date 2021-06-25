package projects;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

public class Printing {

	public static Map<String, Map<String, Map>> print(Map map) {
		Iterator itr = map.keySet().iterator();
		while (itr.hasNext()) {
			String key = (String) itr.next();
			System.out.print(key + " " + map.get(key));
		}
		Map<String, Map<String, Map>> empty = Collections.emptyMap();
		return empty;
	}

}