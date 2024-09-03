public class Main {
    public static void main(String[] args) {

        int[] nums = {3 , 0 , 1};

        int n  = nums.length;

        n = (n*(n+1)) / 2;
        System.out.println(n);
        int sum = 0;
        for(int i = 0 ; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        int mNumber = n - sum ;

        System.out.println(mNumber);

    }
}