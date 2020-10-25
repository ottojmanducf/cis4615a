// version 1.01

public final class CountHits {
  private static int counter;
 
  public void incrementCounter() {
    counter++;
  }
}

// --------------------------
// v1.01 could result in untrusted clients to fail to sync
// --------------------------

// version 1.02
// this version ensures that there is no need for external sync.
// link: https://wiki.sei.cmu.edu/confluence/display/java/LCK05-J.+Synchronize+access+to+static+fields+that+can+be+modified+by+untrusted+code

public final class CountHits {
  private static int counter;
  private static final Object lock = new Object();
 
  public void incrementCounter() {
    synchronized (lock) {
      counter++;
    }
  }
}
