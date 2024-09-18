package collections;

import java.util.HashMap;
import java.util.Map;

public class MapProg {
	public static void main(String a[])
	{
		Map<Integer, String> mpObj = new HashMap<Integer, String>();
		mpObj.put(1, "java");
		mpObj.put(2, "selenium");
		System.out.println(mpObj);
		
		System.out.println(mpObj.get(1));
		  
        Map<String, String> mapObj = new HashMap<String, String>();
        mapObj.put("1", "one");
        mapObj.put("2","two");
     
        System.out.println(mapObj.entrySet());
        System.out.println(mapObj.get("1"));
        System.out.println(mapObj.keySet());
        System.out.println(mapObj.containsKey("1"));
        System.out.println(mapObj.getOrDefault(1, "four"));
		
	}

}
