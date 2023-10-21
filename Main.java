import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Arrayin uzunlugunu daxil edin:");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];
        for (int i =0; i<arr.length;i++){
            System.out.println(i+".ci elementi daxil edin:");
            arr[i] = sc.nextInt();
            boolean has = findEquality(arr);
            System.out.println(has);

        }

    }
public static boolean findEquality(int arr[]){
        // birinci forda i int ile arrayin 0ci reqemi ile diger reqemleri check edir, sonra 1ci ile , 2 ve ardicilligla
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr.length;j++){
                if (arr[i]==j && i!=j){
                    //burda eger i ve j beraber olarsa yeni 0ci reqem ile 0ci reqemi check etdiyi halda beraber oldugu ucun i ve j berabersizliyi qeyd edilir
                    return true;
                }
            }
        }
        return false;
}



}