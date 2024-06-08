import java.util.Objects;
import java.util.Scanner;

public class LinearSearch {

    public static int Search(String[] menu, String key){

//        int count = 0;


        for (int i = 0; i<menu.length; i++){
//            if(menu[i].length() == key.length()){
//                for (int j = 0;j<menu[i].length();j++){
//                    char menuChar = menu[i].charAt(j);
//                    char keyChar = key.charAt(j);
//                    if(menuChar !=keyChar){
//                        return -1;
//                    }
//                    count++;
//
//                }
                if (menu[i].equals(key)){
                    return i;
                }
//            }
//
//            if (count == key.length()){
//                return i;
//            }
        }


        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"pepsi", "maggie", "biscuit", "cake", "chocolate"};

        System.out.print("what would you like to eat = ");
        String key = sc.next();

       int check = Search(menu, key);

       if (check == -1){
           System.out.println("Not found");
       }else {
           System.out.println("Food at index = " + check);
       }

    }
}
