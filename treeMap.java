import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class treeMap<K,V> implements Map<K,V> {

    TreeMap<K,V> treeMap = new TreeMap<K,V>();

	List<String> tipos =Arrays.asList("Mounstro","Trampa","Hechizo");

	public V put(K k, V v) {
		if (tipos.contains(v)) {
			return treeMap.put(k, v);
		}else {
			return null;
		}
	}
	
	// pre: k is a key, possibly in the map
	// post: returns the value mapped to from k, or null
	public V get(K k) {
		return treeMap.get(k);
	}
	
	public boolean containsValue(V v) {
		return treeMap.containsValue(v);
	}
	
	public Set<K> keySet(){
		return treeMap.keySet();
	}
	// post: returns a set of all keys associated with this map
}
