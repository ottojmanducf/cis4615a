// version 1.01

class SensitiveHash {
  private Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
 
  public void removeEntry(Object key) {
    ht.remove(key);
  }
}
