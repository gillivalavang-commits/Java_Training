package ArrayList_Program;
import java.util.*;
public class FindPairWithTargetSum {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     ArrayList<Integer> arr = new ArrayList<>();
     for(int i = 0; i < n; i++)
     {
         arr.add(sc.nextInt());
     }
     int flag = 0;
     System.out.print("Enter target: ");
     int target = sc.nextInt();
     for(int i = 0; i < n; i++)
     {
         for(int j = 0; j < n; j++)
         {
             if((arr.get(i) + arr.get(j)) == target)
             {
                 flag = 1;
                 break;
             }
         }
     }
     if(flag == 0) System.out.print("false");
     else System.out.print("true");
    }
}
