import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args)
    {
        int arr[]={30,50,40,30,10,90,50,};
        int iMin= 0;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]<arr[3])
            {
                iMin = arr[i];
            }

        }
        System.out.println("Min number is: "+iMin);

    }
}