import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.LinkedHashMap;

public class linkedHashMap<K,V> implements Map<K,V> {
	
	private LinkedHashMap<K,V> linkedHashMap = new LinkedHashMap<K,V>();
	private List<String> tipos =Arrays.asList("Mounstro","Trampa","Hechizo");
	
	
	public V put(K k, V v) {
		if (tipos.contains(v)) {
			return linkedHashMap.put(k, v);
		}else {
			return null;
		}
	}
	
	// pre: k is a key, possibly in the map
	// post: returns the value mapped to from k, or null
	public V get(K k) {
		return linkedHashMap.get(k);
	}
	
	public boolean containsValue(V v) {
		return linkedHashMap.containsValue(v);
	}
	
	public Set<K> keySet(){
		return linkedHashMap.keySet();
	}
	

}
