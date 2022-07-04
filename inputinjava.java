import java.util.*;
public class inputinjava {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    // nextDouble
    // nextFloat
    // next
    // nextLong
    // nextLine
    System.out.println("value = "+a);
    // input string
    sc.nextLine();  // because we have to skip the line of integer;
    System.out.print("enter your name ");
    String name = sc.nextLine();
    System.out.println(name);
    }  
}
