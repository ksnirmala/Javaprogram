package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {
		//HashMap<Long,String> hm=new HashMap<Long, String>();
		//LinkedHashMap<Long,String> hm=new LinkedHashMap<Long, String>();
		TreeMap<Long,String> hm=new TreeMap<Long, String>();
		hm.put(7708335639L, "mama");
        hm.put(6301375015L, "nirmala");
        hm.put(9618135721L, "amma");
        hm.put(8712115243L, "anna");
        for(Map.Entry m:hm.entrySet()){    
	           System.out.println(m.getKey()+" :"+m.getValue());    
	          }

        
        
	}

}
