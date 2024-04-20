import java.util.HashMap;
import java. util.LinkedHashMap;
//Create 15 students Name and ID using Random ,Ascending, Inserting order
//using increment all method 

public class Map {

	public static void main(String[] args) {
	
		java.util.Map<String, Integer> mp = new LinkedHashMap<String, Integer>();
		//Set<String> name = new HashSet<String>();
		
		
		
		mp.put("mamun", 123);
		mp.put("shah", 125);
		mp.put("warren", 222);
		mp.put("john", 124);
		mp.put("smith", 125);
		mp.put("walse", 223);
		mp.put("erika", 130);
		mp.put("mary", 166);
		mp.put("warren", 229);
	System.out.println(mp);
	System.out.println(mp.size());
	mp.get("mamun"); 
	
	System.out.println(mp.get("mamun")); 
	for(java.util.Map.Entry<String,Integer>eachMP :mp.entrySet()) {
		System.out.println(eachMP.getKey()+""+)+eachMP.getValue());
		
	}
	
	
	
	
	
	
	
	}

}
