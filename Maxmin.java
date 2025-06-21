import java.util.*;
public class Maxmin
{
    public static void main (String [] args)
    {
        int[] arr= {11,25,7,99,43,5};
        int m=0;
        int n=0;
        for(int i=0;i<arr.length;i++)
        {
            m=Math.max(m,arr[i]);
        }
        System.out.println(m);
        for(int i=0;i<arr.length;i++)
        {
            n=Math.min(m,arr[i]);
        }
        System.out.println(n);

    }
}
