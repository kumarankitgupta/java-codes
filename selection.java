import java.util.*;
public class selection {
    public static void main(String[] args) {
        int arr[] = {7,4,8,3,1};
        for(int i=0 ; i<arr.length-1;i++)
        {   int min=i;
            for(int j=i+1;j<arr.length;j++)
            {   
                if(arr[min]>arr[j])
                {   
                    min=j;
                }
            }
            int swap=arr[i];
            arr[i]=arr[min];
            arr[min]=swap;
            
        }
        System.out.println(Arrays.toString(arr));
    }
}
