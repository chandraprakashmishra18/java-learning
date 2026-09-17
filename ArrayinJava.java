
import java.util.Arrays;

public class ArrayinJava {
    public static void main(String[] args) {
        int i = 6;
        int j = 7;
        int k = 8;

        int num[] = {5,6,7};
        num[1] = 6;

        int nums[] = new int[4];
        nums[0] = 4;
        nums[1] = 5;
        nums[2] = 6;
        nums[3] = 8;

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(Arrays.toString(num));
        System.out.println(num[2]);
        System.out.println(num[1]);
        System.out.println(nums[3]);

        for (int p = 0 ; i<4 ; i++)
        {
            System.err.println(nums[p]);
        }

    }
}
