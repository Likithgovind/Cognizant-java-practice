import java.util.*;
public class Arraysum
{
    public static void main(String [] args)
    {
        Scanner scan =new Scanner(System.in);
        int [] numbers = new int[5];
        int sum=0;
        System.out.println("enter the 5 numbers");
        for (int i=0;i<5;i++)
        {
            numbers[i]=scan.nextInt();
            sum+=numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(sum);
    }
}
