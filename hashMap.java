import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class hashMap<K,V> implements Map<K,V>{
	private HashMap<K, V> hashmap = new HashMap<K, V>();
	
	private List<String> tipos =Arrays.asList("Mounstro","Trampa","Hechizo");

	public V put(K k, V v) {
		if (tipos.contains(v)) {
			return hashmap.put(k, v);
		}else {
			return null;
		}
	}
	
	// pre: k is a key, possibly in the map
	// post: returns the value mapped to from k, or null
	public V get(K k) {
		return hashmap.get(k);
	}
	
	public boolean containsValue(V v) {
		return hashmap.containsValue(v);
	}
	// pre: v is non-null
	// post: returns true iff v is the target of at least one map entry;
	// that is, v is in the range of the map
	
	
	public Set<K> keySet(){
		return hashmap.keySet();
	}
	// post: returns a set of all keys associated with this map
}
