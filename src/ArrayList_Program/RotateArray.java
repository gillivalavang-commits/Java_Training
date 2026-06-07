package ArrayList_Program;
import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Enter rotate: ");
        int r = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            arr.add(sc.nextInt());
        }
        if(r > 0) {
            List<Integer> sub = arr.subList( n - r,n);
            for(int i = 0; i < n - r; i++)
            {
               sub.add(arr.get(i));
            }
            System.out.println(sub);

        } else {
            for (int k : arr) {
                System.out.print(k + " ");
            }
        }
    }
}
