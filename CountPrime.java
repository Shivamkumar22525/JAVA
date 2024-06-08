public class CountPrime {
    public static void main(String[] args) {
        int n = 10;
        int count = 0;
        int num = 0;
//        int flag = 0;
//        while (num<n){
//            if (num<=1){
//                flag = 1;
//            }
//            if (num==2){
//                flag = 0;
//            }
//            for (int i = 2; i<num; i++){
//                if (num%i==0){
//                    flag = 1;
//                    break;
//                }else {
//                    flag = 0;
//                }
//            }
//            if (flag==0){
//                count++;
//            }
//            num++;
//        }
//        System.out.println(count);

        boolean[] arr = new boolean[n+1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;
        }
        arr[0] = arr[1] = false;
//        for (int i = 2; i<n; i++){
//            if (!arr[i]){
//                count++;
//                for (int j = i*2; j<n; j=j+i){
//                    arr[j] = true;
//                }
//            }
//        }
        for (int i = 2; i<n; i++){
            if (arr[i]){
                count++;
                for (int j = i*2; j<n; j=j+i){
                    arr[j] = false;
                }
            }
        }
        System.out.println(count);

    }
}
