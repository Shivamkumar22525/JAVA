
public class leetcode2485 {
    public static int find(int n){
//        int i = 1;
//        int p = i;
//        int k = n;
//        while (n>=i){

//            if (p==k && i==n){
//                return i;
//            }
//            if (p==k){
//                i++;
//                n--;
//                p = p+i;
//                k = k+n;
//            }else if (p<k){
//                i++;
//                p = p+i;
//            }else {
//                n--;
//                k = k+n;
//            }
//        }
            int x = n/2;
            while(n>=x){
                if(2*x*x == ((n*n)+n)){
                    return x;
                }
                x++;
            }
        return -1;
    }
    public static void main(String[] args) {
        int n = 8;
        System.out.println(find(n));
        int a = 8;
        a+= ++a;
        System.out.println(++a);
    }

}
