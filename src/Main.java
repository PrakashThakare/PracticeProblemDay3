import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int arr[] = {20, 39, 10, 7, 8, 20,7,55,10};
        int i=0;
        for( i = 0; i < arr.length; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
