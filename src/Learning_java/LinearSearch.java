package Learning_java;
import java.util.*;
public class LinearSearch {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Enter target: ");
        int target = sc.nextInt();
        int[] arr = new int[n];
        int flag = 0;
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == target)
            {
                flag = 1;
                break;
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
