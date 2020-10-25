// version 1.01

public static int getInteger(DataInputStream is) throws IOException {
  return is.readInt(); 
}

// ----------------------------------
// v1.01 has a vulnerability where the value could be mis-read of misunderstood. 
// ----------------------------------

// version 1.02
public static long getInteger(DataInputStream is) throws IOException {
  return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
}

// link: https://wiki.sei.cmu.edu/confluence/display/java/NUM03-J.+Use+integer+types+that+can+fully+represent+the+possible+range+of++unsigned+data
