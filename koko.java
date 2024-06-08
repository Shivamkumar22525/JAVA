public class koko {
    public static void main(String[] args) {
        int[] arr = {30,11,23,4,20};
        int ans = minEatingSpeed(arr,5);
        System.out.println(ans);

    }
    public static int koko(int[] piles, int mid, int n){
        int i = 0;
        int time = 0;

        while(i<n){
            time+=Math.ceil((double)piles[i]/(double)mid);
            i++;
        }
        return time;
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;


        int l = 1;
        int e = -1;
        for(int i = 0; i<n; i++){
            e = Math.max(e,piles[i]);
        }
        while(l<=e){
            int mid = l+(e-l)/2;
            int time = koko(piles,mid,n);

            if(time > h){

                l = mid+1;
            }else{
                e = mid-1;
            }
        }
        return l;

    }
}