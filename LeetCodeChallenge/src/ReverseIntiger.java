public class ReverseIntiger {
    public int reverse(int x){
        int isNegative = 1;
        if (x<0){
            isNegative = -1;
            x = -x;
        }
        double reverse =0;
        while (x > 0){
            reverse = reverse * 10 + x % 10;
            x/=10;
        }
        if (reverse > Integer.MAX_VALUE) return 0;

        return (int) (reverse * isNegative);
    }
}
