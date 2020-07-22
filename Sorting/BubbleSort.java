
import java.util.Scanner;

public class BubbleSort 
{
    void Sort(int[] arr)
    {
        int a =arr.length;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    void PrintArr(int[] arr)
    {
        System.out.print("Sorted array =");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array = ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        BubbleSort bs = new BubbleSort();
        bs.Sort(arr);
        bs.PrintArr(arr);
    }

}