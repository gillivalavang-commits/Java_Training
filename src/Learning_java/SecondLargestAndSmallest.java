package Learning_java;
import java.util.*;
public class SecondLargestAndSmallest {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int max = 0, smax = 0;
        int min = arr[0], smin = 0;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] > max)
            {
                smax = max;
                max = arr[i];
            }
            else if (arr[i] > smax && smax != max){
                smax = arr[i];
            }

            if(arr[i] < min)
            {
                smin = min;
                min = arr[i];
            }
            else if(arr[i] < smin && smin != min)
            {
              smin = arr[i];
            }
        }
        System.out.print("Second largest: "+ smax+"\nSecond smallest: "+smin);
    }
}
