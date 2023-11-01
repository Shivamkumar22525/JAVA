public class Largest {

    public static void Largest_Array(int[] num){
        int Largest = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i<num.length; i++){
            if (Largest < num[i]){
                Largest = num[i];
            }
            if(min > num[i]){
                min = num[i];
            }
        }
        System.out.println(min + " <-> " + Largest);

    }
    public static void main(String[] args) {

        int[] num = {1,3,5,5,7,43,2,5,6,76,3,5,7,3,3};

        Largest_Array(num);

    }
}
