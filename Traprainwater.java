public class Traprainwater {

    public static int trapwater(int[] height){
        int[] max_left = new int[height.length];

        int max = Integer.MIN_VALUE;
        for (int i = 0; i< height.length; i++){

            max = Math.max(max,height[i]);
            max_left[i] = max;

        }
//        for (int i = 0; i<max_left.length; i++){
//            System.out.print(max_left[i]+",");
//        }
//        System.out.println();

        int[] max_right = new int[height.length];
        int max1 = Integer.MIN_VALUE;


        for (int i = height.length-1; i>=0; i--){
                max1 = Math.max(max1,height[i]);
                max_right[i] = max1;
        }
//        for (int i = 0; i< height.length; i++){
//            System.out.print(max_right[i]+",");
//        }
//        System.out.println();
        int trappedwater = 0;
        int width = 1;
        for (int i = 0; i< height.length; i++){
            int waterlevel = Math.min(max_left[i],max_right[i]);
            trappedwater+= (waterlevel - height[i])*width;
        }
        return trappedwater;
    }
    public static void main(String[] args) {
        int[] height = {4,2,0,6,3,2,5,7};
        System.out.println("Trapped water = " + trapwater(height));
    }
}
