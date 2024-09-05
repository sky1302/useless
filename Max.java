import java.util.*;
public class Max {
    public String maxFind(int[] arr, int s) {
        int max = 0;
        for(int i=0; i<s; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return "Maximum is "+max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=1; i<=num; i++) {
            System.out.println("Enter "+ i+" value");
            arr[i-1] = sc.nextInt();
        }
        Max obj = new Max();
        System.out.println(obj.maxFind(arr, num));
    }
}
