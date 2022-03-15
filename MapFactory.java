
public class MapFactory<K,V> {
	
	public Map<K,V> getMap(String entry) {
	    // seleccion de la implementacion a utilizar:
		if (entry.equals("1")) { // 1 HashMap 
	      return new hashMap<K,V>(); //regresa ArrayList
		}
		else if (entry.equals("2")){ // Elije LinkedHashMap
			return new linkedHashMap<K,V>(); //regresa Vector
			
		}else if (entry.equals("3")){ // Elije LinkedHashMap
			return new treeMap<K,V>(); //regresa Vector
		}
		else {// Sino elije lista
			return null;
		}
	      
	   }
}

