import java.util.*;
public class AggresiveCows {
    public static void main(String[] args) {
        int[] stalls = {18 ,27 ,44 ,77 ,69 ,19 ,35 ,83, 9 ,64 };
        int n = stalls.length;
        int k = 4;
        System.out.println(aggressiveCows(stalls,k,n));
    }

        public static boolean isAssigned(int[] stalls,int k,int mid,int n){


            int cow = 1;
            int cowPos = stalls[0];
            for(int i = 0; i<n; i++){


                if(mid<=stalls[i]-cowPos){
                    cow++;
                    {
                        if (cow==k){
                            return true;
                        }
                        cowPos = stalls[i];
                    }
                }

            }
            return false;
        }
        public static int aggressiveCows(int []stalls, int k,int n) {

            Arrays.sort(stalls);

            if(n<k){
                return -1;
            }

            int l = 1;
            int ans = -1;
            int max = 0;
            int min = 0;
            for(int i = 0; i<n; i++){
                max = Math.max(max,stalls[i]);
                min = Math.min(min,stalls[i]);
            }
            int h = max-min;
            while(l<=h){
                int mid = l+(h-l)/2;

                if(isAssigned(stalls,k,mid,n)){
                    ans = mid;
                    l = mid+1;
                }else{
                    h = mid-1;
                }
            }
            return ans;
        }

}
