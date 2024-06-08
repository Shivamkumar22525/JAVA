public class leetcode2073 {
    public static int find(int[] tickets, int k){
        int count = 0;
//        int i = 0;
//        while (tickets[k]!=0){
//            if (i>=tickets.length){
//                i = 0;
//            }
//            if (tickets[i]==0){
//                i++;
//            }else {
//                tickets[i]--;
//                count++;
//                i++;
//            }
//
//        }
//        return count;
        for (int i = 0; i<=k; i++){
            if (tickets[i]<=tickets[k]){
                count+=tickets[i];
            }else {
                count+=tickets[k];
            }
        }

        for (int i = k+1; i<tickets.length; i++){
            if (tickets[i]<tickets[k]){
                count+=tickets[i];
            }else {
                count+=tickets[k]-1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] tickets = {5,1,1,1};
        int k = 0;
        System.out.println(find(tickets,k));
    }
}
