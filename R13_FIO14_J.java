// version 1.01

public class CreateFile {
  public static void main(String[] args)
                          throws FileNotFoundException {
    final PrintStream out =
        new PrintStream(new BufferedOutputStream(
                        new FileOutputStream("foo.txt")));
    out.println("hello");
    Runtime.getRuntime().exit(1);
  }
}

// --------------------------
// v1.01 exits before closing the file. this could result in the program ending before the file has been written to.
// --------------------------

// version 1.02
// the following code allows for the file to be closed before the program finishes.
// link: https://wiki.sei.cmu.edu/confluence/display/java/FIO14-J.+Perform+proper+cleanup+at+program+termination

public class CreateFile {
  public static void main(String[] args)
                          throws FileNotFoundException {
    final PrintStream out =
    new PrintStream(new BufferedOutputStream(
        new FileOutputStream("foo.txt")));
    try {
      out.println("hello");
    } finally {
    try {
      out.close();
   } catch (IOException x) {
     // Handle error
   }
    }
    Runtime.getRuntime().exit(1);
  }
}
