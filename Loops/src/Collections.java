import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Collections {
	public static void main(String[] args) {
		List<String> storeList = new ArrayList<>();
		storeList.add("Clothing Store");
		storeList.add("Electronics Store");
		storeList.add("Home Decor store");
		
		ListIterator listIterator = storeList.listIterator();
		while(listIterator.next().equals("Clothing Store")) {
			System.out.println(listIterator.next()); 
		} 
		/* while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		//System.out.println("StoreList : " + storeList);
		

		/* Set<String> uniqueStores = new HashSet<>(storeList);
		System.out.println("Unique Stores : " + uniqueStores);
		
		Map<String, String> storeDirectory = new HashMap<>(); 
		storeDirectory.put("Clothing Store", "1st Floor");
		storeDirectory.put("Electronics Store", "2nd Floor");
		storeDirectory.put("Home Decor store", "3rd Floor");
		System.out.println("StoreDirectory :"+storeDirectory); */

	}

}
