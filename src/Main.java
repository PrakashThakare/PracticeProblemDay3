import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args)
    {
        int arr[]={1,1,4,1,2,4,3,1,4,3};
        int a=0,b=0,c=0,d=0;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                a++;
            } else if (arr[i]==2) {
                b++;
            }
            else if (arr[i]==3) {
                c++;
            }
            else if (arr[i]==4) {
                d++;
            }
        }
        System.out.println("Frequency of 1 is : "+a);
        System.out.println("Frequency of 2 is : "+b);
        System.out.println("Frequency of 3 is : "+c);
        System.out.println("Frequency of 4 is : "+d);
    }
}