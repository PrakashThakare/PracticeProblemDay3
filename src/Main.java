import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args)
    {
        int arr[]={10,30,50,40,60,90,50};
        int iMax= 0;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]>iMax)
            {
                iMax = arr[i];
            }

        }
        System.out.println("Max number is: "+iMax);

    }
}