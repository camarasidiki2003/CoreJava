package class8Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Jc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		String[] names = new String[4];
		names[0]="James";
		names[1]="Tom";
		names[0]="Sid";
		names[0]="Steve";
		System.out.println(names.length);
		System.out.println(names[3]);
		System.out.println(names[0]);
		
		names = new String[6];
		names[4]="Tim";
		names[2]="Tom";
		names[4]="Tim";
		names[4]="Tim";
		names[4]="Tim";
	*/
		// Dynamic automamtically allocate  memory
		List<String> myList = new ArrayList<String>();
		//or
		//ArrayList<Integer> my2ndList = ArrayList<Integer>();
		/*myList.add("James");
		myList.add("Tom");
		myList.add("Steve");
		myList.add("Jane");
		myList.add("James");
		System.out.println(myList.size());
		System.out.println(myList);
		System.out.println(myList.get(1));
		myList.remove(1);
		System.out.println(myList.get(1));
		System.out.println(myList.size());
		
		*/
		//List<String> myList = new ArrayList<String>();
		//or
		//Set<String> myList = LiknkedListHashSet<String>();
		// Not duplicate, Random) LinkedHashShet(No duplicate, Insertion oreder, TreeSt(No duplicate, Alpha order)
		// HasSet>LinkedHasSet>TreeSet// Speed
		myList.add("James");
		myList.add("Tom");
		myList.add("Steve");
		myList.add("Jane");
		myList.add("James");
		System.out.println(myList.size());
		System.out.println(myList);
		System.out.println(myList.get(1));
		myList.remove(1);
		System.out.println(myList.get(1));
		System.out.println(myList.size());
		
		//Map: HashMap, SetMap, TreeMap
		//Key, Value pair
		//formula:
		Map<Integer, String> abc = new HashMap<Integer, String>();
         abc.put(55,  "James");
         abc.put(34,  "Tom");
         abc.put(55,  "Steve");
         abc.put(64,  "Steve");
         abc.put(96,  "Tim");
         System.out.println(abc.size());
         System.out.println(abc);
         System.out.println(abc.get(34));
         System.out.println(abc.keySet());
         System.out.println(abc.values());
         for(Integer x : abc.keySet())  {
        	 System.out.println(x);
         }   
         for(String x : abc.values())  {
        	 System.out.println(x);
         }
	}

}
