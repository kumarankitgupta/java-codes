import java.io.*;
public class ReadWrite{
  public static void main(String[] args) 
  throws IOException {
    Reader r = new FileReader("f1.txt");
    int  i = r.read();
    while(i != -1){
        System.out.print((char)i);
        i = r.read();
    }
    Writer w = new FileWriter("f1.txt");
    w.write("My name Is Aandhi Gupta");
    w.append(" hello"+" hero");
    w.close();
}
}
