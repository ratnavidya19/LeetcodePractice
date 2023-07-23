package BitManipulation.medium;

//Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the
// signed 32-bit integer range [-231, 231 - 1], then return 0.
//Youttube - https://www.youtube.com/watch?v=CRgXG1vK-wg
public class ReverseInteger {

    public int reverse(int x) {

        int reversed = 0;
        int pop = 0;
        while(x != 0){
            pop = x%10;
            x = x/10;

            if(reversed > Integer.MAX_VALUE/10 || reversed == Integer.MAX_VALUE/10 && pop > 7){
                return 0;
            }
            if(reversed < Integer.MIN_VALUE/10 || reversed == Integer.MIN_VALUE/10 && pop < -8){
                return 0;
            }
            reversed = (reversed*10)+pop;
        }
        return reversed;

    }
}
