
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MapUSA {

    private final int NUM_OF_CITIES;
    int[][] edges = {
       //  Miles in between cities in matrix form
       //  Chicago  San Fran  Philly   Phoenix  Eugene
            {0      , 2127  , 758   ,  1753  ,  2135}, // Chicago
            {2127   , 0     , 2827  ,  754   ,  528 }, // San Fran
            {758    , 2871  , 0     ,  2342  ,  2879}, // Philly
            {1753   , 752   , 2342  ,  0     ,  1226}, // Phoenix
            {2136   , 529   , 2879  ,  1229  ,  0   }  // Eugene
    };
    HashMap<Integer, String> verteices = new HashMap<>();

    public MapUSA() {
        fillMatrix();
        NUM_OF_CITIES = verteices.size();
        printMap();
    }

    private void fillMatrix() {
        verteices.put(0, "Chicago");
        verteices.put(1, "San Fran");
        verteices.put(2, "Philadelphia");
        verteices.put(3, "Phoenix");
        verteices.put(4, "Eugene");
    }

    public void printMap() {
        StringBuilder spaces;

        for (int i = 0; i < verteices.size(); i++) {
            System.out.print("    " + verteices.get(i));
        }
        System.out.println();
        for (int i = 0; i < NUM_OF_CITIES; i++) {
            for (int j = 0; j < NUM_OF_CITIES; j++) {
                spaces = new StringBuilder();
                for (int k = 0; k < verteices.get(j).length(); k++) {
                    spaces.append(" ");
                }
                System.out.print(spaces.toString() + edges[i][j]);
            }
            System.out.print("    " + verteices.get(i));
            System.out.println();
            System.out.println();
        }


    }

    private <K, V> Integer getKey(V value) {
        Map<Integer, String> map = verteices;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void dijkstra(String start, String[] pred, int[] distance) {
        int numV = NUM_OF_CITIES;
        HashSet<Integer> vMinusS = new HashSet<>(numV);

        for (int i = 0; i < numV; i++) {
            if ()
        }

        for (int v)
    }


}
