package searching.Medium;

public class KokoEatingBanana {

    public int minEatingSpeed(int[] piles, int h) {

        int start = 1;
        int end = Math.max(piles[0], piles[piles.length-1]);
        int ans = 0;
        while(start <= end){
            int mid = (start + end)/2;
            int mintime = timereq(mid, piles);
            if(mintime <= h){
                ans = mid;
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return ans;

    }

    int timereq(int mid, int[] piles){
        int sum = 0;
        for(int i =0; i<piles.length; i++){
            if((piles[i]%mid) != 0){
                sum += (piles[i]/mid) + 1;
            }
            else{
                sum += (piles[i]/mid);
            }

        }

        return sum;
    }
}
