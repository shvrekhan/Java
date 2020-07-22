import java.util.Scanner;
public class SelectionSort
{
    
    void ArraySort(int[] ar, int n)
    {
        
        for (int i=0;i<n;i++)             
        {
           int min = i;
            for(int j=i+1;j<n;j++)
            {
                if(ar[j]<ar[min])
                {
                   int temp = ar[min];
                   ar[min] = ar[j];
                    ar[j] = temp;
                }
            }

        }
    }

    void PrintArray(int n,int[] ar)
    {
        System.out.print("Array After sorting = ");
        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }



    public static void main(String[] args) 
    {
        int n;
        int[] ar;   
        Scanner sc = new Scanner(System.in);   
        n = sc.nextInt();
        ar = new int[n];
        System.out.print("ENter the array to sort = ");
        for(int i=0;i<n;i++)
        {
            ar[i] =  sc.nextInt();
        }
        SelectionSort ss = new SelectionSort();
        ss.ArraySort(ar, n);
        ss.PrintArray(n, ar);



    }   
}