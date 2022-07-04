import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7,8};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        String str = 9 + " is a odd number " + 2 + "is a even number";
        System.out.println(str);
        // intiallization and declaration in same line
        int[] arr1  = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=sc.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        // intiallization and declaration in seprate line
        int[] arr2;
        arr2 = new int[15];


    }
}
