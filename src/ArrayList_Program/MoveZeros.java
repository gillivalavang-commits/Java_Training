package ArrayList_Program;
import java.util.*;
public class MoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        int index = 0;
        for(int i = 0; i < n; i++)
        {
            arr.add(sc.nextInt());
        }
        for(int i = 0; i < n; i++)
        {
            if(arr.get(i) != 0)
            {
                Collections.swap(arr, index, i);
                index++;
            }
        }
        for(int k: arr) System.out.print(k+" ");
    }
}
