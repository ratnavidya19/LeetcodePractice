package BitManipulation.easy;

//Reverse bits of a given 32 bits unsigned integer.
//Youtube - https://www.youtube.com/watch?v=vy288ZcbWRc
public class ReverseBits {

    public int reverseBits(int n) {

        int ans = 0;
        for(int i =0; i<32;i++){
            ans<<=1;
            ans = ans|(n&1);
            n>>=1;
        }
        return ans;

    }
}
