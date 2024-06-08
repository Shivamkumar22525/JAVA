import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class leetcode857 {
    public static void main(String[] args) {
        int[] quality = {3,1,10,10,1};
        int[] wage = {4,8,2,2,7};
        int k = 3;
        double result = Double.MAX_VALUE;
        for (int i = 0; i<quality.length; i++){
            double ratio = (double)wage[i]/quality[i];
            ArrayList<Double> group = new ArrayList<>();
            for (int j = 0; j< quality.length; j++){
                double workerWage = ratio*quality[j];
                if (workerWage>=wage[j]){
                    group.add(workerWage);
                }
            }
            if (group.size()>=k){
                Collections.sort(group);
                double min = 0;
                for (int j = 0; j<k; j++){
                    min+=group.get(j);
                }
                result = Math.min(result,min);
            }
        }
        System.out.println(result);
    }
}
