import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int arr[] = {20, 39, 10, 7, 8, 91, 98, 33, 55, 22, 74,};
        for (int i = 1; i < arr.length; i = i + 2) {

            System.out.println(" elements of an array present on odd position: " + arr[i]);

        }
    }
}
