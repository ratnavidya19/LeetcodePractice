package BitManipulation.easy;

//Write a function that takes the binary representation of an unsigned integer and returns the number of '1' bits it has
//Youtube - https://www.youtube.com/watch?v=GvSheKUPziA
public class NumberOf1Bits {
    int total =0;
    public int hammingWeight(int n) {

        for(int i = 0; i<32; i++){
            //and operation on n and 1
            if((n&1) == 1){
                total++;
            }
            //right shift n by 1
            n>>=1;
        }

        return total;

    }
}
