package chapone.item7.eliminateobsoletereferences;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * see @link{LinkedHashMap} for a cache that removes the oldest entry when a new one is added
 */

public class CacheObsolete {
    public static void main(String[] args) {
        // we can use WeakHashMap to cache objects that can be garbage collected,
        // but it is useful only if the lifetime of the cache is determined by the external references to the key, not the value
        WeakHashMap<String, String> cache = new WeakHashMap<>();

        // we can also use background thread (ScheduledThreatPoolExecutor)
        // or using LinkedHashMap which deletes as a side effect of adding new entries.

        LinkedHashMap<String, String> cache2 = new LinkedHashMap<>();
        cache2.put("key1", "value1");
        /**
         * See {@link LinkedHashMap#removeEldestEntry(Map.Entry)} for a cache that removes the oldest entry when a new one is added
         */
    }
}
