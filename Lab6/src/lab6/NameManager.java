package lab6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NameManager {
	private List<String> names = new ArrayList<String>();
	
	public void addName(String name) {
        names.add(name);
    }
	
	public void printNames() {
        for (String name : names) {
            System.out.println(name);
        }
	}
	
	 public void removeLongNames() {
	        Iterator<String> iterator = names.iterator();
	        while (iterator.hasNext()) {
	            String name = iterator.next();
	            if (name.length() > 15) {
	                iterator.remove();
	            }
	        }
	 }
}
