package ArrayList_Program;
import java.util.*;
public class FindLeader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            arr.add(sc.nextInt());
        }
        boolean[] visit = new boolean[arr.size()];
        int max = arr.get(arr.size() - 1);
        visit[arr.size() - 1] = true;
        for(int i = arr.size() - 1; i >= 0; i--)
        {
            if(arr.get(i) > max)
            {
                max = arr.get(i);
                visit[i] = true;
            }
        }
        for(int i = 0; i < n; i++)
        {
            if(visit[i])
            {
                System.out.print(arr.get(i) +" ");
            }
        }
    }
}
