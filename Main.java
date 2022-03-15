import java.util.ArrayList;
import java.util.Iterator;
public class Main {
	public static void main(String[] args) {
		
		 
		
		
		ArrayList<String> tip = new ArrayList<String>();
		tip.add("Mounstro");
		tip.add("Trampa");
		tip.add("Hechizo");
		
		// Vamos a remplazar esto por un factory
		//Map<String,String> map = new hashMap<String,String>();
		//Map<String,String> map = new linkedHashMap<String,String>();
		//Map<String,String> map = new treeMap<String,String>();
		
		MapFactory<String,String> factory = new MapFactory <String,String>();
		Map<String,String> map = factory.getMap("1");
		
		map.put("asdf", "otraCosa");
		
		
		
		if (map.put("1", "Hechizo") == null) {
			System.out.println("Error, el tipo de carta no existe");
		}
		
		map.put("11", "Trampa");
		map.put("11s", "Mounstro");
		map.put("54", "Hechizo");
		map.put("3", "Hechizo");
		map.put("5345", "Hechizo");
		map.put("6", "Hechizo");
		map.put("12", "Trampa");
		map.put("21", "Trampa");
		map.put("101", "Trampa");
		
		/*
		for (Entry<String, String> nombre : map.entrySet()){
			String clave = jugador.getKey();
			JugadorSeleccion valor = jugador.getValue();
			System.out.println(clave+"  ->  "+valor.toString());
		}
		*/
		
		// 3. Mostrar el nombre, tipo y cantidad de cada carta que el usuario tiene en su colección.
		for (String key : map.keySet()){
			String tipo = map.get(key);
	
			System.out.println("Nombre: "+key+" Tipo: "+tipo);
			//System.out.println("------------------------------------------------");	
		}
		
		for (String x : tip) {
			int i = 0;
			for (String key : map.keySet()){
				String tipo = map.get(key);
				if (tipo.equals(x)) {
					i ++;
				}
			}
			System.out.println("La cantidad de cartas tipo "+ x+ " es: "+i);
			System.out.println("------------------------------------------------");
		}
		
		// 4. Mostrar el nombre, tipo y cantidad de cada carta que el
		// usuario tiene en su colección, ordenadas por
		
		for (String x : tip) {
			int i = 0;
			for (String key : map.keySet()){
				String tipo = map.get(key);
				if (tipo.equals(x)) {
					System.out.println("Nombre: "+ key );
					i ++;
				}
			}
			System.out.println("La cantidad de cartas tipo "+ x+ " es: "+i);
			System.out.println("------------------------------------------------");
		}
		
		// 5. Mostrar el nombre y tipo de todas las cartas existentes
		
		for (String key : map.keySet()){
			String tipo = map.get(key);
	
			System.out.println("Nombre: "+key+" Tipo: "+tipo);
			//System.out.println("------------------------------------------------");	
		}
		
		//6. Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo.
		for (String x : tip) {
			
			for (String key : map.keySet()){
				String tipo = map.get(key);
				if (tipo.equals(x)) {
					System.out.println("Nombre: "+ key );
					
				}
			}
			System.out.println("Cartas de tipo "+ x);
			System.out.println("------------------------------------------------");
		}
		
	}

}
