package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Rubens", "Teste");
        System.out.println(map.get("Rubens"));
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
