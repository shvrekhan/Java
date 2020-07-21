import java.util.Scanner;
class Binary
{
    public int start;
    int m;
    int last;
    void search(int a[], int s, int n)
    {
        start = 0;
        last = n;
        m = (start+last)/2;

        for(int i=0;i<n;i++)
        {
            if(s==a[m])
            {
                System.out.println("Fount at "+ m +" index");
                break;
            }
            else if(s>a[m])
            {
                start=m;
                m = (start+last)/2;
            }
            else if(s<a[m])
            {
                last=m;
                m=(start+last)/2;
            }
        }

    }
}
public class BinarySearch 
{
    public static void main(String[] args) 
    {
        int[] a ;
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        int s = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        Binary b = new Binary();
        b.search(a, s, n);


    }    
}