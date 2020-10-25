// version 1.01

private void readObject(final ObjectInputStream stream)
                        throws IOException, ClassNotFoundException {
  overridableMethod();
  stream.defaultReadObject();
}
 
public void overridableMethod() {
  // do stuff
}

// --------------------------------------
// v1.01 calls the overridable method from readObjet()
// --------------------------------------

// version 1.02
// the below code removes the premature call of the method overridableMethod().
// link: https://wiki.sei.cmu.edu/confluence/display/java/SER09-J.+Do+not+invoke+overridable+methods+from+the+readObject%28%29+method

private void readObject(final ObjectInputStream stream)
                        throws IOException, ClassNotFoundException {
  stream.defaultReadObject();
}
