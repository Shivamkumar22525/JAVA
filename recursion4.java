public class recursion4 {
    public static void reached(int des,int src){
        System.out.println("destination = "+des+" and source = "+src);
        if (src==des){
            System.out.println("mission accomplished");
            return ;
        }
        src++;
        reached(des,src);
    }
    public static void main(String[] args) {
        int des = 10;
        int src = 0;
       reached(des,src);
    }
}
