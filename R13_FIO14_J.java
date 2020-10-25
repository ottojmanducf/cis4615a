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
