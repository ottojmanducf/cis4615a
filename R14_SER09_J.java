// version 1.01

private void readObject(final ObjectInputStream stream)
                        throws IOException, ClassNotFoundException {
  overridableMethod();
  stream.defaultReadObject();
}
 
public void overridableMethod() {
  // ...
}
