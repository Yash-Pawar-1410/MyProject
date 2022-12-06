package Functional_Interface_Assignment.Assignment_1;


/*- Write a functional interface named **InputStreamOpener** whose functional method, named open, accepts a String argument and returns an InputStream.
        - Write an implementation that opens a DataInputStream.
        - Write a second implementation that opens an ObjectInputStream.
        - Write a third implementation that opens a BufferedInputStream.
        - Use traditional way, anonymous classes way and lambda expression for all implementation.
        - Demonstrate the implementation in a main program.*/

public interface InputStreamOpener {
    String open(String string);

}
