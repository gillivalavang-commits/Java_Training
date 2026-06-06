package Learning_java;
import java.util.*;
public class RemoveDuplicate {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        //without use ArrayList
        int[] rd = new int[n];
        int t = 0;

        //with use ArrayList
        ArrayList<Integer>  rdu = new ArrayList<>();

        boolean[] visit = new boolean[1000];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        // without use Arraylist
//        for(int i = 0; i < n;i++)
//        {
//            for(int j = 0; j < n; j++) {
//                if (visit[arr[i] - 1] == false) {
//                    if (arr[i] == arr[j]) {
//                        visit[arr[i] - 1] = true;
//                        rd[t] = arr[i];
//                        t++;
//                    }
//                }
//            }
//        }
//        for(int k : rd)
//        {
//            if(k == 0)
//            {
//                continue;
//            }
//            System.out.print(k+" ");
//        }
        for(int i = 0; i < n; i++)
        {
        for(int j = 0; j < n; j++) {
            if (visit[arr[i] - 1] == false) {
                if (arr[i] == arr[j]) {
                    visit[arr[i] - 1] = true;
                    //rd[t] = arr[i]; use another for store remove duplicate elements
                    //t++;
                    rdu.add(arr[i]); // use dynamic allocation which help store the value without size of original array

                }
            }
        }
    }
        for(int d : rdu)
        {
            System.out.print(d+" ");
        }

    }
}
