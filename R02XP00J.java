// version 1.01

public void deleteFile(){
 
  File someFile = new File("someFileName.txt");
  // Do something with someFile
  someFile.delete();
 
}

// ----------------------------------
// v1.01 had a vulnerability where the return values could be ignored 
// ----------------------------------

// version 1.02

// this version below ensures the delete() returns true and can handle any errors found
// link: https://wiki.sei.cmu.edu/confluence/display/java/EXP00-J.+Do+not+ignore+values+returned+by+methods

public void deleteFile(){
 
  File someFile = new File("someFileName.txt");
  // Do something with someFile
  if (!someFile.delete()) {
    // Handle failure to delete the file
  }
 
}
