import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RecorrerHashmap {

    public static void main(String[] args) {

        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("producto1", 5);
        mapa.put("producto2", 7);
        mapa.put("producto3", 9);
        mapa.put("producto4", 1);
        mapa.put("producto5", 4);

        System.out.println("Recorrer las claves");
        for (String clave : mapa.keySet()) {
            int valor = mapa.get(clave);
            System.out.println("Clave: " + clave + ", valor: " + valor);
        }

        System.out.println("Recorrer con un iterator");
        Iterator<String> it = mapa.keySet().iterator();

        while (it.hasNext()) {
            String clave = it.next();
            int valor = mapa.get(clave);
            System.out.println("Clave: " + clave + ", valor: " + valor);
        }

        System.out.println("Recorrer mediante entry");
        for (Map.Entry entry : mapa.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", valor: " + entry.getValue());
        }

        System.out.println("Recorrer mediante entry e iterator");
        Iterator iterator = mapa.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("Clave: " + entry.getKey() + ", valor: " + entry.getValue());
        }

        System.out.println("Recorrer solo valores");
        for (int valor : mapa.values()) {
            System.out.println("valor: " + valor);
        }

    }

}