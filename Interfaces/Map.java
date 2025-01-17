import java.util.Map;


public interface Map<K, V> {

  // Method that removes all entries from this map
  public abstract void clear();

  // Returns true if the map contains entries of the specified key
  public abstract boolean containsKey(Object key);

  // Returns true if the map maps one or more keys to the specified value
  public abstract boolean containsValue(Object value);

  // Returns a set consisting of the entries in this map
  public abstract Set<Map.Entry<K, V>> entrySet();

  // Returns the value of the specified key in the map
  public abstract V get(Object key);

  // Returns true if this map has no entry
  public abstract boolean isEmpty();

  // Returns a set consisting of the keys in this map
  public abstract Set<K> keySet();

  // Places the key along with its entry in the map
  public abstract void put(K key, V value);

  // Adds all entries from a specified map to this map
  public abstract void putAll(Map<? extends K, ? extends V> map);

  // Removes and returns the entries for the specified key
  public abstract V remove(K key);

  // Returns the number of entries in this map
  public abstract int size();

  // Returns a collection consisting of the values in this map
  public abstract Collection<V> values();


  // An interface within this map interface
  public interface Entry<K, V> {

    // Returns the key corresponding to this entry
    public abstract K getKey();

    // Returns the value corresponding to this entry
    public abstract V getValue();

    // Replaces the value of this entry with the new value
    public abstract void setValue();
  }
}
