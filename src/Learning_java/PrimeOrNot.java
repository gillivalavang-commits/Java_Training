package Learning_java;
import java.util.*;
public class PrimeOrNot {
    public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int flag = 0;
    for(int i = 2; i <= Math.sqrt(n); i++)
    {
        if(n % i == 0)
        {
            flag = 1;
            break;
        }
    }

    if(flag == 0) {
        System.out.print("Prime");
    }
    else
    {
        System.out.print("Not a prime");
    }
  }
}