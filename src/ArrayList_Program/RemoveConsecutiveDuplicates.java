package ArrayList_Program;

import java.util.*;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            list.add(sc.nextInt());
        }
        System.out.print(list.get(0)+" ");
        int cur = 1;
        for(int i = 0; i < n - 1; i++)
        {
            if(list.get(i) == list.get(cur))
            {
                cur++;
                continue;
            }
            else {
                System.out.print(list.get(cur) +" ");
                cur++;
            }

        }
    }
}
