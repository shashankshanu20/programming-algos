package personal.programming.algos.heapsmaps;

import java.util.*;

public class LRUCache {


}
class Solution {

    private Map<Integer, Integer> map;
    public Solution(int capacity) {
        this.map = new LinkedHashMap<Integer, Integer>(capacity, 100, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest)
            {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        if (map.containsKey(key))
            return map.get(key);
        return -1;
    }

    public void set(int key, int value) {
        map.put(key, value);
    }
}
