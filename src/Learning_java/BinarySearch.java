package Learning_java;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int start = 0;
        int end = arr.length - 1;
        int flag = 0;

        while(start <= end)
        {
            int mid = (start  + end)/2;

            if(arr[mid] == target)
            {
                flag = 1;
                break;
            }
            else if(arr[mid] < target)
            {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        if(flag == 1)
        {
            System.out.print("Element found");
        }
        else {
            System.out.print("Element not found");
        }
    }
}
