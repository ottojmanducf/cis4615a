// version 1.01

class SensitiveHash {
  private Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
 
  public void removeEntry(Object key) {
    ht.remove(key);
  }
}

// ------------------------------------
// v1.01 the method of Hashtable is public and non-final which could be exploited by attackers or hackers.
// ------------------------------------

// version 1.02
// this implements a security check which should protect anything from being removed by attackers
// link: https://wiki.sei.cmu.edu/confluence/display/java/SEC04-J.+Protect+sensitive+operations+with+security+manager+checks

class SensitiveHash {
  private Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
 
  public void removeEntry(Object key) {
    check("removeKeyPermission");
    ht.remove(key);
  }
 
  private void check(String directive) {
    SecurityManager sm = System.getSecurityManager();
    if (sm != null) {
      sm.checkSecurityAccess(directive);
    }
  }
}
